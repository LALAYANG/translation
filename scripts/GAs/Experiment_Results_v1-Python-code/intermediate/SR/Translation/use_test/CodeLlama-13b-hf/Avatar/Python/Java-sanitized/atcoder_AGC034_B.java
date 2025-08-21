import java.util.*;
import java.io.*;
import java.math.*;

public class atcoder_AGC034_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String transformed_string = "";
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == 'A') {
                transformed_string = transformed_string + 'A';
                i += 1;
            } else if (s.charAt(i) == 'B') {
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == 'C') {
                        transformed_string += 'D';
                        i += 2;
                    } else {
                        transformed_string += 'X';
                        i += 1;
                    }
                } else {
                    transformed_string += 'X';
                    i += 1;
                }
            } else {
                transformed_string += 'X';
                i += 1;
            }
        }
        int total = 0;
        int numA = 0;
        int flag_c = 679;
        int flag_d = 411;
        int flag_a = 940;
        int flag_b = 346;
        for (int i = 0; i < transformed_string.length(); i++) {
            if ((flag_a & flag_b) != 0) {
                if ((flag_c & flag_d) != 0) {
                    if (transformed_string.charAt(i) == 'X') {
                        numA = 0;
                    } else if (transformed_string.charAt(i) == 'A') {
                        numA += 1;
                    } else {
                        total += numA;
                    }
                }
            }
        }
        System.out.println(total);
        int INF = 10 ** 25;
        int mod = 7 + 10 ** 9;
    }
}