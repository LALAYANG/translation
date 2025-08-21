import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_621_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lst.add(scanner.nextInt());
        }
        lst.sort(null);
        lst.reverse();
        int od = 0;
        for (int num : lst) {
            if (num % 2 == 1) {
                od++;
            }
        }
        int sum = 0;
        boolean ok = false;
        for (int i = 0; i < n; i++) {
            if (lst.get(i) % 2 == 0) {
                sum += lst.get(i);
            } else if (ok || od > 1) {
                sum += lst.get(i);
                od--;
                ok = !ok;
            }
        }
        System.out.println(sum);
    }
}