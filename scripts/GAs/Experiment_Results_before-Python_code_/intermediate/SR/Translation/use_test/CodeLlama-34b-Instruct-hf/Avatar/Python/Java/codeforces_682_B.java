```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        Arrays.sort(l);
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (l[i] > c) {
                c++;
            }
        }
        System.out.println(c + 1);
    }
}
```

Explanation:

1. The first line imports the `Scanner` class from the `java.util` package, which is used to read input from the user.
2. The next line declares a variable `n` of type `int` and initializes it to the value entered by the user.
3. The next line declares an array `l` of type `int` with a length equal to the value of `n`.
4. The next line reads `n` integers from the user and stores them in the array `l`.
5. The next line sorts the array `l` using the `Arrays.sort()` method.
6. The next line declares a variable `c` of type `int` and initializes it to 0.
7. The next line iterates over the elements of the array `l` and checks if each element is greater than the current value of `c`. If it is, `c` is incremented by 1.
8. The final line prints the value of `c + 1` to the console.

Note: The `Arrays.sort()` method is used to sort the array `l` in ascending order. If you want to sort the array in descending order, you can use the `Arrays.sort()` method with the `Collections.reverseOrder()` method as an argument, like this: `Arrays.sort(l, Collections.reverseOrder());`
