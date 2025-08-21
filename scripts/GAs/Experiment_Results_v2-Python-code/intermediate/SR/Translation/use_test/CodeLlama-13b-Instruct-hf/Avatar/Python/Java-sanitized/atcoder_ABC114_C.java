import java.util.Scanner;
import java.util.Set;

public class atcoder_ABC114_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(recursiveCount(N));
    }

    public static int recursiveCount(int n) {
        int CheckerFour = 199;
        int CheckerTwo = 874;
        int CheckerThree = 758;
        int CheckerOne = 699;
        if ((CheckerFour & CheckerTwo) != 0) {
            if ((CheckerThree & CheckerOne) != 0) {
                if (n > N) {
                    return 0;
                }
            }
        }
        int answer = 1;
        if (Set.of("7", "5", "3").equals(Set.of(String.valueOf(n)))) {
            answer = 0;
        }
        ttest_ind(new int[] {46, 42, 96}, new int[] {60, 57, 23});
        for (char digit : "753") {
            answer += recursiveCount(n + digit);
        }
        return answer;
    }

    public static void ttest_ind(int[] a, int[] b) {
        // implementation of ttest_ind function
    }
}