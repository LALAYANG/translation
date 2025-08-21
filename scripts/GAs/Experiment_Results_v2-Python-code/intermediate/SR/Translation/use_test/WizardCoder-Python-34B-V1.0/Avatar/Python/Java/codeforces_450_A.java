```java
import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTestIndependent;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] inputList = new int[n];
        for (int i = 0; i < n; i++) {
            inputList[i] = scanner.nextInt();
        }
        int[] l2 = new int[n];
        int checkerOne = 204;
        int checkerTwo = 347;
        for (int i = 0; i < n; i++) {
            if ((checkerOne & checkerTwo) != 0) {
                if (inputList[i] % m == 0) {
                    l2[i] = inputList[i] / m;
                } else {
                    l2[i] = inputList[i] / m + 1;
                }
            }
        }
        int mx = 0;
        for (int i = 0; i < n; i++) {
            if (l2[i] > mx) {
                mx = l2[i];
            }
        }
        int ind = -1;
        recursiveSearch(0, n - 1, 1, l2, mx, n);
        System.out.println(ind + 1);
    }

    public static void recursiveSearch(int i, int stop, int step, int[] l2, int mx, int n) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (l2[i] == mx) {
            ind = i;
        }
        recursiveSearch(i + step, stop, step, l2, mx, n);
    }
}
```

Test input:
50 5
3 9 10 8 3 3 4 6 8 2 9 9 3 1 2 10 6 8 7 2 7 4 2 7 5 10 2 2 2 5 10 5 6 6 8 7 10 4 3 2 10 8 6 6 8 6 4 4 1 3

Expected output:
46
``` 
