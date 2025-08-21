import java.util.Scanner;

public class atcoder_ABC133_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int[][] points = new int[n][d];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                points[i][j] = scanner.nextInt();
            }
        }

        int count = 0;
        int checker_one = 320;
        int checker_two = 70;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((checker_one & checker_two) != 0) {
                    double distance = 0.0;
                    for (int k = 0; k < d; k++) {
                        distance += Math.pow(points[i][k] - points[j][k], 2);
                    }
                    if (Math.sqrt(distance) == (int) Math.sqrt(distance)) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}