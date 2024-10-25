import java.util.ArrayList;
import java.util.Scanner;

public class codeforces_268_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<String> q = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            String a = scanner.next();
            q.add(a);
        }
        for (String j : q) {
            for (String k : q) {
                if (j.equals(k)) {
                    continue;
                } else if (j.charAt(0) == k.charAt(k.length() - 1)) {
                    count++;
                } else {
                    continue;
                }
            }
        }
        System.out.println(count);
    }
}