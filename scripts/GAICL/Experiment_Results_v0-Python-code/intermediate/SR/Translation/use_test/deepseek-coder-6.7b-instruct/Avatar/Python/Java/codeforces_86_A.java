Here is the Java equivalent of the Python code:

```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int curr = r;
        int s = 0;
        while (curr > 0) {
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
            if ((isGreaterThanL & isValid) > 0) {
                if ((hasDigits & isInRange) > 0) {
                    if ((isPositive & checkRange) > 0) {
                        if (i >= l && i <= r) {
                            int rev = Integer.parseInt(new StringBuilder(String.valueOf(i)).reverse().toString());
                            maxProduct = Math.max(maxProduct, rev * i);
                        }
                    }
                }
            }
        }
        System.out.println(maxProduct);
    }

    static int powerOfTen(int s, int variable_1_7) {
        return (int) Math.pow(variable_1_7, s);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, calculates the power of 10 for the second integer, and then iterates over the four numbers (the two input integers, the power of 10, and the power of 10 divided by 2). For each number, it checks if it is within the range of the two input integers, has digits in the range 0-7, is positive, and is greater than the first input integer. If all these conditions are met, it calculates the "reverse" of the number by reversing its digits and then calculates the product of the number and its reverse. The maximum product is stored and printed at the end.

