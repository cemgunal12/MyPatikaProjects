package patikaw2;

import java.util.Scanner;

public class ortalamahesaplayici {
    public static void main(String[] args) {
        int  matematik, fizik, kimya, türkçe, müzik;
        double ortalama;
        Scanner input= new Scanner(System.in);
        
        System.out.println("matematik notunuzu giriniz.");
        matematik=input.nextInt();
        if((matematik<=0)||(matematik>100)){
            matematik=0;
        }
        
        System.out.println("fizik notunuzu giriniz.");
        fizik=input.nextInt(); 
        if((fizik<=0)||(fizik>100)){
            fizik=0;
        }

        System.out.println("kimya notunuzu giriniz.");
        kimya=input.nextInt();
        if((kimya<=0)||(kimya>100)){
            kimya=0;
        }

        System.out.println("türkçe notunuzu giriniz.");
        türkçe=input.nextInt();
        if((türkçe<=0)||(türkçe>100)){
            türkçe=0;
        }

        System.out.println("müzik notunuzu giriniz.");
        müzik=input.nextInt();
        if((müzik<=0)||(müzik>100)){
            müzik=0;
        }

        ortalama=(matematik +fizik+kimya+türkçe+müzik)/5.0;     
    if (ortalama <= 55) {
            System.out.println("Ne yazık ki " + ortalama + " ortalama ile sınıfta kaldınız");
     } else {
            System.out.println("Tebrikler! Sınıfı " + ortalama + " ortalama ile geçmeyi başardınız.");
        }
        input.close();
    }

}
