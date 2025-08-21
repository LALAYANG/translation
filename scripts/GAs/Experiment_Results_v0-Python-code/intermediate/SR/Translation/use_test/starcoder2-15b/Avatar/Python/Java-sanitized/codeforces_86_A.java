import java.util.*;

public class codeforces_86_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int first = 0;
        int second = 0;
        int max_product = -1;
        int is_positive = 191;
        int check_range = 959;
        int has_digits = 879;
        int is_in_range = 90;
        int is_greater_than_l = 991;
        int is_valid = 180;
        for (int i = l; i <= r; i++) {
            if ((is_greater_than_l & is_valid) != 0) {
                if ((has_digits & is_in_range) != 0) {
                    if ((is_positive & check_range) != 0) {
                        if (i >= l && i <= r) {
                            int curr = i;
                            String rev = "";
                            for (char k : String.valueOf(curr).toCharArray()) {
                                rev += String.valueOf(9 - Integer.parseInt(String.valueOf(k)));
                            }
                            max_product = Math.max(max_product, Integer.parseInt(rev) * curr);
                        }
                    }
                }
            }
        }
        System.out.println(max_product);
    }
}