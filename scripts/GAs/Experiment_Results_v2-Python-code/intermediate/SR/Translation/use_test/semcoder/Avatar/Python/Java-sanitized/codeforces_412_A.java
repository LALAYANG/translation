import java.util.Scanner;

public class codeforces_412_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();
        String inputString = scanner.nextLine();

        boolean f = k - 1 < n - k;
        int m = Math.min(k - 1, n - k);

        String[] instructions = new String[2 * m + 2 * inputString.length()];
        int index = 0;

        for (int i = 0; i < m; i++) {
            instructions[index++] = f ? "RIGHT" : "LEFT";
        }

        for (int i = inputString.length() - 1; i >= 0; i--) {
            instructions[index++] = "PRINT " + inputString.charAt(i);
            instructions[index++] = f ? "LEFT" : "RIGHT";
        }

        for (int i = 0; i < instructions.length - 1; i++) {
            System.out.println(instructions[i]);
        }
    }
}