```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int sa = 0;
        String[] input = scanner.nextLine().split(" ");
        for (String s : input) {
            if (s.equals("-1")) {
                sa++;
            }
        }
        int min = Math.min(n - sa, sa);
        String[] ss = new String[m];
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            b -= a;
            if (b % 2 == 0 && b <= min * 2) {
                ss[i] = "1";
            } else {
                ss[i] = "0";
            }
        }
        for (String s : ss) {
            System.out.println(s);
        }
    }
}
```

Test input:
10 10
-1 1 -1 1 -1 -1 -1 -1 -1 -1
6 7
2 5
3 6
1 3
3 5
4 5
3 4
1 6
1 1
1 1

Expected output:
1
1
1
0
0
1
1
0
0
0 
