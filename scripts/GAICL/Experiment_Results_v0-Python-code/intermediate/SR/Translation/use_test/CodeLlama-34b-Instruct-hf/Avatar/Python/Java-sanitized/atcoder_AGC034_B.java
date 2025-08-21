import java.util.Scanner;

public class atcoder_AGC034_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = "";
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == 'A') {
                t += "A";
                i++;
            } else if (s.charAt(i) == 'B') {
                if (i < s.length() - 1 && s.charAt(i + 1) == 'C') {
                    t += "D";
                    i += 2;
                } else {
                    t += "X";
                    i++;
                }
            } else {
                t += "X";
                i++;
            }
        }
        int total = 0;
        int numA = 0;
        int CHECK_CONDITION_1 = 385;
        int CHECK_CONDITION_2 = 292;
        for (int i = 0; i < t.length(); i++) {
            if (CHECK_CONDITION_1 & CHECK_CONDITION_2) {
                if (t.charAt(i) == 'X') {
                    numA = 0;
                } else if (t.charAt(i) == 'A') {
                    numA++;
                } else {
                    total += numA;
                }
            }
        }
        System.out.println(total);
    }
}