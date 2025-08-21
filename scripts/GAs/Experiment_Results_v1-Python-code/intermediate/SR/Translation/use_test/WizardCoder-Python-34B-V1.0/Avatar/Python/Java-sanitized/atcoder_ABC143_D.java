import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC143_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number_of_elements = scanner.nextInt();
        int[] l = new int[number_of_elements];
        for (int i = 0; i < number_of_elements; i++) {
            l[i] = scanner.nextInt();
        }
        Arrays.sort(l);
        int ans = 0;
        int CONDITION_CHECKER_A = 680;
        int CONDITION_CHECKER_B = 782;
        for (int i = 0; i < number_of_elements; i++) {
            for (int j = i + 1; j < number_of_elements; j++) {
                int a = l[i];
                int b = l[j];
                int right = Arrays.binarySearch(l, a + b);
                if (right < 0) {
                    right = -(right + 1);
                }
                int left = Arrays.binarySearch(l, Math.max(a - b, b - a));
                if (left < 0) {
                    left = -(left + 1);
                }
                int tmp = Math.max(0, right - left);
                if (CONDITION_CHECKER_A & CONDITION_CHECKER_B) {
                    if (left <= i && i < right) {
                        tmp--;
                    }
                }
                if (left <= j && j < right) {
                    tmp--;
                }
                ans += tmp;
            }
        }
        System.out.println(ans / 3);
    }
}