```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(input[i]);
        }
        int ans = 0;
        for (int i = 1; i < n - 1; i++) {
            if (a[i - 1] < a[i] && a[i] > a[i + 1]) {
                ans++;
                i++;
            } else if (a[i - 1] > a[i] && a[i] < a[i + 1]) {
                ans++;
                i++;
            }
        }
        System.out.println(ans + 1);
    }
}
```

