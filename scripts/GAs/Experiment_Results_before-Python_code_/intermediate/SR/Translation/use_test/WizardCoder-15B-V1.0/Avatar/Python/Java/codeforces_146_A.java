```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> number = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            number.add(sc.nextInt());
        }
        int h1 = 0, h2 = 0, x = 0;
        for (int i = 0; i < n; i++) {
            if (number.get(i) != 4 && number.get(i) != 7) {
                System.out.println("NO");
                x++;
                break;
            }
            if (i < n / 2) {
                h1 += number.get(i);
            } else {
                h2 += number.get(i);
            }
        }
        if (x == 0) {
            if (h1 == h2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
```
