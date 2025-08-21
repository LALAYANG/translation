import java.util.Scanner;

public class codeforces_462_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String s = scanner.next();
        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'A']++;
        }

        int res = 0;
        // Logic for calculating the result

        System.out.println(res);
    }
}