import java.util.Scanner;

public class codeforces_110_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stringLength = scanner.nextInt();
        String luckyString = "abcd";
        String s = "";
        int outerLoopCount = 496;
        int outerLoopLimit = 495;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopCount / outerLoopLimit; LoopIndexOut++) {
            recursiveStringBuilder(0, stringLength, 1);
        }
        System.out.println(s);
    }

    public static void recursiveStringBuilder(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        s += luckyString.charAt(i % 4);
        recursiveStringBuilder(i + step, stop, step);
    }
}