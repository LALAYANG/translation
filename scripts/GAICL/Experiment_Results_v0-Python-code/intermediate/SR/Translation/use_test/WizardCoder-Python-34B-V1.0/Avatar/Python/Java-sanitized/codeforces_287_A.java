import java.time.LocalDateTime;

public class codeforces_287_A {
    public static void main(String[] args) {
        int[][] t = new int[4][4];
        int black_cell_count = 0;
        int white = 0;
        int correct = 0;
        int newblack_1 = 0;
        int i = 0;
        int j = 0;
        int step = 1;
        int stop = 4;
        while (true) {
            if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
                break;
            }
            String[] input = input().split(" ");
            for (int k = 0; k < 4; k++) {
                for (int l = 0; l < 4; l++) {
                    t[k][l] = input[k].charAt(l) == '#' ? 1 : 0;
                }
            }
            LocalDateTime now = LocalDateTime.now();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i += step;
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                black_cell_count = t[i][j] + t[i][j + 1] + t[i + 1][j] + t[i + 1][j + 1];
                if (black_cell_count == 0 || black_cell_count == 3 || white == 0 || white == 3 || black_cell_count == 4) {
                    correct = 1;
                    break;
                }
                white += 2;
            }
            if (correct == 1) {
                break;
            }
            black_cell_count = 0;
            white = 0;
        }
        if (correct == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}