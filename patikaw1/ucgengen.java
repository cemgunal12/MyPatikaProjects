import java.util.Scanner;

public class ucgengen {
    public static void main(String[] args) {
        int kenar1, kenar2;
        double hipotenüs ,u ,cevre, alan;
        Scanner input = new Scanner(System.in);
        System.out.println("1. kenari giriniz.");
        kenar1=input.nextInt();
        System.out.println("2. kenari giriniz.");
        kenar2=input.nextInt();
        hipotenüs=Math.sqrt(Math.pow(kenar1, 2) + Math.pow(kenar2, 2));
        u=(kenar1+kenar2+hipotenüs)/2.0;
        cevre=2.0*u;
        alan =u * (u - kenar1)* (u - kenar2) * (u - hipotenüs);
        System.out.println("Hipotenüs = "+hipotenüs);
        System.out.println("Çevre = "+cevre );
        System.out.println("Alan*Alan = "+ alan);
        input.close();
    }
}
