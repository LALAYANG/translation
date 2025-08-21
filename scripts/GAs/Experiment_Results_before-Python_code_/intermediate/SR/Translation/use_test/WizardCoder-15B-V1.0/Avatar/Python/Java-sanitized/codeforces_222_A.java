public class codeforces_222_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean allSame = true;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[0]) {
                allSame = false;
                break;
            }
        }
        if (allSame) {
            System.out.println(0);
            return;
        }
        if (k == 1) {
            System.out.println(-1);
            return;
        }
        if (arr[k-1] != arr[0]) {
            System.out.println(-1);
            return;
        }
        int target = arr[n-1];
        List<Integer> toDelete = new ArrayList<>();
        for (int i = 0; i < k-1; i++) {
            toDelete.add(arr[i]);
        }
        while (toDelete.size() > 0 && toDelete.get(toDelete.size()-1) == target) {
            toDelete.remove(toDelete.size()-1);
        }
        System.out.println(toDelete.size());
    }
}