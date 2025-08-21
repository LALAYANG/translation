import java.util.*;

public class codeforces_106_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] input_array = new int[n][4];
        for (int i = 0; i < n; i++) {
            input_array[i][0] = sc.nextInt();
            input_array[i][1] = sc.nextInt();
            input_array[i][2] = sc.nextInt();
            input_array[i][3] = sc.nextInt();
        }
        Set<int[]> outdated_items = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && input_array[i][0] < input_array[j][0] && input_array[i][1] < input_array[j][1] && input_array[i][2] < input_array[j][2]) {
                    outdated_items.add(input_array[i]);
                }
            }
        }
        int minimum_cost = Integer.MAX_VALUE;
        int input_number = 0;
        for (int i = 0; i < n; i++) {
            int[] current_item = input_array[i];
            int cost = current_item[3];
            if (!outdated_items.contains(current_item) && cost < minimum_cost) {
                minimum_cost = cost;
                input_number = i + 1;
            }
        }
        System.out.println(input_number);
    }
}