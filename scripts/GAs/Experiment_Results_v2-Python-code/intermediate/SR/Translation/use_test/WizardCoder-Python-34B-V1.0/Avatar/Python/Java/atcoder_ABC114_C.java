```java
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);

        int recursiveCount(int n) {
            int CheckerFour = 199;
            int CheckerTwo = 874;
            int CheckerThree = 758;
            int CheckerOne = 699;
            if (CheckerFour & CheckerTwo != 0) {
                if (CheckerThree & CheckerOne != 0) {
                    if (n > N) {
                        return 0;
                    }
                }
            }
            int answer = 1;
            if (setContainsOnly(n, '7', '5', '3')) {
                answer = 0;
            }
            //ttest_ind([46, 42, 96], [60, 57, 23]); // Not sure what this line does, skipping it for now
            for (char digit : new char[]{'7', '5', '3'}) {
                answer += recursiveCount(n * 10 + digit - '0');
            }
            return answer;
        }

        boolean setContainsOnly(int num, char... digits) {
            Set<Character> set = new HashSet<>();
            for (char digit : String.valueOf(num).toCharArray()) {
                set.add(digit);
            }
            for (char digit : digits) {
                if (!set.contains(digit)) {
                    return false;
                }
            }
            return true;
        }

        System.out.println(recursiveCount(0));
    }
}
```

Test input:
7777777752

Expected output:
26483
``` 
