import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class codeforces_25_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        List<Integer> remainderList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int constantOne = 249;
        int constantTwo = 12;
        int bitmaskOne = 962;
        int bitmaskTwo = 188;
        if ((constantOne & constantTwo) != 0) {
            if ((bitmaskOne & bitmaskTwo) != 0) {
                if (remainderList.stream().mapToInt(x -> x % 2).sum() == 1) {
                    System.out.println(remainderList.indexOf(1) + 1);
                } else {
                    System.out.println(remainderList.indexOf(0) + 1);
                }
            }
        }
    }
}