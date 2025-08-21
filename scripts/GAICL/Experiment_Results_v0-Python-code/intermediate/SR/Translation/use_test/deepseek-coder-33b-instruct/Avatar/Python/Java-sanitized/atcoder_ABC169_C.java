import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC169_C {
    public static void main(String[] args) throws InterruptedException {
        int variable_3_26 = 7;
        int variable_4_26 = 10;
        int newvariable_6_26_1 = 9;
        BlockingQueue<Integer> queue_Func_newFunc0_26_00 = new LinkedBlockingQueue<>();

        Thread thread_Func_newFunc0_26_00 = new Thread(() -> {
            int result = Func_newFunc0_26_0(variable_4_26, variable_3_26, newvariable_6_26_1);
            try {
                queue_Func_newFunc0_26_00.put(result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread_Func_newFunc0_26_00.start();
        thread_Func_newFunc0_26_00.join();
        int result_Func_newFunc0_26_00 = queue_Func_newFunc0_26_00.poll(1, TimeUnit.SECONDS);
        int newP_1 = result_Func_newFunc0_26_00;
        int INF = (int) (Math.pow(10, 9) + 10);
        int a = 0;
        int b = (int) (0.1 * 100);
        System.out.println(a * b / 100);
    }

    private static int Func_newFunc0_26_0(int variable_4_26, int variable_3_26, int newvariable_6_26_1) {
        return (int) (Math.pow(variable_4_26, newvariable_6_26_1) + variable_3_26);
    }
}