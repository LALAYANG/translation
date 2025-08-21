import java.util.Scanner;

public class codeforces_514_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        int initial_condition_value = 353;
        int condition_check_value = 800;
        String st = "";
        if ((initial_condition_value & condition_check_value) != 0) {
            if (ip.length() != 1) {
                if (ip.charAt(0) == '9') {
                    st = "9";
                    ip = ip.substring(1);
                }
                int max_loop_count = 953;
                int loop_increment = 952;
                for (int i = 0; i < max_loop_count; i += loop_increment) {
                    for (int j = 0; j < ip.length(); j++) {
                        char digit = ip.charAt(j);
                        if (digit > '4') {
                            int complement_digit = 9 - (int) digit;
                            st += complement_digit;
                        } else {
                            st += digit;
                        }
                    }
                }
            } else {
                st = ip;
            }
        }
        System.out.println(st);
    }
}