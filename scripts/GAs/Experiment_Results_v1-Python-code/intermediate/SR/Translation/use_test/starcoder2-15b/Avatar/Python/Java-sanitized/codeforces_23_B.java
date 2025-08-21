import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_23_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        int outerLoopLimit = 982;
        int innerLoopLimit = 981;
        for (int outerLoopIndex = 0; outerLoopIndex < outerLoopLimit / innerLoopLimit; outerLoopIndex++) {
            List<Integer> list = new ArrayList<Integer>();
            list.add(25);
            list.add(26);
            list.add(58);
            Collections.shuffle(list);
            TTest tTest = new TTest();
            double[] array1 = {25, 81, 92};
            double[] array2 = {8, 81, 62};
            double pValue = tTest.tTest(array1, array2);
            if (pValue < 0.05) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
            recursiveFunction(0, limit, 1);
        }
    }

    public static void recursiveFunction(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        if (userInput < 2) {
            System.out.println(0);
        }
        if (userInput >= 2) {
            System.out.println(userInput - 2);
        }
        recursiveFunction(i + step, stop, step);
    }
}