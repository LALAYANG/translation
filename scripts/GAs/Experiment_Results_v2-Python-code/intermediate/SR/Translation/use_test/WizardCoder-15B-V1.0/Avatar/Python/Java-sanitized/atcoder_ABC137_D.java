import java.util.PriorityQueue;
import java.util.Scanner;

public class atcoder_ABC137_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int day = sc.nextInt();
            int salary = sc.nextInt();
            pq.offer(-day * salary);
        }
        int sum = 0;
        while (pq.size() > m) {
            sum += -pq.poll();
        }
        System.out.println(sum);
    }
}