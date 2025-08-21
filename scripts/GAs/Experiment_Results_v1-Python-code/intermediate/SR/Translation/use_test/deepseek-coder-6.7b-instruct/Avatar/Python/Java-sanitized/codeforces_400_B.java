import java.util.*;

public class codeforces_400_B {

    public static int subtract(int arg0, int arg1) {
        return arg0 - arg1;
    }

    public static int calculate_difference(String element, String b) {
        int indexOfS = element.indexOf('S');
        int indexOfG = element.indexOf('G');
        return subtract(indexOfS, indexOfG);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_strings = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        Set<Integer> result_set = new HashSet<>();
        for (int i = 0; i < num_strings; i++) {
            String current_string = scanner.nextLine();
            result_set.add(calculate_difference(current_string, ""));
        }
        boolean hasNegative = result_set.stream().anyMatch(element -> element < 0);
        System.out.println(hasNegative ? -1 : result_set.size());
    }
}