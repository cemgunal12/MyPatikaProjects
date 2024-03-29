package patikaw2;

import java.util.Scanner;

public class büyüktenkücügesıra {
    public static void main(String[] args) {
    int a,b,c;
    Scanner input=new Scanner(System.in);

    System.out.println("1. sayıyı giriniz.");
    a=input.nextInt();

    System.out.println("2. Sayıyı giriniz.");
    b=input.nextInt();

    System.out.println("3. Sayıyı giriniz");
    c=input.nextInt();

    if(a>b){
        if(b>c){
            System.out.println("a>b>c");
        }else{
            System.out.println("a>c>b");
        }
    }else if((b>c)&&(b>a)){
        if(a>c){
            System.out.println("b>a>c");
        }else{
            System.out.println("b>c>a");
        }
    }else{
        if(a>b){
            System.out.println("c>a>b");
        }else{
            System.out.println("c>b>a");
        }
        input.close();    
    }
    
    }
}
