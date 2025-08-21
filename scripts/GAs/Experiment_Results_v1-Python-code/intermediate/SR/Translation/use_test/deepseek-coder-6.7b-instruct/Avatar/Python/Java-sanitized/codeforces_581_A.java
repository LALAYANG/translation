import java.util.Scanner;

public class codeforces_581_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInput = scanner.nextInt();
        int secondInput = scanner.nextInt();
        System.out.println(Math.min(firstInput, secondInput) + " " + calculateHalfDiff(Math.max(firstInput, secondInput), Math.min(firstInput, secondInput)) / 2);
    }

    public static int diff(int arg0, int arg1) {
        return arg0 - arg1;
    }

    public static int calculateHalfDiff(int a, int b) {
        return diff(a, b);
    }
}