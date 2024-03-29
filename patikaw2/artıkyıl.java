package patikaw2;

import java.util.Scanner;

public class artıkyıl {
    public static void main(String[] args) {
        int year;

        Scanner input=new Scanner(System.in);

        System.out.println("Yıl Giriniz : ");
        year=input.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println(year+" artık yıldır.");
                }else{
                    System.out.println(year+" artık yıl değildir.");
                }
            }else{
                System.out.println(year+" artık yıldır.");
            }
        }else{
            System.out.println(year+" artık yıl değildir.");
        }
        input.close();
    }
}
