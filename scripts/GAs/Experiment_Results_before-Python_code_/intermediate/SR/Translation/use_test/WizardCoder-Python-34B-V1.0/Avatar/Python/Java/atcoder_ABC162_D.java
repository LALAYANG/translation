```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int rNum = 0, gNum = 0, bNum = 0, sum = 0;
        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == 'R') {
                rNum++;
            } else if (S.charAt(i) == 'G') {
                gNum++;
            } else if (S.charAt(i) == 'B') {
                bNum++;
            }
        }
        for (int step = 1; step <= Math.ceil(N / 2.0); step++) {
            for (int i = 0; i < N - 2 * step; i++) {
                String s = "" + S.charAt(i) + S.charAt(i + step) + S.charAt(i + 2 * step);
                if (s.equals("RGB") || s.equals("RBG") || s.equals("BGR") || s.equals("BRG") || s.equals("GBR") || s.equals("GRB")) {
                    sum++;
                }
            }
        }
        System.out.println(rNum * gNum * bNum - sum);
    }
}
```

Test input:
10
BBBBBBBBBB

Expected output:
0 
