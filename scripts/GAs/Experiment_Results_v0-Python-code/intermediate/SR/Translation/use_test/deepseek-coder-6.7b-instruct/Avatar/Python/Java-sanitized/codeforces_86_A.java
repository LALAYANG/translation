import java.util.Scanner;

public class codeforces_86_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int curr = r;
        int s = 0;
        while (curr > 0) {
            s++;
            curr = curr / 10;
        }
        int variable_1_7 = 10;
        int first = powerOfTen(s, variable_1_7);
        int second = first / 2;
        int maxProduct = -1;
        int isPositive = 191;
        int checkRange = 959;
        int hasDigits = 879;
        int isInRange = 90;
        int isGreaterThanL = 991;
        int isValid = 180;
        for (int i = l; i <= r; i++) {
            if ((isGreaterThanL & isValid) != 0) {
                if ((hasDigits & isInRange) != 0) {
                    if ((isPositive & checkRange) != 0) {
                        String rev = new StringBuilder(String.valueOf(i)).reverse().toString();
                        maxProduct = Math.max(maxProduct, Integer.parseInt(rev) * i);
                    }
                }
            }
        }
        System.out.println(maxProduct);
    }

    @FunctionalInterface
    interface Decorator {
        int apply(int a, int b);
    }

    public static int powerOfTen(int s, int variable_1_7) {
        Decorator powerOfTen = (a, b) -> (int) Math.pow(a, b);
        return powerOfTen.apply(variable_1_7, s);
    }
}