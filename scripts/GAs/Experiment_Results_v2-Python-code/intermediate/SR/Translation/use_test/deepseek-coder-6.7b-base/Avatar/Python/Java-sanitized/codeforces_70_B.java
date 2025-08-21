import java.util.Scanner;
import java.util.regex.Pattern;

public class codeforces_70_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.nextLine();
        String[] sentences = s.split("[.?!]");
        int ans = 1;
        int currentLineLength = 0;
        for (String sentence : sentences) {
            int sentenceLength = sentence.length();
            if (sentenceLength > 1 && sentenceLength > n) {
                System.out.println("Impossible");
                return;
            }
            if (currentLineLength + sentenceLength + (currentLineLength > 0) > n) {
                ans++;
                currentLineLength = sentenceLength;
            } else {
                currentLineLength += sentenceLength + (currentLineLength > 0 ? 1 : 0);
            }
        }
        System.out.println(ans);
    }
}