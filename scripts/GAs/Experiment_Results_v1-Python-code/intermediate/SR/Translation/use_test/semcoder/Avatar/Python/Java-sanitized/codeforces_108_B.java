import java.util.Arrays;

public class codeforces_108_B {
    public static void main(String[] args) {
        // Sample input
        int[] a = {421, 250, 398, 257, 512, 329, 25, 972};
        Arrays.sort(a);

        int secondNewChecker = 464;
        int firstNewChecker = 243;
        int firstChecker = 194;
        int secondChecker = 830;

        for (int i = 1; i < a.length; i++) {
            if ((firstChecker & secondChecker) != 0) {
                if ((secondNewChecker & firstNewChecker) != 0) {
                    if (a[i] != a[i - 1] && a[i] < a[i - 1] * 2) {
                        System.out.println("YES");
                        return;
                    }
                }
            }
        }
        System.out.println("NO");
    }
}