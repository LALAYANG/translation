```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] n = new int[N];
        for (int i = 0; i < N; i++) {
            n[i] = sc.nextInt();
        }

        int a = 1;
        int pos = 0;
        for (int i = 1; i < N; i++) {
            if (n[pos] > n[i]) {
                a++;
                pos = i;
            }
        }
        System.out.println(a);
    }
}
```

Explanation:

1. The first line of the code `import java.util.Scanner;` imports the `Scanner` class from the `java.util` package, which is used to read input from the user.
2. The next line `public class Solution {` declares the start of a new class called `Solution`.
3. The `main` method is the entry point of the program, and it is where the program starts executing.
4. The first statement inside the `main` method is `Scanner sc = new Scanner(System.in);`, which creates a new `Scanner` object called `sc` that reads input from the standard input stream (usually the keyboard).
5. The next statement `int N = sc.nextInt();` reads an integer from the user and stores it in the variable `N`.
6. The next statement `int[] n = new int[N];` creates a new array of integers called `n` with a length of `N`.
7. The next loop `for (int i = 0; i < N; i++)` iterates over the elements of the array `n` and reads an integer from the user for each element.
8. The statement `n[i] = sc.nextInt();` reads an integer from the user and stores it in the `i`-th element of the array `n`.
9. The next statement `int a = 1;` initializes a variable `a` to 1.
10. The next statement `int pos = 0;` initializes a variable `pos` to 0.
11. The next loop `for (int i = 1; i < N; i++)` iterates over the elements of the array `n` and checks if the `i`-th element is greater than the `pos`-th element.
12. If the condition is true, the statement `a++;` increments the variable `a` by 1.
13. The statement `pos = i;` sets the variable `pos` to the value of `i`.
14. The final statement `System.out.println(a);` prints the value of `a` to the console.

Test case:

Input:
4
4 3 2 1

Output:
4
