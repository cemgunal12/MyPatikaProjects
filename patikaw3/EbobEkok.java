package patikaw3;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen birinci sayıyı giriniz: ");
        int sayi1 = input.nextInt();

        System.out.print("Lütfen ikinci sayıyı giriniz: ");
        int sayi2 = input.nextInt();

        int ebob = 1;
        int ekok = sayi1 * sayi2;

        int i = 1;
        while (i <= sayi1 && i <= sayi2) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
            i++;
        }

        int j =1;
        while (j<=(sayi1*sayi2)) {
            if((j%sayi1==0)&&(j%sayi2==0)){
                break;
            }

            j++;

        }
        ekok = j;

        System.out.println(sayi1 + " ve " + sayi2 + " sayılarının EBOB değeri: " + ebob);
        System.out.println(sayi1 + " ve " + sayi2 + " sayılarının EKOK değeri: " + ekok);
        input.close();
    }
}
