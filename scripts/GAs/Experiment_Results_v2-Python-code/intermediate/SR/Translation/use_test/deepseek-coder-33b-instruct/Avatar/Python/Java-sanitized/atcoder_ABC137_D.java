import java.util.*;

public class atcoder_ABC137_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        PriorityQueue<Pair> x = new PriorityQueue<>();
        PriorityQueue<Integer> salaryHeap = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int day = scanner.nextInt();
            int salary = scanner.nextInt();
            x.add(new Pair(-day, -salary));
        }
        while (!x.isEmpty()) {
            Pair pair = x.poll();
            int r = m - salaryHeap.size();
            if (r >= -pair.day) {
                salaryHeap.add(-pair.salary);
            } else {
                salaryHeap.add(-pair.salary);
                salaryHeap.poll();
            }
        }
        int sum = 0;
        while (!salaryHeap.isEmpty()) {
            sum += salaryHeap.poll();
        }
        System.out.println(sum);
    }

    static class Pair implements Comparable<Pair> {
        int day;
        int salary;

        public Pair(int day, int salary) {
            this.day = day;
            this.salary = salary;
        }

        @Override
        public int compareTo(Pair o) {
            return Integer.compare(this.day, o.day);
        }
    }
}