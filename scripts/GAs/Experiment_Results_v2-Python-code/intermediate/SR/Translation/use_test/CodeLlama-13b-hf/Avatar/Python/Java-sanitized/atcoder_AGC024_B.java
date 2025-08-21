import java.util.Scanner;

public class atcoder_AGC024_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        int[] rotated = rotRight(a, d);
        for (int i = 0; i < n; i++) {
            System.out.print(rotated[i] + " ");
        }
    }

    public static int[] rotRight(int[] a, int d) {
        int[] rotated = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            rotated[(i - d) % a.length] = a[i];
        }
        return rotated;
    }
}