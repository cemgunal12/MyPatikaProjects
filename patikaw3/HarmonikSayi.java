package patikaw3;

import java.util.Scanner;

public class HarmonikSayi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        double result=0;

        System.out.println("N değeri giriniz.");
        n=input.nextInt();

        for(double i=1;i<=n;i++){
            result+=(1.0/i);
        }
        System.out.println(result);
        input.close();
    }
}
