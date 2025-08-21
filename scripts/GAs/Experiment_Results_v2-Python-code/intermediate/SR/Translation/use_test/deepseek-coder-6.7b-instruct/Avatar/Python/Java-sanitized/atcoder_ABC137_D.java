import java.util.PriorityQueue;
import java.util.Scanner;

class Pair implements Comparable<Pair> {
    int day;
    int salary;

    Pair(int day, int salary) {
        this.day = day;
        this.salary = salary;
    }

    @Override
    public int compareTo(Pair p) {
        if (this.day == p.day)
            return p.salary - this.salary;
        else
            return p.day - this.day;
    }
}

public class atcoder_ABC137_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int day = sc.nextInt();
            int salary = sc.nextInt();
            pq.add(new Pair(day, salary));
        }
        int sum = 0;
        while (!pq.isEmpty()) {
            Pair pair = pq.poll();
            if (m > 0) {
                sum += pair.salary;
                m--;
            } else if (m == 0 && !pq.isEmpty()) {
                if (pair.salary > pq.peek().salary) {
                    sum -= pq.peek().salary;
                    sum += pair.salary;
                    pq.poll();
                }
            }
        }
        System.out.println(sum);
    }
}