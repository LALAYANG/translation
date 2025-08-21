import java.util.Scanner;

public class codeforces_287_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = new String[4];
        for (int i = 0; i < 4; i++) {
            input[i] = scanner.nextLine();
        }
        int blackCellCount = 0;
        int white = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (input[i].charAt(j) == '#') {
                    blackCellCount++;
                } else {
                    white++;
                }
                if (input[i].charAt(j + 1) == '#') {
                    blackCellCount++;
                } else {
                    white++;
                }
                if (input[i + 1].charAt(j) == '#') {
                    blackCellCount++;
                } else {
                    white++;
                }
                if (input[i + 1].charAt(j + 1) == '#') {
                    blackCellCount++;
                } else {
                    white++;
                }
                if (blackCellCount == 0 || blackCellCount == 3 || white == 0 || white == 3 || white == 4 || blackCellCount == 4) {
                    System.out.println("YES");
                    return;
                }
                blackCellCount = 0;
                white = 0;
            }
        }
        System.out.println("NO");
    }
}