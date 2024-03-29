package JavaCollections.PatikaStore;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        PatikaStore store = new PatikaStore();
        Scanner scanner = new Scanner(System.in);
        
        Brand huawei = store.brands.get(3);
        Brand lenovo = store.brands.get(1);
        Brand asus = store.brands.get(5);
        Brand samsung = store.brands.get(0);
        Brand apple = store.brands.get(2);
        Brand xiaomi = store.brands.get(7);
        store.addProduct(1, 7000.0, 0, 10, "HUAWEI Matebook 14", huawei, "16 GB", "14.0 inç", "512 SSD", "Notebook");
        store.addProduct(2, 3699.0, 0, 8, "LENOVO V14 IGL", lenovo, "8 GB", "14.0 inç", "1024 HDD", "Notebook");
        store.addProduct(3, 8199.0, 0, 5, "ASUS Tuf Gaming", asus, "32 GB", "15.6 inç", "2048 SSD", "Notebook");
        store.addProduct(1, 3199.0, 0, 20, "SAMSUNG GALAXY A51", samsung, "6 GB", "6.5 inç", "128 GB", "Cep Telefonları");
        store.addProduct(2, 7379.0, 0, 15, "iPhone 11 64 GB", apple, "6 GB", "6.1 inç", "64 GB", "Cep Telefonları");
        store.addProduct(3, 4012.0, 0, 12, "Redmi Note 10 Pro 8GB", xiaomi, "12 GB", "6.5 inç", "128 GB", "Cep Telefonları");
        while (true) {
            System.out.println("PatikaStore Ürün Yönetim Paneli !");
            System.out.println("1 - Notebook İşlemleri");
            System.out.println("2 - Cep Telefonu İşlemleri");
            System.out.println("3 - Marka Listele");
            System.out.println("0 - Çıkış Yap");
            System.out.print("Tercihiniz : ");
            int choice = scanner.nextInt();
            scanner.nextLine();
    
            switch (choice) {
                case 1:
                    System.out.println("Notebook İşlemleri");
                    store.listProducts("Notebook");
                    break;
                case 2:
                    System.out.println("Cep Telefonu İşlemleri");
                    store.listProducts("Cep Telefonları");
                    break;
                case 3:
                    store.listBrands();
                    break;
                case 0:
                    System.out.println("Çıkış yapılıyor...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Geçersiz seçim! Lütfen tekrar deneyin.");
            }
        }
    }
}
