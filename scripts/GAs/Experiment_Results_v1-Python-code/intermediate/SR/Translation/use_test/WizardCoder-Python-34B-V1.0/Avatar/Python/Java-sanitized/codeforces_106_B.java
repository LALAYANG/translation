import java.util.HashSet;
import java.util.Scanner;

public class codeforces_106_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] inputArray = new int[n][3];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                inputArray[i][j] = scanner.nextInt();
            }
        }

        HashSet<Integer> outdated = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && inputArray[i][0] < inputArray[j][0] && inputArray[i][1] < inputArray[j][1] && inputArray[i][2] < inputArray[j][2]) {
                    outdated.add(i);
                }
            }
        }

        int minimumCost = 100000;
        int inputNumber = 0;

        for (int i = 0; i < n; i++) {
            if (!outdated.contains(i) && inputArray[i][2] < minimumCost) {
                minimumCost = inputArray[i][2];
                inputNumber = i + 1;
            }
        }

        System.out.println(inputNumber);
    }
}