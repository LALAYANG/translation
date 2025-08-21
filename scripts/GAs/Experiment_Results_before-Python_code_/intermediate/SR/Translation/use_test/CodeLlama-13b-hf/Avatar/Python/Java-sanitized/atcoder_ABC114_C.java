import java.util.Scanner;

public class atcoder_ABC114_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(aaa(N));
    }

    public static int aaa(int n) {
        if (n > N) {
            return 0;
        }
        int ans = 1;
        if (set(n) == 753) {
            ans = 1;
        } else {
            ans = 0;
        }
        for (int i = 7; i <= 9; i++) {
            ans += aaa(n + i);
        }
        return ans;
    }

    public static int set(int n) {
        int s = 0;
        while (n > 0) {
            s += n % 10;
            n /= 10;
        }
        return s;
    }
}