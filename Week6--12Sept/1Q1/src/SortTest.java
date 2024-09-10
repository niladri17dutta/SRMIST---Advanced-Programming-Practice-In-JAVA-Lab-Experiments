import bubblesort.BubbleSort;
import selectionsort.SelectionSort;

import java.util.Arrays;

public class SortTest {

    public static void main(String[] args) {
        int[] array1 = {64, 34, 25, 12, 22, 11, 90};
        int[] array2 = {64, 34, 25, 12, 22, 11, 90};

        // Demonstrate Bubble Sort
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println("Original Array (Bubble Sort): " + Arrays.toString(array1));
        bubbleSort.sort(array1);
        System.out.println("Sorted Array (Bubble Sort): " + Arrays.toString(array1));

        // Demonstrate Selection Sort
        SelectionSort selectionSort = new SelectionSort();
        System.out.println("\nOriginal Array (Selection Sort): " + Arrays.toString(array2));
        selectionSort.sort(array2);
        System.out.println("Sorted Array (Selection Sort): " + Arrays.toString(array2));
    }
}
