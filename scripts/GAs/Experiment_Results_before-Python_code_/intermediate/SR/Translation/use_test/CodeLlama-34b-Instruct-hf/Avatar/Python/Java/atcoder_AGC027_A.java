```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int ans = 0;
        if (a[0] > x) {
            System.out.println(0);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (a[i] > x) {
                x = 0;
                break;
            }
            x -= a[i];
            ans++;
        }

        if (x != 0) {
            ans--;
        }

        System.out.println(ans);
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not the most efficient or elegant solution to the problem. A more efficient solution would involve using a more appropriate data structure, such as a priority queue, to keep track of the elements in the array and their corresponding indices.
