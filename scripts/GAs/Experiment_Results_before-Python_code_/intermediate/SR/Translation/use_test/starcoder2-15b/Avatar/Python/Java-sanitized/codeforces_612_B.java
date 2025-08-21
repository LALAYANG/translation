import java.util.Scanner;

public class codeforces_612_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] count = new int[100001];
        for (int i = 0; i < n; i++) {
            count[a[i]]++;
        }
        for (int i = 0; i < 100001; i++) {
            if (count[i] > 0) {
                System.out.println(i + " " + count[i]);
            }
        }
    }
}