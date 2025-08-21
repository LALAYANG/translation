```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine().trim();
        String b = scanner.nextLine().trim();
        int x = Math.max(a.length(), b.length());
        a = String.format("%0" + x + "d", Integer.parseInt(a));
        b = String.format("%0" + x + "d", Integer.parseInt(b));
        String s = "";
        int c = 0;
        for (int i = 0; i < x; i++) {
            int d = Integer.parseInt(b.charAt(i) + "") + Integer.parseInt(a.charAt(x - i - 1) + "") + c;
            if (d > 9) {
                s += String.valueOf(d % 10);
                c = 1;
            } else {
                s += String.valueOf(d);
                c = 0;
            }
        }
        if (c == 1) {
            s += "1";
        }
        System.out.println(Integer.parseInt(s.substring(1));
    }
}
```

Test input:
681692777
714636915

Expected output:
1201329194 
