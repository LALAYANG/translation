import java.util.*;
import java.io.*;
import java.math.*;

public class atcoder_AGC034_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int ans = 0;
            ans += n / 2;
            ans += n / 3;
            ans -= n / 6;
            System.out.println(ans);
        }
    }
}