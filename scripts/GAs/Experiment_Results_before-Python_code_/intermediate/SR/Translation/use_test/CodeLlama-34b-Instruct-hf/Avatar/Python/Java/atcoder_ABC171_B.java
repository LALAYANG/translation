```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
```

Explanation:

1. The first line of the code `n , k = map ( int , input ( ).split ( ) )` reads the input from the user and stores it in the variables `n` and `k`.
2. The next line `print ( sum ( sorted ( list ( map ( int , input ( ).split ( ) ) ) ) [ : k ] ) )` sorts the input array and then calculates the sum of the first `k` elements.
3. The `sorted` function sorts the input array in ascending order.
4. The `list` function converts the sorted array into a list.
5. The `[ : k ]` syntax is used to slice the list and get the first `k` elements.
6. The `sum` function calculates the sum of the sliced list.
7. The final output is printed using the `print` function.
