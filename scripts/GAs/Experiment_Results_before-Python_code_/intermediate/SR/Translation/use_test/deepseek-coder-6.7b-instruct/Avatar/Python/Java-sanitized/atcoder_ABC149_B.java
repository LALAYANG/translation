import java.util.Scanner;

public class atcoder_ABC149_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();

        long leftOver = a - c;
        long takahashi = Math.max(0, leftOver);
        System.out.println(takahashi + " " + (takahashi > 0 ? b : Math.max(0, b - Math.abs(leftOver))));
    }
}