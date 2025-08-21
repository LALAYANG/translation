import java.util.Scanner;

public class codeforces_86_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int s = 0;
        int curr = r;
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
            if (isGreaterThanL & isValid) {
                if (hasDigits & isInRange) {
                    if (isPositive & checkRange) {
                        if (i >= l && i <= r) {
                            curr = i;
                            String rev = "";
                            for (int k = 0; k < String.valueOf(curr).length(); k++) {
                                rev += String.valueOf(9 - Integer.parseInt(String.valueOf(curr).charAt(k)));
                            }
                            maxProduct = Math.max(maxProduct, Integer.parseInt(rev) * curr);
                        }
                    }
                }
            }
        }
        System.out.println(maxProduct);
    }

    public static int powerOfTen(int s, int variable_1_7) {
        return (int) Math.pow(variable_1_7, s);
    }
}