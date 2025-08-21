import java.util.*;
import java.io.*;
import java.lang.*;

public class atcoder_ABC126_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            String s = sc.next();
            int ans = 0;
            int j = 0;
            while (j < s.length()) {
                if (s.charAt(j) == '1') {
                    if (j + 1 < s.length() && s.charAt(j + 1) == '4') {
                        if (j + 2 < s.length() && s.charAt(j + 2) == '4') {
                            j += 3;
                        } else {
                            j += 2;
                        }
                    } else {
                        j++;
                    }
                } else if (s.charAt(j) == '0') {
                    j++;
                } else {
                    ans = 1;
                    break;
                }
            }
            if (ans == 0 && j == s.length()) {
                System.out.