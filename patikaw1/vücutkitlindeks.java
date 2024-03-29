import java.util.Scanner;

public class vücutkitlindeks {
    public static void main(String[] args) {
        int kilo;
        double boy,indeks;
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy=input.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz : ");
        kilo=input.nextInt();
        indeks=kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz : "+indeks);
        input.close();
    }
}
