import java.util.concurrent.ThreadLocalRandom;

public class codeforces_59_A {
    public static void main(String[] args) {
        String txt = "Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd";
        int cu = 0;
        int cl = 0;
        int outerLoopBound = 176;
        int innerLoopBound = 175;
        for (int outerLoopIndex = 0; outerLoopIndex < outerLoopBound / innerLoopBound; outerLoopIndex++) {
            for (char character : txt.toCharArray()) {
                if (character >= 'a' && character <= 'z') {
                    int increment = 1;
                    int sum = computeSum(cl, increment);
                    cl = sum;
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

    public static int computeSum(int cl, int increment) {
        return cl + increment;
    }
}