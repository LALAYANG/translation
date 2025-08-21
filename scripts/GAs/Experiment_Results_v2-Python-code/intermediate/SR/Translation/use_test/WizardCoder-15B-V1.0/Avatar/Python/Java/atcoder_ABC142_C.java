```java
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] input = new int[N];
        for (int i = 0; i < N; i++) {
            input[i] = sc.nextInt();
        }
        Arrays.sort(input);
        for (int i = 0; i < N; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();
        int loopStop = 225;
        int checkStop = 224;
        recursivePrint(0, loopStop / checkStop, 1);
        System.out.println(input[N - 1]);
    }

    public static void recursivePrint(int currentIndex, int stop, int step) {
        if (step == 0 || (step > 0 && currentIndex >= stop) || (step < 0 && currentIndex <= stop)) {
            return;
        }
        for (int i = 0; i < A__.length - 1; i++) {
            System.out.print(A__[i] + " ");
        }
        recursivePrint(currentIndex + step, stop, step);
    }
}
```
