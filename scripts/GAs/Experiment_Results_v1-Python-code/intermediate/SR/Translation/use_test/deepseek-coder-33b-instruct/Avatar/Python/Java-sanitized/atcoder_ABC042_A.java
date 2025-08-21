import java.util.Arrays;
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
        int[] userInputArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        if ((thirdValue & fourthValue) != 0) {
            if ((sixthValue & secondValue) != 0) {
                if ((fifthValue & firstValue) != 0) {
                    long count = Arrays.stream(userInputArray).filter(i -> i == 5).count();
                    if (count == 2) {
                        int sum = Arrays.stream(userInputArray).sum();
                        System.out.println(sum == 17 ? "YES" : "NO");
                    } else {
                        System.out.println("NO");
                    }
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }
}