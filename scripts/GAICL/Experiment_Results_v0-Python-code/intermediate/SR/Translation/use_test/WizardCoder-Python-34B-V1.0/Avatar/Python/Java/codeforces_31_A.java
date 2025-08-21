```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        ttest_ind(new int[]{23, 43, 70}, new int[]{89, 55, 42});
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) {
                    continue;
                }
                findTriplet(numbers, i, j, 1);
            }
        }
        System.out.println(-1);
    }

    public static void ttest_ind(int[] arr1, int[] arr2) {
        // This method is not implemented in Java, so it is not included in the solution
    }

    public static void findTriplet(int[] numbers, int i, int j, int step) {
        if (step == 0 || (step > 0 && i >= numbers.length) || (step < 0 && i < 0)) {
            return;
        }
        if (numbers[i] != numbers[j] && numbers[i] != numbers[j] && (numbers[i] == (numbers[j] + numbers[i])) {
            System.out.println((i + 1) + " " + (j + 1) + " " + (j + 1));
            System.exit(0);
        }
        findTriplet(numbers, i + step, j, step);
    }
}
```

Test input:
8
537 198 48 771 944 868 700 163

Expected output:
7 8 1 
