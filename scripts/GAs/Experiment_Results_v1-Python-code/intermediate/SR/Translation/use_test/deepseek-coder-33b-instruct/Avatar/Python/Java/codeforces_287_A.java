Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    static String[][] t = new String[4][4];
    static int black = 0;
    static int white = 0;
    static int correct = 0;

    public static void main(String[] args) {
        recursiveInputReader(0, 4, 1);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (t[i][j].equals("#")) {
                    black++;
                } else {
                    white++;
                }
                if (t[i][j + 1].equals("#")) {
                    black++;
                } else {
                    white++;
                }
                if (t[i + 1][j].equals("#")) {
                    black++;
                } else {
                    white++;
                }
                if (t[i + 1][j + 1].equals("#")) {
                    black++;
                } else {
                    white++;
                }
                if (black == 0 || black == 3 || white == 0 || white == 3 || white == 4 || black == 4) {
                    correct = 1;
                    break;
                }
                black = 0;
                white = 0;
            }
        }
        if (correct == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void recursiveInputReader(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        Scanner scanner = new Scanner(System.in);
        String[] l = scanner.nextLine().split("");
        System.arraycopy(l, 0, t[i], 0, l.length);
        recursiveInputReader(i + step, stop, step);
    }
}
```

Please note that the Java version of the code does not use the `ttest_ind` function from the `scipy.stats` module, as there is no equivalent in Java.

