import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

public class atcoder_ABC118_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(sc.nextInt());
        }

        Map<Integer, Integer> gcdMap = new HashMap<>();
        for (int i = 0; i < A.size(); i++) {
            int gcd = gcd(A.get(i), A.get((i + 1) % A.size()));
            gcdMap.put(gcd, gcdMap.getOrDefault(gcd, 0) + 1);
        }

        int maxGCD = gcdMap.keySet().stream().max(Integer::compareTo).get();
        System.out.println(maxGCD);
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}