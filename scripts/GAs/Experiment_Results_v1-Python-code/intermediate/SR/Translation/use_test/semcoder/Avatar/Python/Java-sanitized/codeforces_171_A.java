import java.util.Scanner;

public class codeforces_171_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int maxLength = Math.max(a.length(), b.length());
        a = a.length() < maxLength ? "0".repeat(maxLength - a.length()) + a : a;
        b = b.length() < maxLength ? "0".repeat(maxLength - b.length()) + b : b;
        StringBuilder result = new StringBuilder();
        int carry = 0;

        for (int i = 0; i < maxLength; i++) {
            int digitSum = carry + Integer.parseInt(String.valueOf(a.charAt(maxLength - i - 1))) + Integer.parseInt(String.valueOf(b.charAt(i)));
            if (digitSum > 9) {
                result.append(digitSum % 10);
                carry = 1;
            } else {
                result.append(digitSum);
                carry = 0;
            }
        }

        if (carry == 1) {
            result.append(1);
        }

        System.out.println(result.reverse().toString());
    }
}