import java.util.Scanner;

public class codeforces_58_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userRange = scanner.nextInt();
        int sum = 0;
        for (int iterator = 1; iterator <= userRange; iterator++) {
            sum += iterator;
        }
        System.out.println(sum);
    }
}