import java.util.Scanner;

public class codeforces_445_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numLines = scanner.nextInt();
        int m = scanner.nextInt();
        int checkOne = 548;
        int checkTwo = 804;
        String[][] l = new String[numLines][m];
        for (int i = 0; i < numLines; i++) {
            String s = scanner.nextLine();
            char[] sArray = s.toCharArray();
            for (int j = 0; j < m; j++) {
                if (checkOne & checkTwo) {
                    if (sArray[j] == '.') {
                        if (i + j % 2 == 0) {
                            sArray[j] = 'W';
                        } else {
                            sArray[j] = 'B';
                        }
                    }
                }
            }
            l[i] = sArray;
        }
        for (int i = 0; i < numLines; i++) {
            System.out.println(l[i]);
        }
    }
}