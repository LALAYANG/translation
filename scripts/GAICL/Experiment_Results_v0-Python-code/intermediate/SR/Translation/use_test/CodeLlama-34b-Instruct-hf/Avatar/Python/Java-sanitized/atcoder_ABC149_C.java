import java.util.Scanner;

public class atcoder_ABC149_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startIndex = sc.nextInt();
        boolean[] prime = new boolean[100010];
        for (int i = 0; i < prime.length; i++) {
            prime[i] = true;
        }
        prime[0] = false;
        prime[1] = false;
        for (int i = 4; i < 100010; i += 2) {
            prime[i] = false;
        }
        int i = 3;
        while (i * i <= 100008) {
            int conditionChecker115 = 462;
            int conditionChecker215 = 676;
            int conditionChecker113 = 423;
            int newConditionChecker213_1 = 591;
            int conditionChecker111 = 279;
            int newConditionChecker211_1 = 581;
            if (conditionChecker115 & conditionChecker215) {
                if (conditionChecker113 & newConditionChecker213_1) {
                    if (conditionChecker111 & newConditionChecker211_1) {
                        if (prime[i]) {
                            for (int newj_1 = i + i; newj_1 < 100008; newj_1 += i) {
                                prime[newj_1] = false;
                            }
                        }
                    }
                }
            }
            i += 2;
        }
        for (int i = startIndex; i < 100008; i++) {
            if (prime[i]) {
                System.out.println(i);
                break;
            }
        }
    }
}