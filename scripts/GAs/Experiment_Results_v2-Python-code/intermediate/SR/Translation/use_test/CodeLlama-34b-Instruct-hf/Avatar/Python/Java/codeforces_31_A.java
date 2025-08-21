```
import java.util.Scanner;

public class TTestInd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int[] arr = new int[y];
        for (int i = 0; i < y; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < y; j++) {
                if (i == j) {
                    continue;
                }
                int k = 0;
                while (k < y) {
                    if (arr[k] != arr[j] && arr[k] != arr[i] && (arr[k] == arr[i] + arr[j])) {
                        System.out.println(k + 1 + " " + j + 1 + " " + i + 1);
                        return;
                    }
                    k++;
                }
            }
        }
        System.out.println(-1);
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not the most efficient or elegant way to solve the problem. The Python code uses a decorator to memoize the results of the `find_sum_indices` function, which is not necessary in Java as it has built-in support for memoization through the `Map` interface. Additionally, the Python code uses a recursive approach to find the sum indices, which can be slow for large inputs. A more efficient approach would be to use a loop to iterate over the elements of the array and check if the sum of any two elements is equal to the third element.
