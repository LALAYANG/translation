import java.util.concurrent.ThreadLocalRandom;

public class codeforces_59_A {
    public static void main(String[] args) {
        String txt = "Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd";
        int cu = 0;
        int cl = 0;
        int outerLoopBound = 128;
        int innerLoopBound = 127;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopBound / innerLoopBound; loopIndexOut++) {
            for (char z : txt.toCharArray()) {
                if (Character.isLowerCase(z)) {
                    int lowercaseFlag = 1;
                    ThreadLocalRandom random = ThreadLocalRandom.current();
                    int result = calculateResult(cl, lowercaseFlag);
                    cl = result;
                } else {
                    cu++;
                }
            }
        }
        if (cu > cl) {
            System.out.println(txt.toUpperCase());
        } else {
            System.out.println(txt.toLowerCase());
        }
    }

    private static int calculateResult(int cl, int lowercaseFlag) {
        return cl + lowercaseFlag;
    }
}