import java.util.Scanner;

public class atcoder_ABC112_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int userAge = scanner.nextInt();
        
        if (userAge == 1) {
            System.out.println("Hello World");
        } else {
            int firstNumber = scanner.nextInt();
            int secondNumber = scanner.nextInt();
            System.out.println(firstNumber + secondNumber);
        }
        
        scanner.close();
    }
}