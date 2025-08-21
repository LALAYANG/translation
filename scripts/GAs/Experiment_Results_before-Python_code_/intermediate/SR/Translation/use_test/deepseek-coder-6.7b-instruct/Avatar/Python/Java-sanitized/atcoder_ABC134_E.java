import java.util.*;

public class atcoder_ABC134_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int A = scanner.nextInt();
            int idx = binarySearch(ans, A);
            if (idx == ans.size()) {
                ans.add(new ArrayList<>(Arrays.asList(A)));
            } else {
                ans.get(idx).add(A);
            }
        }
        System.out.println(ans.size());
    }

    private static int binarySearch(List<List<Integer>> list, int key) {
        int bad = -1, good = list.size();
        while (good - bad > 1) {
            int mid = (bad + good) / 2;
            if (list.get(mid).get(list.get(mid).size() - 1) < key) {
                good = mid;
            } else {
                bad = mid;
            }
        }
        return good;
    }
}