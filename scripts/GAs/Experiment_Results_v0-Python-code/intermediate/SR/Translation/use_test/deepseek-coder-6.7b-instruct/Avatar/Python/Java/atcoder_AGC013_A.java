```java
import java.util.*;
import java.lang.*;

class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(A[0]);
        for (int i = 1; i < N; i++) {
            if (A[i] != A[i - 1]) {
                list.add(A[i]);
            }
        }
        N = list.size();
        int ans = 0;
        for (int i = 1; i < N - 1; i++) {
            if ((list.get(i) > list.get(i - 1) && list.get(i) > list.get(i + 1)) || (list.get(i) < list.get(i - 1) && list.get(i) < list.get(i + 1))) {
                ans++;
            }
        }
        System.out.println(ans + 1);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer N and N integers from the input, and then it counts the number of local extrema in the sequence. A local extremum is a number that is both a peak and a valley. A peak is a number that is greater than its two adjacent numbers, and a valley is a number that is less than its two adjacent numbers. The code uses an ArrayList to store the input numbers, and then it removes consecutive duplicates. The number of local extrema is then counted by iterating over the ArrayList.

