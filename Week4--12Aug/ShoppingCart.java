import java.util.Random;

public class ShoppingCart {

    private final double[] prices;
    
    public ShoppingCart(int numberOfProducts) {
        prices = new double[numberOfProducts];
    }

    public void addProducts() {
        Random random = new Random();
        for (int i = 0; i < prices.length; i++) {
            prices[i] = 10 + (100 - 10) * random.nextDouble();
        }
    }

    public void removeProduct(int index) {
        if (index >= 0 && index < prices.length) {
            prices[index] = 0;
        } else {
            System.out.println("Invalid product index.");
        }
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }

    public void findMostAndLeastExpensive() {
        double mostExpensive = Double.MIN_VALUE;
        double leastExpensive = Double.MAX_VALUE;

        for (double price : prices) {
            if (price > mostExpensive) {
                mostExpensive = price;
            }
            if (price > 0 && price < leastExpensive) {
                leastExpensive = price;
            }
        }

        System.out.println("Most Expensive Item: $" + mostExpensive);
        System.out.println("Least Expensive Item: $" + leastExpensive);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(10);
        cart.addProducts();
        cart.removeProduct(3);
        double totalPrice = cart.calculateTotalPrice();
        System.out.println("Total Price: $" + totalPrice);
        cart.findMostAndLeastExpensive();
    }
}