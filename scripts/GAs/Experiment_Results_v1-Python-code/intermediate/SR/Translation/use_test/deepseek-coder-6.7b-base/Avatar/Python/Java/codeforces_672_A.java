```
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws Exception {
        List<Integer> li = new ArrayList<>();
        int ind = 0;
        for (int i = 1; i < 371; i++) {
            List<Integer> temp = new ArrayList<>();
            int p = i;
            int q = i;
            int count = 0;
            while (p != 0) {
                p = p / 10;
                count = count + 1;
            }
            if (count == 1) {
                li.add(i);
            }
            if (count == 2) {
                temp = new ArrayList<>();
                while (q != 0) {
                    int x = q % 10;
                    q = q / 10;
                    temp.add(x);
                }
                Collections.reverse(temp);
                List<Integer> result = appendDigits(li, temp);
                li = result;
            }
            if (count == 3) {
                temp = new ArrayList<>();
                while (q != 0) {
                    int x = q % 10;
                    q /= 10;
                    temp.add(x);
                }
                Collections.reverse(temp);
                li.addAll(temp);
            }
        }
        li.remove(li.size() - 1);
        li.remove(li.size() - 1);
        int n = Integer.parseInt(args[0]);
        System.out.println(li.get(n - 1));
    }

    public static List<Integer> appendDigits(List<Integer> li, List<Integer> digits) {
        List<Integer> result = new ArrayList<>();
        result.addAll(li);
        result.addAll(digits);
        return result;
    }
}
```

