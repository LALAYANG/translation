import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_70_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String input = scanner.nextLine();
        String[] sentences = input.split("[.?!]");
        int result = 0;
        int sumL = 0;
        for (String sentence : sentences) {
            int L = sentence.length();
            if (L > 1 && L > n) {
                System.out.println("Impossible");
                return;
            }
            if (sumL + L + (sumL > 0) > n) {
                result++;
                sumL = L;
            } else {
                sumL += L + (sumL > 0);
            }
        }
        System.out.println(result);
    }
}