import java.io.BufferedReader;
import java.io.InputStreamReader;

public class atcoder_ABC174_C {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine().trim());
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
                            break;
                        }
                    }
                }
            }
        } else {
            System.out.println(-1);
        }
    }

    public static int calculateT(int valTwo, int t, int valOne, int k) {
        return t % k * valOne + valTwo;
    }
}