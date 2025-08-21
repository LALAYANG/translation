```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> menu = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int m = sc.nextInt();
            int e = m % 10;
            if (e == 0) {
                e = 10;
            }
            menu.add(m);
            menu.add(e);
        }
        Collections.sort(menu, (a, b) -> a[1] - b[1]);
        int ans = 0;
        for (int i = 1; i < menu.size(); i++) {
            ans += Math.ceil(menu.get(i)[0] / 10) * 10;
        }
        System.out.println(ans + menu.get(0)[0]);
    }
}
```
Note: In Java, we use `ArrayList` instead of `list` to create a list of integers. We also use `Scanner` to read input from the user. The `Collections.sort()` method is used to sort the list based on the second element of each sublist. The `Math.ceil()` method is used to round up the result of the division to the nearest integer.
