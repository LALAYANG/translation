<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
8
7 3 5 4 2 1 6 8
3 8 2 5 4 6 7 1

Expected output:
17517


```
n = int ( input ( ) )
import itertools
orig = list ( itertools.permutations ( list ( range ( 1 , n + 1 ) ) ) )
p = tuple ( map ( int , input ( ).split ( ) ) )
q = tuple ( map ( int , input ( ).split ( ) ) )
pn = orig.index ( p )
qn = orig.index ( q )
print ( abs ( pn - qn ) )


```

### Response:
Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] p = new int[n];
        int[] q = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            q[i] = scanner.nextInt();
        }
        int pn = getIndex(p, n);
        int qn = getIndex(q, n);
        System.out.println(Math.abs(pn - qn));
    }

    private static int getIndex(int[] arr, int n) {
        int[][] permutations = generatePermutations(n);
        for (int i = 0; i < permutations.length; i++) {
            if (Arrays.equals(arr, permutations[i])) {
                return i;
            }
        }
        return -1;
    }

    private static int[][] generatePermutations(int n) {
        int[][] permutations = new int[factorial(n)][n];
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        int[] temp = Arrays.copyOf(arr, n);
        int count = 0;
        permutations[count++] = arr;
        while (hasNextPermutation(temp)) {
            permutations[count++] = Arrays.copyOf(temp, n);
        }
        return permutations;
    }

    private static boolean hasNextPermutation(int[] arr) {
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }
        if (i < 0) {
            return false;
        }
        int j = arr.length - 1;
        while (arr[j] <= arr[i]) {
            j--;
        }
        swap(arr, i, j);
        reverse(arr, i + 1, arr.length - 1);
        return true;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i++, j--);
        }
    }

    private static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
```

This Java code does the same thing as the Python code. It reads the input, generates all permutations of the numbers from 1 to n, finds the index of the input permutations in the generated permutations, and prints the absolute difference of the indices. <｜end▁of▁sentence｜>
