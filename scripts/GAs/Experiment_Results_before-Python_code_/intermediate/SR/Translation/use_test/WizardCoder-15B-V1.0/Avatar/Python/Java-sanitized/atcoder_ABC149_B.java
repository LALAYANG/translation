import java.util.Scanner;

public class atcoder_ABC149_B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long[] cookies = new long[3];
        for (int i = 0; i < 3; i++) {
            cookies[i] = input.nextLong();
        }
        long leftOver = cookies[0] - cookies[2];
        long takahashi = Math.max(0, leftOver);
        System.out.println(takahashi + " " + (cookies[1] > 0 ? cookies[1] : Math.max(0, cookies[1] - Math.abs(leftOver))));
    }
}