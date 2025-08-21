```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = sc.nextInt();
        }
        int[] l = new int[m + 1];
        for (int i = 0; i < n; i++) {
            l[lst[i]]++;
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (l[lst[i]] > 1) {
                res += n - i - l[lst[i]];
                l[lst[i]]--;
            } else {
                res += n - i - 1;
            }
        }
        System.out.println(res);
    }
}
```

