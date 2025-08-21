import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_96_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        generateNumber(0, 0, 0, list);
        list.sort(Integer::compareTo);
        int minimumValue = 0;
        for (int val : list) {
            if (val >= n) {
                minimumValue = val;
                break;
            }
        }
        System.out.println(minimumValue);
    }

    private static void generateNumber(int number, int four, int seven, List<Integer> list) {
        if (number > 10000000000L) {
            return;
        }
        if (number > 0 && four == seven) {
            list.add(number);
        }
        generateNumber(number * 10 + 4, four + 1, seven, list);
        generateNumber(number * 10 + 7, four, seven + 1, list);
    }
}