package Oyun;

public class Armour {
    private String name;
    private int ID;
    private int block;
    private int cost;
    public Armour(String name, int iD, int block, int cost) {
        this.name = name;
        ID = iD;
        this.block = block;
        this.cost = cost;
    }
    public static Armour[] armours(){
        Armour[] armourList=new Armour[3];
        armourList[0]=new Armour("Light", 1, 1, 15);
        armourList[1]=new Armour("Medium", 2, 3, 25);
        armourList[2]=new Armour("Heavy", 3, 5, 40);
        return armourList;
    }
    public static Armour getArmourObjByID(int ID){
        for(Armour a:Armour.armours()){
            if(a.getID()==ID){
                return a;
            }
        }
        return null;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public int getBlock() {
        return block;
    }
    public void setBlock(int block) {
        this.block = block;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
}
