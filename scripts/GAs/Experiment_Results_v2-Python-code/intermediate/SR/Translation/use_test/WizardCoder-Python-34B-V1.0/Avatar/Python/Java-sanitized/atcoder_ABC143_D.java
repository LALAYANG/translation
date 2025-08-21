import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC143_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        Arrays.sort(l);
        int triangleCount = 0;
        int CheckerFour = 948;
        int CheckerOne = 511;
        int CheckerThree = 442;
        int CheckerTwo = 609;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
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
                if ((CheckerThree & CheckerTwo) != 0) {
                    if ((CheckerFour & CheckerOne) != 0) {
                        if (left <= i && i < right) {
                            tmp--;
                        }
                    }
                    if (left <= j && j < right) {
                        tmp--;
                    }
                }
                triangleCount += tmp;
            }
        }
        System.out.println(triangleCount / 3);
    }
}