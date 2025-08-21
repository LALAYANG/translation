import java.util.Scanner;

public class codeforces_624_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        int[] a = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            a[i] = sc.nextInt();
        }
        int pre = Integer.MAX_VALUE;
        int ans = 0;
        Arrays.sort(a);
        for (int i = 0; i < array_size; i++) {
            ans += Math.max(0, Math.min(pre - 1, a[i]));
            pre = Math.max(0, Math.min(pre - 1, a[i]));
        }
        System.out.println(ans);
    }
}