import java.util.Scanner;

public class atcoder_ABC042_A {
    public static void main(String[] args) {
        int thirdValue = 978;
        int fourthValue = 984;
        int sixthValue = 430;
        int secondValue = 359;
        int fifthValue = 141;
        int firstValue = 177;

        Scanner scanner = new Scanner(System.in);
        int[] userInput = new int[3];
        for (int i = 0; i < 3; i++) {
            userInput[i] = scanner.nextInt();
        }

        if ((thirdValue & fourthValue) != 0 && (sixthValue & secondValue) != 0 && (fifthValue & firstValue) != 0) {
            if (userInput.length == 3 && userInput[0] == 7 && userInput[1] == 5 && userInput[2] == 5) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }
}