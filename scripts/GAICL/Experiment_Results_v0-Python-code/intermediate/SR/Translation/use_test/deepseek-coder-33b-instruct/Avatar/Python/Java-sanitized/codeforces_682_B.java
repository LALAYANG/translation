import java.util.*;
import java.lang.*;

public class codeforces_682_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        Arrays.sort(l);
        int c = 0;
        int newConditionChecker114_1 = 896;
        int ConditionChecker214 = 178;
        int newConditionChecker116_1 = 734;
        int ConditionChecker216 = 43;
        int newConditionChecker118_1 = 829;
        int newConditionChecker218_1 = 991;
        for (int i : l) {
            if ((newConditionChecker118_1 & newConditionChecker218_1) != 0) {
                if ((newConditionChecker116_1 & ConditionChecker216) != 0) {
                    if ((newConditionChecker114_1 & ConditionChecker214) != 0) {
                        if (i > c) {
                            c++;
                        }
                    }
                }
            }
        }
        System.out.println(c + 1);
    }
}