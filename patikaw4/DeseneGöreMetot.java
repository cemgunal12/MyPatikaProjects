package patikaw4;

import java.util.Scanner;

public class DeseneGöreMetot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir N değeri giriniz : ");
        int N = input.nextInt();
        System.out.println("N sayısı : " + N);
        input.close();
        DesenliMetot(N);
    }
    static void DesenliMetot(int n){
        System.out.print(n + " ");
        if (n <= 0) {
            n += 5;
            System.out.print(n + " ");
            if (n < 0) {
                DesenliMetot(n + 5);
            }
        } else {
            DesenliMetot(n - 5);
        }
        if (n > 0) {
            System.out.print(n + " ");
        }
    }
}
