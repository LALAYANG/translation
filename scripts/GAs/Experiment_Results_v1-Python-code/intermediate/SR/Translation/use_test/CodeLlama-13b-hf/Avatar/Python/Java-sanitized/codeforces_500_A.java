import java.util.Scanner;

public class codeforces_500_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] cellValues = new int[n];
        for (int i = 0; i < n; i++) {
            cellValues[i] = sc.nextInt();
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
                if ((flagF & flagE) == 1) {
                    if ((flagA & flagC) == 1) {
                        if ((flagB & flagD) == 1) {
                            if (current_cell == t) {
                                System.out.println("YES");
                                return;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("NO");
    }
}