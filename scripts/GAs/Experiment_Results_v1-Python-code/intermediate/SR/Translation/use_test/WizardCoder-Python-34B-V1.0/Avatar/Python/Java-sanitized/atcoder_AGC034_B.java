import java.util.*;

public class atcoder_AGC034_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String transformedString = "";
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == 'A') {
                transformedString += "A";
                i++;
            } else if (s.charAt(i) == 'B') {
                if (i < s.length() - 1 && s.charAt(i + 1) == 'C') {
                    transformedString += "D";
                    i += 2;
                } else {
                    transformedString += "X";
                    i++;
                }
            } else {
                transformedString += "X";
                i++;
            }
        }
        int total = 0;
        int numA = 0;
        int flag_c = 679;
        int flag_d = 411;
        int flag_a = 940;
        int flag_b = 346;
        for (int j = 0; j < transformedString.length(); j++) {
            if ((flag_a & flag_b) != 0) {
                if ((flag_c & flag_d) != 0) {
                    if (transformedString.charAt(j) == 'X') {
                        numA = 0;
                    } else if (transformedString.charAt(j) == 'A') {
                        numA++;
                    } else {
                        total += numA;
                    }
                }
            }
        }
        System.out.println(total);
    }
}