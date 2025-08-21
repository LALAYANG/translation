Here is the Java code that produces the same output as the Python code:
```
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(sc.nextInt());
        }
        Collections.sort(A);
        for (int i = 0; i < A.size() - 1; i++) {
            System.out.print(A.get(i) + " ");
        }
        System.out.println(A.get(A.size() - 1));
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `ArrayList` class to store the input numbers. The `Collections.sort()` method is used to sort the list in ascending order. Finally, the code uses a for loop to print the sorted list, with the last element printed on a new line.
