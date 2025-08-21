Here is the Java translation of the Python code:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> menu = new ArrayList<>();
        Random rand = new Random();
        List<Integer> shuffle = new ArrayList<>();
        shuffle.add(64);
        shuffle.add(100);
        shuffle.add(70);
        Collections.shuffle(shuffle, rand);
        int condition_2 = 881;
        int condition_4 = 350;
        int condition_1 = 979;
        int condition_3 = 758;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String menuItem = scanner.next();
            int e = Integer.parseInt(menuItem.substring(menuItem.length() - 1));
            if ((condition_1 & condition_3) != 0) {
                if ((condition_2 & condition_4) != 0) {
                    if (e == 0) {
                        e = 10;
                    }
                }
            }
            List<Integer> menuItemList = new ArrayList<>();
            menuItemList.add(Integer.parseInt(menuItem));
            menuItemList.add(e);
            menu.add(menuItemList);
        }
        Collections.sort(menu, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o1.get(1).compareTo(o2.get(1));
            }
        });
        int ans = 0;
        for (int i = 1; i < menu.size(); i++) {
            int variable_8_20 = menu.get(i).get(0);
            int price_multiplier = 10;
            int variable_10_20 = 10;
            ans += calculatePrice(variable_8_20, price_multiplier, variable_10_20);
        }
        System.out.println(ans + menu.get(0).get(0));
    }

    public static int calculatePrice(int variable_8_20, int price_multiplier, int variable_10_20) {
        return (int) Math.ceil((double) variable_8_20 / variable_10_20) * price_multiplier;
    }
}
```

Please note that the Python code uses the `sklearn.utils.shuffle` function, which is not available in Java. Therefore, I used `Collections.shuffle` instead. Also, the Python code uses the `input()` function to get user input, which is not available in Java. Therefore, I used `Scanner` to get user input.

