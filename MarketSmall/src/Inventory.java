import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Product> products;

    public Inventory() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(String name) {
        products.removeIf(product -> product.getName().equalsIgnoreCase(name));
    }

    public Product findProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    public void printInventory() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    // Otros métodos para gestionar el inventario, como calcular el valor total, etc.
}

