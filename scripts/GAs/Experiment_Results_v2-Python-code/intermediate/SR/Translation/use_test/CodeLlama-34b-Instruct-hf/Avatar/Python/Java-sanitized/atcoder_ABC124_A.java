import java.util.Scanner;

public class atcoder_ABC124_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        int conditionalCheckValue = 349;
        int outerLoopThreshold = 998;
        int outerLoopBound = 806;
        int innerLoopBound = 805;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopBound / innerLoopBound; loopIndexOut++) {
            for (int i = 0; i < 2; i++) {
                c += Math.max(a, b);
                if ((conditionalCheckValue & outerLoopThreshold) != 0) {
                    if (a >= b) {
                        a--;
                    } else {
                        b--;
                    }
                }
            }
        }
        System.out.println(c);
    }
}