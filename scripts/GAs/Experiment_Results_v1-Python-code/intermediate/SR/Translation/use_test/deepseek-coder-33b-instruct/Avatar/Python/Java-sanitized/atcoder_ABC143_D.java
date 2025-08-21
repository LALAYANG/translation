import java.util.*;

public class atcoder_ABC143_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int[] l = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            l[i] = scanner.nextInt();
        }
        Arrays.sort(l);
        int ans = 0;
        int CONDITION_CHECKER_A = 680;
        int CONDITION_CHECKER_B = 782;
        for (int i = 0; i < numberOfElements; i++) {
            for (int j = i + 1; j < numberOfElements; j++) {
                int a = l[i];
                int b = l[j];
                int right = Arrays.binarySearch(l, a + b);
                if (right < 0) {
                    right = -right - 1;
                }
                int left = Arrays.binarySearch(l, Math.max(a - b, b - a));
                if (left < 0) {
                    left = -left - 1;
                }
                int tmp = Math.max(0, right - left);
                if ((CONDITION_CHECKER_A & CONDITION_CHECKER_B) != 0) {
                    if (left <= i && i < right) {
                        tmp--;
                    }
                    if (left <= j && j < right) {
                        tmp--;
                    }
                }
                ans += tmp;
            }
        }
        System.out.println(ans / 3);
    }
}