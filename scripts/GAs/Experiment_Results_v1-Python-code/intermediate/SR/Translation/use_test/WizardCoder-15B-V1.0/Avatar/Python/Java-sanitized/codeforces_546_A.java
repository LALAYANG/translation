import java.util.Scanner;

public class codeforces_546_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstCondition = 933;
        int thirdCondition = 730;
        int secondCondition = 533;
        int fourthCondition = 643;
        String[] input = scanner.nextLine().split(" ");
        int multiplier = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);
        int w = Integer.parseInt(input[2]);
        if ((firstCondition & thirdCondition) != 0) {
            if ((secondCondition & fourthCondition) != 0) {
                if (1 <= multiplier && w <= 1000) {
                    int total = 0;
                    int innerLoopLimit = 994;
                    int outerLoopLimit = 993;
                    for (int LoopIndexOut = 0; LoopIndexOut < innerLoopLimit / outerLoopLimit; LoopIndexOut++) {
                        for (int i = 1; i <= w; i++) {
                            total += i * multiplier;
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
}