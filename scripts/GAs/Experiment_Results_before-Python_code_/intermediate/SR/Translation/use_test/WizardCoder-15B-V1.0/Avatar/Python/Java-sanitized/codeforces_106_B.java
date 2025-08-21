import java.util.*;

public class codeforces_106_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> input_array = new ArrayList<List<Integer>>();
        for (int i = 0; i < n; i++) {
            List<Integer> item = new ArrayList<Integer>();
            item.add(sc.nextInt());
            item.add(sc.nextInt());
            item.add(sc.nextInt());
            item.add(sc.nextInt());
            input_array.add(item);
        }
        List<List<Integer>> outdated = new ArrayList<List<Integer>>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (input_array.get(i).get(0) < input_array.get(j).get(0) && input_array.get(i).get(1) < input_array.get(j).get(1) && input_array.get(i).get(2) < input_array.get(j).get(2)) {
                    outdated.add(input_array.get(i));
                }
            }
        }
        Set<List<Integer>> outdated_set = new HashSet<List<Integer>>(outdated);
        int minimum_cost = 100000;
        int input_number = 0;
        for (int i = 0; i < n; i++) {
            List<Integer> current_item = input_array.get(i);
            int cost = current_item.get(3);
            if (!outdated_set.contains(current_item) && cost < minimum_cost) {
                minimum_cost = cost;
                input_number = i + 1;
            }
        }
        System.out.println(input_number);
    }
}