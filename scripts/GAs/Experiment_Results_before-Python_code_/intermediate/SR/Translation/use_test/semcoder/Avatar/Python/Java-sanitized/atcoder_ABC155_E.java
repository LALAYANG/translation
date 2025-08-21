import java.util.Scanner;

public class atcoder_ABC155_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pp = 0;
        int na = 0;
        for (int i = String.valueOf(n).length() - 1; i >= 0; i--) {
            int c = n % 10;
            n /= 10;
            int cc = na + c;
            na = 0;
            if (cc <= 4) {
                pp += cc;
            } else {
                na = 1;
                if (i == 0) {
                    pp += 1;
                }
                pp += 10 - cc;
            }
        }
        System.out.println(pp);
    }
}