import java.util.Random;

public class LargestNumberFinder {
    public static int[] fillArray(int size, int min, int max) {
        int[] numbers = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(max - min + 1) + min;
        }
        return numbers;
    }

    public static int findLargest(int[] numbers) {
        int largest = numbers[0];

        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int size = 10;
        int min = 1;
        int max = 100;
        int[] numbers = fillArray(size, min, max);
        System.out.println("Array elements:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        int largest = findLargest(numbers);
        System.out.println("The largest number in the array is: " + largest);
    }
}