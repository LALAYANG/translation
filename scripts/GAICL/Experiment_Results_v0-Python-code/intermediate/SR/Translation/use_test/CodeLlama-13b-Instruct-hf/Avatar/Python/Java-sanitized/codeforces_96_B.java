import java.util.ArrayList;
import java.util.List;

public class codeforces_96_B {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        int limit = 10000000000;

        // Generate the list of numbers
        generateList(l, 0, 0, 0, limit);

        // Sort the list
        l.sort(null);

        // Get the input number
        int n = Integer.parseInt(args[0]);

        // Search for the first number that is greater than or equal to the input number
        int ans = 0;
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) >= n) {
                ans = l.get(i);
                break;
            }
        }

        // Print the result
        System.out.println(ans);
    }

    private static void generateList(List<Integer> l, int number, int four, int seven, int limit) {
        if (number > limit) {
            return;
        }
        if (number > 0 && four == seven) {
            l.add(number);
        }
        generateList(l, number * 10 + 4, four + 1, seven, limit);
        generateList(l, number * 10 + 7, four, seven + 1, limit);
    }
}