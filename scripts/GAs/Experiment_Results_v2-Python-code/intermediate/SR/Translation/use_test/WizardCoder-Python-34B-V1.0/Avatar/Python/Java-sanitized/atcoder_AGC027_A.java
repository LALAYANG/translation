import java.util.Arrays;
import java.util.Scanner;

public class atcoder_AGC027_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] sorted_numbers = new int[n];
        for (int i = 0; i < n; i++) {
            sorted_numbers[i] = scanner.nextInt();
        }
        Arrays.sort(sorted_numbers);
        if (sorted_numbers[0] > x) {
            System.out.println(0);
            return;
        }
        int ans = 0;
        for (int i = 0; i < sorted_numbers.length; i++) {
            if (sorted_numbers[i] > x) {
                break;
            }
            x = x - sorted_numbers[i];
            ans++;
        }
        if (x != 0) {
            ans--;
        }
        System.out.println(ans);
    }
}