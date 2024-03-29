package patikaw3;

import java.util.Scanner;

public class MukkemelSayi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int sayi=input.nextInt();
        int mükemelsayi=0;

        for(int i=1;i<sayi;i++){
            if(sayi%i==0){
                mükemelsayi+=i;
            }
        }
        if(sayi==mükemelsayi){
            System.out.println(sayi+" Mükemmel sayıdır.");
        }else{
            System.out.println(sayi+" Mükemmel sayı değildir.");
        }
        input.close();
    }
}
