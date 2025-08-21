import java.util.PriorityQueue;

public class atcoder_ABC137_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        PriorityQueue<Integer> x = new PriorityQueue<>();
        PriorityQueue<Integer> salaryHeap = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int day = scanner.nextInt();
            int salary = scanner.nextInt();
            x.add(-day);
            x.add(-salary);
        }
        while (!x.isEmpty()) {
            int d = x.poll();
            int s = x.poll();
            int r = m - salaryHeap.size();
            if (r >= -d) {
                salaryHeap.add(-s);
            } else {
                salaryHeap.add(-s);
                salaryHeap.poll();
            }
        }
        System.out.println(salaryHeap.stream().mapToInt(Integer::intValue).sum());
    }
}