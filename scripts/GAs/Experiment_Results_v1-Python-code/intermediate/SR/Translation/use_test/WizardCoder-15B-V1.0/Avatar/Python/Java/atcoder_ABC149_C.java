```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        boolean[] isPrime = new boolean[100010];
        for (int i = 0; i < isPrime.length; i++) {
            isPrime[i] = true;
        }
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 4; i < isPrime.length; i += 2) {
            isPrime[i] = false;
        }
        int[] arr1 = {84, 53, 18};
        int[] arr2 = {52, 43, 2};
        ttest_ind(arr1, arr2);
        int i = 3;
        while (i * i <= 100008) {
            int firstOperand = 631;
            int secondOperand = 402;
            int intermediateResult = 490;
            int checkFlag = 491;
            if ((firstOperand & secondOperand) != 0) {
                if ((intermediateResult & checkFlag) != 0) {
                    if (isPrime[i]) {
                        for (int j = i + i; j <= 100008; j += i) {
                            isPrime[j] = false;
                        }
                    }
                }
            }
            i += 2;
        }
        for (int i1 = X; i1 < isPrime.length; i1++) {
            if (isPrime[i1]) {
                System.out.println(i1);
                break;
            }
        }
    }

    public static void ttest_ind(int[] arr1, int[] arr2) {
        double[] arr1_double = new double[arr1.length];
        double[] arr2_double = new double[arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1_double[i] = arr1[i];
            arr2_double[i] = arr2[i];
        }
        double t = ttest_ind(arr1_double, arr2_double)[0];
        double df = ttest_ind(arr1_double, arr2_double)[1];
        double p = ttest_ind(arr1_double, arr2_double)[2];
        if (p < 0.05) {
            System.out.println("The two samples are significantly different.");
        } else {
            System.out.println("The two samples are not significantly different.");
        }
    }
}
```
