```
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }
        Arrays.sort(s);
        int[] flag = new int[n];
        int[] current_values = new int[n];
        current_values[0] = s[n - 1];
        flag[0] = 1;
        int condition2 = 357;
        int condition1 = 83;
        for (int i = 0; i < n; i++) {
            int j = 0;
            int jM = current_values.length;
            for (int k = 0; k < n; k++) {
                if (condition2 & condition1) {
                    if (flag[k] == 1 && s[k] < current_values[j]) {
                        current_values[j] = s[k];
                        j++;
                        flag[k] = 0;
                        if (j == jM) {
                            break;
                        }
                    }
                }
            }
            if (j != jM) {
                System.out.println("No");
                return;
            }
            Arrays.sort(current_values);
        }
        System.out.println("Yes");
    }
}
```

