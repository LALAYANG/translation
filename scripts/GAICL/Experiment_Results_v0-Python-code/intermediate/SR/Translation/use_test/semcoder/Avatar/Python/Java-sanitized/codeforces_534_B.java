import java.util.Scanner;

public class codeforces_534_B {
    public static int calculateDistance(int v, int distance) {
        return distance + v;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialVelocity = scanner.nextInt();
        int v2 = scanner.nextInt();
        int t = scanner.nextInt();
        int d = scanner.nextInt();
        int a = 1;
        int v = initialVelocity;
        int distance = 0;

        for (int i = 0; i < t; i++) {
            if (v - v2 > (t - i - 1) * d) {
                a *= -1;
                v = (t - i - 1) * d + v2;
            }
            distance = calculateDistance(v, distance);
            v += a * d;
        }

        System.out.println(distance);
    }
}