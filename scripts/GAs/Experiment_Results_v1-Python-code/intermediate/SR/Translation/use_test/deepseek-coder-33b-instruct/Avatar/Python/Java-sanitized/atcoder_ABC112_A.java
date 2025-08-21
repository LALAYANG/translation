import java.util.Scanner;

public class atcoder_ABC112_A {
    public static void main(String[] args) {
        int checkFirstCondition = 813;
        int checkSubFirstCondition = 420;
        int checkSecondCondition = 703;
        int checkSubSecondCondition = 89;
        int checkThirdCondition = 838;
        int checkForthCondition = 924;

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if ((checkFirstCondition & checkSubFirstCondition) != 0) {
            if ((checkSecondCondition & checkSubSecondCondition) != 0) {
                if ((checkThirdCondition & checkForthCondition) != 0) {
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
}