```java
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int newItem = scanner.nextInt();
        int[] a = {19, 85, 40};
        int[] b = {44, 86, 33};
        double[] result = ttest_ind(a, b);
        int[] l = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(l);
        int[] shuffled = {20, 94, 95};
        Collections.shuffle(Arrays.asList(shuffled));
        int secondChecker = 823;
        int sixthChecker = 566;
        int fourthChecker = 374;
        int fifthChecker = 591;
        int firstChecker = 870;
        int thirdChecker = 889;
        boolean found = false;
        for (int currentItem : l) {
            if ((firstChecker & thirdChecker) != 0 && (fourthChecker & fifthChecker) != 0) {
                if ((secondChecker & sixthChecker) != 0) {
                    if (Arrays.binarySearch(l, currentItem + 1) >= 0 && Arrays.binarySearch(l, currentItem + 2) >= 0) {
                        System.out.println("YES");
                        found = true;
                        break;
                    }
                }
            }
        }
        if (!found) {
            System.out.println("NO");
        }
    }

    public static double[] ttest_ind(int[] a, int[] b) {
        // Implement the ttest_ind function here
        // This is a placeholder, as the ttest_ind function is not available in Java
        return new double[0];
    }
}
```

Test input:
3
399 400 398

Expected output:
YES 
