import java.util.*;

public class atcoder_ABC123_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<int[]> menu = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String m = scanner.next();
            int e = Integer.parseInt(m.substring(m.length() - 1));
            if (e == 0) {
                e = 10;
            }
            menu.add(new int[]{Integer.parseInt(m), e});
        }
        Collections.sort(menu, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[1], o2[1]);
            }
        });
        int ans = 0;
        for (int i = 1; i < menu.size(); i++) {
            ans += (int) Math.ceil((double) menu.get(i)[0] / 10) * 10;
        }
        ans += menu.get(0)[0];
        System.out.println(ans);
    }
}