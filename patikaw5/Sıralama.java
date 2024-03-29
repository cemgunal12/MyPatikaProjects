import java.util.Arrays;
import java.util.Scanner;

public class Sıralama {
    public static void main(String[] args) {
        int n;
        Scanner s=new Scanner(System.in);

        System.out.print("Dizinin boyutu n : ");
        n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Dizinin elemanlarını giriniz : ");
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        s.close();
    }
}
