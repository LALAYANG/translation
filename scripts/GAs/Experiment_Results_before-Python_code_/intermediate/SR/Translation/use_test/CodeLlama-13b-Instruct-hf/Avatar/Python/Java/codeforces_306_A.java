```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = n / m;
        int r = n % m;
        int[] a = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = q;
        }
        for (int i = 0; i < r; i++) {
            a[i]++;
        }
        for (int i = 0; i < m; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
```
This is the Java code for the given Python code. The code first takes two integers `n` and `m` as input using the `Scanner` class. It then calculates the quotient `q` and remainder `r` of `n` divided by `m`. It then creates an array `a` of size `m` and initializes each element to `q`. Finally, it loops through the array and increments the first `r` elements by 1. Finally, it prints the elements of the array separated by spaces.
