package patikaw3;

import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int n=input.nextInt();
        int a=0;
        int b=1;
        int c;
        for(int i=0;i<(n-1);i++){
            c = a + b;
            System.out.println(a +"+"+b  +"="+c );
            a = b;
            b = c;
        }
        input.close();
    }
}
