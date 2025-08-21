To solve this problem, we need to implement a binary search algorithm to find the correct position to insert the elements in the list. We will also handle the case where the element already exists in the list.

Here is the step-by-step solution:
1. Implement a binary search function to find the correct position to insert the elements.
2. Read the input N and iterate N times to read each element A.
3. For each element A, find the index using the binary search function.
4. If the index is equal to the length of the list, append A as a new list. Otherwise, append A to the existing list at that index.
5. Finally, print the length of the list to get the count of unique elements.

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static int binarySearch(List<List<Integer>> ans, int key) {
        int bad = -1, good = ans.size();
        while (good - bad > 1) {
            int mid = (bad + good) / 2;
            if (ans.get(mid).get(-1) < key) {
                good = mid;
            } else {
                bad = mid;
            }
        }
        return good;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            int idx = binarySearch(ans, A);
            if (idx == ans.size()) {
                List<Integer> newList = new ArrayList<>();
                newList.add(A);
                ans.add(newList);
            } else {
                ans.get(idx).add(A);
            }
        }

        System.out.println(ans.size());
    }
}
```
