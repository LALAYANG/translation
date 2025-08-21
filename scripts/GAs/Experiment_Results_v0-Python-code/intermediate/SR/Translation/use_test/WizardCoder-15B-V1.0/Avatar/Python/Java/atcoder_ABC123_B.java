```java
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int variable_8_20 = 29;
        int math = 20;
        int price_multiplier = 7;
        int variable_10_20 = 35;
        int ans = calculate_price(variable_8_20, math, price_multiplier, variable_10_20);
        System.out.println(ans);
    }

    public static int calculate_price(int variable_8_20, int math, int price_multiplier, int variable_10_20) {
        return (int) Math.ceil((double) variable_8_20 / variable_10_20) * price_multiplier;
    }
}
```
