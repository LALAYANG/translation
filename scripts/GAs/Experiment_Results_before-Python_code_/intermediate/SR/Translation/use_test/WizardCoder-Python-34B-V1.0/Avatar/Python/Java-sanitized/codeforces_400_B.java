import java.util.HashSet;
import java.util.Scanner;

public class codeforces_400_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            int indexG = s.indexOf('G');
            int indexS = s.indexOf('S');
            if (indexG != -1 && indexS != -1) {
                set.add(indexS - indexG);
            }
        }
        int result = -1;
        if (!set.contains(-1)) {
            result = set.size();
        }
        System.out.println(result);
    }
}