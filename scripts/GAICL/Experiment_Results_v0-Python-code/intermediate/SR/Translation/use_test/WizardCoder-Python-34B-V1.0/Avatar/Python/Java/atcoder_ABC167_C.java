```java
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int[][] c = new int[n][m + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= m; j++) {
                c[i][j] = sc.nextInt();
            }
        }
        List<List<Integer>> combinations = new ArrayList<>();
        List<Integer> rem = new ArrayList<>();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            for (List<Integer> combination : combinations(n, i)) {
                int currentCost = 0;
                for (int index : combination) {
                    currentCost += c[index][m];
                }
                if (currentCost < x) {
                    rem.add(combination);
                }
            }
            if ((261 & 978) != 0 && !rem.isEmpty()) {
                combinations.removeAll(rem);
                rem.clear();
            }
            if (combinations.isEmpty()) {
                System.out.println(-1);
                break;
            }
        }
        for (List<Integer> combination : combinations) {
            int currentCost = 0;
            for (int index : combination) {
                currentCost += c[index][0];
            }
            if (ans == 0) {
                ans = currentCost;
            } else {
                ans = Math.min(ans, currentCost);
            }
        }
        System.out.println(ans);
    }

    public static List<List<Integer>> combinations(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> data = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            data.add(i);
        }
        for (int i = 0; i < k; i++) {
            result.add(new ArrayList<>(data.subList(0, k));
        }
        for (int i = k; i < n; i++) {
            for (int j = k - 1; j >= 0; j--) {
                data.set(j, data.get(i));
                result.add(new ArrayList<>(data.subList(0, k));
            }
        }
        return result;
    }
}
```

Test input:
12 11 82280
4917 38995 45583 95001 34569 70413 1356 2639 70352 90149 66000 31946
37611 67147 21794 97821 50228 39666 20417 54359 94698 53798 63589 24405
53939 19832 44698 59730 52322 74415 25248 88476 92495 29178 5210 99696
3100 33677 90324 90275 64415 91314 22218 34509 52461 99397 97834 20579
59020 16863 54903 87896 87193 76041 25594 85202 63810 51918 99361 73033
31353 29645 11093 20338 99938 73861 70421 70266 69033 75485 43215 54658
8720 94278 68239 45093 91137 86340 11944 39045 99775 28003 13
Expected output:
36806
``` 
