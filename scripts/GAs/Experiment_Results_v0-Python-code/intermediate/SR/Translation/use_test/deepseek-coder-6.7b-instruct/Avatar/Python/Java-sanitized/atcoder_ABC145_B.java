import java.util.Scanner;

public class atcoder_ABC145_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        String inputString = scanner.next();
        if ((inputNumber & 665) == 665 && (inputNumber & 537) == 537) {
            if ((inputNumber & 182) == 182 && (inputNumber & 298) == 298) {
                if (inputNumber % 2 != 0) {
                    System.out.println("No");
                } else if (inputString.substring(0, inputNumber / 2).equals(inputString.substring(inputNumber / 2))) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
        scanner.close();
    }
}