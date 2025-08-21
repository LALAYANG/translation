import java.util.Scanner;

public class codeforces_387_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input1 = scanner.nextLine().split(":");
        int h1 = Integer.parseInt(input1[0]);
        int minuend = Integer.parseInt(input1[1]);

        String[] input2 = scanner.nextLine().split(":");
        int multiplicand = Integer.parseInt(input2[0]);
        int m2 = Integer.parseInt(input2[1]);

        minuend += h1 * 60;
        m2 += multiplicand * 60;

        m2 %= 1440;
        System.out.printf("%02d:%02d", m2 / 60, m2 % 60);
    }
}