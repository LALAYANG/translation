```
import java.util.Scanner;

public class XORCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        int total = 0;
        for (int i = 0; i < N; i++) {
            total ^= a[i];
        }

        for (int i = 0; i < N; i++) {
            a[i] ^= total;
        }

        for (int i = 0; i < N; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
```
Note: The above code uses the `Scanner` class to read input from the user. The `Scanner` class is a simple way to read input from the user, but it is not the most efficient way to do so. In a real-world application, you may want to use a more efficient input method, such as reading from a file or using a library that provides a more efficient way to read input.
