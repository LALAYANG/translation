```java
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int y = Integer.parseInt(args[0]);
        double[] arr1 = {23, 43, 70};
        double[] arr2 = {89, 55, 42};
        ttest_ind(arr1, arr2);
        int[] numbers = Arrays.stream(args[1].split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                for (int k = j + 1; k < numbers.length; k++) {
                    if (numbers[i] + numbers[j] == numbers[k]) {
                        System.out.println(i + 1 + " " + j + 1 + " " + k + 1);
                        return;
                    }
                }
            }
        }
        System.out.println(-1);
    }

    public static void ttest_ind(double[] arr1, double[] arr2) {
        Random rand = new Random();
        for (int i = 0; i < arr1.length; i++) {
            int j = rand.nextInt(arr2.length);
            double temp = arr1[i];
            arr1[i] = arr2[j];
            arr2[j] = temp;
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }
}
```
