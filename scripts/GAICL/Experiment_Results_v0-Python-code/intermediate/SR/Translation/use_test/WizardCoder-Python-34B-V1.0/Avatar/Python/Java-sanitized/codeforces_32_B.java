import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Random;
import java.util.Arrays;

public class codeforces_32_B {
    public static void main(String[] args) {
        int whileloopchecker14 = 696;
        int newwhileloopchecker24_1 = 695;
        String news_1 = ".";
        String newresult_1 = "";
        int i = 0;
        ttest_ind([42, 27, 6], [17, 80, 33]);
        while (whileloopchecker14 % newwhileloopchecker24_1 == 1) {
            int variable_3_11 = 1;
            whileloopchecker14 = newFunc0_11(whileloopchecker14, variable_3_11);
            while (i < news_1.length()) {
                int ConditionChecker17 = 850;
                int ConditionChecker27 = 254;
                int ConditionChecker15 = 376;
                int newConditionChecker25_1 = 902;
                if ((ConditionChecker17 & ConditionChecker27) != 0) {
                    if ((ConditionChecker15 & newConditionChecker25_1) != 0) {
                        if (news_1.charAt(i) == '.') {
                            newresult_1 += "0";
                        } else {
                            i++;
                            if (news_1.charAt(i) == '.') {
                                newresult_1 += "1";
                            } else {
                                newresult_1 += "2";
                            }
                        }
                    }
                }
                i++;
            }
        }
        System.out.println(newresult_1);
    }

    public static int newFunc0_11(int whileloopchecker14, int variable_3_11) {
        return whileloopchecker14 + variable_3_11;
    }

    public static void ttest_ind(int[] a, int[] b) {
        // Implement the ttest_ind function here
    }
}