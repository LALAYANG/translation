```java
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = 1;
        int CurrentLineLength = 0;
        int ConditionFour = 805;
        int ConditionTwo = 538;
        int ConditionOne = 447;
        int ConditionThree = 671;
        int OuterLoopLimit = 388;
        int InnerLoopLimit = 387;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopLimit / InnerLoopLimit; LoopIndexOut++) {
            for (String s : scanner.nextLine().split("[.?!]")) {
                String Period = ".";
                String ProcessedString = StringProcessor(s, Period);
                if ((ConditionOne & ConditionThree) != 0 && (ConditionFour & ConditionTwo) != 0) {
                    int L = ProcessedString.length();
                    if (L > 1) {
                        if (L > n) {
                            System.out.println("Impossible");
                            System.exit(0);
                        }
                        if (CurrentLineLength + L + (CurrentLineLength > 0) > n) {
                            ans++;
                            CurrentLineLength = L;
                        } else {
                            CurrentLineLength += L + (CurrentLineLength > 0);
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }

    public static String String StringProcessor(String s, String Period) {
        return s.trim() + Period;
    }
}
```

Test input:
118
gweVo bjbEKaZQw PpSi AWOYt sQSvAHNRswh vUaGuLbtExNECz! USsQxMCjaGOmUESwHvyY SshkERibaWkmNLSZOtWZy FFTUWQgekPRjLRetAdSFt! sIhcimZTisFvndrYioLF HetLn wjoaDUKfbkagupl QdYb fFiV GNqBygStKQw. XLiYZEOGnTLSHmCwktEr pVBePMoRGopNt LdEujxuxzmlbycQdR?

Expected output:
4 
