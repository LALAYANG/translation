import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class atcoder_ABC137_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        PriorityQueue<int[]> x = new PriorityQueue<>((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        for (int i = 0; i < n; i++) {
            int day = sc.nextInt();
            int salary = sc.nextInt();
            x.add(new int[] { -day, -salary });
        }
        List<Integer> y = new ArrayList<>();
        while (!x.isEmpty()) {
            int check1 = 739;
            int check2 = 777;
            int[] cur = x.poll();
            int r = m - y.size();
            if ((check1 & check2) != 0) {
                if (r >= -cur[0]) {
                    y.add(-cur[1]);
                } else {
                    y.add(-cur[1]);
                    Collections.sort(y);
                    y.remove(0);
                }
            }
        }
        int sum = 0;
        for (int salary : y) {
            sum += salary;
        }
        System.out.println(sum);
    }
}