import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class atcoder_ABC137_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int day = scanner.nextInt();
            int salary = scanner.nextInt();
            x.add(-day);
            x.add(-salary);
        }
        Collections.sort(x, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        for (int i = 0; i < x.size(); i++) {
            int d = x.get(i);
            int salary = x.get(i + 1);
            int r = m - y.size();
            if (d >= 0 && r >= -d) {
                y.add(-salary);
            } else if (d >= 0 && r < -d) {
                y.add(-salary);
                y.remove(y.size() - 1);
            }
        }
        System.out.println(y.stream().mapToInt(Integer::intValue).sum());
    }
}