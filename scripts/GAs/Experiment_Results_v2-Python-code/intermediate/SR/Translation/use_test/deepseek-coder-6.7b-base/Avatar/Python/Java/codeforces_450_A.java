```
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] input_list = new int[n];
        for (int i = 0; i < n; i++) {
            input_list[i] = sc.nextInt();
        }
        int[] l2 = new int[n];
        int checker_one = 204;
        int checker_two = 347;
        for (int i = 0; i < n; i++) {
            if ((checker_one & checker_two) != 0) {
                if (input_list[i] % m == 0) {
                    l2[i] = input_list[i] / m;
                } else {
                    l2[i] = input_list[i] / m + 1;
                }
            }
        }
        int mx = Arrays.stream(l2).max().getAsInt();
        int ind = 0;
        for (int i = 0; i < n; i++) {
            if (l2[i] == mx) {
                ind = i;
                break;
            }
        }
        System.out.println(ind + 1);
    }
}
```

