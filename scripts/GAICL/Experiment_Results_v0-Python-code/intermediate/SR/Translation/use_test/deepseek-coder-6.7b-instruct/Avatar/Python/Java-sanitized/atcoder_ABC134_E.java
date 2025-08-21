import java.util.*;

class Main {
    static int binarySearch(List<Integer> arr, int key) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr.get(mid) < key)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return l;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            int idx = binarySearch(ans, A);
            if (idx == ans.size())
                ans.add(new ArrayList<>(Arrays.asList(A)));
            else
                ans.get(idx).add(A);
        }
        System.out.println(ans.size());
    }
}