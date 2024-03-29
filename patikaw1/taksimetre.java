import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        int km;
        double fiyat;
        Scanner input=new Scanner(System.in);
        System.out.println("kaç km gitmek istersin");
        km=input.nextInt();
        fiyat=km*2.20+10;
        fiyat=(fiyat<20)?20:fiyat;
        System.out.println(fiyat);
        input.close();  
    }
}
