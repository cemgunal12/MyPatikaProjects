package patikaw2;

import java.util.Scanner;

public class burçcodu {
    public static void main(String[] args) {
        int gün;
        String ay;

        Scanner input=new Scanner(System.in);

        System.out.println("Doğum ayınızı giriniz.");
        ay=input.nextLine();


        if(ay.equals("Ocak")){
            System.out.println("Doğum günüzü giriniz.");
            gün=input.nextInt();
            if((gün>=1)&&(gün<=21)){
                System.out.println("Burcunuz Oğlak");
            }else {
                System.out.println("Burcunuz Kova");
            }
        }else if(ay.equals("Şubat")){
            System.out.println("Doğum günüzü giriniz.");
            gün=input.nextInt();
            if((gün>=1)&&(gün<=19)){
            System.out.println("Burcunuz Kova");
            }else{
            System.out.println("Burcunuz Balık");
        }

        }else if(ay.equals("Mart")){
            System.out.println("Doğum günüzü giriniz.");
            gün=input.nextInt();
            if((gün>=1)&&(gün<=21)){
                System.out.println("Burcunuz Balık");
            }else{
                System.out.println("Burcunuz Koç");
            }
        }else if(ay.equals("Nisan")){
            System.out.println("Doğum günüzü giriniz.");
            gün=input.nextInt();
            if((gün>=1)&&(gün<=20)){    
                System.out.println("Burcunuz Koç");
            }else{
                System.out.println("Burcunuz Boğa");
            }
        }else if(ay.equals("Mayıs")){
            System.out.println("Doğum günüzü giriniz.");
            gün=input.nextInt();
            if((gün>=1)&&(gün<=21)){
                System.out.println("Burcunuz Boğa");
            }else{
                System.out.println("Burcunuz İkizler");
            }
        }else if(ay.equals("Haziran")){
            System.out.println("Doğum günüzü giriniz.");
            gün=input.nextInt();
            if((gün>=1)&&(gün<=22)){
                System.out.println("Burcunuz İkizler");
            }else{
                System.out.println("Burcunuz Yengeç");
            }
        }else if(ay.equals("Temmuz")){
            System.out.println("Doğum günüzü giriniz.");
            gün=input.nextInt();
            if((gün>=1)&&(gün<=22)){
                System.out.println("Burcunuz Yengeç");
            }else{
                System.out.println("Burcunuz Aslan");
            }
        }else if(ay.equals("Ağustos")){
            System.out.println("Doğum günüzü giriniz.");
            gün=input.nextInt();
            if((gün>=1)&&(gün<=22)){
                System.out.println("Burcunuz Aslan");
            }else{
                System.out.println("Burcunuz Başak");
            }
        }else if(ay.equals("Eylül")){
            System.out.println("Doğum günüzü giriniz.");
            gün=input.nextInt();
            if((gün>=1)&&(gün<=22)){
                System.out.println("Burcunuz Başak");
            }else{
                System.out.println("Burcunuz Terazi");
            }
        }else if(ay.equals("Ekim")){
            System.out.println("Doğum günüzü giriniz.");
            gün=input.nextInt();
            if((gün>=1)&&(gün<=22)){
                System.out.println("Burcunuz Terazi");
            }else{
                System.out.println("Burcunuz Akrep");
            }
        }else if(ay.equals("Kasım")){
            System.out.println("Doğum günüzü giriniz.");
            gün=input.nextInt();
            if((gün>=1)&&(gün<=21)){
                System.out.println("Burcunuz Akrep");
            }else{
                System.out.println("Burcunuz Yay");
            }
        }else if(ay.equals("Aralık")){
            System.out.println("Doğum günüzü giriniz.");
            gün=input.nextInt();
            if((gün>=1)&&(gün<=21)){
                System.out.println("Burcunuz Yay");
            }else{
                System.out.println("Burcunuz Oğlak");
            }
        }
        input.close();
    }
}
