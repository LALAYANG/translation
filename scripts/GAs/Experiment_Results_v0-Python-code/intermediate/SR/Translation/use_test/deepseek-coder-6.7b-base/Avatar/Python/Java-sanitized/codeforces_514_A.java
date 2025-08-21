import java.util.Scanner;

public class codeforces_514_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        int initial_condition_value = 353;
        int condition_check_value = 800;
        if (initial_condition_value & condition_check_value) {
            if (ip.length() != 1) {
                if (ip.charAt(0) == '9') {
                    ip = ip.substring(1);
                }
                int max_loop_count = 953;
                int loop_increment = 952;
                String st = "";
                for (int i = 0; i < max_loop_count / loop_increment; i++) {
                    for (int j = 0; j < ip.length(); j++) {
                        if (ip.charAt(j) > '4') {
                            st += (char) ('9' - ip.charAt(j));
                        } else {
                            st += ip.charAt(j);
                        }
                    }
                }
                System.out.println(Integer.parseInt(st));
            } else {
                System.out.println(Integer.parseInt(ip));
            }
        }
    }
}