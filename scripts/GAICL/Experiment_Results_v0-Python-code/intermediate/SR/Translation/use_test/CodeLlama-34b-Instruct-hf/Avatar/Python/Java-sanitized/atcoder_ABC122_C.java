import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class atcoder_ABC122_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();
        List<Integer> queries = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            queries.add(sc.nextInt());
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (s.substring(i, i + 2).equals("AC")) {
                count++;
            }
        }

        System.out.println(count);

        for (int i = 0; i < q; i++) {
            int l = queries.get(i);
            int r = queries.get(i + 1);
            int numOccurrences = 0;
            for (int j = l; j <= r; j++) {
                if (s.substring(j, j + 2).equals("AC")) {
                    numOccurrences++;
                }
            }
            System.out.println(numOccurrences);
        }
    }
}