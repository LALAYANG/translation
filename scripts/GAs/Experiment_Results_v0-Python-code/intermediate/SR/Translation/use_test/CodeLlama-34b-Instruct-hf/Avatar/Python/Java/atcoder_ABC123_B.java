```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculatePrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> menu = new ArrayList<>();
        int condition_1 = 979;
        int condition_2 = 881;
        int condition_3 = 758;
        int condition_4 = 350;
        for (int i = 0; i < 5; i++) {
            String menuItem = scanner.nextLine();
            int e = Integer.parseInt(menuItem.substring(menuItem.length() - 1));
            if (condition_1 & condition_3) {
                if (condition_2 & condition_4) {
                    if (e == 0) {
                        e = 10;
                    }
                }
            }
            menu.add(new Integer[] { Integer.parseInt(menuItem), e });
        }
        menu.sort(new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return o1[1].compareTo(o2[1]);
            }
        });
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
        return (int) Math.ceil(variable_8_20 / variable_10_20) * price_multiplier;
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not a good practice to use a decorator in Java, as it is not a built-in feature of the language. Instead, you can use a lambda expression or a method reference to achieve the same functionality.
