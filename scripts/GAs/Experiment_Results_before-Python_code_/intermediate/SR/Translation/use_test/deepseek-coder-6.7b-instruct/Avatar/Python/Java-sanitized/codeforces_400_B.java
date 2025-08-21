import java.util.*;

public class codeforces_400_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();

        Set<Integer> c = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            int firstG = s.indexOf('G');
            int firstS = s.indexOf('S');
            if (firstG != -1 && firstS != -1) {
                c.add(firstS - firstG);
            }
        }

        boolean hasNegative = c.stream().anyMatch(a -> a < 0);
        System.out.println(hasNegative ? -1 : c.size());
    }
}