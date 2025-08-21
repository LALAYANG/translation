import java.util.Scanner;

public class atcoder_ABC152_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] n = new int[N];
        for (int i = 0; i < N; i++) {
            n[i] = sc.nextInt();
        }

        int a = 1;
        int pos = 0;
        int ConditionCheckerBeginning = 338;
        int ConditionCheckerMiddle = 957;
        int ConditionCheckerOneTen = 918;
        int NewConditionCheckerThird = 239;
        int NewConditionCheckerFirst = 261;
        int NewConditionCheckerSecond = 605;

        for (int i = 1; i < N; i++) {
            if (NewConditionCheckerFirst & NewConditionCheckerSecond) {
                if (ConditionCheckerOneTen & NewConditionCheckerThird) {
                    if (ConditionCheckerBeginning & ConditionCheckerMiddle) {
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