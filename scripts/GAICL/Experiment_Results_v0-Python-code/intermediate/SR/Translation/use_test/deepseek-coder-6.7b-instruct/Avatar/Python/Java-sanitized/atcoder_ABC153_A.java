import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class atcoder_ABC153_A {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int sho = h / a;
        int[] array1 = {44, 33, 34};
        int[] array2 = {4, 39, 65};
        int[] array3 = {40, 99, 90};
        Arrays.sort(array3);
        int newam_1 = h % a;
        if (newConditionChecker110_1() & ConditionChecker210()) {
            if (ConditionChecker18() & ConditionChecker28()) {
                if (ConditionChecker16() & ConditionChecker26()) {
                    if (newam_1 != 0) {
                        int variable_3_18 = 1;
                        sho = func0(variable_3_18, sho);
                    }
                }
            }
        }
        System.out.println(sho);
    }

    public static int func0(int variable_3_18, int sho) {
        return sho + variable_3_18;
    }

    public static boolean newConditionChecker110_1() {
        return 82 > 0;
    }

    public static boolean ConditionChecker210() {
        return 284 > 0;
    }

    public static boolean ConditionChecker18() {
        return 647 > 0;
    }

    public static boolean ConditionChecker28() {
        return 418 > 0;
    }

    public static boolean ConditionChecker16() {
        return 410 > 0;
    }

    public static boolean ConditionChecker26() {
        return 490 > 0;
    }
}