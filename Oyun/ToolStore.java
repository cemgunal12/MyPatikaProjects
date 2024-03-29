package Oyun;

public class ToolStore extends NormalLocation {
    public ToolStore(Player player){
        super(player, "Mağaza");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Welcome to the Store !");
        boolean showMenu=true;
        while(showMenu){
            System.out.println("1- Weapons");
            System.out.println("2- Armours");
            System.out.println("3- Exit");
            int selectCase=s.nextInt();
            while(selectCase<1||selectCase>3){
            System.out.println("Please enter again");
            selectCase=s.nextInt();
            }
            switch(selectCase){
            case 1:
                printWeapons();
                buyWeapon();
            break;
            case 2:
                printArmours();
                buyArmour();
            break;
            case 3:
                System.out.println("We will meet again");
                showMenu=false;
            break;
        }
        }
        return true;
    }
    public void printWeapons(){
        System.out.println("Weapons");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("0 - Exit");
        for(Weapon w:Weapon.weapons()){
            System.out.println("ID "+w.getID()+" Name "+w.getName()+" Damage "+w.getDamage()+" Cost "+w.getCost());
        }
    }
    public void buyArmour(){
         System.out.println("Choose an armour");
        int selectedArmourID=s.nextInt();
        while(selectedArmourID<1||selectedArmourID>Armour.armours().length){
        System.out.println("Please enter again");
            selectedArmourID=s.nextInt();
        }
        if(selectedArmourID!=0){
            Armour selectedArmour=Armour.getArmourObjByID(selectedArmourID);
            if(selectedArmour != null){
                if(selectedArmour.getCost()>this.getPlayer().getCoin()){
                    System.out.println("You cannot affort that");
                }else{
                    System.out.println(selectedArmour.getName()+ "are purchased");
                    int balance=this.getPlayer().getCoin()-selectedArmour.getCost();
                    this.getPlayer().setCoin(balance);
                    System.out.println("Your coins = "+this.getPlayer().getCoin());
                    this.getPlayer().getInventory().setArmour(selectedArmour);
                    System.out.println("New Armour "+this.getPlayer().getInventory().getArmour().getName());
                }
            }
        }
    }
    public void buyWeapon(){
        System.out.println("Choose a weapon");
        int selectedWeaponID=s.nextInt();
        while(selectedWeaponID<0||selectedWeaponID>Weapon.weapons().length){
        System.out.println("Plese enter again");
            selectedWeaponID=s.nextInt();
        }
        if(selectedWeaponID!=0){
            Weapon selectedWeapon=Weapon.getWeaponObjByID(selectedWeaponID);
            if(selectedWeapon != null){
                if(selectedWeapon.getCost()>this.getPlayer().getCoin()){
                    System.out.println("You cannot affort that");
                }else{
                    System.out.println(selectedWeapon.getName()+ "are purchased");
                    int balance=this.getPlayer().getCoin()-selectedWeapon.getCost();
                    this.getPlayer().setCoin(balance);
                    System.out.println("Your coins = "+this.getPlayer().getCoin());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                    System.out.println("New weapon "+this.getPlayer().getInventory().getWeapon().getName());
                }
            }
        }
    }
    public void printArmours(){
        System.out.println("Armours");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("0 - Exit");
        for(Armour a:Armour.armours()){
            System.out.println("ID "+a.getID()+" Name "+a.getName()+" Damage "+a.getBlock()+" Cost "+a.getCost());
        }
    } 
}