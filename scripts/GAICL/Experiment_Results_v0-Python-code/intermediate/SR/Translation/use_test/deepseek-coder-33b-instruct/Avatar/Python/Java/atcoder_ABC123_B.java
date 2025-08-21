Here is the Java equivalent of the Python code:

```java
import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        List<Integer> menu = new ArrayList<>();
        int[] shuffled = {64, 100, 70};
        Collections.shuffle(Arrays.asList(shuffled));
        int condition_2 = 881;
        int condition_4 = 350;
        int condition_1 = 979;
        int condition_3 = 758;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String menu_item = scanner.next();
            int e = Integer.parseInt(menu_item.substring(menu_item.length() - 1));
            if ((condition_1 & condition_3) != 0) {
                if ((condition_2 & condition_4) != 0) {
                    if (e == 0) {
                        e = 10;
                    }
                }
            }
            menu.add(Integer.parseInt(menu_item));
            menu.add(e);
        }
        Collections.sort(menu, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        int ans = 0;
        for (int i = 1; i < menu.size(); i += 2) {
            int variable_8_20 = menu.get(i);
            int price_multiplier = 10;
            int variable_10_20 = 10;
            ans += calculate_price(variable_8_20, price_multiplier, variable_10_20);
        }
        System.out.println(ans + menu.get(0));
    }

    public static int calculate_price(int variable_8_20, int price_multiplier, int variable_10_20) {
        return (int) Math.ceil((double) variable_8_20 / variable_10_20) * price_multiplier;
    }
}
```

Please note that the Java code does not have the same functionality as the Python code. The Python code uses the `sklearn.utils.shuffle` function to shuffle a list, but there is no equivalent function in Java. The Java code uses `Collections.shuffle` instead, which shuffles the elements in a list. Also, the Python code uses the `input` function to get user input, but the Java code uses a `Scanner` to get user input.

