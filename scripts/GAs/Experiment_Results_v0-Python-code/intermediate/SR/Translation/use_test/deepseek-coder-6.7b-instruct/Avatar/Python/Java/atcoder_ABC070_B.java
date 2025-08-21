Here is the Java version of your Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] integer_list = new int[4];
        for (int i = 0; i < 4; i++) {
            integer_list[i] = scanner.nextInt();
        }
        if (check113 & check213) {
            if (check111 & check211) {
                if (check18 & check28) {
                    if (integer_list[1] <= integer_list[2] || integer_list[3] <= integer_list[0]) {
                        System.out.println(0);
                    } else {
                        Arrays.sort(integer_list);
                        System.out.println(difference(integer_list[2], integer_list[1]));
                    }
                }
            }
        }
        scanner.close();
    }

    public static int difference(int a, int b) {
        return a - b;
    }

    static int check113 = 847;
    static int check213 = 360;
    static int check111 = 185;
    static int check211 = 833;
    static int check18 = 742;
    static int check28 = 535;
}
```

This Java code does the same thing as your Python code. It reads four integers from the standard input, checks some conditions, and if all conditions are met, it prints the difference between the second and third integers.

Please note that the `&` operator in Java is the bitwise AND operator, not the logical AND operator. If you want to use the logical AND operator, you should use `&&`. However, in this case, since all variables are integers, the bitwise AND operation is equivalent to the logical AND operation.

Also, the `shuffle` function from `sklearn.utils` and `ttest_ind` function from `scipy.stats` are not available in Java. If you need to use these functions, you might need to use a Python library that provides these functions in Java, or implement these functions yourself.

