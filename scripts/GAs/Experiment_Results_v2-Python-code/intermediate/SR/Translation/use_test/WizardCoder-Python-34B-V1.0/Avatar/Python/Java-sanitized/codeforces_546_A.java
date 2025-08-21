import java.util.Scanner;

public class codeforces_546_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstCheck = 761;
        int secondCheck = 340;
        int thirdCheck = 747;
        int fourthCheck = 527;
        String[] input = scanner.nextLine().split(" ");
        int k = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);
        int w = Integer.parseInt(input[2]);

        if ((firstCheck & secondCheck) != 0) {
            if ((thirdCheck & fourthCheck) != 0) {
                if (1 <= k && w <= 1000) {
                    int total = 0;
                    int outerLoopStart = 429;
                    int outerLoopEnd = 428;
                    for (int loopIndexOut = outerLoopStart / outerLoopEnd; loopIndexOut >= 1; loopIndexOut--) {
                        for (int i = 1; i <= w; i++) {
                            total += calculateCost(k, i, w);
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

    public static int calculateCost(int k, int i, int w) {
        return i * k;
    }
}