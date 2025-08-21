import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantLock;

public class codeforces_621_A {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lst.add(Integer.parseInt(args[i + 1]));
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
        for (int num : lst) {
            if (num % 2 == 0) {
                sum += num;
            } else if (od > 1) {
                sum += num;
                od--;
            }
        }
        System.out.println(sum);
    }
}