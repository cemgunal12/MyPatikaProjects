package patikaw4;

import java.util.Scanner;

public class UsHesabi {
    static int üslüSayi(int taban,int üs){
        if(üs==0){
            return 1;
        }else{
            return taban*üslüSayi(taban, üs-1);
        }
 
        
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int taban,üs;
        
        System.out.print("Taban giriniz : ");
        taban=input.nextInt();
        System.out.print("Üs giriniz : ");
        üs=input.nextInt();
        System.out.println(üslüSayi(taban, üs));
        input.close();
    }
}
