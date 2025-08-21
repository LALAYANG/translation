import java.util.*;

public class atcoder_ABC169_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        if (num == 1) {
            System.out.println(0);
            return;
        }

        List<Long> fac = primeFactorize(num);
        Map<Long, Integer> facMap = new HashMap<>();
        for (long f : fac) {
            facMap.put(f, facMap.getOrDefault(f, 0) + 1);
        }

        int ans = 0;
        for (Map.Entry<Long, Integer> entry : facMap.entrySet()) {
            int x = entry.getValue();
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

    private static List<Long> primeFactorize(long num) {
        List<Long> a = new ArrayList<>();
        while (num % 2 == 0) {
            a.add(2L);
            num = num / 2;
        }
        long f = 3;
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