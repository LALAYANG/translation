import java.util.*;

public class codeforces_106_B {
    static int num_inputs;
    static List<int[]> input_array = new ArrayList<>();
    static Set<int[]> outdated = new HashSet<>();
    static int minimum_cost = 100000;
    static int input_number = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        num_inputs = scanner.nextInt();
        read_input(0, num_inputs, 1, scanner);
        outer_loop(0, num_inputs, 1);
        cost_loop(0, num_inputs, 1);
        System.out.println(input_number);
    }

    static void read_input(int i, int stop, int step, Scanner scanner) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int S = scanner.nextInt();
        int R = scanner.nextInt();
        int H = scanner.nextInt();
        int cost = scanner.nextInt();
        input_array.add(new int[]{S, R, H, cost});
        read_input(i + step, stop, step, scanner);
    }

    static void outer_loop(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        inner_loop(0, num_inputs, 1, input_array.get(i));
        outer_loop(i + step, stop, step);
    }

    static void inner_loop(int j, int stop, int step, int[] current) {
        if (step == 0 || (step > 0 && j >= stop) || (step < 0 && j <= stop)) {
            return;
        }
        int[] compare = input_array.get(j);
        if (current[0] < compare[0] && current[1] < compare[1] && current[2] < compare[2]) {
            outdated.add(current);
        }
        inner_loop(j + step, stop, step, current);
    }

    static void cost_loop(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int[] current_item = input_array.get(i);
        int cost = current_item[3];
        if (!outdated.contains(current_item) && cost < minimum_cost) {
            minimum_cost = cost;
            input_number = i + 1;
        }
        cost_loop(i + step, stop, step);
    }
}