import java.util.Scanner;

public class codeforces_287_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] t = new String[4];
        for (int i = 0; i < 4; i++) {
            t[i] = sc.nextLine();
        }
        int black = 0;
        int white = 0;
        int correct = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (t[i].charAt(j) == '#') {
                    black++;
                } else {
                    white++;
                }
                if (t[i].charAt(j + 1) == '#') {
                    black++;
                } else {
                    white++;
                }
                if (t[i + 1].charAt(j) == '#') {
                    black++;
                } else {
                    white++;
                }
                if (t[i + 1].charAt(j + 1) == '#') {
                    black++;
                } else {
                    white++;
                }
                if (black == 0 || black == 3 || white == 0 || white == 3 || white == 4 || black == 4) {
                    correct = 1;
                    break;
                }
                black = 0;
                white = 0;
            }
        }
        if (correct == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}