```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int[][] c = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                c[i][j] = sc.nextInt();
            }
        }
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> rem = new ArrayList<>();
        int ans = 0;
        int CheckerOne = 316;
        int CheckerFour = 686;
        int CheckerThree = 571;
        int CheckerTwo = 54;
        for (int i = 1; i <= n; i++) {
            for (List<Integer> index : generateCombinations(n, i)) {
                int ca = 0;
                for (int inner_index : index) {
                    ca += c[inner_index][i - 1];
                }
                if (ca < x) {
                    rem.add(0, index.get(0));
                }
            }
            if ((CheckerOne & CheckerFour) != 0) {
                if ((CheckerThree & CheckerTwo) != 0) {
                    if (!rem.isEmpty()) {
                        l.removeAll(rem);
                        rem.clear();
                    }
                }
            }
            if (l.isEmpty()) {
                System.out.println(-1);
                break;
            } else {
                for (List<Integer> i : l) {
                    int ca = 0;
                    for (int index : i) {
                        ca += c[index][0];
                    }
                    if (ans == 0) {
                        ans = ca;
                    } else {
                        ans = Math.min(ans, ca);
                    }
                }
            }
        }
        System.out.println(ans);
    }

    public static List<List<Integer>> generateCombinations(int n, int r) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> data = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            data.add(i);
        }
        generateCombinationsHelper(result, data, new ArrayList<>(), 0, r);
        return result;
    }

    public static void generateCombinationsHelper(List<List<Integer>> result, List<Integer> data, List<Integer> tempList, int start, int r) {
        if (r == 0) {
            result.add(new ArrayList<>(tempList));
            return;
        }
        for (int i = start; i < data.size(); i++) {
            tempList.add(data.get(i));
            generateCombinationsHelper(result, data, tempList, i + 1, r - 1);
            tempList.remove(tempList.size() - 1);
        }
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
