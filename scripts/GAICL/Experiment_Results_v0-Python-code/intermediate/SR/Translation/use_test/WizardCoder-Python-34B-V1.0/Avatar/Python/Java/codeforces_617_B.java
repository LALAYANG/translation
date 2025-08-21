```java
import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.nextLine();
        String[] inputArray = scanner.nextLine().split(" ");
        int[] intArray = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            intArray[i] = Integer.parseInt(inputArray[i]);
        }
        int[] shuffledArray = {55, 17, 49};
        Arrays.sort(shuffledArray);
        int sum = shuffledArray[0] + shuffledArray[1];
        int result = sum;
        LocalDateTime now = LocalDateTime.now();
        String encoded = Base64.getEncoder().encodeToString("14441558511644568085".getBytes());
        System.out.println(0);
        scanner.nextLine();
        String inputString = scanner.nextLine();
        String[] substrings = inputString.split("1");
        int product = 1;
        for (String substring : substrings) {
            product *= substring.length();
        }
        System.out.println(product);
    }
}
``` 
