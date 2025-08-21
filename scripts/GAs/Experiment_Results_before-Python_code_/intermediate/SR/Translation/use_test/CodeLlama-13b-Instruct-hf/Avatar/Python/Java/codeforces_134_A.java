```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }
        int x = 0;
        for (int i = 0; i < n; i++) {
            x += w[i];
        }
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            if ((x - w[i]) / (n - 1) == w[i]) {
                d[i] = i + 1;
            }
        }
        System.out.println(d.length);
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + " ");
        }
    }
}
```
This is the Java code for the given Python code. The code first reads the input from the user, which is the number of elements in the array `n` and the array itself. Then, it calculates the sum of the array elements and stores it in a variable `x`. Next, it initializes an empty array `d` to store the indices of the elements that satisfy the condition. Then, it iterates through the array and checks if the condition is satisfied for each element. If it is, it adds the index of the element to the `d` array. Finally, it prints the length of the `d` array and the elements of the `d` array separated by a space.
