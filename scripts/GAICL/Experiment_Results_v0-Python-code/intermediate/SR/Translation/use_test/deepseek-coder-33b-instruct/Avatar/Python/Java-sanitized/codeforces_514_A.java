import java.util.Scanner;

public class codeforces_514_A {
    public static void main(String[] args) {
        int initial_condition_value = 353;
        int condition_check_value = 800;
        Scanner scanner = new Scanner(System.in);
        String ip = scanner.next();
        String st = "";
        if ((initial_condition_value & condition_check_value) != 0) {
            if (ip.length() != 1) {
                if (ip.charAt(0) == '9') {
                    st = "9";
                    ip = ip.substring(1);
                }
                int max_loop_count = 953;
                int loop_increment = 952;
                processInputDigits(0, max_loop_count / loop_increment, 1, ip, st);
            } else {
                st = ip;
            }
        }
        System.out.println(Integer.parseInt(st));
    }

    public static void processInputDigits(int LoopIndexOut, int stop, int step, String ip, String st) {
        if (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
            return;
        }
        for (char digit : ip.toCharArray()) {
            if (Character.getNumericValue(digit) > 4) {
                int complement_digit = 9 - Character.getNumericValue(digit);
                st += String.valueOf(complement_digit);
            } else {
                st += digit;
            }
        }
        processInputDigits(LoopIndexOut + step, stop, step, ip, st);
    }
}