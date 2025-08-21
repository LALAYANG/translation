import java.util.Scanner;

public class codeforces_653_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        sc.close();

        // Sort the array
        Arrays.sort(l);

        // Check if there are two consecutive numbers
        for (int i = 0; i < n - 1; i++) {
            if (l[i] + 1 == l[i + 1]) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}