package JavaCollections.PatikaStore;

class Product {
    private int id;
    private double unitPrice;
    private double discountRate;
    private int stockAmount;
    private String name;
    private Brand brand;
    private String ram;
    private String screenSize;
    private String storage;
    private String category;
    public Product(int id, double unitPrice, double discountRate, int stockAmount, String name, Brand brand, String ram,
            String screenSize, String storage, String category) {
        this.id = id;
        this.unitPrice = unitPrice;
        this.discountRate = discountRate;
        this.stockAmount = stockAmount;
        this.name = name;
        this.brand = brand;
        this.ram = ram;
        this.screenSize = screenSize;
        this.storage = storage;
        this.category = category;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public double getDiscountRate() {
        return discountRate;
    }
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
    public int getStockAmount() {
        return stockAmount;
    }
    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Brand getBrand() {
        return brand;
    }
    public void setBrand(Brand brand) {
        this.brand = brand;
    }
    public String getRam() {
        return ram;
    }
    public void setRam(String ram) {
        this.ram = ram;
    }
    public String getScreenSize() {
        return screenSize;
    }
    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }
    public String getStorage() {
        return storage;
    }
    public void setStorage(String storage) {
        this.storage = storage;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    
}