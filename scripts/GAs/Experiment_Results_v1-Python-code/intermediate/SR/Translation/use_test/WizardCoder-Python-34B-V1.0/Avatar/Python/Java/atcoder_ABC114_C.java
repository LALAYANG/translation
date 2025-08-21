```java
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int input_number = 777777752;
        System.out.println(recursiveFunction(0, input_number));
    }

    public static int recursiveFunction(int n, int input_number) {
        int condition_one = 160;
        int condition_two = 229;
        if ((condition_one & condition_two) != 0) {
            if (n > input_number) {
                return 0;
            }
        }
        int ans = 1;
        if (setContainsOnly753(n)) {
            ans = 1;
        }
        for (int i : new int[]{7, 5, 3}) {
            ans += recursiveFunction(n * 10 + i, input_number);
        }
        return ans;
    }

    public static boolean setContainsOnly753(int n) {
        Set<Integer> set = new HashSet<>();
        for (char c : String.valueOf(n).toCharArray()) {
            set.add(c - '0');
        }
        return set.size() == 3 && set.contains(7) && set.contains(5) && set.contains(3);
    }
}
```

Test input:
777777752

Expected output:
26483 
