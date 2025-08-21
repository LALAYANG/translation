Here is the Java version of the provided Python code:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> V = new ArrayList<>();
        List<Integer> C = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            V.add(scanner.nextInt());
        }
        for (int i = 0; i < N; i++) {
            C.add(scanner.nextInt());
        }
        List<Integer> list = new ArrayList<>();
        int ans = 0;
        int X = 0;
        int Y = 0;
        for (int i = 0; i < N; i++) {
            if (V.get(i) - C.get(i) > 0) {
                X = V.get(i);
                Y = C.get(i);
                list.add(X - Y);
            }
        }
        for (int num : list) {
            ans += num;
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads the number of elements `N`, and `N` integers from the input. It then reads `N` more integers for the list `V` and `N` more integers for the list `C`. It then calculates the difference between the corresponding elements in `V` and `C`, and adds these differences to a list. Finally, it prints the sum of all the elements in the list.

