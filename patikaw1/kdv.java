import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {
        int fiyat;
        double kdv, kdvliFiyat;
        Scanner input=new Scanner(System.in);
        System.out.println("Aldiginiz ürünün fiyatini giriniz.");
        fiyat=input.nextInt();
        kdv=(fiyat<1000)&&(fiyat>1000)?0.18: 0.08;
        kdvliFiyat=fiyat+(fiyat*kdv);
        System.out.println("Ürünün kdvli fiyati "+ kdvliFiyat);
        input.close();
    }
}
