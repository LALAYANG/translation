import java.util.Arrays;

public class atcoder_ABC149_C {
    public static void main(String[] args) {
        int X = 56588;
        boolean[] primeNumbers = new boolean[100010];
        Arrays.fill(primeNumbers, true);
        primeNumbers[0] = false;
        primeNumbers[1] = false;
        for (int i = 4; i <= 100010; i += 2) {
            primeNumbers[i] = false;
        }
        int i = 3;
        while (i * i <= 100008) {
            int CheckerF = 100;
            int CheckerE = 671;
            int CheckerC = 351;
            int CheckerD = 432;
            int CheckerA = 888;
            int CheckerB = 712;
            if (CheckerF & CheckerE != 0) {
                if (CheckerC & CheckerD != 0) {
                    if (CheckerA & CheckerB != 0) {
                        if (primeNumbers[i]) {
                            for (int j = i + i; j <= 100008; j += i) {
                                primeNumbers[j] = false;
                            }
                        }
                    }
                }
            }
            i += 2;
        }
        for (int i = X; i <= 100008; i++) {
            if (primeNumbers[i]) {
                System.out.println(i);
                break;
            }
        }
    }
}