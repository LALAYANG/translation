import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class atcoder_ABC143_D {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1997);
        list.add(436);
        list.add(715);
        // Add more elements as needed

        Collections.sort(list);
        int n = list.size();
        long ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int a = list.get(i);
                int b = list.get(j);
                int right = Collections.binarySearch(list, a + b);
                int left = Collections.binarySearch(list, Math.max(a - b, b - a));
                int tmp = Math.max(0, right - left);

                if (left <= i && i < right) {
                    tmp--;
                }
                if (left <= j && j < right) {
                    tmp--;
                }
                ans += tmp;
            }
        }
        System.out.println(ans / 3);
    }
}