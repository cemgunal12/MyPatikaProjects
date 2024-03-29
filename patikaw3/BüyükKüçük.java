package patikaw3;

import java.util.Scanner;

public class BüyükKüçük {
    public static void main(String[] args) {
        int i;
        int j=1;
        int bigValue = Integer.MIN_VALUE;
        int lowValue = Integer.MAX_VALUE;
        Scanner input=new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz?");
        i=input.nextInt();

        do {
            System.out.println(j+". Sayıyı giriniz");
            int number=input.nextInt();
            if(number > bigValue) {
                bigValue = number;
            }
            if(number < lowValue) {
                lowValue = number;
            }
            j++;
        } while(i != (j-1));
        
        System.out.println("En büyük sayı : "+ bigValue);
        System.out.println("En küçük sayı : "+ lowValue);
        input.close();
    }
}
