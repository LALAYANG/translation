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

        if ((firstCondition & thirdCondition) != 0 && (secondCondition & fourthCondition) != 0) {
            if (1 <= multiplier && multiplier <= 1000) {
                int total = 0;
                int innerLoopLimit = 994;
                int outerLoopLimit = 993;
                for (int i = 0; i < innerLoopLimit / outerLoopLimit; i++) {
                    for (int j = 1; j <= w; j++) {
                        total += calculateProduct(multiplier, j, n);
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

    private static int calculateProduct(int multiplier, int i, int n) {
        return i * multiplier;
    }
}