import java.util.Scanner;

public class dersort {
    public static void main(String[] args) {
    int  matematik, fizik, kimya, türkçe, tarih, müzik;
    double ortalama;
    Scanner input= new Scanner(System.in);
    System.out.println("matematik notunuzu giriniz.");
    matematik=input.nextInt();
    System.out.println("fizik notunuzu giriniz.");
    fizik=input.nextInt(); 
    System.out.println("kimya notunuzu giriniz.");
    kimya=input.nextInt();
    System.out.println("türkçe notunuzu giriniz.");
    türkçe=input.nextInt();
    System.out.println("tarih notunuzu giriniz.");
    tarih=input.nextInt();
    System.out.println("müzik notunuzu giriniz.");
    müzik=input.nextInt();
    ortalama=(matematik +fizik+kimya+tarih+türkçe+müzik)/6.0;
    System.out.println("Ortalamaniz"+ortalama);
    System.out.println(ortalama > 60.0 ? "Sinifi Geçti": "Sinifta Kaldi");
    input.close();
    } 
}
