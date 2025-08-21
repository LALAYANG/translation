import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC123_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<int[]> menu = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String m = sc.nextLine();
            int e = Integer.parseInt(m.substring(m.length() - 1));
            if (e == 0) {
                e = 10;
            }
            menu.add(new int[]{Integer.parseInt(m), e});
        }

        Collections.sort(menu, (a, b) -> a[1] - b[1]);

        int ans = 0;
        for (int[] m : menu.subList(1, menu.size())) {
            ans += (int) Math.ceil(m[0] / 10.0) * 10;
        }

        System.out.println(ans + menu.get(0)[0]);
    }
}