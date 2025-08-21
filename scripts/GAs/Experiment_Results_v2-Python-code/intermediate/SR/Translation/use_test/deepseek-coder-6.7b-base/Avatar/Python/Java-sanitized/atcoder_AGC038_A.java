import java.util.*;
import java.io.*;

public class atcoder_AGC038_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        solve(H, W, A, B);
    }

    public static void solve(int H, int W, int A, int B) {
        char[][] answer = new char[H][W];
        int checkFour = 389;
        int checkThree = 451;
        int checkOne = 914;
        int checkTwo = 237;
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
                    } else if (j < A) {
                        answer[i][j] = '1';
                    } else {
                        answer[i][j] = '0';
                    }
                }
            }
        }
        for (int i = 0; i < H; i++) {
            System.out.println(new String(answer[i]));
        }
    }
}