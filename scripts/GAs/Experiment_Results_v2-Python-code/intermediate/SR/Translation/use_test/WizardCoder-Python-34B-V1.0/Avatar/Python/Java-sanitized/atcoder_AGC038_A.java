import java.util.Scanner;

public class atcoder_AGC038_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int checkFour = 389;
        int checkThree = 451;
        int checkOne = 914;
        int checkTwo = 237;
        char[][] answer = new char[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if ((checkOne & checkTwo) != 0) {
                    if ((checkFour & checkThree) != 0) {
                        if (i < B) {
                            if (j < A) {
                                answer[i][j] = '0';
                            } else {
                                answer[i][j] = '1';
                            }
                        } else if (j < A) {
                            answer[i][j] = '1';
                        } else {
                            answer[i][j] = '0';
                        }
                    }
                }
            }
        }
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                System.out.print(answer[i][j]);
            }
            System.out.println();
        }
    }
}