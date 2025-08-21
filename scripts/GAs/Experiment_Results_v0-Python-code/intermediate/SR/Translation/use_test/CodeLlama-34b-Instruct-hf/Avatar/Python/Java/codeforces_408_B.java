```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int[] boughtCount = new int[26];
        for (int i = 0; i < line.length(); i++) {
            boughtCount[line.charAt(i) - 'a']++;
        }

        line = sc.nextLine();
        int[] madeCount = new int[26];
        for (int i = 0; i < line.length(); i++) {
            madeCount[line.charAt(i) - 'a']++;
        }

        int res = 0;
        for (int i = 0; i < 26; i++) {
            res += Math.min(boughtCount[i], madeCount[i]);
        }

        System.out.println(res);
    }
}
```
Note: The above code assumes that the input strings only contain lowercase letters. If the input strings can contain uppercase letters as well, you may need to modify the code accordingly.
