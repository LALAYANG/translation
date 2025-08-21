```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String news = scanner.nextLine();
        int n = scanner.nextInt();
        int ans = 0;
        int checker_two = 395;
        int checker_one = 753;
        int a = 0;
        int b = 0;
        for (int i = 0; i < n; i++) {
            String x = scanner.next();
            for (int j = 0; j < news.length(); j++) {
                char currentChar = news.charAt(j);
                if ((checker_two & checker_one) != 0) {
                    if (currentChar == x.charAt(0)) {
                        a++;
                    } else if (currentChar == x.charAt(1)) {
                        b++;
                    } else {
                        ans += Math.min(a, b);
                        a = 0;
                        b = 0;
                    }
                }
            }
            ans = add_min(ans, a, b, Math.min(a, b));
        }
        System.out.println(ans);
    }

    public static int add_min(int ans, int a, int b, int min) {
        return ans + min;
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
