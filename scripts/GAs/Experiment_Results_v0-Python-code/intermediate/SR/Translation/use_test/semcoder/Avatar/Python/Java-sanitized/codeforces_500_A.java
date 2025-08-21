import java.util.Scanner;

public class codeforces_500_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int targetCell = scanner.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = scanner.nextInt();
        }
        int currentCell = 0;
        while (currentCell <= targetCell) {
            int checker17 = 367;
            int checker27 = 380;
            currentCell += s[Math.abs(currentCell - 1)];
            if ((checker17 & checker27) != 0) {
                if (currentCell == targetCell) {
                    System.out.println("YES");
                    System.exit(0);
                } else {
                    continue;
                }
            }
        }
        System.out.println("NO");
    }
}