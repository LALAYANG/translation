import java.util.Scanner;

public class atcoder_ARC062_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numG = 0, numP = 0, score = 0;
        String input = sc.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char x = input.charAt(i);
            if (x == 'g') {
                if (numG - numP > 0) {
                    score++;
                    numP++;
                } else {
                    score = score;
                    numG++;
                }
            } else if (x == 'p') {
                if (numG - numP > 0) {
                    score = score;
                    numP++;
                } else {
                    score--;
                    numG++;
                }
            }
        }
        System.out.println(score);
    }
}