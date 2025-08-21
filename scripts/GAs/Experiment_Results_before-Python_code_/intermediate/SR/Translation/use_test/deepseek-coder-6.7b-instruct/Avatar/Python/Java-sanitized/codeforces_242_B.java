import java.io.*;
import java.util.*;

public class codeforces_242_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int l = in.nextInt();
        int r = in.nextInt();
        int id = 0;
        for (int i = 1; i < n; i++) {
            int li = in.nextInt();
            int ri = in.nextInt();
            if (li <= l && r <= ri) {
                id = i;
            } else if (li < l || r < ri) {
                id = n;
            }
            l = Math.min(l, li);
            r = Math.max(r, ri);
        }
        System.out.println(id == n ? -1 : id + 1);
    }
}