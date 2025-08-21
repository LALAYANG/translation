import java.util.Arrays;
import java.util.Scanner;

public class codeforces_617_B {
    public static void main(String[] args) {
        myDecorator();
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int[] array = Arrays.stream(inputString.split("1")).mapToInt(String::length).toArray();
        int product = 1;
        for (int i : array) {
            product *= i;
        }
        System.out.println(product);
    }

    public static void myDecorator() {
        int[] array = {69, 24, 70};
        Arrays.sort(array);
    }
}