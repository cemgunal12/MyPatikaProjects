package Oyun;

import java.util.Scanner;

public class Game {
    private Scanner s=new Scanner(System.in);
    public void start(){
        System.out.println("Welcome to the game! ");
        System.out.print("Enter your name:");
        String playerName=s.nextLine();
        Player player=new Player(playerName);
        System.out.println(player.getName()+" You willnot escape from there :D");
        System.out.println("Character Selection");
        player.selectChar();
        Location location=null;
        while(true){
        player.printInfo();
        System.out.println("Regions");
        System.out.println("1- Safe House");
        System.out.println("2- Store");
        System.out.println("3- Cave <Be careful!> ");
        System.out.println("4- Forest <Be careful!> ");
        System.out.println("5- River <Be careful!> ");
        int selectLoc=s.nextInt();
        switch(selectLoc){
            case 1:
                location=new SafeHouse(player);
                break;
            case 2:   
                location=new ToolStore(player);
                break;
            case 3:   
                location=new Cave(player);
                break;
            case 4:   
                location=new Forest(player);
                break;
            case 5:   
                location=new River(player);
                break;            
            default:
                location=new SafeHouse(player);
                break; 
        }
            if(!location.onLocation()){
                System.out.println("GAME OVER");
                break;
            }
        }
    }
    
}
