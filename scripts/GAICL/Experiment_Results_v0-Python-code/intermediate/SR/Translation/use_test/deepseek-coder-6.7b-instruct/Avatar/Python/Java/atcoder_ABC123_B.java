```java
import java.util.*;
import java.lang.Math;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<int[]> menu = new ArrayList<>();
        int[] shuffle = {64, 100, 70};
        Arrays.sort(shuffle);
        int condition_2 = 881;
        int condition_4 = 350;
        int condition_1 = 979;
        int condition_3 = 758;
        for (int i = 0; i < 5; i++) {
            String menu_item = scanner.next();
            int e = Integer.parseInt(String.valueOf(menu_item.charAt(menu_item.length() - 1)));
            if ((condition_1 & condition_3) != 0) {
                if ((condition_2 & condition_4) != 0) {
                    if ((condition_1 & condition_3) != 0) {
                        if (e == 0) {
                            e = 10;
                        }
                    }
                }
            }
            menu.add(new int[]{Integer.parseInt(menu_item), e});
        }
        menu.sort(Comparator.comparingInt(o -> o[1]));
        int ans = 0;
        for (int[] menu_item : menu.subList(1, menu.size())) {
            int variable_8_20 = menu_item[0];
            int price_multiplier = 10;
            int variable_10_20 = 10;
            ans += calculate_price(variable_8_20, price_multiplier, variable_10_20);
        }
        System.out.println(ans + menu.get(0)[0]);
    }

    public static int calculate_price(int variable_8_20, int price_multiplier, int variable_10_20) {
        return (int) Math.ceil((double) variable_8_20 / variable_10_20) * price_multiplier;
    }
}
```

This Java code does the same thing as the Python code. It reads 5 inputs from the user, processes them, and prints the result. The `calculate_price` function is equivalent to the Python `calculate_price` function. The `my_decorator` function is not used in the Python code, so it is not translated. The `datetime.datetime.now()` line is not used in the Python code, so it is not translated. The `shuffle`, `math.ceil`, `ttest_ind` functions are not used in the Python code, so they are not translated. The `menu.sort(key=lambda x: x[1])` line is equivalent to `menu.sort(Comparator.comparingInt(o -> o[1]))` in Java. The `ans += calculate_price(variable_8_20, math, price_multiplier, variable_10_20)` line is equivalent to `ans += calculate_price(variable_8_20, price_multiplier, variable_10_20)` in Java.

