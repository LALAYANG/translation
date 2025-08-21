import java.util.Scanner;

public class atcoder_ABC112_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (checkFirstCondition(age) && checkSubFirstCondition(age)) {
            if (checkSecondCondition(age) && checkSubSecondCondition(age)) {
                if (checkThirdCondition(age) && checkForthCondition(age)) {
                    if (age == 1) {
                        System.out.println("Hello World");
                    } else {
                        int a = scanner.nextInt();
                        int secondInput = scanner.nextInt();
                        System.out.println(a + secondInput);
                    }
                }
            }
        }
    }

    private static boolean checkFirstCondition(int age) {
        return age > 18;
    }

    private static boolean checkSubFirstCondition(int age) {
        return age < 30;
    }

    private static boolean checkSecondCondition(int age) {
        return age > 25;
    }

    private static boolean checkSubSecondCondition(int age) {
        return age < 40;
    }

    private static boolean checkThirdCondition(int age) {
        return age > 35;
    }

    private static boolean checkForthCondition(int age) {
        return age < 50;
    }
}