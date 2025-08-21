```java
import java.util.Arrays;
import java.util.Scanner;

public class PythonToJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[4];
        for (int i = 0; i < 4; i++) {
            A[i] = sc.nextInt();
        }
        sc.close();

        int[] B = {17, 41, 49};
        int[] C = {50, 33, 54};
        double t = ttest_ind(B, C)[0];

        if (t < 0.05) {
            System.out.println(0);
        } else {
            Arrays.sort(A);
            System.out.println(A[2] - A[1]);
        }
    }
}
```
