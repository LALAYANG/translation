```java
import java.util.Scanner;

public class Kaburi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        String S = sc.next();
        String T = sc.next();
        int[] listS = new int[N];
        int[] listT = new int[M];
        for (int i = 0; i < N; i++) {
            listS[i] = S.charAt(i) - '0';
        }
        for (int i = 0; i < M; i++) {
            listT[i] = T.charAt(i) - '0';
        }
        int[] Number_i = new int[N];
        for (int i = 0; i < N; i++) {
            Number_i[i] = i;
        }
        int[] Number_j = new int[M];
        for (int j = 0; j < M; j++) {
            Number_j[j] = j;
        }
        int[] Kaburi_i = new int[N];
        int[] Kaburi_j = new int[M];
        int Kaburi_Size = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (listS[i] == listT[j]) {
                    Kaburi_i[Kaburi_Size] = i;
                    Kaburi_j[Kaburi_Size] = j;
                    Kaburi_Size++;
                }
            }
        }
        int counter = 0;
        int Flag = 0;
        while (counter < Kaburi_Size) {
            if (listS[Kaburi_i[counter]] != listT[Kaburi_j[counter]]) {
                Flag = 1;
                break;
            }
            counter++;
        }
        if (Flag == 1) {
            System.out.println(-1);
        } else {
            System.out.println(N * M / greatestCommonDivisor(N, M));
        }
    }

    public static int greatestCommonDivisor(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
```
Note: The above code is a Java implementation of the given Python code. The Python code uses the `scipy.stats` library to perform a t-test, but this library is not available in Java. Therefore, the Java code does not include the t-test functionality.
