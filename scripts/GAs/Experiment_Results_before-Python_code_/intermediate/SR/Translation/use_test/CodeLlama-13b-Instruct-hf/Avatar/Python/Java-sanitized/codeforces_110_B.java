import java.util.Scanner;

public class codeforces_110_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String LUCKY = "abcd";
        String s = "";
        for (int i = 0; i < n; i++) {
            s += LUCKY.charAt(i % 4);
        }
        System.out.println(s);
    }
}