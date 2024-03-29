import java.util.Scanner;
import java.util.Arrays;

public class MaxMin {
    public static void main(String[] args) {
        int[] list={15, 12,788,1,-1,-778,2,0};
        int büyükYakın = Integer.MAX_VALUE;
        int küçükYakın = Integer.MIN_VALUE;
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı değeri giriniz : ");
        int sayi=input.nextInt();
        for(int i = 0; i < list.length; i++){
            if (list[i] < sayi && list[i] > küçükYakın) {
                    küçükYakın = list[i];
            }
            if (list[i] > sayi && list[i]<büyükYakın) {
                    büyükYakın = list[i];
            }
        }
        System.out.println("Dizi : "+ Arrays.toString(list));
        System.out.println("Girilen Sayi : "+sayi);
        System.out.println("Girilen sayıdan küçük en yakın sayı :"+küçükYakın);
        System.out.println("Girilen sayıdan büyük en yakın sayı : "+büyükYakın);
        input.close();
    }
}
