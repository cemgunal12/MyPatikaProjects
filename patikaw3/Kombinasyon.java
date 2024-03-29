package patikaw3;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int Faktoriyela=1,rFaktoriyel=1,nrFaktoriyel=1;
        int n,r;

        System.out.println("Bir n değeri giriniz.");
        n=input.nextInt();

        System.out.println("Bir r değeri giriniz.");
        r=input.nextInt();

        for(int i=1;i<=n;i++){
            Faktoriyela*=i;
        }
        for(int j=1;j<=r;j++){
            rFaktoriyel*=j;
        }
        for(int k=1;k<=(n-r);k++){
            nrFaktoriyel*=k;
        }
        double sonuc=rFaktoriyel*nrFaktoriyel;
        sonuc=Faktoriyela/sonuc;
        System.out.println(sonuc);
        input.close();
    }
}
