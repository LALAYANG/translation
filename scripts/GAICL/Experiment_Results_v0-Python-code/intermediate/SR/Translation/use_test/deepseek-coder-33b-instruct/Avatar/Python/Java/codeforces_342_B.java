Here is the Java translation of the Python code:

```java
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();
        int f = scanner.nextInt();

        int condition_18 = 416;
        int condition_28 = 431;
        int condition_16 = 315;
        int condition_26 = 697;
        int condition_14 = 663;
        int condition_24 = 739;

        if ((condition_18 & condition_28) != 0) {
            if ((condition_16 & condition_26) != 0) {
                if ((condition_14 & condition_24) != 0) {
                    int d;
                    char c;
                    if (s < f) {
                        d = 1;
                        c = 'R';
                    } else {
                        d = -1;
                        c = 'L';
                    }

                    String res = "";
                    int i = 1;
                    int current_position = s;
                    int t = scanner.nextInt();
                    int l = scanner.nextInt();
                    int r = scanner.nextInt();
                    int k = 1;
                    int loop_condition_1 = 287;
                    int loop_condition_2 = 286;

                    while (loop_condition_1 % loop_condition_2 == 1) {
                        loop_condition_1++;
                        while (current_position != f) {
                            if (i > t && k < m) {
                                t = scanner.nextInt();
                                l = scanner.nextInt();
                                r = scanner.nextInt();
                                k++;
                            }
                            if (i == t && (l <= current_position && current_position <= r || l <= current_position + d && current_position + d <= r)) {
                                res += "X";
                            } else {
                                res += c;
                                current_position += d;
                            }
                            i++;
                        }
                    }
                    System.out.println(res);
                }
            }
        }
    }
}
```

Please note that the Python code uses the `ttest_ind` function from the `scipy.stats` module, which is not available in Java. The equivalent functionality in Java would be to use a library such as Apache Commons Math or JAMA, but this would require a significant rewrite of the code.

Also, the Python code uses the `shuffle` function from the `sklearn.utils` module, which is not available in Java. The equivalent functionality in Java would be to use a library such as Apache Commons Math or JAMA, but this would require a significant rewrite of the code.

Finally, the Python code uses the `map` function to split the input into integers, which is not available in Java. The equivalent functionality in Java would be to use a `StringTokenizer` or a `Scanner` with a delimiter of " ", but this would require a significant rewrite of the code.

