```java
import java.util.Arrays;

public class StringBuilder {
    private static String baseString = "abcd";
    private static StringBuilder s = new StringBuilder();

    public static void main(String[] args) {
        int inputLength = 74;
        stringBuilder(0, inputLength, 1);
        System.out.println(s.toString());
    }

    private static void stringBuilder(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        s.append(baseString.charAt(i % 4));
        stringBuilder(i + step, stop, step);
    }
}
```
