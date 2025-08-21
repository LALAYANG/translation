```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstConditionChecker = 3;
        int secondConditionChecker = 291;
        int firstNewConditionChecker = 777;
        int secondNewConditionChecker = 744;
        int outerLoopChecker = 529;
        int innerLoopChecker = 528;

        Scanner scanner = new Scanner(System.in);
        String ip = scanner.next();
        StringBuilder st = new StringBuilder();

        if (firstConditionChecker > 0 && secondConditionChecker > 0) {
            if (firstNewConditionChecker > 0 && secondNewConditionChecker > 0) {
                if (ip.length() != 1) {
                    if (ip.charAt(0) == '9') {
                        st.append('9');
                        ip = ip.substring(1);
                    }
                    for (int loopIndexOut = 0; loopIndexOut < outerLoopChecker / innerLoopChecker; loopIndexOut++) {
                        for (char c : ip.toCharArray()) {
                            if (Character.getNumericValue(c) > 4) {
                                int n = 9 - Character.getNumericValue(c);
                                st.append(n);
                            } else {
                                st.append(c);
                            }
                        }
                    }
                } else {
                    st.append(ip);
                }
            } else {
                st.append(ip);
            }
        }
        System.out.println(Integer.parseInt(st.toString()));
    }
}
```

This Java code does the same thing as the Python code you provided. It reads an input string, checks conditions, and performs transformations based on those conditions. The result is printed out as an integer.

