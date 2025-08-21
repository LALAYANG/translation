import java.util.Scanner;

public class codeforces_621_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (lst[i] > lst[i - 1]) {
                sum += lst[i];
            }
        }
        System.out.println(sum);
    }
}