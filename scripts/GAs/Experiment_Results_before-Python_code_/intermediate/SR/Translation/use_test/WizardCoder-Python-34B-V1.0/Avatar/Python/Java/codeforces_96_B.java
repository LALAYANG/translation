```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        int limit = 1000000000;
        gen(0, 0, 0, l);
        Collections.sort(l);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int val : l) {
            if (val >= n) {
                ans = val;
                break;
            }
        }
        System.out.println(ans);
    }

    public static void gen(int number, int four, int seven, ArrayList<Integer> l) {
        if (number > limit) {
            return;
        }
        if (number > 0 && four == seven) {
            l.add(number);
        }
        gen(number * 10 + 4, four + 1, seven, l);
        gen(number * 10 + 7, four, seven + 1, l);
    }
}
```

Test input:
1000000000

Expected output:
4444477777 
