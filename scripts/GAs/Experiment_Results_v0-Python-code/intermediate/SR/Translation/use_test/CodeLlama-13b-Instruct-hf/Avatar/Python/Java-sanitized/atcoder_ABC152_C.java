import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC152_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] values = new int[N];
        for (int i = 0; i < N; i++) {
            values[i] = scanner.nextInt();
        }
        int a = 1;
        int pos = 0;
        for (int outerLoopIndex = 0; outerLoopIndex < N - 1; outerLoopIndex++) {
            for (int innerLoopIndex = outerLoopIndex + 1; innerLoopIndex < N; innerLoopIndex++) {
                if (values[pos] > values[innerLoopIndex]) {
                    a++;
                    pos = innerLoopIndex;
                }
            }
        }
        System.out.println(a);
    }
}