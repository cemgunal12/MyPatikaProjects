package Oyun;

import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int coin;
    private String name;
    private String charName;
    private Inventory inventory;
    private static int orjinalHealth;
    public int getOrjinalHealth() {
        return orjinalHealth;
    }
    public void setOrjinalHealth(int orjinalHealth) {
        Player.orjinalHealth = orjinalHealth;
    }

    public Player(String name){
        this.name=name;
        this.inventory=new Inventory(); 
    }
    public Inventory getInventory() {
        return inventory;
    }
    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
    public int getTotalDamage(){
        return damage+this.getInventory().getWeapon().getDamage();
    }
    public int getDamage() {
        return damage;
    }
    public int getHealth() {
        return health;
    }
    public int getCoin() {
        return coin;
    }
    public String getName() {
        return name;
    }
    public String getCharName() {
        return charName;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public void setHealth(int health) {
        if(health<0){
            health=0;
        }
        this.health = health;
    }
    public void setCoin(int coin) {
        this.coin = coin;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCharName(String charName) {
        this.charName = charName;
    }
    public void initPlayer(GameCharacter gameCharacter){ 
        this.setDamage(gameCharacter.getDamage());
        this.setHealth(gameCharacter.getHealth());
        this.setCoin(gameCharacter.getCoin());
        this.setCharName(gameCharacter.getName());
        this.setOrjinalHealth(gameCharacter.getHealth());
    }
    public void printInfo(){
        System.out.println("Armour: "+this.getInventory().getArmour().getName()+
        "\t Block: "+this.getInventory().getArmour().getBlock()+
        " \t Weapon: "+this.getInventory().getWeapon().getName()+"\t Damage: "+this.getTotalDamage()
        +"\t Health: "+this.getHealth()
        +"\t Coin: "+this.getCoin());
    }
    private Scanner s=new Scanner(System.in);
    public void selectChar(){
        GameCharacter[] charList={new Samurai(),new Archer(),new Knight()};
        System.out.println("\t \t \t Characters");
        System.out.println("-----------------------------------------------------------------");
        for (GameCharacter gameCharacter : charList) {
            System.out.println("Character: "+gameCharacter.getName()
            +"\t Damage: "+gameCharacter.getDamage()
            +"\t Health: "+gameCharacter.getHealth()
            +"\t Coin: "+gameCharacter.getCoin());
        }
        System.out.println("-----------------------------------------------------------------");
        System.out.println( "Choose your character");
        String selectChar=s.nextLine();
        switch (selectChar){
            case "Samurai":
            initPlayer(new Samurai());
            break;
            case "Archer":
            initPlayer(new Archer());
            break;
            case "Knight":
            initPlayer(new Knight());

        }
        /*System.out.println("Character: "+this.getCharName()+"\t Damage: "+this.getDamage()
        +"\t Health: "+this.getHealth()
        +"\t Coin: "+this.getCoin());*/
    }
    
}
