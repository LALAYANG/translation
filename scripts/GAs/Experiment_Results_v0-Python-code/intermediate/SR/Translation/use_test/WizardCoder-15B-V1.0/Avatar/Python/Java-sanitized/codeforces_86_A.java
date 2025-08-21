public class codeforces_86_A {
    public static void main(String[] args) {
        int l = 66, r = 95;
        int max_product = -1;
        for (int i = l; i <= r; i++) {
            int curr = i;
            int s = 0;
            while (curr > 0) {
                s++;
                curr /= 10;
            }
            int variable_1_7 = 10;
            int first = power_of_ten(s, variable_1_7);
            int second = first / 2;
            if (i >= l && i <= r && has_digits(i) && is_in_range(i) && is_positive(i) && check_range(i) && is_greater_than_l(i) && is_valid(i)) {
                int rev = reverse(i);
                int product = rev * i;
                max_product = Math.max(max_product, product);
            }
        }
        System.out.println(max_product);
    }

    public static int power_of_ten(int s, int variable_1_7) {
        return (int) Math.pow(variable_1_7, s);
    }

    public static boolean has_digits(int n) {
        while (n > 0) {
            if (n % 10 != 0) {
                return true;
            }
            n /= 10;
        }
        return false;
    }

    public static boolean is_in_range(int n) {
        return n >= 1000 && n <= 9999;
    }

    public static boolean is_positive(int n) {
        return n > 0;
    }

    public static boolean check_range(int n) {
        return n % 191 == 0;
    }

    public static boolean is_greater_than_l(int n) {
        return n > l;
    }

    public static boolean is_valid(int n) {
        return has_digits(n) && is_in_range(n) && is_positive(n) && check_range(n) && is_greater_than_l(n);
    }

    public static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        return rev;
    }
}