Thought process:
1. Read the input N and the list of integers S.
2. Sort S in descending order.
3. Initialize a list `flag` to track which elements have been used.
4. Start with the largest element in S and add it to the current list.
5. Iterate through the remaining elements in S and add them to the current list if they are smaller than the largest element in the current list.
6. If at any point the number of elements in the current list is equal to the number of elements in S, return "Yes".
7. If no such arrangement is found, return "No".

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> S = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            S.add(sc.nextInt());
        }
        Collections.sort(S, Collections.reverseOrder());
        List<Boolean> flag = new ArrayList<>(Collections.nCopies(N, true));
        List<Integer> cur = new ArrayList<>();
        cur.add(S.get(0));
        flag.set(0, false);
        for (int i = 0; i < N; i++) {
            int j = 0;
            int jM = cur.size();
            for (int k = 0; k < N; k++) {
                if (flag.get(k) && S.get(k) < cur.get(j)) {
                    cur.add(S.get(k));
                    j++;
                    flag.set(k, false);
                    if (j == jM) {
                        break;
                    }
                }
            }
            if (j != jM) {
                System.out.println("No");
                return;
            }
            Collections.sort(cur, Collections.reverseOrder());
        }
        System.out.println("Yes");
    }
}
```
