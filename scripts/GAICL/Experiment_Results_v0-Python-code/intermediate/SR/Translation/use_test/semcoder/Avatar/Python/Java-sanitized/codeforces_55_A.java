import java.util.Scanner;

public class codeforces_55_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        while (number % 2 == 0) {
            number /= 2;
        }

        if (number == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}