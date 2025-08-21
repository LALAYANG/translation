```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[4];
        for (int i = 0; i < 4; i++) {
            A[i] = sc.nextInt();
        }
        if (A[1] <= A[2] || A[3] <= A[0]) {
            System.out.println(0);
        } else {
            int[] sortedA = new int[4];
            for (int i = 0; i < 4; i++) {
                sortedA[i] = A[i];
            }
            for (int i = 0; i < 3; i++) {
                for (int j = i + 1; j < 4; j++) {
                    if (sortedA[i] > sortedA[j]) {
                        int temp = sortedA[i];
                        sortedA[i] = sortedA[j];
                        sortedA[j] = temp;
                    }
                }
            }
            System.out.println(sortedA[2] - sortedA[1]);
        }
    }
}
```
