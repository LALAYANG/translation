```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        if (num == 1) {
            System.out.println(0);
            return;
        }
        List<Integer> fac = prime_factorize(num);
        Map<Integer, Integer> fac_ = new HashMap<>();
        for (int f : fac) {
            fac_.put(f, fac_.getOrDefault(f, 0) + 1);
        }
        int ans = 0;
        for (int p : fac_.keySet()) {
            int x = fac_.get(p);
            for (int i = 1; i < 99999999; i++) {
                if (x >= i) {
                    x -= i;
                    ans++;
                } else {
                    break;
                }
            }
        }
        System.out.println(ans);
    }

    public static List<Integer> prime_factorize(int num) {
        List<Integer> a = new ArrayList<>();
        while (num % 2 == 0) {
            a.add(2);
            num = num / 2;
        }
        int f = 3;
        while (f * f <= num) {
            if (num % f == 0) {
                a.add(f);
                num = num / f;
            } else {
                f += 2;
            }
        }
        if (num != 1) {
            a.add(num);
        }
        return a;
    }
}
```

