```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] parts = input.split("\\.");
        char[] chars = parts[0].toCharArray();
        int[] digits = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            digits[i] = Character.getNumericValue(chars[i]);
        }
        int decimal = Integer.parseInt(parts[1]);
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
        }
        if (sum == 9) {
            System.out.println("GOTO Vasilisa.");
        } else if (sum != 9 && decimal < 5) {
            System.out.println(new String(chars));
        } else {
            String str = new String(chars);
            int num = Integer.parseInt(str) + 1;
            System.out.println(num);
        }
    }
}
```

Explanation:

- We first import the `Scanner` class to read input from the user.
- We then read the input string using the `nextLine()` method of the `Scanner` class.
- We split the input string into two parts using the `split()` method of the `String` class. The first part is the integer part and the second part is the decimal part.
- We convert the integer part into a character array using the `toCharArray()` method of the `String` class.
- We create an integer array to store the digits of the integer part.
- We loop through the character array and convert each character to its corresponding integer value using the `getNumericValue()` method of the `Character` class.
- We calculate the sum of the digits of the integer part.
- If the sum is 9, we print "GOTO Vasilisa."
- If the sum is not 9 and the decimal part is less than 5, we print the integer part.
- If the sum is not 9 and the decimal part is greater than or equal to 5, we convert the integer part back to a string using the `String` constructor and add 1 to it. We then print the resulting integer.
