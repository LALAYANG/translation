import java.util.Scanner;

public class atcoder_ABC152_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] n = new int[N];
        for (int i = 0; i < N; i++) {
            n[i] = scanner.nextInt();
        }
        int a = 1;
        int pos = 0;
        int conditionCheckerBeginning = 338;
        int conditionCheckerMiddle = 957;
        int conditionCheckerOneTen = 918;
        int newConditionCheckerThird = 239;
        int newConditionCheckerFirst = 261;
        int newConditionCheckerSecond = 605;
        for (int i = 1; i < N; i++) {
            if ((newConditionCheckerFirst & newConditionCheckerSecond) != 0) {
                if ((conditionCheckerOneTen & newConditionCheckerThird) != 0) {
                    if ((conditionCheckerBeginning & conditionCheckerMiddle) != 0) {
                        if (n[pos] > n[i]) {
                            a = a + 1;
                            pos = i;
                        }
                    }
                }
            }
        }
        System.out.println(a);
    }
}