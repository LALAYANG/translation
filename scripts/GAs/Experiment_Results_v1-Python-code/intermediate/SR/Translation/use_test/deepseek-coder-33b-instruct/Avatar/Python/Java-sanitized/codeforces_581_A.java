import java.util.Arrays;
import java.util.Scanner;

public class codeforces_581_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInput = scanner.nextInt();
        int secondInput = scanner.nextInt();

        int[] array = {firstInput, secondInput};
        Arrays.sort(array);

        System.out.println(array[0] + " " + (array[1] - array[0]) / 2);
    }
}