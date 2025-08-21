import java.util.*;

public class codeforces_400_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_strings = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        Set<Integer> result_set = new HashSet<>();
        for (int range_index = 0; range_index < num_strings; range_index++) {
            String current_string = scanner.nextLine();
            int index_of_s = current_string.indexOf('S');
            int index_of_g = current_string.indexOf('G');
            result_set.add(subtract(index_of_s, index_of_g));
        }
        if (result_set.stream().anyMatch(element -> element < 0)) {
            System.out.println(-1);
        } else {
            System.out.println(result_set.size());
        }
    }

    public static int subtract(int arg0, int arg1) {
        return arg0 - arg1;
    }

    public static int calculate_difference(int element, int b) {
        return subtract(element, b);
    }
}