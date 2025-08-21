import java.util.ArrayList;
import java.util.List;

public class atcoder_AGC027_B {
    public static void main(String[] args) {
        // Read input from stdin
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        List<Integer> valueList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            valueList.add(scanner.nextInt());
        }

        // Calculate the sum of the values
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += valueList.get(i);
        }

        // Calculate the cost of the groups
        int cost = 0;
        for (int i = 0; i < N; i++) {
            cost += valueList.get(i) * X + 2 * sum(valueList.subList(N - 2 * i - 1, N - i));
        }

        // Print the cost
        System.out.println(cost + N * X + 5 * valueList.get(N - 1));
    }

    private static int sum(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}