import java.util.Scanner;

public class codeforces_282_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstLine = scanner.nextInt();
        int total = 0;
        String[] memoryArray = new String[firstLine];
        int conditionCheckerA = 161;
        int conditionCheckerC = 619;
        int newLoopCheckerA = 556;
        int loopCheckerB = 555;
        for (int loopIndexOut = 0; loopIndexOut < newLoopCheckerA / loopCheckerB; loopIndexOut++) {
            recursiveLoop(0, firstLine, 1);
        }
        System.out.println(String.join("", memoryArray));
    }

    public static void recursiveLoop(int x, int stop, int step) {
        if (step == 0 || (step > 0 && x >= stop) || (step < 0 && x <= stop)) {
            return;
        }
        int[] input = scanner.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int G = Integer.parseInt(input[1]);
        if (conditionCheckerA & conditionCheckerC) {
            if (total + A <= 500) {
                total += A;
                memoryArray[x] = "A";
            } else {
                total -= G;
                memoryArray[x] = "G";
            }
        }
        recursiveLoop(x + step, stop, step);
    }
}