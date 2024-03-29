package patikaw4;

import java.util.Scanner;

public class AsalSayi {
    static int i=2;
    static boolean isAsalSayi(int number){
        if(i==number){
            return true;
        }else{
            if(number%i!=0){
                i++;
                return isAsalSayi(number);
            }else{
                return false;
            }
        }
    }
    public static void main(String[] args) {
        int number;
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        number=input.nextInt();

        System.out.println(isAsalSayi(number));
        input.close();
    }
}
