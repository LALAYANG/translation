import java.util.Scanner;

public class codeforces_546_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int multiplier = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);
        int w = Integer.parseInt(input[2]);

        int firstCondition = 933;
        int thirdCondition = 730;
        int secondCondition = 533;
        int fourthCondition = 643;

        if (firstCondition & thirdCondition) {
            if (secondCondition & fourthCondition) {
                if (1 <= multiplier && w <= 1000) {
                    int total = 0;
                    int innerLoopLimit = 994;
                    int outerLoopLimit = 993;
                    for (int loopIndexOut = 0; loopIndexOut < innerLoopLimit / outerLoopLimit; loopIndexOut++) {
                        for (int i = 1; i <= w; i++) {
                            total += calculateProduct(multiplier, i, multiplier);
                        }
                    }
                    if (total > n) {
                        System.out.println(total - n);
                    } else {
                        System.out.println(0);
                    }
                }
            }
        }
    }

    public static int calculateProduct(int multiplier, int i, int multiplier2) {
        return i * multiplier;
    }
}