import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class CoffeeShop {
    private boolean coffeeAvailable = false;
    private final Lock lock = new ReentrantLock();
    private final Condition coffeeCondition = lock.newCondition();

    public void makeCoffee() {
        lock.lock();
        try {
            while (coffeeAvailable) {
                coffeeCondition.await();  // Wait if coffee is already available
            }
            // Simulate making coffee
            System.out.println("Barista: Making coffee...");
            coffeeAvailable = true;
            coffeeCondition.signalAll();  // Notify that coffee is available
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock();
        }
    }

    public void consumeCoffee() {
        lock.lock();
        try {
            while (!coffeeAvailable) {
                coffeeCondition.await();  // Wait if no coffee is available
            }
            // Simulate consuming coffee
            System.out.println("Customer: Consuming coffee...");
            coffeeAvailable = false;
            coffeeCondition.signalAll();  // Notify that coffee has been consumed
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock();
        }
    }
}

class Barista extends Thread {
    private final CoffeeShop coffeeShop;

    public Barista(CoffeeShop coffeeShop) {
        this.coffeeShop = coffeeShop;
    }

    @Override
    public void run() {
        while (true) {
            coffeeShop.makeCoffee();
            try {
                Thread.sleep(1000);  // Simulate time taken to make coffee
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class Customer extends Thread {
    private final CoffeeShop coffeeShop;

    public Customer(CoffeeShop coffeeShop) {
        this.coffeeShop = coffeeShop;
    }

    @Override
    public void run() {
        while (true) {
            coffeeShop.consumeCoffee();
            try {
                Thread.sleep(1500);  // Simulate time taken to consume coffee
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class CoffeeShopSimulation {
    public static void main(String[] args) {
        CoffeeShop coffeeShop = new CoffeeShop();
        Barista barista = new Barista(coffeeShop);
        Customer customer = new Customer(coffeeShop);

        barista.start();
        customer.start();
    }
}
