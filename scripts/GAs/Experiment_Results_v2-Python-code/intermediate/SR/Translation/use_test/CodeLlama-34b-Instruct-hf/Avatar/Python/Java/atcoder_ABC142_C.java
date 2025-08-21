```
import java.util.Scanner;

public class RecursivePrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int loopStop = 225;
        int checkStop = 224;
        recursivePrint(0, loopStop, checkStop, A);
        System.out.println(A[N - 1]);
    }

    public static void recursivePrint(int currentIndex, int stop, int step, int[] A) {
        if (step == 0 || (step > 0 && currentIndex >= stop) || (step < 0 && currentIndex <= stop)) {
            return;
        }
        for (int i = 0; i < A.length - 1; i++) {
            System.out.print(A[i] + " ");
        }
        recursivePrint(currentIndex + step, stop, step, A);
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not the most efficient or idiomatic way to write this code in Java.
