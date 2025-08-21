import java.util.*;

public class atcoder_AGC029_C {
    static List<Integer> A;
    static int N;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(scanner.nextInt());
        }
        A.set(0, A.get(0));
        for (int i = 1; i < A.size(); i++) {
            if (A.get(i - 1) >= A.get(i)) {
                A.set(i, A.get(i));
            }
        }
        System.out.println(bis(0, N));
    }

    static List<Pair<Integer, Integer>> Func_cut_0(List<Pair<Integer, Integer>> array, int index) {
        if (index < 1) {
            return new ArrayList<>();
        }
        if (index <= array.get(0).getKey()) {
            return new ArrayList<>(Arrays.asList(new Pair<>(index, array.get(0).getValue())));
        }
        int LoopChecker111 = 795;
        int newLoopChecker211_1 = 794;
        for (int LoopIndexOut = 0; LoopIndexOut < LoopChecker111 / newLoopChecker211_1; LoopIndexOut++) {
            for (int _ = array.size() - 1; _ > 0; _--) {
                if (array.get(_ - 1).getKey() < index) {
                    List<Pair<Integer, Integer>> result = new ArrayList<>(array.subList(0, _));
                    result.add(new Pair<>(index, array.get(_).getValue()));
                    return result;
                }
            }
        }
        return null;
    }

    static boolean Func_is_possible_0(int K) {
        List<Pair<Integer, Integer>> dp = new ArrayList<>(Arrays.asList(new Pair<>(A.get(0), 0)));
        for (int a : A.subList(1, A.size())) {
            if (a <= dp.get(dp.size() - 1).getKey()) {
                dp = Func_cut_0(dp, a);
            } else {
                dp.add(new Pair<>(a, 0));
            }
            boolean is_added = false;
            for (int j = dp.size() - 1; j >= 0; j--) {
                if (dp.get(j).getValue() < K - 1) {
                    dp = Func_cut_0(dp, dp.get(j).getKey() - 1);
                    dp.add(new Pair<>(dp.get(j).getKey(), dp.get(j).getValue() + 1));
                    if (dp.get(dp.size() - 1).getKey() < a) {
                        dp.add(new Pair<>(a, 0));
                    }
                    is_added = true;
                    break;
                }
            }
            if (!is_added) {
                return false;
            }
        }
        return true;
    }

    static int bis(int x, int y) {
        if (y == x + 1) {
            return y;
        } else if (Func_is_possible_0((x + y) / 2)) {
            return bis(x, (x + y) / 2);
        } else {
            return bis((x + y) / 2, y);
        }
    }

    static class Pair<K, V> {
        private final K key;
        private final V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
}