import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class codeforces_456_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<int[]> m = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] pair = scanner.nextLine().split(" ");
            m.add(new int[]{Integer.parseInt(pair[0]), Integer.parseInt(pair[1])});
        }
        Collections.sort(m, (a, b) -> b[1] - a[1]);
        int[] a = m.get(0);
        for (int[] i : m.subList(1, m.size())) {
            if (i[1] > a[1]) {
                System.out.println("Happy Alex");
                break;
            }
            a = i;
        } else {
            System.out.println("Poor Alex");
        }
    }
}