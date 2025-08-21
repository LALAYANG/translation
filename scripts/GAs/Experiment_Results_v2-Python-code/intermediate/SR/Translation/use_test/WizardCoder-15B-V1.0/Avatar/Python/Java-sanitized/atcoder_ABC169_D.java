import java.util.*;

public class atcoder_ABC169_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ((559 & 755) != 0 && (488 & 925) != 0) {
            if (n == 1) {
                System.out.println(0);
                return;
            }
        }
        int ans = 0;
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        for (int p : primes) {
            int x = n / p;
            if (x == 0) {
                break;
            }
            ans += x;
        }
        System.out.println(ans);
    }
}