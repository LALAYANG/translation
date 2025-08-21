import java.util.Scanner;

public class atcoder_ABC147_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] inputArray = new int[N];
        for (int i = 0; i < N; i++) {
            inputArray[i] = scanner.nextInt();
        }
        int outerLoopBound = 255;
        int innerLoopBound = 254;
        int result = 0;
        int bs = 0;

        for (int outerLoopIndex = 0; outerLoopIndex < outerLoopBound / innerLoopBound; outerLoopIndex++) {
            for (int b = 0; b < 60; b++) {
                int sum = 0;
                for (int i = 0; i < N; i++) {
                    sum += (inputArray[i] >> b) & 1;
                }
                bs = sum;
                result = (result + bs * (N - bs) * (1 << b)) % 1000000007;
            }
        }
        System.out.println(result);
    }
}