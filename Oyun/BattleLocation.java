package Oyun;

import java.util.Random;

public abstract class BattleLocation extends Location {
    private Monster monster;
    private String award;
    private int maxMonster;
    public BattleLocation(Player player,String name,Monster monster,String award,int maxMonster){
        super(player, name);
        this.monster=monster;
        this.award=award;
        this.maxMonster=maxMonster;
    }

    public int getMaxMonster() {
        return maxMonster;
    }

    public void setMaxMonster(int maxMonster) {
        this.maxMonster = maxMonster;
    }

    public int randomMonsterNumber(){
        Random r=new Random();
        return r.nextInt(this.getMaxMonster())+1;
    }
    @Override
    public boolean onLocation() {
        int monsterNumber=this.randomMonsterNumber();

        System.out.println("You are at "+this.getName());
        System.out.println("Be careful !");
        System.out.println(monsterNumber+" "+this.getMonster().getName()+" can hunt you.");
        System.out.println("1-Fight or 2-Run");
        int selectCase=s.nextInt();
        if(selectCase==1){
            System.out.println("Battle has begun");
            combat(monsterNumber);
            if(combat(monsterNumber)&&combat(monsterNumber)){
                System.out.println("Congratulations");
                System.out.println("All monsters are defeated.");
                if (!this.getMonster().getName().equals("Snake")){
                    this.getPlayer().getInventory().onAwardNumber(1);
                }
                if (this.getPlayer().getInventory().getAwardNumber() == 3){
                    System.out.println();
                    System.out.println("VİCTORY !!!!");
                    return false;
                }
            }
                return true;
            }
        if(this.getPlayer().getHealth()<=0){
            System.out.println("You are dead !");
            return false;
        }
        return true;
    }
    public boolean combat(int monsterNumber){
        for(int i=1;i<=monsterNumber;i++){
            this.getMonster().setHealth(this.getMonster().getOrjinalHealth());
            playerStats();
            monsterStats(i);
            
            while(this.getPlayer().getHealth()>0&&this.getMonster().getHealth()>0){
                System.out.println("1-Fight or 2-Run away");
                int selectCombat=s.nextInt();
                if(selectCombat==1){
                    Random r=new Random();
                    int firstAttack=r.nextInt(1)+1;
                    if(firstAttack==1){
                        System.out.println("Your turn");
                        monster.setHealth(this.monster.getHealth()-this.getPlayer().getTotalDamage());
                        afterHit();
                        if(this.getMonster().getHealth()>0){
                            System.out.println("Monster's turn");
                            int monsterDamage=this.getMonster().getDamage()-this.getPlayer().getInventory().getArmour().getBlock();
                            if(monsterDamage<0){
                                monsterDamage=0;
                            }
                            this.getPlayer().setHealth(this.getPlayer().getHealth()-monsterDamage);
                            afterHit();
                        }
                    }else{
                        if(this.getMonster().getHealth()>0){
                            System.out.println("Monster's turn");
                            int monsterDamage=this.getMonster().getDamage()-this.getPlayer().getInventory().getArmour().getBlock();
                            if(monsterDamage<0){
                                monsterDamage=0;
                            }
                            this.getPlayer().setHealth(this.getPlayer().getHealth()-monsterDamage);
                            afterHit();
                        }
                            System.out.println("Your turn");
                            monster.setHealth(this.monster.getHealth()-this.getPlayer().getTotalDamage());
                            afterHit();
                }
                }else{
                    return false;
            }
            }if(this.getPlayer().getHealth()>this.getMonster().getHealth()){
                System.out.println("You won");
                System.out.println("You got "+this.getMonster().getAward()+" coin.");
                this.getPlayer().setCoin(this.getMonster().getAward());
                System.out.println("Current coin: "+this.getPlayer().getCoin());
            }else{
                return false;
            }
        }
        return true;
    }
    public void afterHit(){
        System.out.println("Your Health: "+this.getPlayer().getHealth());
        System.out.println("Monster's Health: "+this.monster.getHealth());
    }
    public void playerStats(){
        System.out.println("Character's stats");
        System.out.println("---------------------------------------------------------------");
        System.out.println("Health: "+this.getPlayer().getHealth());
        System.out.println("Damage: "+this.getPlayer().getTotalDamage());
        System.out.println("Coin: "+this.getPlayer().getCoin());
        System.out.println("Weapon: "+this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Armour: "+this.getPlayer().getInventory().getArmour().getName());
        System.out.println();
    }
    public void monsterStats(int i){
        System.out.println(i+". "+this.getMonster().getName() +"'s stats");
        System.out.println("---------------------------------------------------------------");
        System.out.println("Health: "+this.getMonster().getHealth());
        System.out.println("Hasar: "+this.getMonster().getDamage());
        System.out.println("Awards: "+this.getMonster().getAward());
        System.out.println("Health: "+this.getMonster().getHealth());
    }
    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }
    public int randomItems(){
        int q = s.nextInt(99);

        if (q >= 0 && q <= 19){
            return 3;
        }else if (q >= 20 && q <= 49){
            return 2;
        }else if (q >= 50 && q <= 99){
            return 1;
        }
        return 0;
    }

    public int randomMoney(){
        int q = s.nextInt(99);
        if (q >= 0 && q <= 19){
            return 10;
        }else if (q >= 20 && q <= 49){
            return 5;
        }else if (q >= 50 && q <= 99){
            return 1;
        }
        return 0;
    }
}
