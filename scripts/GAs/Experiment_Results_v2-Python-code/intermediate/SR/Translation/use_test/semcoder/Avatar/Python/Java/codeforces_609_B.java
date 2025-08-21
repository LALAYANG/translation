Thought process:
1. Read the input values for `n` and `m`.
2. Read the list `lst` of integers.
3. Count the frequency of each element in the list and store it in dictionary `l`.
4. Calculate the result based on the frequency of elements in the list.
5. Print the final result.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = sc.nextInt();
        }
        int[] l = new int[100001];
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
