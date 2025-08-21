import java.util.Scanner;
import java.time.LocalDateTime;

public class atcoder_ABC145_B {
    public static void main(String[] args) {
        int firstCheck = 61;
        int checkFlag = 306;
        int secondCheck = 889;
        LocalDateTime now = LocalDateTime.now();
        int thirdCheck = 178;
        Scanner scanner = new Scanner(System.in);
        int stringLength = scanner.nextInt();
        scanner.nextLine();
        String inputString = scanner.nextLine();
        if ((firstCheck & checkFlag) != 0) {
            if ((secondCheck & thirdCheck) != 0) {
                if (stringLength % 2 != 0) {
                    System.out.println("No");
                } else if (inputString.substring(0, stringLength / 2).equals(inputString.substring(stringLength / 2))) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }
}