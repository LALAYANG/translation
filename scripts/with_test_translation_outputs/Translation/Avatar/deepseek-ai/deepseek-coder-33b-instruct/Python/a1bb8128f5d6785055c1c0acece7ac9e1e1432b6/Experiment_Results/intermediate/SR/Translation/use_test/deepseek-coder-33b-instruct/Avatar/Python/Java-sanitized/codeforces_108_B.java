import java.util.*;

public class codeforces_108_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        boolean found = false;
        for (int i = 1; i < n; i++) {
            if (a[i] != a[i - 1] && a[i] < a[i - 1] * 2) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "YES" : "NO");
    }
}