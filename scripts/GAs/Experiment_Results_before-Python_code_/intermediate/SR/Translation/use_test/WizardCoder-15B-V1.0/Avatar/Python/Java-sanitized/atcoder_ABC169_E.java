import java.util.*;

public class atcoder_ABC169_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] low = new int[n];
        int[] high = new int[n];
        for (int i = 0; i < n; i++) {
            low[i] = sc.nextInt();
            high[i] = sc.nextInt();
        }
        Arrays.sort(low);
        Arrays.sort(high);
        if (n % 2 == 0) {
            int hh = (high[(n + 1) / 2 - 1] + high[(n + 1) / 2]) / 2;
            int ll = (low[(n + 1) / 2 - 1] + low[(n + 1) / 2]) / 2;
            System.out.println(hh - ll + 1);
        } else {
            int hh = high[(n + 1) / 2];
            int ll = low[(n + 1) / 2 - 1];
            System.out.println(hh - ll + 1);
        }
    }
}