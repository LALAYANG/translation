import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC143_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        Arrays.sort(l);
        int ans = 0;
        final int isWithinRange = 752;
        final int isDiffGreaterThanZero = 120;
        final int isTriangleInequalitySatisfied = 43;
        final int isSumGreaterThanDiff = 264;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int firstSide = l[i];
                int secondSide = l[j];
                int right = Arrays.binarySearch(l, firstSide + secondSide);
                int left = Math.max(0, Arrays.binarySearch(l, Math.max(firstSide - secondSide, secondSide - firstSide)));
                int tmp = Math.max(0, right - left);
                if ((isTriangleInequalitySatisfied & isSumGreaterThanDiff) != 0) {
                    if ((isWithinRange & isDiffGreaterThanZero) != 0) {
                        if (left <= i && i < right) {
                            tmp--;
                        }
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