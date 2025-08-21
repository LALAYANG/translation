import java.util.Arrays;
import java.util.Collections;

public class codeforces_621_A {
    public static void main(String[] args) {
        int n = Integer.parseInt(new java.util.Scanner(System.in).nextLine());
        Integer[] lst = Arrays.stream(new java.util.Scanner(System.in).nextLine().split(" ")).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
        Arrays.sort(lst, Collections.reverseOrder());
        int od = 0;
        for (int i : lst) {
            if (i % 2 != 0) {
                od++;
            }
        }
        int sum = 0;
        int ok = 0;
        for (int i = 0; i < n; i++) {
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