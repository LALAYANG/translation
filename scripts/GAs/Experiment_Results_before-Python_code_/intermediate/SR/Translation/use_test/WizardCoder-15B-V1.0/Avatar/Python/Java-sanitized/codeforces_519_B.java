import java.util.*;

public class codeforces_519_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            b.add(sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            c.add(sc.nextInt());
        }
        int x = 0;
        int y = 0;
        int z = 0;
        for (int i : a) {
            x += i;
        }
        for (int i : b) {
            y += i;
        }
        for (int i : c) {
            z += i;
        }
        System.out.println(Math.abs(x - y));
        System.out.println(Math.abs(y - z));
    }
}