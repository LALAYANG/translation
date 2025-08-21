Here is the Java version of the provided Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int A = scanner.nextInt();
            int idx = binarySearch(ans, A);
            if (idx == ans.size()) {
                ans.add(new ArrayList<>(Arrays.asList(A)));
            } else {
                ans.get(idx).add(A);
            }
        }
        System.out.println(ans.size());
    }

    private static int binarySearch(List<List<Integer>> list, int key) {
        int bad = -1, good = list.size();
        while (good - bad > 1) {
            int mid = (bad + good) / 2;
            if (list.get(mid).get(list.get(mid).size() - 1) < key) {
                good = mid;
            } else {
                bad = mid;
            }
        }
        return good;
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `N` from the input, then reads `N` more integers. For each integer, it uses a binary search to find the correct position in the `ans` list to insert it. If the integer is greater than all the integers in the list, it is appended to the end of the list. If not, it is inserted at the appropriate position to keep the list sorted. Finally, it prints the size of the `ans` list, which is the number of unique integers.

