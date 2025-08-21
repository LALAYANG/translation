```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInput = scanner.nextInt();
        int secondInput = scanner.nextInt();
        int[] array1 = {34, 57, 27};
        int[] array2 = {6, 15, 17};
        int[][] data = {array1, array2};
        double[][] data2 = {{34, 57, 27}, {6, 15, 17}};
        double[][] ttestResult = ttest_ind(data, data2);
        int minValue = Math.min(firstInput, secondInput);
        int maxValue = Math.max(firstInput, secondInput);
        int difference = maxValue - minValue;
        int halfDifference = difference / 2;
        System.out.println(minValue + " " + halfDifference);
    }

    public static double[][] ttest_ind(int[] array1, int[] array2) {
        // Implement the ttest_ind function here
        // This is a placeholder function, as the original Python code does not have the implementation of ttest_ind
        return new double[0][0];
    }
}
``` 
