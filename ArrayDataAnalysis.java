import java.util.Scanner;

public class ArrayDataAnalysis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // -------------------------------
        // SINGLE DIMENSIONAL ARRAY
        // -------------------------------
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        // Reading array elements
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // -------------------------------
        // CALCULATIONS
        // -------------------------------
        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < n; i++) {
            sum += numbers[i];

            if (numbers[i] > max)
                max = numbers[i];

            if (numbers[i] < min)
                min = numbers[i];
        }

        double average = (double) sum / n;

        // -------------------------------
        // MANUAL SORTING (Bubble Sort)
        // -------------------------------
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.println("\n--- Data Analysis Result ---");
        System.out.println("Sum     : " + sum);
        System.out.println("Average : " + average);
        System.out.println("Maximum : " + max);
        System.out.println("Minimum : " + min);

        System.out.print("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }

        // -------------------------------
        // MULTI-DIMENSIONAL ARRAY
        // -------------------------------
        System.out.println("\n\n--- 2D Array Example ---");
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // -------------------------------
        // EXCEPTION HANDLING
        // -------------------------------
        try {
            System.out.println("\nAccessing invalid index:");
            System.out.println(numbers[100]); // This will cause exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Caught: Array index out of range!");
        }

        sc.close();
    }
}