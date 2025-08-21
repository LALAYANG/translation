import java.util.Scanner;

public class codeforces_242_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        int intersectionId = 0;

        for (int i = 0; i < n; i++) {
            int li = sc.nextInt();
            int ri = sc.nextInt();

            if (li <= l && r <= ri) {
                intersectionId = i + 1;
            } else if (li < l || r < ri) {
                intersectionId = n;
            }

            l = Math.min(l, li);
            r = Math.max(r, ri);
        }

        System.out.println(intersectionId == n ? -1 : intersectionId);
    }
}