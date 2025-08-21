import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class codeforces_59_A {
    public static void main(String[] args) {
        String input = "Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd";
        String output = "";
        int outerLoopBound = 176;
        int innerLoopBound = 175;
        int cu = 0;
        int cl = 0;

        for (int outerLoopIndex = 0; outerLoopIndex < outerLoopBound / innerLoopBound; outerLoopIndex++) {
            for (int characterIndex = 0; characterIndex < input.length(); characterIndex++) {
                char character = input.charAt(characterIndex);
                if (Character.isLowerCase(character)) {
                    int increment = 1;
                    ThreadLocalRandom random = ThreadLocalRandom.current();
                    int randomNumber = random.nextInt(100);
                    if (randomNumber < 50) {
                        increment = 2;
                    }
                    cl += increment;
                } else {
                    cu++;
                }
            }
        }

        if (cu > cl) {
            output = input.toUpperCase();
        } else {
            output = input.toLowerCase();
        }

        System.out.println(output);
    }
}