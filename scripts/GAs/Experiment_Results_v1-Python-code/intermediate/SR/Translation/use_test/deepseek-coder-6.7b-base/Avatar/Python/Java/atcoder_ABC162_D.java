```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int redCount = countChar(s, 'R');
        int gNum = countChar(s, 'G');
        int bNum = countChar(s, 'B');
        int sum = 0;
        for (int step = 1; step <= Math.ceil(n / 2.0); step++) {
            for (int i = 0; i < n - 2 * step; i++) {
                String sub = s.substring(i, i + 3);
                if (sub.equals("RGB") || sub.equals("RBG") || sub.equals("BGR") || sub.equals("BRG") || sub.equals("GBR") || sub.equals("GRB")) {
                    sum++;
                }
            }
        }
        System.out.println(redCount * gNum * bNum - sum);
    }

    public static int countChar(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}
```

