import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class codeforces_106_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_inputs = sc.nextInt();
        List<int[]> input_array = new ArrayList<int[]>();

        for (int i = 0; i < num_inputs; i++) {
            int[] input = new int[4];
            input[0] = sc.nextInt();
            input[1] = sc.nextInt();
            input[2] = sc.nextInt();
            input[3] = sc.nextInt();
            input_array.add(input);
        }
        Set<int[]> outdated = new HashSet<int[]>();

        for (int i = 0; i < num_inputs; i++) {
            for (int j = 0; j < num_inputs; j++) {
                if (i == j) {
                    continue;
                }
                if (input_array.get(i)[0] < input_array.get(j)[0] && input_array.get(i)[1] < input_array.get(j)[1] && input_array.get(i)[2] < input_array.get(j)[2]) {
                    outdated.add(input_array.get(i));
                }
            }
        }
        int minimum_cost = 100000;
        int input_number = 0;

        for (int i = 0; i < num_inputs; i++) {
            if (!outdated.contains(input_array.get(i)) && input_array.get(i)[3] < minimum_cost) {
                minimum_cost = input_array.get(i)[3];
                input_number = i + 1;
            }
        }
        System.out.println(input_number);
    }
}