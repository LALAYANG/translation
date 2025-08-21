import java.util.Scanner;

public class atcoder_ABC149_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int leftOver = a - c;
        int takahashi = Math.max(0, leftOver);
        System.out.println(takahashi + " " + (takahashi > 0 ? b : Math.max(0, b - Math.abs(leftOver))));
    }
}