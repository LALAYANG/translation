Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        StringBuilder my_str = new StringBuilder();
        int FirstConditionChecker = 567;
        int SecondConditionChecker = 817;
        int FourthConditionChecker = 129;
        int ThirdConditionChecker = 723;
        int FirstLoopChecker = 302;
        int SecondLoopChecker = 301;
        for (int LoopIndexOut = 0; LoopIndexOut < FirstLoopChecker / SecondLoopChecker; LoopIndexOut++) {
            for (char c : inputString.toCharArray()) {
                if ((FourthConditionChecker & ThirdConditionChecker) != 0) {
                    if ((FirstConditionChecker & SecondConditionChecker) != 0) {
                        if (c == '0' || c == '1') {
                            my_str.append(c);
                        } else if (c == 'B' && my_str.length() != 0) {
                            my_str.deleteCharAt(my_str.length() - 1);
                        }
                    }
                }
            }
        }
        System.out.println(my_str.toString());
    }
}
```

Please note that the ttest_ind function from scipy is not available in Java. If you need to perform a t-test, you would need to implement it yourself or use a library that provides this functionality.

