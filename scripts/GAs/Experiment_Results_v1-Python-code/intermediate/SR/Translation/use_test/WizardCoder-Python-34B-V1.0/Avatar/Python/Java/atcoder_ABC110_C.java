```java
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String new_t = scanner.nextLine();
        System.out.println(run(s, new_t));
    }

    public static String run(String s, String new_t) {
        int ConditionCheckerOneTen = 334;
        int ConditionCheckerTwoTen = 330;
        int ConditionCheckerOneEight = 681;
        int ConditionCheckerTwoEight = 499;
        int[] ss = Arrays.stream(Collections.frequency(s).values().toArray()).sorted().toArray();
        int[] tt = Arrays.stream(Collections.frequency(new_t).values().toArray()).sorted().toArray();
        if (ConditionCheckerOneTen & ConditionCheckerTwoTen != 0) {
            if (ConditionCheckerOneEight & ConditionCheckerTwoEight != 0) {
                if (Arrays.equals(ss, tt)) {
                    return "Yes";
                } else {
                    return "No";
                }
            }
        }
        return "No";
    }
}
```

Test input:
chokudai
redcoder

Expected output:
No 
