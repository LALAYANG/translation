import java.util.Scanner;

public class atcoder_ARC062_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int numG = 0, numP = 0, score = 0;
        for (char x : s.toCharArray()) {
            if (x == 'g') {
                if (numG - numP > 0) {
                    score += 1;
                    numP += 1;
                } else {
                    score = score;
                    numG += 1;
                }
            } else if (x == 'p') {
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