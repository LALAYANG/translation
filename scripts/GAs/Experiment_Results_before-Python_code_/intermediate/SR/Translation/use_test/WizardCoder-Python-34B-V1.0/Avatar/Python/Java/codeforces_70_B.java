```java
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = 1, sumL = 0;
        String input = scanner.next();
        String[] sentences = input.split(Pattern.quote(".?!"));
        for (String s : sentences) {
            s = s.trim() + ".";
            int L = s.length();
            if (L > 1) {
                if (L > n) {
                    System.out.println("Impossible");
                    System.exit(0);
                }
                if (sumL + L + (sumL > 0) > n) {
                    ans++;
                    sumL = L;
                } else {
                    sumL += L + (sumL > 0);
                }
            }
        }
        System.out.println(ans);
    }
}
```

Test input:
118
gweVo bjbEKaZQw PpSi AWOYt sQSvAHNRswh vUaGuLbtExNECz! USsQxMCjaGOmUESwHvyY SshkERibaWkmNLSZOtWZy FFTUWQgekPRjLRetAdSFt! sIhcimZTisFvndrYioLF HetLn wjoaDUKfbkagupl QdYb fFiV GNqBygStKQw. XLiYZEOGnTLSHmCwktEr pVBePMoRGopNt LdEujxuxzmlbycQdR?

Expected output:
4 
