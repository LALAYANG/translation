import java.util.PriorityQueue;
import java.util.Scanner;

public class atcoder_ABC137_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        PriorityQueue<int[]> x = new PriorityQueue<>((a, b) -> a[0] == b[0] ? b[1] - a[1] : b[0] - a[0]);
        PriorityQueue<Integer> salaryHeap = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            int day = sc.nextInt();
            int salary = sc.nextInt();
            x.add(new int[]{-day, -salary});
        }

        while (!x.isEmpty()) {
            int[] current = x.poll();
            int r = m - salaryHeap.size();

            if (r >= -current[0]) {
                salaryHeap.add(-current[1]);
            } else {
                salaryHeap.add(-current[1]);
                salaryHeap.poll();
            }
        }

        int totalSalary = salaryHeap.stream().mapToInt(Integer::intValue).sum();
        System.out.println(totalSalary);
    }
}