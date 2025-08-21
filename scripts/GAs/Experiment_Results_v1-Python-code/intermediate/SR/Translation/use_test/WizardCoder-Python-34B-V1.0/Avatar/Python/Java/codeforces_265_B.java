```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count_input = scanner.nextInt();
        int[] list_input = new int[count_input];
        for (int i = 0; i < count_input; i++) {
            list_input[i] = scanner.nextInt();
        }
        int constant_variable = 1;
        int ans = 0;
        int last = 0;
        for (int i = 0; i < count_input; i++) {
            ans += Math.abs(last - list_input[i]) + 1;
            last = list_input[i];
        }
        System.out.println(ans);
    }
}
```

Test input:
5
2
1
2
1
1

Expected output:
6 
