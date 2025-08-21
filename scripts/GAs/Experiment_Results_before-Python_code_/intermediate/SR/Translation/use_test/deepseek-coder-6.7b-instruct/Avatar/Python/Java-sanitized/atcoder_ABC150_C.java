import java.util.*;

public class atcoder_ABC150_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        List<List<Integer>> perm = permute(list);
        int[] p = new int[n];
        int[] q = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            q[i] = scanner.nextInt();
        }
        int pn = -1, qn = -1;
        for (int i = 0; i < perm.size(); i++) {
            if (compare(perm.get(i), p) == 0) {
                pn = i;
            }
            if (compare(perm.get(i), q) == 0) {
                qn = i;
            }
        }
        System.out.println(Math.abs(pn - qn));
    }

    public static List<List<Integer>> permute(List<Integer> list) {
        if (list.size() == 0) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(new ArrayList<>());
            return result;
        }
        List<List<Integer>> result = new ArrayList<>();
        Integer first = list.get(0);
        List<Integer> subList = subList(list);
        for (List<Integer> perm : permute(subList)) {
            for (int i = 0; i <= perm.size(); i++) {
                List<Integer> newPerm = new ArrayList<>(perm);
                newPerm.add(i, first);
                result.add(newPerm);
            }
        }
        return result;
    }

    public static List<Integer> subList(List<Integer> list) {
        return list.subList(1, list.size());
    }

    public static int compare(List<Integer> list, int[] arr) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != arr[i]) {
                return 1;
            }
        }
        return 0;
    }
}