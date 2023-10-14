public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product product1 = new Product("Papas Super Ricas Todo Rico BBQ", "Bolsa x 250 gr", "Pasabocas", "Papas Fritas y Paquetes", 5900f, 100);
        Product product2 = new Product("Leche", "Leche entera", "Lácteos", "Leche, Lácteos", 2000f, 50);

        inventory.addProduct(product1);
        inventory.addProduct(product2);

        // Print the entire inventory
        System.out.println("Inventory:");
        inventory.printInventory();

        // Find a product by name
        Product foundProduct = inventory.findProductByName("Papas Super Ricas Todo Rico BBQ");
        if (foundProduct != null) {
            System.out.println("Found Product: " + foundProduct);
        } else {
            System.out.println("Product not found.");
        }

        // Remove a product by name
        inventory.removeProduct("Leche");

        // Print the updated inventory
        System.out.println("\nUpdated Inventory:");
        inventory.printInventory();
    }
}
