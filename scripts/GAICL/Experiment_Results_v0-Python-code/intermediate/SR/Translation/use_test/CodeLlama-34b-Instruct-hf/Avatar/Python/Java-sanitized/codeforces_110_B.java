import java.util.Date;
import java.util.Scanner;

public class codeforces_110_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "";

        for (int i = 0; i < n; i++) {
            s += "abcd"[i % 4];
        }

        System.out.println(s);
    }
}