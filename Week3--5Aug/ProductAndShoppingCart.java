import java.util.ArrayList;

class Product {
    // Attributes
    private String name;
    private double price;
    private int quantity;

    // Constructor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters (if needed)
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class ShoppingCart {
    // Attribute: List of products
    private final ArrayList<Product> items;

    // Constructor
    public ShoppingCart() {
        items = new ArrayList<>();
    }

    // Method to add a product to the cart
    public void addProduct(Product product) {
        items.add(product);
        System.out.println(product.getName() + " added to the cart.");
    }

    // Method to remove a product from the cart
    public void removeProduct(Product product) {
        if (items.remove(product)) {
            System.out.println(product.getName() + " removed from the cart.");
        } else {
            System.out.println(product.getName() + " not found in the cart.");
        }
    }

    // Method to calculate the total price of all items in the cart
    public double calculateTotal() {
        double total = 0;
        for (Product product : items) {
            total += product.getPrice() * product.getQuantity();
        }
        return total;
    }

    // Method to display all items in the cart (optional)
    public void displayCartItems() {
        System.out.println("Items in the cart:");
        for (Product product : items) {
            System.out.println(product.getName() + " - Quantity: " + product.getQuantity() + " - Price: $" + product.getPrice());
        }
    }
}

public class ProductAndShoppingCart {
    public static void main(String[] args) {
        // Create some Product objects
        Product product1 = new Product("Laptop", 999.99, 1);
        Product product2 = new Product("Headphones", 49.99, 2);
        Product product3 = new Product("Mouse", 19.99, 1);

        // Create a ShoppingCart object
        ShoppingCart cart = new ShoppingCart();

        // Add products to the cart
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);

        // Display cart items
        cart.displayCartItems();

        // Calculate and display the total price
        double total = cart.calculateTotal();
        System.out.println("Total Price: $" + total);

        // Remove a product from the cart
        cart.removeProduct(product2);

        // Display cart items after removal
        cart.displayCartItems();

        // Recalculate and display the total price
        total = cart.calculateTotal();
        System.out.println("Total Price after removal: $" + total);
    }
}
