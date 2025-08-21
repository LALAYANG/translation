import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class atcoder_ABC137_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int day = scanner.nextInt();
            int salary = scanner.nextInt();
            x.add(-day);
            x.add(-salary);
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        while (!x.isEmpty()) {
            int d = x.remove(0);
            int salary = x.remove(0);
            int r = m - y.size();
            if (d >= 0 && salary >= 0) {
                heap.add(-salary);
            } else if (r >= -d) {
                y.add(-salary);
            } else {
                y.add(-salary);
                y.remove(0);
            }
        }
        System.out.println(y.stream().mapToInt(i -> i).sum());
    }
}