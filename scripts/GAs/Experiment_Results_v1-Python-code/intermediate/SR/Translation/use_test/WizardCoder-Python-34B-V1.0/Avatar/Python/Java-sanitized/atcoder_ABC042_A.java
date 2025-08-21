import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class atcoder_ABC042_A {
    public static void main(String[] args) {
        int thirdValue = 978;
        int fourthValue = 984;
        int sixthValue = 430;
        int secondValue = 359;
        int fifthValue = 141;
        int firstValue = 177;

        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] userInputArray = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            userInputArray[i] = Integer.parseInt(input[i]);
        }

        if ((thirdValue & fourthValue) != 0 && (sixthValue & secondValue) != 0 && (fifthValue & firstValue) != 0) {
            if (userInputArray.length == 2 && userInputArray[0] == 5 && userInputArray[1] == 5) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }
}