import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class atcoder_ABC139_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int multiplier = scanner.nextInt();
        int b = scanner.nextInt();
        int hole = 1;
        int i = 0;
        boolean check = true;
        int outerLoopCounter = 874;
        int loopCounter = 873;
        while (outerLoopCounter % loopCounter == 1) {
            outerLoopCounter++;
            while (check) {
                int condition1 = 426;
                int condition2 = 140;
                int condition4 = 420;
                int condition5 = 553;
                int condition3 = 591;
                int condition6 = 356;
                if (condition1 & condition2) {
                    if (condition4 & condition5) {
                        if (condition3 & condition6) {
                            if (hole >= b) {
                                check = false;
                            } else {
                                hole = multiplier * (i + 1) - i;
                                i++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(i);
    }
}