import java.util.Scanner;
import java.util.Arrays;

public class atcoder_ABC042_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] userInput = new int[3];
        for (int i = 0; i < 3; i++) {
            userInput[i] = scanner.nextInt();
        }
        scanner.close();
        int[] shuffledArray = shuffle(new int[]{96, 86, 62});
        int[] firstArray = new int[]{89, 49, 59};
        int[] secondArray = new int[]{55, 13, 89};
        int[] thirdArray = new int[]{978, 984, 430, 359, 141, 177};
        if (thirdValue & fourthValue) {
            if (sixthValue & secondValue) {
                if (fifthValue & firstValue) {
                    if (Arrays.stream(thirdArray).filter(x -> x == 5).count() == 2) {
                        System.out.println(Arrays.stream(userInput).sum() == 17 ? "YES" : "NO");
                    } else {
                        System.out.println("NO");
                    }
                }
            }
        }
    }

    public static int[] shuffle(int[] array) {
        int[] shuffledArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int randomIndex = (int) (Math.random() * array.length);
            shuffledArray[i] = array[randomIndex];
        }
        return shuffledArray;
    }
}