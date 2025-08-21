import java.util.*;
import java.util.stream.*;

public class atcoder_ABC137_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int day = sc.nextInt();
            int salary = sc.nextInt();
            x.add(-day);
            x.add(-salary);
        }
        while (!x.isEmpty()) {
            int d = -x.remove(0);
            int news = -x.remove(0);
            int r = m - y.size();
            if (r >= d) {
                y.add(news);
            } else if (r > 0) {
                y.add(news);
                y.remove(0);
            }
        }
        System.out.println(y.stream().mapToInt(i -> i).sum());
    }
}