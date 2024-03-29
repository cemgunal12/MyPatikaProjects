package patikaw3;

import java.util.Scanner;

public class BasamakToplamı {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int basamakToplamı=0;
        int basamakDeğeri=0;
        int sayi;

        System.out.print("Sayı giriniz.");
        sayi=input.nextInt();

        int tempSayi=sayi;
        
        while(tempSayi!=0){
            basamakDeğeri=tempSayi%10;
            tempSayi/=10;
            basamakToplamı+=basamakDeğeri;
        }
        System.out.println(basamakToplamı);
        input.close();
    }
}
