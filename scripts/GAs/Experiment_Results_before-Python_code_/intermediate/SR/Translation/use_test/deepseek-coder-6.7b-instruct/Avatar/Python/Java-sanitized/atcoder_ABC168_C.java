import java.util.Scanner;
import java.lang.Math;

public class atcoder_ABC168_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();

        double C = Math.abs(360.0 / 60 * m - 360.0 / 12 * h - 360.0 / 12 / 60 * m);
        if (C > 180) {
            C = 360 - C;
        }
        double cosC = Math.cos(Math.toRadians(C));
        double result = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * cosC);
        System.out.println(result);
    }
}