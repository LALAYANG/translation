
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Math;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> menu = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String m = sc.nextLine();
            int e = Integer.parseInt(m.substring(m.length() - 1));
            if (e == 0) {
                e = 10;
            }
            menu.add(new int[] {Integer.parseInt(m), e});
        }
        Collections.sort(menu, (a, b) -> a[1] - b[1]);
        int ans = 0;
        for (int i = 1; i < menu.size(); i++) {
            ans += (int) Math.ceil(menu.get(i)[0] / 10.0) * 10;
        }
        System.out.println(ans + menu.get(0)[0]);
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `ArrayList` class to store the menu items. The `Collections.sort` method is used to sort the menu items based on their prices, and the `Math.ceil` method is used to round up the prices to the nearest multiple of 10. The `System.out.println` method is used to print the final answer.
