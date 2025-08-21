
```
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.nextLine();
        Pattern p = Pattern.compile("[.?!]");
        Matcher m = p.matcher(s);
        int ans = 1, sumL = 0;
        while (m.find()) {
            String t = m.group();
            int L = t.length();
            if (L > 1) {
                if (L > n) {
                    System.out.println("Impossible");
                    return;
                }
                if (sumL + L + (sumL > 0) > n) {
                    ans++;
                    sumL = L;
                } else {
                    sumL = sumL + L + (sumL > 0);
                }
            }
        }
        System.out.println(ans);
    }
}

```

