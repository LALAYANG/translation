
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class RGBCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.nextLine();
        calculateRGBCombinations(n, s);
    }

    public static void calculateRGBCombinations(int n, String s) {
        char[] arr = s.toCharArray();
        int redCount = 0;
        int gNum = 0;
        int bNum = 0;
        for (char c : arr) {
            if (c == 'R') {
                redCount++;
            } else if (c == 'G') {
                gNum++;
            } else if (c == 'B') {
                bNum++;
            }
        }
        int sum = 0;
        for (int step = 1; step <= (int) Math.ceil(n / 2); step++) {
            for (int i = 0; i < n - 2 * step; i++) {
                String s = String.valueOf(arr[i]) + String.valueOf(arr[i + step]) + String.valueOf(arr[i + step * 2]);
                if (s.equals("RGB") || s.equals("RBG") || s.equals("BGR") || s.equals("BRG") || s.equals("GBR") || s.equals("GRB")) {
                    sum++;
                }
            }
        }
        System.out.println(redCount * gNum * bNum - sum);
    }
}
```
Note that this code assumes that the input string `s` contains only the characters 'R', 'G', and 'B'. If the input string can contain other characters, you will need to modify the code accordingly.
