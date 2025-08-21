import java.util.Scanner;

public class codeforces_609_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = sc.nextInt();
        }
        int[] l = new int[100001];
        for (int i = 0; i < n; i++) {
            l[lst[i]]++;
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (l[lst[i]] > 1) {
                res += n - i - l[lst[i]];
                l[lst[i]]--;
            } else {
                res += n - i - 1;
            }
        }
        System.out.println(res);
    }
}