import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_106_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_inputs = scanner.nextInt();
        List<int[]> input_array = new ArrayList<>();

        for (int i = 0; i < num_inputs; i++) {
            int S = scanner.nextInt();
            int R = scanner.nextInt();
            int H = scanner.nextInt();
            int cost = scanner.nextInt();
            input_array.add(new int[]{S, R, H, cost});
        }

        List<int[]> outdated = new ArrayList<>();

        for (int i = 0; i < num_inputs; i++) {
            for (int j = 0; j < num_inputs; j++) {
                if (input_array.get(i)[0] < input_array.get(j)[0] && input_array.get(i)[1] < input_array.get(j)[1] && input_array.get(i)[2] < input_array.get(j)[2]) {
                    outdated.add(input_array.get(i));
                }
            }
        }

        int minimum_cost = Integer.MAX_VALUE;
        int input_number = 0;

        for (int i = 0; i < num_inputs; i++) {
            int cost = input_array.get(i)[3];
            if (!outdated.contains(input_array.get(i)) && cost < minimum_cost) {
                minimum_cost = cost;
                input_number = i + 1;
            }
        }

        System.out.println(input_number);
    }
}