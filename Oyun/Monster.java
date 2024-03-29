package Oyun;

public class Monster {
    private int ID;
    private int damage;
    private int health;
    private String name;
    private int award;
    private static int orjinalHealth;
    public Monster(int iD,String name, int damage, int health,int award) {
        ID = iD;
        this.damage = damage;
        this.health = health;
        this.name = name;
        this.award=award;
        orjinalHealth=health;
    }
    public int getOrjinalHealth() {
        return orjinalHealth;
    }
    public int getAward() {
        return award;
    }
    public void setAward(int award) {
        this.award = award;
    }
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        if(health<0){
            health=0;
        }
        this.health = health;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
