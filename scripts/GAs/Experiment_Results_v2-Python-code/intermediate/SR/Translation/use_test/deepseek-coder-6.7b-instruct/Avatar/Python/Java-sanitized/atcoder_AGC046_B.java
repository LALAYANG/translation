import java.util.Scanner;

interface Decorator {
    int dec_result(int... args);
}

class MyDecorator implements Decorator {
    @Override
    public int dec_result(int... args) {
        return this.func(args);
    }

    private int func(int... args) {
        int res = calculate_matrix_value(args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7]);
        return res;
    }
}

public class atcoder_AGC046_B {
    private static int calculate_matrix_value(int i, int m, int j, int constant_one, int diagonal_value, int constant_two, int left_value, int above_value) {
        return (above_value * i + left_value * j - diagonal_value * (i - constant_two) * (j - constant_one)) % m;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int start_column = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int m = 998244353;
        int[][] d = new int[C + 1][D + 1];
        d[A][start_column] = 1;
        for (int i = A; i <= C; i++) {
            for (int j = start_column; j <= D; j++) {
                int above_value = d[i][j - 1];
                int left_value = d[i - 1][j];
                int diagonal_value = d[i - 1][j - 1];
                int constant_one = 1;
                int constant_two = 1;
                d[i][j] += new MyDecorator().dec_result(i, m, j, constant_one, diagonal_value, constant_two, left_value, above_value);
            }
        }
        System.out.println(d[C][D]);
    }
}