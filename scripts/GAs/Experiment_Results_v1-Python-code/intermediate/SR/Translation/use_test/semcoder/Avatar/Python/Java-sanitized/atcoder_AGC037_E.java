import java.util.Scanner;

public class atcoder_AGC037_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        String S = scanner.next();

        boolean aaaa = false;
        if (K >= 15) {
            aaaa = true;
        } else if (Math.pow(2, K) >= N) {
            aaaa = true;
        }

        if (aaaa) {
            String smallestChar = Character.toString(S.charAt(0));
            for (int i = 1; i < S.length(); i++) {
                if (S.charAt(i) < smallestChar.charAt(0)) {
                    smallestChar = Character.toString(S.charAt(i));
                }
            }
            System.out.println(smallestChar.repeat(N));
        } else {
            // Implement the rest of the logic for K < 15 and 2^K < N
        }
    }
}