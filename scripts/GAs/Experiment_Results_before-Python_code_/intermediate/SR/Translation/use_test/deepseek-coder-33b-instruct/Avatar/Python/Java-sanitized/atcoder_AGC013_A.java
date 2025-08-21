import java.util.*;

public class atcoder_AGC013_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                list.add(arr[i]);
            }
        }

        n = list.size();
        int ans = 0;
        for (int i = 1; i < n - 1; i++) {
            if ((list.get(i - 1) < list.get(i) && list.get(i) > list.get(i + 1)) ||
                    (list.get(i - 1) > list.get(i) && list.get(i) < list.get(i + 1))) {
                ans++;
                i++;
            }
        }

        System.out.println(ans + 1);
    }
}