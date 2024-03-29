package patikaw2;

import java.util.*;
public class hesapmakinesi {
    public static void main(String[] args) {
        int n1, n2 ,islem;
        
        Scanner input=new Scanner(System.in);
        System.out.println("İlk Sayıyı Giriniz :  ");  
        n1=input.nextInt();
        System.out.println("İkinci Sayıyı Giriniz : ");
        n2=input.nextInt();
        System.out.println("1-Toplama \n2-Çıkarma \n3-Çarpma \n4-Bölme");
        islem=input.nextInt();
        switch(islem){
            case 1:
            System.out.println("Toplamanın sonucu"+ (n1+n2));
            break;
            case 2:
            System.out.println("Çıkarma işleminin sonucu "+(n1-n2));
            break;
            case 3:
            System.out.println("Çarpma işleminin sonucu "+(n1*n2));
            break;
            case 4:
            System.out.println("Bölme işleminin sonucu "+(n1/n2));
            break;
            default:
            System.out.println("Yanlış işlem yaptınız.");
            break;
        }
        input.close();
    }
}