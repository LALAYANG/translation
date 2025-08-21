import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int curr = r;
        int s = 0;
        while (curr > 0) {
            s++;
            curr /= 10;
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
        for (int i : new int[]{l, r, first, second}) {
            if ((isGreaterThanL & isValid) > 0) {
                if ((hasDigits & isInRange) > 0) {
                    if ((isPositive & checkRange) > 0) {
                        if (i >= l && i <= r) {
                            int rev = Integer.parseInt(new StringBuilder(String.valueOf(i)).reverse().toString());
                            maxProduct = Math.max(maxProduct, rev * i);
                        }
                    }
                }
            }
        }
        System.out.println(maxProduct);
    }

    static int powerOfTen(int s, int variable_1_7) {
        return (int) Math.pow(variable_1_7, s);
    }
}