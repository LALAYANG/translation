import java.util.Scanner;

public class atcoder_ABC149_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cookies = scanner.nextLine().split(" ");
        int[] intCookies = new int[cookies.length];
        for (int i = 0; i < cookies.length; i++) {
            intCookies[i] = Integer.parseInt(cookies[i]);
        }
        int leftOver = intCookies[0] - intCookies[2];
        int takahashi = Math.max(0, leftOver);
        System.out.println(takahashi + " " + (intCookies[1] + " " + (Math.max(0, intCookies[1] - Math.abs(leftOver))));
    }
}