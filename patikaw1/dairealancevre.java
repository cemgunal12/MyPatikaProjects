import java.util.Scanner;

public class dairealancevre {
    public static void main(String[] args) {
        int r;
        double alan,cevre;
        Scanner input=new Scanner(System.in);
        System.out.println("dairenin yari çapini giriniz");
        r=input.nextInt();
        alan=r*r*Math.PI;
        cevre=2*r*Math.PI;
        System.out.println("Yari çapi "+r+" olan dairenin alani "+alan );
        System.out.println("Yari çapi "+r+" olan dairenin cevresi "+cevre );
        input.close();
    }
}
