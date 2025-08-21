import java.util.*;
import java.lang.*;

public class atcoder_ABC123_B {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<int[]> menu = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String m = scanner.next();
            int e = Integer.parseInt(String.valueOf(m.charAt(m.length() - 1)));
            if (e == 0) {
                e = 10;
            }
            menu.add(new int[]{Integer.parseInt(m), e});
        }
        menu.sort(Comparator.comparingInt(o -> o[1]));
        int ans = 0;
        for (int i = 1; i < menu.size(); i++) {
            ans += (int)Math.ceil((double)menu.get(i)[0] / 10) * 10;
        }
        System.out.println(ans + menu.get(0)[0]);
    }
}