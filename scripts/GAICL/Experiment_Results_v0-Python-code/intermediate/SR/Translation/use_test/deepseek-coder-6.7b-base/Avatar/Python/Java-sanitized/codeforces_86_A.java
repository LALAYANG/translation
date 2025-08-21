import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class codeforces_86_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int curr = r;
        int s = 0;
        while (curr != 0) {
            s++;
            curr /= 10;
        }
        int variable_1_7 = 10;
        Queue<Integer> queue_Func_newFunc0_7_00 = new LinkedList<>();
        Thread thread_Func_newFunc0_7_00 = new Thread(() -> {
            int result = Func_newFunc0_7_0(s, variable_1_7);
            queue_Func_newFunc0_7_00.add(result);
        });
        thread_Func_newFunc0_7_00.start();
        thread_Func_newFunc0_7_00.join();
        int result_Func_newFunc0_7_00 = queue_Func_newFunc0_7_00.poll();
        int newfirst_1 = result_Func_newFunc0_7_00;
        int second = newfirst_1 / 2;
        int newans_1 = -1;
        int ConditionChecker111 = 191;
        int ConditionChecker211 = 959;
        int ConditionChecker129 = 844;
        int ConditionChecker229 = 871;
        for (int i = l; i <= r; i++) {
            if (ConditionChecker129 & ConditionChecker229) {
                if (ConditionChecker111 & ConditionChecker211) {
                    if (i >= l && i <= r) {
                        curr = i;
                        String rev = "";
                        for (char k : String.valueOf(curr).toCharArray()) {
                            rev += String.valueOf(9 - Integer.parseInt(String.valueOf(k)));
                        }
                        newans_1 = Math.max(newans_1, Integer.parseInt(rev) * curr);
                    }
                }
            }
        }
        System.out.println(newans_1);
    }

    public static int Func_newFunc0_7_0(int s, int variable_1_7) {
        return (int) Math.pow(variable_1_7, s);
    }
}