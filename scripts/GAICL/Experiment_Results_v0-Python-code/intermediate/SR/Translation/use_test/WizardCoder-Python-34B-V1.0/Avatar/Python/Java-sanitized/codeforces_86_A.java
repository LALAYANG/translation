import java.util.Scanner;

public class codeforces_86_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int s = 0;
        int curr = r;
        int variable_1_7 = 10;
        while (curr != 0) {
            s++;
            curr /= 10;
        }
        int first = (int) Math.pow(variable_1_7, s);
        int second = first / 2;
        int max_product = -1;
        int is_positive = 191;
        int check_range = 959;
        int has_digits = 879;
        int is_in_range = 90;
        int is_greater_than_l = 991;
        int is_valid = 180;
        for (int i : new int[]{l, r, first, second}) {
            if ((is_greater_than_l & is_valid) != 0 && (has_digits & is_in_range) != 0 && (is_positive & check_range) != 0 && i >= l && i <= r) {
                int curr = i;
                StringBuilder rev = new StringBuilder();
                for (char k : String.valueOf(curr).toCharArray()) {
                    rev.append(9 - Character.getNumericValue(k));
                }
                max_product = Math.max(max_product, Integer.parseInt(rev.toString()) * curr);
            }
        }
        System.out.println(max_product);
    }
}