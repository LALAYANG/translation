import java.util.Scanner;

public class atcoder_ARC062_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] s = input.split(" ");
        int numG = 0;
        int numP = 0;
        int score = 0;
        for (String x : s) {
            if (x.equals("g")) {
                if (numG - numP > 0) {
                    score += 1;
                    numP += 1;
                } else {
                    score = score;
                    numG += 1;
                }
            } else if (x.equals("p")) {
                if (numG - numP > 0) {
                    score = score;
                    numP += 1;
                } else {
                    score -= 1;
                    numG += 1;
                }
            }
        }
        System.out.println(score);
    }
}