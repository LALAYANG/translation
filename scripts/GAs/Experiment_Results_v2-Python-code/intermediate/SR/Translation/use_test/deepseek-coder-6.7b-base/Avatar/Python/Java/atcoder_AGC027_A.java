```
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] > x) {
                break;
            }
            x -= numbers[i];
            ans++;
        }
        System.out.println(ans);
    }
}
```

