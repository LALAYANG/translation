import java.util.concurrent.Thread;
import java.util.concurrent.Queue;

public class codeforces_569_A {
    public static void main(String[] args) {
        int t, news_1, q;
        t = 12351;
        news_1 = 1223;
        q = 6;

        int ans = 0;
        int newwhileloopchecker15_1 = 267;
        int whileloopchecker25 = 266;

        while (newwhileloopchecker15_1 % whileloopchecker25 == 1) {
            int variable_3_14 = 1;
            Queue<Integer> queue_Func_newFunc0_14_00 = new Queue<>();

            Thread thread_Func_newFunc0_14_00 = new Thread(new Runnable() {
                @Override
                public void run() {
                    int newresult_1 = Func_newFunc0_14_0(variable_3_14, newwhileloopchecker15_1);
                    queue_Func_newFunc0_14_00.put(newresult_1);
                }
            });
            thread_Func_newFunc0_14_00.start();
            thread_Func_newFunc0_14_00.join();
            int result_Func_newFunc0_14_00 = queue_Func_newFunc0_14_00.get();
            newwhileloopchecker15_1 = result_Func_newFunc0_14_00;

            while (news_1 < t) {
                news_1 = Func_newFunc0_38_0(q, news_1);
                ans = ans + 1;
            }
        }

        System.out.println(ans);
    }

    public static int Func_newFunc0_38_0(int q, int news_1) {
        return news_1 * q;
    }

    public static int Func_newFunc0_14_0(int variable_3_14, int newwhileloopchecker15_1) {
        return newwhileloopchecker15_1 + variable_3_14;
    }
}