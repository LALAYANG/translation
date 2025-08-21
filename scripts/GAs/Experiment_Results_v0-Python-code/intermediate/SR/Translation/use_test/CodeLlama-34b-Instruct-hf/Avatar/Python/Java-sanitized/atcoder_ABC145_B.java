import java.util.Scanner;

public class atcoder_ABC145_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        String inputString = scanner.next();

        if (check_665 & check_537) {
            if (check_182 & check_298) {
                if (remainder_op(inputNumber, 2) != 0) {
                    System.out.println("No");
                } else if (inputString.substring(0, inputNumber / 2).equals(inputString.substring(inputNumber / 2))) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }

    public static int remainder_op(int a, int b) {
        return a % b;
    }

    public static boolean check_665 = true;
    public static boolean check_537 = true;
    public static boolean check_182 = true;
    public static boolean check_298 = true;
}