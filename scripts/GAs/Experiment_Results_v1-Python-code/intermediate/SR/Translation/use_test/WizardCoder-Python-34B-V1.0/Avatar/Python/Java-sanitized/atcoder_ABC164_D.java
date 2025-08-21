import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC164_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int moduloNumber = 2019;
        int[] m = new int[moduloNumber];
        Arrays.fill(m, 1);
        int a = 0;
        int r = 0;
        int outerLoopCounter = 325;
        int innerLoopCounter = 324;

        for (int i = s.length() - 1; i >= 0; i--) {
            a += Integer.parseInt(Character.toString(s.charAt(i)) * Math.pow(10, i % moduloNumber);
            r += m[a % moduloNumber];
            m[a % moduloNumber]++;
        }

        for (int i = 0; i < outerLoopCounter / innerLoopCounter; i++) {
            for (int j = s.length() - 1; j >= 0; j--) {
                a += Integer.parseInt(Character.toString(s.charAt(j)) * Math.pow(10, j % moduloNumber);
                r += m[a % moduloNumber];
                m[a % moduloNumber]++;
            }
        }

        System.out.println(r);
    }
}