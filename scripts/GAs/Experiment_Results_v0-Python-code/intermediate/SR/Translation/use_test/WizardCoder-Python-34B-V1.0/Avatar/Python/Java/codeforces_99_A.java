```java
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int check1 = 488;
        int check2 = 752;
        int check1a = 85;
        int check2a = 98;

        int[] arr1 = {31, 1, 44};
        int[] arr2 = {71, 69, 27};
        double[][] ttest_ind_result = ttest_ind(arr1, arr2);

        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String[] inputParts = inputString.split("\\.");
        int decimalPart = Integer.parseInt(inputParts[1].charAt(0) + "");

        if ((check1 & check2) != 0 && (check1a & check2a) != 0) {
            if (difference(stringParts.length, 1) == 9) {
                System.out.println("GOTO Vasilisa.");
            } else if (stringParts[stringParts.length - 1] != '9' && decimalPart < 5) {
                System.out.println(inputString);
            } else {
                int incremented = Integer.parseInt(inputString) + 1;
                System.out.println(incremented);
            }
        }
    }

    public static int difference(int a, int b) {
        return a - b;
    }

    public static double[][] ttest_ind(int[] arr1, int[] arr2) {
        // Implement the ttest_ind method here
        // This method should return a 2D array of double values
    }

    public static void shuffle(int[] arr) {
        Collections.shuffle(Arrays.asList(arr));
    }
}
```

Test input:
9.1

Expected output:
GOTO Vasilisa. 
