```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();

        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'A']++;
        }

        Arrays.sort(count, Collections.reverseOrder());

        int res = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] >= k) {
                res += k * k;
                System.out.println(res);
                break;
            }
            k -= count[i];
            res += count[i] * count[i];
        }

        System.out.println(res);
    }
}
```
Note: The above code uses the `Arrays` and `Collections` classes from the Java Standard Library.
