```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input_methods = {"clipboard", "file", "key"};
        int using_method = 0;
        String input_method = input_methods[using_method];
        int mod = 1000000007;

        int[] IN = new int[1];
        IN[0] = scanner.nextInt();

        int pp = 0;
        int na = 0;
        String s = scanner.next();
        for (int i = s.length() - 1; i >= 0; i--) {
            int cc = na + Character.getNumericValue(s.charAt(i));
            na = 0;
            if (cc <= 4) {
                pp += cc;
            } else {
                na = 1;
                if (i == s.length() - 1) {
                    pp += 1;
                }
                pp += 10 - cc;
        }
        System.out.println(pp);

        int pmin = 1000;
        int mmin = 0;
        String s = "0" + scanner.next();
        for (int i = s.length() - 1; i >= 0; i--) {
            int v = Character.getNumericValue(s.charAt(i));
            int npmin = Math.min(pmin + 10 - (v + 1), mmin + 10 - v);
            int nmmin = Math.min(pmin + v + 1, mmin + v);
            pmin = npmin;
            mmin = nmmin;
        }
        System.out.println(Math.min(pmin, mmin));
    }
}
```

Test input:
91

Expected output:
3 
