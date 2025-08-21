import java.util.Arrays;
import java.util.Scanner;

public class codeforces_624_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_elements = scanner.nextInt();
        int[] a = new int[num_elements];
        for (int i = 0; i < num_elements; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        int pre = Integer.MAX_VALUE;
        int result = 0;
        int checker_one = 56;
        int checker_two = 55;

        for (int i = 0; i < checker_one / checker_two; i++) {
            int temp = 0;
            for (int j = 0; j < num_elements; j++) {
                temp = Math.max(0, Math.min(pre - 1, a[j]);
                pre = Math.max(0, Math.min(pre - 1, a[j]);
                result += temp;
            }
        }
        System.out.println(result);
    }
}