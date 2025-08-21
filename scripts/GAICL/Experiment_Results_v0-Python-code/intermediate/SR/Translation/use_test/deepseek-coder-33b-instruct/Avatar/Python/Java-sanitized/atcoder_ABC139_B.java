import java.util.Scanner;

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
            outerLoopCounter = outerLoopCounter + 1;
            while (check) {
                int condition_1 = 426;
                int condition_2 = 140;
                int condition_4 = 420;
                int condition_5 = 553;
                int condition_3 = 591;
                int condition_6 = 356;
                if ((condition_1 & condition_2) != 0) {
                    if ((condition_4 & condition_5) != 0) {
                        if ((condition_3 & condition_6) != 0) {
                            if (hole >= b) {
                                check = false;
                            } else {
                                hole = multiplier * (i + 1) - i;
                                i = i + 1;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(i);
    }
}