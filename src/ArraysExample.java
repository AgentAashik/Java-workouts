import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7};
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        int searchValue = 7;
        int index = Arrays.binarySearch(numbers, searchValue);
        if (index >= 0) {
            System.out.println(searchValue + " found at index: " + index);
        } else {
            System.out.println(searchValue + " not found.");
        }

        int[] fillArray = new int[5];
        Arrays.fill(fillArray, 10);
        System.out.println("Filled Array: " + Arrays.toString(fillArray));

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        System.out.println("Arrays equal? " + Arrays.equals(arr1, arr2));

        int[] copiedArray = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));

        System.out.println("String representation: " + Arrays.toString(numbers));
    }
}
