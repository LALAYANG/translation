import java.util.*;

public class codeforces_299_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        System.out.println(anyDivisor(a) ? a[0] : -1);
    }

    private static boolean anyDivisor(int[] a) {
        for (int x : a) {
            if (x % a[0] != 0) {
                return false;
            }
        }
        return true;
    }
}