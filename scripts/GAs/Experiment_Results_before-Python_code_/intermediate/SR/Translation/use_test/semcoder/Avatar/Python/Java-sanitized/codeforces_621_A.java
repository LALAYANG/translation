import java.util.Scanner;

public class codeforces_621_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = sc.nextInt();
        }
        
        java.util.Arrays.sort(lst);
        java.util.Arrays.sort(lst, java.util.Collections.reverseOrder());
        
        int od = 0;
        for (int i : lst) {
            if ((i & 1) != 0) {
                od++;
            }
        }
        
        int sum = 0;
        int ok = 0;
        for (int i = 0; i < n; i++) {
            if ((lst[i] & 1) == 0) {
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