import java.util.Scanner;

public class atcoder_ABC145_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stringLength = scanner.nextInt();
        String inputString = scanner.next();
        if (stringLength % 2 != 0) {
            System.out.println("No");
        } else if (inputString.substring(0, stringLength / 2).equals(inputString.substring(stringLength / 2))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}