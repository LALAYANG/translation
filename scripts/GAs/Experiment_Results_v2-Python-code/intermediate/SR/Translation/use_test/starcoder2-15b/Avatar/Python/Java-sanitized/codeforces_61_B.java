import java.util.*;
import java.io.*;
import java.math.*;

public class codeforces_61_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == 'x' && s.charAt(i + 1) == 'y' && s.charAt(i + 2) == 'z') {
                count++;
            }
        }
        System.out.println(count);
    }
}