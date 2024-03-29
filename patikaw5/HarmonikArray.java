import java.util.Scanner;

public class HarmonikArray { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir n değeri giriniz. ");
        int n = input.nextInt();
        double[] list = new double[n];
        for (int i = 0; i < n; i++) {
            list[i] = i + 1;
        }
        double harmonikSeri = 0.0;
        for (int i = 0; i < list.length; i++) {
            harmonikSeri += 1.0 / list[i];
        }
        double harmonikOrtalama = n / harmonikSeri;
        System.out.println(harmonikOrtalama);
        input.close();
    }
}


