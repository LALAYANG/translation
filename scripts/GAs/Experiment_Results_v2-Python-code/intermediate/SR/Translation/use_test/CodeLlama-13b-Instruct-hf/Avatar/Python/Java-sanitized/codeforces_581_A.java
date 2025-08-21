import java.util.Scanner;

public class codeforces_581_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInput = scanner.nextInt();
        int secondInput = scanner.nextInt();
        int difference = differenceFunction(firstInput, secondInput);
        System.out.println(Math.min(firstInput, secondInput) + " " + difference);
    }

    public static int differenceFunction(int a, int b) {
        return a - b;
    }
}