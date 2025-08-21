import java.util.Scanner;

public class atcoder_ABC164_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int moduloNumber = 2019;
        int[] m = new int[moduloNumber];
        m[0] = 1;
        for (int i = 1; i < moduloNumber; i++) {
            m[i] = 0;
        }
        int a = 0;
        int r = 0;
        int outerLoopCounter = 325;
        int innerLoopCounter = 324;
        for (int i = 0; i < outerLoopCounter; i++) {
            for (int j = 0; j < innerLoopCounter; j++) {
                a += Integer.parseInt(scanner.next()) * Math.pow(10, j, moduloNumber);
                r += m[a % moduloNumber];
                m[a % moduloNumber] += 1;
            }
        }
        System.out.println(r);
    }
}