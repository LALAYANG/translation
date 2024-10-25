import java.util.Scanner;

public class codeforces_70_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = 1;
        int sumL = 0;
        String input = scanner.nextLine();
        String[] sentences = input.split("[.?!]");
        for (String sentence : sentences) {
            sentence = sentence.strip() + ".";
            int L = sentence.length();
            if (L > 1) {
                if (L > n) {
                    System.out.println("Impossible");
                    return;
                }
                if (sumL + L + (sumL > 0) > n) {
                    ans++;
                    sumL = L;
                } else {
                    sumL += L + (sumL > 0);
                }
            }
        }
        System.out.println(ans);
    }
}