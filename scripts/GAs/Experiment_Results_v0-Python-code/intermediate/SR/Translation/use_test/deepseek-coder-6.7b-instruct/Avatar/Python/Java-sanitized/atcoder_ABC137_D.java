import java.util.*;

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
        Collections.sort(x);
        int sum = 0;
        for (int i = 0; i < x.size(); i += 2) {
            int d = -x.get(i);
            int salary = -x.get(i + 1);
            int r = remainingCapacity(y, m);
            if (d <= 739 && d <= 777) {
                if (r >= d) {
                    y.add(salary);
                } else {
                    if (!y.isEmpty()) {
                        y.remove(Collections.min(y));
                    }
                }
            }
        }
        for (int salary : y) {
            sum += salary;
        }
        System.out.println(sum);
    }

    public static int remainingCapacity(List<Integer> y, int m) {
        return m - y.size();
    }
}