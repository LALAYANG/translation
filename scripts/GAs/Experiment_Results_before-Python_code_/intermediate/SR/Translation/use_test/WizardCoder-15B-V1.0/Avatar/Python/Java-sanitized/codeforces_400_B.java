import java.util.*;

public class codeforces_400_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Set<Integer> c = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            int indexS = s.indexOf("S");
            int indexG = s.indexOf("G");
            if (indexS != -1 && indexG != -1) {
                c.add(indexS - indexG);
            }
        }
        System.out.println(c.isEmpty() ? -1 : c.size());
    }
}