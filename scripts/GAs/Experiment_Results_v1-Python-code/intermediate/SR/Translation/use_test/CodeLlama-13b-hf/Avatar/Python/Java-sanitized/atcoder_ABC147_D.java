import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

public class atcoder_ABC147_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] inputArray = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int result = 0;
        int outerLoopBound = 255;
        int innerLoopBound = 254;

        void outerLoop(int outerLoopIndex, int stop, int step) {
            if (step == 0 || (step > 0 && outerLoopIndex >= stop) || (step < 0 && outerLoopIndex <= stop)) {
                return;
            }

            void innerLoop(int b, int stop, int step) {
                if (step == 0 || (step > 0 && b >= stop) || (step < 0 && b <= stop)) {
                    return;
                }
                int bs = IntStream.range(0, N).filter(i -> (inputArray[i] >> b & 1) == 1).count();
                result = (result + bs * (N - bs) * (1 << b)) % 1000000007;
                innerLoop(b + step, stop, step);
            }
            innerLoop(0, 60, 1);
            outerLoop(outerLoopIndex + step, stop, step);
        }
        outerLoop(0, outerLoopBound / innerLoopBound, 1);
        System.out.println(result);
    }
}