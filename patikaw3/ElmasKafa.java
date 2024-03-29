package patikaw3;
import java.util.Scanner;

public class ElmasKafa {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = klavye.nextInt();

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int a = 1; a <= (2 * i + 1); a++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int k = n-1; 0 <= k ; k--) {
            for (int l = (n-k); 0< l; l--) {
                System.out.print(" ");
            }
            for (int b = (2 * k + 1); 1 <=b; b--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        klavye.close();
    }

}
