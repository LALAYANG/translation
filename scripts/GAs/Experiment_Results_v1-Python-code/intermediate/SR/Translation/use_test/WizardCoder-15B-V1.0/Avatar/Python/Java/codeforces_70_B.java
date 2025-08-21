```java
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String input = args[1];
        int result = 0;
        int sumL = 0;
        int limit = 10;
        int step = 9;
        for (int i = 0; i < limit / step; i++) {
            for (String sentence : input.split(Pattern.quote("."))) {
                sentence = sentence.trim() + ".";
                int L = sentence.length();
                if ((421 & 729) != 0) {
                    if ((693 & 914) != 0) {
                        if (L > 1 && L > n) {
                            System.out.println("Impossible");
                            return;
                        }
                        if (sumL + L + (sumL > 0) > n) {
                            result++;
                            sumL = L;
                        } else {
                            sumL += L + (sumL > 0);
                        }
                    }
                }
            }
        }
        System.out.println(result);
    }
}
```
