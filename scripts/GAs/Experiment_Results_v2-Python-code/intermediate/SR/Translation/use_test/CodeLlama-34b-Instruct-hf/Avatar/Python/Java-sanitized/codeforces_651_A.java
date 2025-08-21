import java.util.Scanner;

public class codeforces_651_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int secondInput = sc.nextInt();
        System.out.println(sumInputs(x, secondInput));
    }

    public static int sumInputs(int a, int b) {
        return a + b;
    }
}