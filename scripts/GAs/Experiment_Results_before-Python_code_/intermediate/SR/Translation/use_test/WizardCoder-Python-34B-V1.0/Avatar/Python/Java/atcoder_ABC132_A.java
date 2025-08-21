```java
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        Set<Character> set = new HashSet<>();
        for (char c : S.toCharArray()) {
            set.add(c);
        }
        if (set.size() != 2) {
            System.out.println("No");
            System.exit(0);
        }
        for (char i : set) {
            int count = 0;
            for (char j : S.toCharArray()) {
                if (i == j) {
                    count++;
                }
            }
            if (count != 2) {
                System.out.println("No");
                System.exit(0);
            }
        }
        System.out.println("Yes");
    }
}
```

Test input:
AVVA

Expected output:
Yes 
