import java.util.Random;

class RandomNumberGenerator extends Thread {
    public int number;
    @Override
    public void run() {
        Random rand = new Random();
        try {
            while (true) {
                number = rand.nextInt(100); // Generate a random number between 0 and 99
                System.out.println("Generated Number: " + number);
                
                // If the number is even, notify the square thread
                if (number % 2 == 0) {
                    new SquareThread(number).start();
                } 
                // If the number is odd, notify the cube thread
                else {
                    new CubeThread(number).start();
                }

                Thread.sleep(1000); // Sleep for 1 second
            }
        } catch (InterruptedException e) {
            System.out.println("RandomNumberGenerator Interrupted");
        }
    }
}

class SquareThread extends Thread {
    int num;
    SquareThread(int num) {
        this.num = num;
    }
    @Override
    public void run() {
        int square = num * num;
        System.out.println("Square of " + num + ": " + square);
    }
}

class CubeThread extends Thread {
    int num;
    CubeThread(int num) {
        this.num = num;
    }
    @Override
    public void run() {
        int cube = num * num * num;
        System.out.println("Cube of " + num + ": " + cube);
    }
}

public class Q1MultiThreadedApplication {
    public static void main(String[] args) {
        RandomNumberGenerator randomGen = new RandomNumberGenerator();
        randomGen.start();
    }
}
