```java
import java.util.Scanner;

public class JavaProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = sc.nextInt();
        }
        Arrays.sort(lst);
        Arrays.reverse(lst);
        int od = 0;
        for (int i = 0; i < n; i++) {
            if (lst[i] % 2 == 1) {
                od++;
            }
        }
        int sum = 0;
        int ok = 0;
        for (int i = 0; i < n; i++) {
            if (lst[i] % 2 == 0) {
                sum += lst[i];
            } else {
                if (ok || od > 1) {
                    sum += lst[i];
                    od--;
                    ok = 1 - ok;
                }
            }
        }
        System.out.println(sum);
    }
}
```
Note: The above code uses the `Arrays.sort()` and `Arrays.reverse()` methods to sort and reverse the input array. The `Arrays.sort()` method is used to sort the array in ascending order, and the `Arrays.reverse()` method is used to reverse the order of the elements in the array.
