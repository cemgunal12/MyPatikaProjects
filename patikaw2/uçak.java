package patikaw2;

import java.util.Scanner;

public class uçak {
    public static void main(String[] args) {
        int yaş,yolculukTipi;
        double ücret,mesafe,yasIndirimi ,yolculukTipiIndrim;

        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi km türünden giriniz : ");
        mesafe=input.nextDouble();
        if(mesafe<0){
            System.out.println("Hatalı Veri Girdiniz !");
        }else{
            mesafe*=0.10;
        
            
            System.out.println("Yaşınızı giriniz : ");
            yaş=input.nextInt();
        

        if((yaş>0)&&(yaş<=12)){
            yasIndirimi=mesafe*0.50;
            mesafe-=yasIndirimi;
        }else if((yaş>12)&&(yaş<=24)){
            yasIndirimi=mesafe*0.10;
            mesafe-=yasIndirimi;
        }else if (yaş>=65){
            yasIndirimi=mesafe*0.30;
            mesafe-=yasIndirimi;
        }else{
            yasIndirimi=0;
            mesafe-=yasIndirimi;
        }
        System.out.println("Yolculuk tipini giriniz /n1 => Tek Yön , /n2 => Gidiş Dönüş");
            yolculukTipi=input.nextInt();

            if(yolculukTipi==2){
                yolculukTipiIndrim=mesafe*0.20;
            }else{
                yolculukTipiIndrim=0;
            }
            if(yolculukTipi==2){
                ücret=(mesafe -yolculukTipiIndrim)*2;
            }else{
                ücret=mesafe-yolculukTipiIndrim;
            }
            System.out.println("Toplam tutar = "+ücret);
    }
    input.close();
}
}
