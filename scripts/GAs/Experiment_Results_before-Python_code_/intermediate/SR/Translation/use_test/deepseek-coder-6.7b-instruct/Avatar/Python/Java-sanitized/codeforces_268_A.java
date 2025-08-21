import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_268_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String[]> q = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            String[] a = new String[2];
            a[0] = scanner.next();
            a[1] = scanner.next();
            q.add(a);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                } else if (q.get(i)[0].equals(q.get(j)[1])) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}