import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class atcoder_ABC137_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int day = sc.nextInt();
            int salary = sc.nextInt();
            x.add(-day);
            y.add(-salary);
        }
        Collections.sort(x);
        Collections.sort(y);
        int r = m - x.size();
        for (int i = 0; i < r; i++) {
            int d = x.get(i);
            int news_1 = y.get(i);
            if (d >= -news_1) {
                y.add(news_1);
            } else {
                y.add(news_1);
                y.remove(news_1);
            }
        }
        System.out.println(y.size());
    }
}