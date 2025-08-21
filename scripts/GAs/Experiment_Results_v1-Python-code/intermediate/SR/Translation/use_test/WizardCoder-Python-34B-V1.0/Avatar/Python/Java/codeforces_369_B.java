```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int new_n = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int new_r = scanner.nextInt();
        int sa = scanner.nextInt();
        int sk = scanner.nextInt();

        int[] result = get_numbers(k, sk);
        int[] partitions_result = compute_partitions(k, new_n, sa, result, sk);
        for (int i : partitions_result) {
            System.out.print(i + " ");
        }
    }

    public static int[] get_numbers(int num, int t) {
        return new int[num];
    }

    public static int[] compute_partitions(int k, int new_n, int sa, int[] get_numbers, int sk) {
        int[] result = new int[new_n];
        for (int i = 0; i < new_n; i++) {
            if (i < t % num) {
                result[i] = sa / num + 1;
            } else {
                result[i] = sa / num;
            }
        }
        return result;
    }
}
``` 
