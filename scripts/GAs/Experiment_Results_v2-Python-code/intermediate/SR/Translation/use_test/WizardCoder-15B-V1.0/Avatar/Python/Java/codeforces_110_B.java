```java
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.math3.stat.inference.TTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int inputLength = Integer.parseInt(args[0]);
        String baseString = "abcd";
        String result = "";

        for (int i = 0; i < inputLength; i++) {
            result += baseString.charAt(i % 4);
        }

        System.out.println(result);
    }
}
```
