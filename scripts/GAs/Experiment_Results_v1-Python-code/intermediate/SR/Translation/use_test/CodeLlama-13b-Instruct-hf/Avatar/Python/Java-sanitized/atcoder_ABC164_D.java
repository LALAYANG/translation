import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC164_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int moduloNumber = 2019;
        int[] m = new int[moduloNumber];
        int a = 0;
        int r = 0;
        int outerLoopCounter = 325;
        int innerLoopCounter = 324;

        String s = scanner.nextLine();
        int[] sArray = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            sArray[i] = Integer.parseInt(s.substring(i, i + 1));
        }

        for (int i = 0; i < sArray.length; i++) {
            a += sArray[i] * (int) Math.pow(10, i, moduloNumber);
            r += m[a % moduloNumber];
            m[a % moduloNumber] += 1;
        }

        for (int i = 0; i < outerLoopCounter / innerLoopCounter; i++) {
            recursiveLoop(i, outerLoopCounter, innerLoopCounter);
        }

        System.out.println(r);
    }

    public static void recursiveLoop(int LoopIndexOut, int stop, int step) {
        if (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
            return;
        }

        for (int i = 0; i < sArray.length; i++) {
            a += sArray[i] * (int) Math.pow(10, i, moduloNumber);
            r += m[a % moduloNumber];
            m[a % moduloNumber] += 1;
        }

        recursiveLoop(LoopIndexOut + step, stop, step);
    }
}