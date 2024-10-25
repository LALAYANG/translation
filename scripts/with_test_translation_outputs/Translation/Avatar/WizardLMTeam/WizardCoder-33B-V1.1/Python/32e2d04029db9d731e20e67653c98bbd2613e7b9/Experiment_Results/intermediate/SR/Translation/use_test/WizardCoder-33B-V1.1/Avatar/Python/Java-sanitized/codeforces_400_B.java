import java.util.*;

public class codeforces_400_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            int gIndex = s.indexOf('G');
            int sIndex = s.indexOf('S');
            set.add(sIndex - gIndex);
        }
        boolean hasNegative = false;
        for (int a : set) {
            if (a < 0) {
                hasNegative = true;
                break;
            }
        }
        System.out.println(hasNegative ? -1 : set.size());
    }
}