```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int sa = scanner.nextInt();
        int sk = scanner.nextInt();

        int[] ans = get_nums(k, sk);
        int[] ans2 = get_nums(n - k, sa - sk);
        for (int i = 0; i < ans2.length; i++) {
            ans[k + i] = ans2[i];
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] get_nums(int num, int t) {
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
