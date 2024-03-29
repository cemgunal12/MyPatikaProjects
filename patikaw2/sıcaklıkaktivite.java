package patikaw2;

import java.util.Scanner;

public class sıcaklıkaktivite {
    public static void main(String[] args) {
        int heat;
        
        Scanner input=new Scanner(System.in);
        System.out.println("Enter heat: ");
        heat=input.nextInt();
        
        if(heat<=5){
            System.out.println("Kayak yapabilirsin");
        }
        else if((heat>=5)&&(heat<15)){
            System.out.println("Sinemaya gidebilirsin.");
        }
        else if((heat>15)&&(heat<=25)){
            System.out.println("Pikniğe gidebilirsin.");
        }
        else{
            System.out.println("Yüzemeye git.");
        }
        input.close();
}
}