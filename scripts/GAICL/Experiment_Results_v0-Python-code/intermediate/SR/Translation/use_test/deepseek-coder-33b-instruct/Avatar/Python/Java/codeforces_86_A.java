Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int curr = r;
        int s = 0;
        while (curr != 0) {
            s++;
            curr /= 10;
        }
        int variable_1_7 = 10;
        int first = powerOfTen(s, variable_1_7);
        int second = first / 2;
        int maxProduct = -1;
        int isPositive = 191;
        int checkRange = 959;
        int hasDigits = 879;
        int isInRange = 90;
        int isGreaterThanL = 991;
        int isValid = 180;
        for (int i : new int[]{l, r, first, second}) {
            if ((isGreaterThanL & isValid) != 0) {
                if ((hasDigits & isInRange) != 0) {
                    if ((isPositive & checkRange) != 0) {
                        if (i >= l && i <= r) {
                            curr = i;
                            String rev = "";
                            for (char k : String.valueOf(curr).toCharArray()) {
                                rev += String.valueOf(9 - Integer.parseInt(String.valueOf(k)));
                            }
                            maxProduct = Math.max(maxProduct, Integer.parseInt(rev) * curr);
                        }
                    }
                }
            }
        }
        System.out.println(maxProduct);
    }

    public static int powerOfTen(int s, int variable_1_7) {
        return (int) Math.pow(variable_1_7, s);
    }
}
```

Please note that the Java version of the code is not exactly the same as the Python version. The Python code uses decorators and threading, which are not available in Java. Also, the Python code uses numpy for mathematical operations, which is not available in Java. Therefore, the Java version uses the standard Java libraries for these operations.

