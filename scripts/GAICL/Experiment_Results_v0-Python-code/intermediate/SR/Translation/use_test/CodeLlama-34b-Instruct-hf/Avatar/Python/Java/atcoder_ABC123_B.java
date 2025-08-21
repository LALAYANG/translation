```
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> menu = new ArrayList<>();
        int condition_1 = 881;
        int condition_2 = 350;
        int condition_3 = 979;
        int condition_4 = 758;
        int condition_5 = 303;
        int condition_6 = 142;

        for (int i = 0; i < 5; i++) {
            int menu_item = scanner.nextInt();
            int e = menu_item % 10;
            if (condition_1 & condition_3) {
                if (condition_2 & condition_4) {
                    if (e == 0) {
                        e = 10;
                    }
                }
            }
            menu.add(menu_item);
        }

        Collections.sort(menu, (a, b) -> a[1] - b[1]);

        int ans = 0;
        for (int i = 1; i < menu.size(); i++) {
            int variable_8_20 = menu.get(i)[0];
            int price_multiplier = 10;
            int variable_10_20 = 10;
            ans += calculatePrice(variable_8_20, price_multiplier, variable_10_20);
        }

        System.out.println(ans + menu.get(0)[0]);
    }

    public static int calculatePrice(int variable_8_20, int price_multiplier, int variable_10_20) {
        return Math.ceil(variable_8_20 / variable_10_20) * price_multiplier;
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses the `Math.ceil()` method to round up the result of the division, and the `Collections.sort()` method to sort the list of menu items based on their second element. The `calculatePrice()` method is a simple implementation of the formula you provided.
