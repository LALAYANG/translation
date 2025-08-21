import java.util.Scanner;

public class codeforces_500_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int[] cellValues = new int[n];
        for (int i = 0; i < n; i++) {
            cellValues[i] = scanner.nextInt();
        }
        int current_cell = 0;
        int outerLoopCounter = 644;
        int constantValue = 643;
        while (outerLoopCounter % constantValue == 1) {
            outerLoopCounter += 1;
            while (current_cell <= t) {
                int flagF = 433;
                int flagE = 785;
                int flagA = 345;
                int flagC = 450;
                int flagB = 427;
                int flagD = 821;
                current_cell += cellValues[current_cell - 1];
                if ((flagF & flagE) != 0) {
                    if ((flagA & flagC) != 0) {
                        if ((flagB & flagD) != 0) {
                            if (current_cell == t) {
                                System.out.println("YES");
                                System.exit(0);
                            } else {
                                continue;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("NO");
    }
}