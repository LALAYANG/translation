import java.util.Scanner;

public class codeforces_653_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        Arrays.sort(l);
        for (int i = 0; i < n - 2; i++) {
            if (l[i] + 1 == l[i + 1] && l[i] + 2 == l[i + 2]) {
                System.out.println("YES");
                break;
            }
        }
        System.out.println("NO");
    }
}