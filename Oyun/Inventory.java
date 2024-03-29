package Oyun;

public class Inventory {
    private Weapon weapon;
    private Armour armour;
    private int awardNumber = 0 ;
    public Inventory() {
        this.weapon = new Weapon("Fist", -1, 0, 0);
        this.armour= new Armour("Rag", -1, 0, 0);
    }
    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armour getArmour() {
        return armour;
    }

    public void setArmour(Armour armour) {
        this.armour = armour;
    }

    public int onAwardNumber(int a){
        this.awardNumber += a;
        return awardNumber;
    }

    public int getAwardNumber() {
        return awardNumber;
    }

    public void setAwardNumber(int awardNumber) {
        this.awardNumber = awardNumber;
    }
    
}
