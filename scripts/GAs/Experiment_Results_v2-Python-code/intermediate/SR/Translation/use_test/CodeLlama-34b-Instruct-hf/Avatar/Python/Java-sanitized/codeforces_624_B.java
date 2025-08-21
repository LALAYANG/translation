import java.util.Scanner;

public class codeforces_624_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] a = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            a[i] = scanner.nextInt();
        }

        int pre = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < arraySize; i++) {
            int current = a[i];
            if (current < pre) {
                ans += pre - current;
                pre = current;
            }
        }

        System.out.println(ans);
    }
}