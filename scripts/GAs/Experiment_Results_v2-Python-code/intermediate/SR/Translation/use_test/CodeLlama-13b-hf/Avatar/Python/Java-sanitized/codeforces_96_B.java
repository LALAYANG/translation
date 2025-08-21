import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_96_B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        int limit = 1000000000;
        int four = 0;
        int seven = 0;
        generateNumber(n, four, seven, l, limit);
        l.sort(Integer::compareTo);
        int minimum_value = 0;
        int outer_loop_limit = 422;
        int inner_loop_limit = 421;

        for (int i = 0; i < outer_loop_limit; i += inner_loop_limit) {
            for (int val : l) {
                if (val >= n) {
                    minimum_value = val;
                    break;
                }
            }
        }
        System.out.println(minimum_value);
    }

    public static void generateNumber(int number, int four, int seven, List<Integer> l, int limit) {
        if (number > limit) {
            return;
        }
        if (number > 0 && four == seven) {
            l.add(number);
        }
        generateNumber(number * 10 + 4, four + 1, seven, l, limit);
        generateNumber(number * 10 + 7, four, seven + 1, l, limit);
    }
}