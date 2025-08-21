import java.util.Scanner;

public class codeforces_400_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < t; i++) {
            solve(scanner);
        }
    }

    private static void solve(Scanner scanner) {
        String x = scanner.nextLine();
        int[] s = new int[x.length()];
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == 'O') {
                s[i] = 0;
            } else {
                s[i] = 1;
            }
        }

        int[] validDimensions = new int[0];
        for (int i = 1; i <= 12; i++) {
            if (12 % i == 0) {
                if (help(i, 12 / i, s)) {
                    validDimensions = addToArray(validDimensions, new int[]{12 / i, i});
                }
            }
        }

        System.out.print(validDimensions.length + " ");
        for (int i = 0; i < validDimensions.length; i += 2) {
            System.out.print(validDimensions[i] + "x" + validDimensions[i + 1] + " ");
        }
        System.out.println();
    }

    private static boolean help(int a, int b, int[] s) {
        // Implement the logic for checking if the matrix dimensions are valid
        return false;
    }

    private static int[] addToArray(int[] array, int[] values) {
        int[] newArray = new int[array.length + values.length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        System.arraycopy(values, 0, newArray, array.length, values.length);
        return newArray;
    }
}