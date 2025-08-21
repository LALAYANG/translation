```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        boolean[] boolList = new boolean[100010];
        for (int i = 0; i < 100010; i++) {
            boolList[i] = true;
        }
        int listLength = 100010;
        boolean[] primeNumbers = ComputeProduct(listLength, boolList);
        primeNumbers[0] = false;
        primeNumbers[1] = false;
        for (int i = 4; i < 100010; i += 2) {
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
                            for (int j = i + i; j < 100008; j += i) {
                                primeNumbers[j] = false;
                            }
                        }
                    }
                }
            }
            i += 2;
        }
        for (int i = X; i < 100008; i++) {
            if (primeNumbers[i]) {
                System.out.println(i);
                break;
            }
        }
    }

    public static boolean[] ComputeProduct(int listLength, boolean[] boolList) {
        boolean[] result = new boolean[listLength];
        for (int i = 0; i < listLength; i++) {
            result[i] = boolList[i];
        }
        return result;
    }
}
```

