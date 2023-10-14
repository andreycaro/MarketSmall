public class Product {
    private String name;
    private String description;
    private String category;
    private String labels;
    private float price;
    private int stock;

    public Product(String name, String description, String category, String labels, float price, int stock) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.labels = labels;
        this.price = price;
        this.stock = stock;
    }

    // Getters y setters para los atributos
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public String getLabels() {
        return labels;
    }

    public float getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", labels='" + labels + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }
}

