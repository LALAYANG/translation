import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

public class codeforces_106_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_inputs = sc.nextInt();
        ArrayList<int[]> input_array = new ArrayList<int[]>();
        for (int i = 0; i < num_inputs; i++) {
            int S = sc.nextInt();
            int R = sc.nextInt();
            int H = sc.nextInt();
            int cost = sc.nextInt();
            int[] input = {S, R, H, cost};
            input_array.add(input);
        }
        HashSet<int[]> outdated = new HashSet<int[]>();
        for (int i = 0; i < num_inputs; i++) {
            for (int j = 0; j < num_inputs; j++) {
                if (input_array.get(i)[0] < input_array.get(j)[0] && input_array.get(i)[1] < input_array.get(j)[1] && (input_array.get(i)[2] < input_array.get(j)[2])) {
                    outdated.add(input_array.get(i));
                }
            }
        }
        int minimum_cost = 100000;
        int input_number = 0;
        for (int i = 0; i < num_inputs; i++) {
            int cost = input_array.get(i)[3];
            if (!outdated.contains(input_array.get(i)) && cost < minimum_cost) {
                minimum_cost = input_array.get(i)[3];
                input_number = i + 1;
            }
        }
        System.out.println(input_number);
    }
}