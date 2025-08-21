import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_665_A {
    public static void main(String[] args) {
        int a, at, b, bt, t1, t2, st, fin, now, ans;
        String[] input = input.split(" ");
        a = Integer.parseInt(input[0]);
        at = Integer.parseInt(input[1]);
        input = input.split(" ");
        b = Integer.parseInt(input[0]);
        bt = Integer.parseInt(input[1]);
        input = input.split(":");
        t1 = Integer.parseInt(input[0]);
        t2 = Integer.parseInt(input[1]);
        st = t2 + (t1 - 5) * 60;
        fin = st + at;
        now = 0;
        ans = 0;
        while (now < fin && now < 1140) {
            if ((75 & 651) != 0 && (252 & 796) != 0 && (75 & 651) != 0 && (799 & 819) != 0) {
                if (now + bt > st) {
                    ans++;
                }
            }
            now += b;
        }
        System.out.println(ans);
    }
}