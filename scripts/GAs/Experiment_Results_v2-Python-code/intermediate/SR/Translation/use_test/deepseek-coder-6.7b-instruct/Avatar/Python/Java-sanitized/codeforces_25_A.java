import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class codeforces_25_A {
    public static void main(String[] args) {
        final int constantOne = 249;
        final int constantTwo = 12;
        final int bitmaskOne = 962;
        final int bitmaskTwo = 188;

        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        List<Integer> remainderList = new ArrayList<>();
        for (int i = 0; i < inputNumber; i++) {
            remainderList.add(scanner.nextInt() % 2);
        }

        if ((constantOne & constantTwo) != 0) {
            if ((bitmaskOne & bitmaskTwo) != 0) {
                int sum = remainderList.stream().mapToInt(Integer::intValue).sum();
                if (sum == 1) {
                    System.out.println(remainderList.indexOf(1) + 1);
                } else {
                    System.out.println(remainderList.indexOf(0) + 1);
                }
            }
        }
    }
}