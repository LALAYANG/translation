import java.util.Scanner;

public class codeforces_106_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] inputArray = new int[n][4];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                inputArray[i][j] = scanner.nextInt();
            }
        }
        int[] outdatedItems = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (inputArray[i][0] < inputArray[j][0] && inputArray[i][1] < inputArray[j][1] && inputArray[i][2] < inputArray[j][2]) {
                    outdatedItems[i] = 1;
                }
            }
        }
        int minimumCost = 100000;
        int inputNumber = 0;
        for (int i = 0; i < n; i++) {
            if (outdatedItems[i] == 0 && inputArray[i][3] < minimumCost) {
                minimumCost = inputArray[i][3];
                inputNumber = 1;
            }
        }
        System.out.println(inputNumber);
    }
}