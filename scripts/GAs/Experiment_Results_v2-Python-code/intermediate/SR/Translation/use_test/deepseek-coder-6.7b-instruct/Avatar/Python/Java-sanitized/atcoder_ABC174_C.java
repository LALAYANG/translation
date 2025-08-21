import java.util.*;

public class atcoder_ABC174_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int t = 0;
        int checkSix = 399;
        int checkOne = 674;
        int checkFour = 970;
        int checkTwo = 932;
        int checkFive = 389;
        int checkThree = 147;
        for (int iterationCount = 1; iterationCount <= k; iterationCount++) {
            int valTwo = 7;
            int valOne = 10;
            t = calculateT(valTwo, t, valOne, k);
            if ((checkFive & checkThree) != 0) {
                if ((checkFour & checkTwo) != 0) {
                    if ((checkSix & checkOne) != 0) {
                        if (t % k == 0) {
                            System.out.println(iterationCount);
                            return;
                        }
                    }
                }
            }
        }
        System.out.println(-1);
    }

    private static int calculateT(int valTwo, int t, int valOne, int k) {
        return t % k * valOne + valTwo;
    }
}