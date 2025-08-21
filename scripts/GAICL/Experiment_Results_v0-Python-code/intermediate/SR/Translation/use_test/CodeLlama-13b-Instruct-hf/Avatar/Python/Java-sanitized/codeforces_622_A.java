import java.util.Scanner;

public class codeforces_622_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int targetValue = scanner.nextInt();
        int left = 1;
        int right = targetValue;
        while (left < right) {
            int mid = left + (right - left) / 2;
            int idxcnt = mid * (mid + 1) / 2;
            if (idxcnt < targetValue) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        System.out.println(left);
    }
}