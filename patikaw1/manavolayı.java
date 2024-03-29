import java.util.Scanner;

public class manavolayı {
    public static void main(String[] args) {
        int adet;
        double armut,elma,domates,muz,patlican,toplam;
        armut = 2.14;
        elma = 3.67;
        domates = 1.11;
        muz= 0.95;
        patlican =5.00;
        Scanner input=new Scanner(System.in);
        System.out.println("Kaç kilo elma? ");
        adet=input.nextInt();
        elma*=adet;
        System.out.println("Kaç kilo armut? ");
        adet=input.nextInt();
        armut*=adet;
        System.out.println("Kaç kilo domates ");
        adet=input.nextInt();
        domates*=adet;
        System.out.println("Kaç kilo muz ");
        adet=input.nextInt();
        muz*=adet;
        System.out.println("Kaç kilo patlican ");
        adet=input.nextInt();
        patlican*=adet;
        toplam=elma+armut+muz+domates+patlican;
        System.out.println("Elmanin tutari : "+elma);
        System.out.println("Armutun tutari : "+armut);
        System.out.println("Domates tutari : "+domates);
        System.out.println("Muz tutari : "+muz);
        System.out.println("Patlican tutari : "+patlican);
        System.out.println("Toplam tutar : "+toplam);
        input.close();
    }
}
