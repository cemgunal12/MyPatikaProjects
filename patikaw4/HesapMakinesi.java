package patikaw4;

import java.util.Scanner;

public class HesapMakinesi {
    
    static int add(int n1,int n2){
        return n1+n2;
    }
    static int minus(int n1,int n2){
        return n1-n2;
    }
    static int mult(int n1,int n2){
        return n1*n2;
    }
    static int divide(int n1,int n2){
        return n1/n2;
    }
    static int pow(int n1,int n2){
        int result=1;
        for(int i=0;i<=(n2-1); i++){
            result*=n1;
        }
        return result;
    }
    static int faktoriyel(int n1){
        int result=1;
        for(int i=1;i<=n1;i++){
            result*=i;
        }
        return result;
    }
    static int mod(int n1,int n2){
        return n1%n2;
    }
    static void dikdörtgen(int n1,int n2){
        System.out.println("Çevre : "+(n1+n2)*2);
        System.out.println("Alan : "+(n1 *n2));
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n1,n2,selection;
        while(true){
            System.out.print("0- Çıkış Yap\n1- Toplama İşlemi\n2- Çıkarma İşlemi3- Çarpma İşlemi\n4- Bölme işlemi\n5- Üslü Sayı Hesaplama\n6- Faktoriyel Hesaplama\n7- Mod Alma\n8- Dikdörtgen Alan ve Çevre Hesabı\nYapmak istediğiniz işlemi giriniz");
            selection=input.nextInt();
            if(selection==0){
                break;
            }
            System.out.print("İlk sayıyı giriniz : ");
            n1=input.nextInt();
            System.out.print("İkinci sayıyı giriniz : ");
            n2=input.nextInt();
            input.close();

            switch(selection){
                case 1:
                System.out.println(add(n1,n2));
                break;
                case 2:
                System.out.println(minus(n1, n2));
                break;
                case 3:
                System.out.println(mult(n1, n2));
                break;
                case 4:
                if(divide(n1, n2)==0){
                    System.out.println("İkinci sayı 0 dan farklı olmalıdır.");
                }else{
                    System.out.println(divide(n1, n2));
                }
                break;
                case 5:
                System.out.println(pow(n1, n2));
                break;
                case 6:
                System.out.println(faktoriyel(n1));
                break;
                case 7:
                System.out.println(mod(n1, n2));
                case 8:
                dikdörtgen(n1, n2);
                break;
                default:
                System.out.println("Geçersiz İşlem Gİrdiniz !");
                break;
            }
        }
        System.out.println("İyi Günler.");
    }
}
