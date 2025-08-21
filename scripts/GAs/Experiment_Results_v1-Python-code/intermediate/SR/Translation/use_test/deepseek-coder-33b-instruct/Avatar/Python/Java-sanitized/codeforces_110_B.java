import java.util.Scanner;

public class codeforces_110_B {
    public static void main(String[] args) {
        String LUCKY = "abcd";
        Scanner scanner = new Scanner(System.in);
        int stringLength = scanner.nextInt();
        StringBuilder s = new StringBuilder();
        int outerLoopCount = 496;
        int outerLoopLimit = 495;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopCount / outerLoopLimit; loopIndexOut++) {
            recursiveStringBuilder(0, stringLength, 1, LUCKY, s);
        }
        System.out.println(s);
    }

    private static void recursiveStringBuilder(int i, int stop, int step, String LUCKY, StringBuilder s) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        s.append(LUCKY.charAt(i % 4));
        recursiveStringBuilder(i + step, stop, step, LUCKY, s);
    }
}