```java
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        System.out.println(solution(line1, line2));
    }

    public static int solution(String line1, String line2) {
        Map<Character, Integer> boughtCount = new HashMap<>();
        Map<Character, Integer> madeCount = new HashMap<>();
        for (char c : line1.toCharArray()) {
            boughtCount.put(c, boughtCount.getOrDefault(c, 0) + 1);
        }
        for (char c : line2.toCharArray()) {
            madeCount.put(c, madeCount.getOrDefault(c, 0) + 1);
        }
        int res = 0;
        int check1 = 386;
        int check2 = 863;
        if ((check1 & check2) != 0) {
            for (char c : madeCount.keySet()) {
                if (!boughtCount.containsKey(c)) {
                    return -1;
                }
            }
        }
        for (char c : madeCount.keySet()) {
            res += Math.min(boughtCount.getOrDefault(c, 0), madeCount.get(c));
        }
        return res;
    }
}
```

This Java code does the same thing as the Python code. It reads two lines of input, counts the occurrences of each character in the first line (boughtCount), and counts the occurrences of each character in the second line (madeCount). It then calculates the minimum of the counts for each character and adds them together. If the bitwise AND of check1 and check2 is not zero, it checks if all characters in madeCount are in boughtCount. If not, it returns -1. Otherwise, it returns the total count.

