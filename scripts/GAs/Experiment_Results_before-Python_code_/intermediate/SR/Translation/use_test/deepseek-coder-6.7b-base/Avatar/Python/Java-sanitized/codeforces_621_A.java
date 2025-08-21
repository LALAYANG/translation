import java.util.*;

public class codeforces_621_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = sc.nextInt();
        }
        Arrays.sort(lst);
        int od = 0;
        for (int i = 0; i < n; i++) {
            if (lst[i] % 2 == 1) {
                od++;
            }
        }
        int sum = 0;
        int ok = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (lst[i] % 2 == 0) {
                sum += lst[i];
            } else {
                if (ok == 0 || od > 1) {
                    sum += lst[i];
                    od--;
                    ok = 1 - ok;
                }
            }
        }
        System.out.println(sum);
    }
}