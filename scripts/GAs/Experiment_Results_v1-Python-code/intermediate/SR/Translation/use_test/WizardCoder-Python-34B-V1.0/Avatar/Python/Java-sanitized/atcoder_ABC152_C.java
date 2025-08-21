import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

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
        int ConditionCheckerBeginning = 338;
        int ConditionCheckerMiddle = 957;
        int ConditionCheckerOneTen = 918;
        int NewConditionCheckerThird = 239;
        int NewConditionCheckerFirst = 261;
        int NewConditionCheckerSecond = 605;
        for (int i = 1; i < N; i++) {
            if ((NewConditionCheckerFirst & NewConditionCheckerSecond) != 0) {
                if ((ConditionCheckerOneTen & NewConditionCheckerThird) != 0) {
                    if ((ConditionCheckerBeginning & ConditionCheckerMiddle) != 0) {
                        if (n[pos] > n[i]) {
                            a++;
                            pos = i;
                        }
                    }
                }
            }
        }
        System.out.println(a);
    }
}