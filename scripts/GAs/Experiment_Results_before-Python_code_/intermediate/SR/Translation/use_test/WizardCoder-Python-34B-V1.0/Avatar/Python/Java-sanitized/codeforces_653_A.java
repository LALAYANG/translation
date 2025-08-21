import java.util.Scanner;

public class codeforces_653_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        java.util.Arrays.sort(l);
        boolean found = false;
        for (int i = 0; i < n - 2; i++) {
            if (l[i] + 1 == l[i + 1] && l[i + 1] == l[i] + 2) {
                System.out.println("YES");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("NO");
        }
    }
}