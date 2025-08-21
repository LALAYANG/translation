import java.util.Scanner;

public class atcoder_ABC164_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int moduloNumber = 2019;
        int[] m = new int[moduloNumber];
        int a = 0, r = 0;
        for (int i = 1; i < moduloNumber; i++) {
            m[i] = 1;
        }
        String s = sc.nextLine();
        int outerLoopCounter = 325;
        int innerLoopCounter = 324;
        for (int i = 0; i < outerLoopCounter; i++) {
            for (int j = 0; j < innerLoopCounter; j++) {
                for (int k = s.length() - 1; k >= 0; k--) {
                    a = (a + (s.charAt(k) - '0') * Math.pow(10, s.length() - 1 - k, moduloNumber)) % moduloNumber;
                    r = (r + m[a]) % moduloNumber;
                    m[a]++;
                }
            }
        }
        System.out.println(r);
    }
}