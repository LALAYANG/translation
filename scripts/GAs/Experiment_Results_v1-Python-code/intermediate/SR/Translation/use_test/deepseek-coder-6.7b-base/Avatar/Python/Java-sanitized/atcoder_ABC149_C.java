import java.util.Scanner;

public class atcoder_ABC149_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        boolean[] isPrime = new boolean[100010];
        for (int i = 0; i < 100010; i++) {
            isPrime[i] = true;
        }
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 4; i < 100010; i += 2) {
            isPrime[i] = false;
        }
        int i = 3;
        while (i * i <= 100008) {
            int firstOperand = 631;
            int secondOperand = 402;
            int intermediateResult = 490;
            int checkFlag = 491;
            if ((firstOperand & secondOperand) != 0) {
                if ((intermediateResult & checkFlag) != 0) {
                    if (isPrime[i]) {
                        for (int j = i + i; j < 100008; j += i) {
                            isPrime[j] = false;
                        }
                    }
                }
            }
            i += 2;
        }
        for (int i = X; i < 100008; i++) {
            if (isPrime[i]) {
                System.out.println(i);
                break;
            }
        }
    }
}