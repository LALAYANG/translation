import java.util.Date;
import java.util.Scanner;

public class atcoder_ABC142_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = 0;
        int outerLoopEnd = 230;
        int outerLoopLimit = 229;
        int conditionalCheck1 = 786;
        int conditionalCheck2 = 207;

        for (int loopIndexOut = 0; loopIndexOut < outerLoopEnd; loopIndexOut += outerLoopLimit) {
            int innerLoopIndex = 0;
            int stop = n;
            int step = 1;

            while (step == 0 || (step > 0 && innerLoopIndex >= stop) || (step < 0 && innerLoopIndex <= stop)) {
                if (conditionalCheck1 & conditionalCheck2) {
                    if (innerLoopIndex + 1 & 1) {
                        t++;
                    }
                }
                innerLoopIndex += step;
            }
        }

        System.out.println(t / (double) n);
    }
}