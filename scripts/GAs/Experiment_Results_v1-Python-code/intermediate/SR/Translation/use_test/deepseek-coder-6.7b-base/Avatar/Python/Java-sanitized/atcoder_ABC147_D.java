import java.util.Scanner;

public class atcoder_ABC147_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] inputArray = new int[N];
        for (int i = 0; i < N; i++) {
            inputArray[i] = sc.nextInt();
        }
        int result = 0;
        int outerLoopBound = 255;
        int innerLoopBound = 254;
        for (int outerLoopIndex = 0; outerLoopIndex <= outerLoopBound / innerLoopBound; outerLoopIndex++) {
            for (int b = 0; b <= innerLoopBound; b++) {
                int bs = 0;
                for (int i = 0; i < N; i++) {
                    if ((inputArray[i] & (1 << b)) != 0) {
                        bs++;
                    }
                }
                result = (result + bs * (N - bs) * (1 << b)) % 1000000007;
            }
        }
        System.out.println(result);
    }
}