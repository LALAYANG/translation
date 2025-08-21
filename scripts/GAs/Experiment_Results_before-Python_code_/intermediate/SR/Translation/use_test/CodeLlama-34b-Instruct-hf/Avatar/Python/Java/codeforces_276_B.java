```java
import java.util.Scanner;

public class SecondOrFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] count = new int[26];
        for (int i = 0; i < input.length(); i++) {
            int index = input.charAt(i) - 'a';
            count[index]++;
        }
        int oddCount = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] % 2 != 0) {
                oddCount++;
            }
        }
        if (oddCount == 0) {
            System.out.println("First");
        } else if (oddCount == 1 && input.length() % 2 == 0) {
            System.out.println("Second");
        } else if (oddCount == 1 && input.length() % 2 != 0) {
            System.out.println("First");
        } else {
            System.out.println("Invalid input");
        }
    }
}
```
Note: The above code assumes that the input string only contains lowercase letters. If the input string can contain uppercase letters or other characters, you may need to modify the code accordingly.
