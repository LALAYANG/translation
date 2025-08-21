```
import java.util.Scanner;

public class GetNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int sa = scanner.nextInt();
        int sk = scanner.nextInt();

        int[] ans = getNums(k, sk) + getNums(n - k, sa - sk);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] getNums(int num, int t) {
        int[] result = new int[num];
        for (int i = 0; i < num; i++) {
            if (i < t % num) {
                result[i] = t / num + 1;
            } else {
                result[i] = t / num;
            }
        }
        return result;
    }
}
```
Note: The `Arrays.toString()` method is used to print the array in the same format as the Python code.
