import java.util.*;
import java.io.*;
public class atcoder_AGC013_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int ans = n / 2 + n / 3 + n / 5 - n / 6 - n / 10 - n / 15 + n / 30;
            System.out.println(ans);
        }
    }
}