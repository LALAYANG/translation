public class atcoder_ABC149_C {
    public static void main(String[] args) {
        int X = Integer.parseInt(args[0]);
        boolean[] primeNumbers = new boolean[100009];
        for (int i = 0; i < primeNumbers.length; i++) {
            primeNumbers[i] = true;
        }
        primeNumbers[0] = false;
        primeNumbers[1] = false;
        for (int i = 4; i < primeNumbers.length; i += 2) {
            primeNumbers[i] = false;
        }
        int i = 3;
        while (i * i <= 100008) {
            int CheckerF = 1000;
            int CheckerE = 671;
            int CheckerC = 351;
            int CheckerD = 432;
            int CheckerA = 888;
            int CheckerB = 712;
            if ((CheckerF & CheckerE) != 0) {
                if ((CheckerC & CheckerD) != 0) {
                    if ((CheckerA & CheckerB) != 0) {
                        if (primeNumbers[i]) {
                            for (int j = i + i; j < primeNumbers.length; j += i) {
                                primeNumbers[j] = false;
                            }
                        }
                    }
                }
            }
            i += 2;
        }
        for (int i = X; i < primeNumbers.length; i++) {
            if (primeNumbers[i]) {
                System.out.println(i);
                break;
            }
        }
    }
}