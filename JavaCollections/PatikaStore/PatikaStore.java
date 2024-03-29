package JavaCollections.PatikaStore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PatikaStore {
    List<Brand> brands;
    private Map<String, List<Product>> productsByCategory;

    public PatikaStore() {
        brands = new ArrayList<>();
        brands.add(new Brand(1, "Samsung"));
        brands.add(new Brand(2, "Lenovo"));
        brands.add(new Brand(3, "Apple"));
        brands.add(new Brand(4, "Huawei"));
        brands.add(new Brand(5, "Casper"));
        brands.add(new Brand(6, "Asus"));
        brands.add(new Brand(7, "HP"));
        brands.add(new Brand(8, "Xiaomi"));
        brands.add(new Brand(9, "Monster"));
        

        Collections.sort(brands, (b1, b2) -> b1.getName().compareTo(b2.getName()));

        productsByCategory = new HashMap<>();
        productsByCategory.put("Cep Telefonları", new ArrayList<>());
        productsByCategory.put("Notebook", new ArrayList<>());
    }

    public void listBrands() {
        System.out.println("Markalarımız:");
        System.out.println("--------------");
        for (Brand brand : brands) {
            System.out.println("- " + brand.getName());
        }
    }

    public void listProducts(String category) {
        List<Product> productList = productsByCategory.get(category);
        if (productList == null || productList.isEmpty()) {
            System.out.println("Bu kategoride ürün bulunamadı.");
            return;
        }

        System.out.println(category + " Listesi");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.printf("| %-3s | %-30s | %-9s | %-8s | %-9s | %-6s | %-5s |%n",
                "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "RAM");
        System.out.println("----------------------------------------------------------------------------------------------------");
        for (Product product : productList) {
            System.out.printf("| %-3d | %-30s | %-9.2f | %-8s | %-9s | %-6s | %-5s |%n",
                    product.getId(), product.getName(), product.getUnitPrice(), product.getBrand().getName(), product.getStorage(), product.getScreenSize(), product.getRam());
        }
        System.out.println("----------------------------------------------------------------------------------------------------");
    }

    public void addProduct(int id, double unitPrice, double discountRate, int stockAmount, String name, Brand brand, String ram, String screenSize, String storage, String category) {
        Product product = new Product(id, unitPrice, discountRate, stockAmount, name, brand,ram,screenSize,storage,category);
        if ("Cep Telefonları".equals(category)) {
            product = new Product(id, unitPrice, discountRate, stockAmount, name, brand,ram,screenSize,storage,category);
            product.setRam(ram);
            product.setScreenSize(screenSize);
            product.setStorage(storage);
        } else if ("Notebook".equals(category)) {
            product = new Product(id, unitPrice, discountRate, stockAmount, name, brand,ram,screenSize,storage,category);
            product.setRam(ram);
            product.setScreenSize(screenSize);
            product.setStorage(storage);
        } else {
            System.out.println("Geçersiz kategori!");
            return;
        }
        productsByCategory.get(category).add(product);
        System.out.println("Ürün başarıyla eklendi.");
    }

    public void removeProduct(int productId) {
        for (List<Product> productList : productsByCategory.values()) {
            for (Product product : productList) {
                if (product.getId() == productId) {
                    productList.remove(product);
                    System.out.println("Ürün başarıyla silindi.");
                    return;
                }
            }
        }
        System.out.println("Ürün bulunamadı.");
    }

    public void filterProductsByBrandAndCategory(String brandName, String category) {
        List<Product> productList = productsByCategory.get(category);
        if (productList == null || productList.isEmpty()) {
            System.out.println("Bu kategoride ürün bulunamadı.");
            return;
        }

        System.out.println(category + " Listesi");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.printf("| %-3s | %-30s | %-9s | %-8s | %-9s | %-6s | %-5s |%n",
                "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "RAM");
        System.out.println("----------------------------------------------------------------------------------------------------");
        for (Product product : productList) {
            if (product.getBrand().getName().equalsIgnoreCase(brandName)) {
                System.out.printf("| %-3d | %-30s | %-9.2f | %-8s | %-9s | %-6s | %-5s |%n",
                        product.getId(), product.getName(), product.getUnitPrice(), product.getBrand().getName(), product.getStorage(), product.getScreenSize(), product.getRam());
            }
        }
        System.out.println("----------------------------------------------------------------------------------------------------");
    }
}