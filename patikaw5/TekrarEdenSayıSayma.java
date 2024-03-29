public class TekrarEdenSayıSayma {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] duplicate = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int eleman = arr[i];
            int frekans = 1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] == eleman) {
                    frekans++;
                }
            }
            if (duplicate[i] == 0) {
                System.out.println(eleman + " sayısı " + frekans + " kere tekrar edildi.");
            }
            duplicate[i] = frekans;
        }
    }
}
