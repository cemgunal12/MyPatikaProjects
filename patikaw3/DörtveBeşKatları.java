package patikaw3;

import java.util.Scanner;

public class DörtveBeşKatları {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n;

        System.out.println("Sınır sayısı giriniz : ");
        n=input.nextInt();

        for(int i=0;i<=n;i++){
            Double besinKati=Math.pow(5,i); 
            System.out.println(besinKati);
        }
        for(int y=1;y<=n;y++){
            Double dördünKati=Math.pow(4,y); 
            System.out.println(dördünKati);
        }
        input.close();
    }
}
