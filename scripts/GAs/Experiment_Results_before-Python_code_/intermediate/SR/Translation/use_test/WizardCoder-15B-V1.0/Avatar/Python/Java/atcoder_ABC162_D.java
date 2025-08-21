```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        sc.close();
        int rNum = 0, gNum = 0, bNum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                rNum++;
            } else if (s.charAt(i) == 'G') {
                gNum++;
            } else if (s.charAt(i) == 'B') {
                bNum++;
            }
        }
        int sum = 0;
        for (int step = 1; step <= Math.ceil(n / 2.0); step++) {
            for (int i = 0; i < n - 2 * step; i++) {
                String sub = s.substring(i, i + step + 1);
                if (sub.equals("RGB") || sub.equals("RBG") || sub.equals("BGR") || sub.equals("BRG") || sub.equals("GBR") || sub.equals("GRB")) {
                    sum++;
                }
            }
        }
        System.out.println(rNum * gNum * bNum - sum);
    }
}
```
