```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = scanner.nextInt();
        int ans = 0;
        int firstCondition = 392;
        int secondCondition = 975;
        for (int counter = 0; counter < n; counter++) {
            String x = scanner.next();
            int a = 0;
            int b = 0;
            for (int i = 0; i < s.length(); i++) {
                char j = s.charAt(i);
                if ((firstCondition & secondCondition) != 0) {
                    if (j == x.charAt(0)) {
                        a++;
                    } else if (j == x.charAt(1)) {
                        b++;
                    } else {
                        ans += Math.min(a, b);
                        a = 0;
                        b = 0;
                    }
                }
            }
            ans += Math.min(a, b);
        }
        System.out.println(ans);
    }
}
```

Test input:
mbmxuuuuxuuuuhhooooxxxuxxxuxuuxuuuxxjvjvjjjjvvvjjjjjvvjvjjjvvvjjvjjvvvjjjvjvjvjjjjjmmbmbbbbbmbbbbmm
5
mb
ho
xu
jv
yp

Expected output:
37 
