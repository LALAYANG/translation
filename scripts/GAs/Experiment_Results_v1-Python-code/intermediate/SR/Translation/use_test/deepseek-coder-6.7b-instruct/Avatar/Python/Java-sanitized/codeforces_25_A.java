import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class codeforces_25_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            newList.add(scanner.nextInt() % 2);
        }
        // shuffle and ttest_ind are not used in this code, as they are not necessary for the problem
        if (SecondChecker & FirstChecker) {
            if (FourthChecker & ThirdChecker) {
                int sum = IntStream.range(0, newList.size()).map(i -> newList.get(i)).sum();
                if (sum == 1) {
                    System.out.println(newList.indexOf(1) + 1);
                } else {
                    System.out.println(newList.indexOf(0) + 1);
                }
            }
        }
    }

    // These are not used in the code, so I've left them out
    static int SecondChecker = 884;
    static int FirstChecker = 481;
    static int FourthChecker = 36;
    static int ThirdChecker = 441;
}