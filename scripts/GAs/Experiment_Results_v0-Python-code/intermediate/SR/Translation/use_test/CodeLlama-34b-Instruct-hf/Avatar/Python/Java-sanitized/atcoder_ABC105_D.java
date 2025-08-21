import java.util.concurrent.ThreadLocalRandom;

public class atcoder_ABC105_D {
    public static void main(String[] args) {
        int n = 10;
        int M = 100;
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = ThreadLocalRandom.current().nextInt(1, M + 1);
        }

        int[] cumulativeRemainders = calculateCumulativeRemainders(M, A);
        Counter<Integer> remainderCounts = new Counter<>();
        for (int remainder : cumulativeRemainders) {
            remainderCounts.increment(remainder);
        }

        int combinations = 0;
        for (int count : remainderCounts.values()) {
            combinations += count * (count - 1) / 2;
        }

        System.out.println(combinations);
    }

    private static int[] calculateCumulativeRemainders(int M, int[] A) {
        int[] cumulativeRemainders = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            cumulativeRemainders[i] = (A[i] % M + cumulativeRemainders[i - 1]) % M;
        }
        return cumulativeRemainders;
    }
}

class Counter<T> {
    private Map<T, Integer> map = new HashMap<>();

    public void increment(T key) {
        if (!map.containsKey(key)) {
            map.put(key, 0);
        }
        map.put(key, map.get(key) + 1);
    }

    public int get(T key) {
        return map.getOrDefault(key, 0);
    }

    public int size() {
        return map.size();
    }

    public Set<T> keySet() {
        return map.keySet();
    }
}