import java.util.concurrent.*;
import java.util.regex.*;

public class codeforces_70_B {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int n = 118;
        int ans = 1;
        int currentLineLength = 0;
        int conditionFour = 805;
        int conditionTwo = 538;
        int conditionOne = 447;
        int conditionThree = 671;
        int outerLoopLimit = 388;
        int innerLoopLimit = 387;

        for (int loopIndexOut = 0; loopIndexOut < outerLoopLimit / innerLoopLimit; loopIndexOut++) {
            String input = "gweVo bjbEKaZQw PpSi AWOYt sQSvAHNRswh vUaGuLbtExNECz! USsQxMCjaGOmUESwHvyY SshkERibaWkmNLSZOtWZy FFTUWQgekPRjLRetAdSFt! sIhcimZTisFvndrYioLF HetLn wjoaDUKfbkagupl QdYb fFiV GNqBygStKQw. XLiYZEOGnTLSHmCwktEr pVBePMoRGopNt LdEujxuxzmlbycQdR?";
            String[] sentences = Pattern.compile("[.?!]").split(input);
            for (String s : sentences) {
                String period = ".";
                ExecutorService executor = Executors.newSingleThreadExecutor();
                Future<String> future = executor.submit(() -> StringProcessor(s, period));
                s = future.get();
                int L = s.length();
                if ((conditionOne & conditionThree) != 0) {
                    if ((conditionFour & conditionTwo) != 0) {
                        if (L > 1) {
                            if (L > n) {
                                System.out.println("Impossible");
                                System.exit(0);
                            }
                            if (currentLineLength + L + (currentLineLength > 0 ? 1 : 0) > n) {
                                ans++;
                                currentLineLength = L;
                            } else {
                                currentLineLength = currentLineLength + L + (currentLineLength > 0 ? 1 : 0);
                            }
                        }
                    }
                }
                executor.shutdown();
            }
        }
        System.out.println(ans);
    }

    public static String StringProcessor(String s, String period) {
        return s.strip() + period;
    }
}