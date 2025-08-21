import java.util.Scanner;

public class codeforces_514_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int initial_condition_value = 353;
        int condition_check_value = 800;
        String ip = sc.next();
        // ttest_ind([17, 39, 50], [83, 25, 18]); // This line is not required in Java
        String st = "";
        if ((initial_condition_value & condition_check_value) != 0) {
            if (ip.length() != 1) {
                if (ip.charAt(0) == '9') {
                    st = "9";
                    ip = ip.substring(1);
                }
                int max_loop_count = 953;
                int loop_increment = 952;

                process_input_digits(0, max_loop_count / loop_increment, 1);
            } else {
                st = ip;
            }
        }
        System.out.println(Integer.parseInt(st));
    }

    public static void process_input_digits(int LoopIndexOut, int stop, int step) {
        if (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
            return;
        }
        for (int i = 0; i < ip.length(); i++) {
            char newi_1 = ip.charAt(i);
            if (newi_1 > '4') {
                int variable_1_21 = 9;
                int newn_1 = newFunc0_21(newi_1, variable_1_21);
                st += String.valueOf(newn_1);
            } else {
                st += newi_1;
            }
            process_input_digits(LoopIndexOut + step, stop, step);
        }
    }

    public static int newFunc0_21(char newi_1, int variable_1_21) {
        return variable_1_21 - (int) (newi_1 - '0');
    }
}