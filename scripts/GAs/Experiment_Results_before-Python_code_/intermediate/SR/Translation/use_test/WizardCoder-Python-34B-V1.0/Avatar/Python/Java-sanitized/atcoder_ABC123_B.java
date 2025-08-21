import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class atcoder_ABC123_B {
    public static void main(String[] args) {
        ArrayList<int[]> menu = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String m = scanner.next();
            int e = m.charAt(m.length() - 1) - '0';
            if (e == 0) {
                e = 10;
            }
            menu.add(new int[]{Integer.parseInt(m), e});
        }
        Collections.sort(menu, (a, b) -> a[1] - b[1]);
        int ans = 0;
        for (int i = 1; i < menu.size(); i++) {
            ans += Math.ceil(menu.get(i)[0] / 10.0) * 10;
        }
        System.out.println(ans + menu.get(0)[0]);
    }
}