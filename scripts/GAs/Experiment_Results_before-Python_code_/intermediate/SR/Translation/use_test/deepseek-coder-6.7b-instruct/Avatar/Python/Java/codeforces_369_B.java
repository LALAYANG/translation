```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int sa = scanner.nextInt();
        int sk = scanner.nextInt();
        scanner.close();

        List<Integer> ans = new ArrayList<>();
        ans.addAll(getNums(k, sk));
        ans.addAll(getNums(n - k, sa - sk));

        StringBuilder output = new StringBuilder();
        for (int num : ans) {
            output.append(num).append(" ");
        }
        System.out.println(output.toString().trim());
    }

    private static List<Integer> getNums(int num, int t) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            if (i < t % num) {
                nums.add(t / num + 1);
            } else {
                nums.add(t / num);
            }
        }
        return nums;
    }
}
```

This Java code does the same thing as the Python code. It reads in six integers from the input, uses them to calculate two lists of integers, and then prints out the concatenated list of integers. The `getNums` method in the Java code is equivalent to the `get_nums` function in the Python code.

