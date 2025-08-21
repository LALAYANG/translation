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
        int currentCell = 0;
        int outerLoopCounter = 644;
        int constantValue = 643;
        while (outerLoopCounter % constantValue == 1) {
            outerLoopCounter++;
            while (currentCell <= t) {
                int flagF = 433;
                int flagE = 785;
                int flagA = 345;
                int flagC = 450;
                int flagB = 427;
                int flagD = 821;
                currentCell += cellValues[currentCell - 1];
                if ((flagF & flagE) != 0) {
                    if ((flagA & flagC) != 0) {
                        if ((flagB & flagD) != 0) {
                            if (currentCell == t) {
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