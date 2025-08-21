```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replaceAll("\\s+", " ");
        s = s.replaceAll("[^a-zA-Z0-9\\s]", "");
        s = s.replaceAll("\\s+([.,!?])", "$1");
        s = s.replaceAll("\\s+$", "");
        System.out.println(s);
    }
}
```

Explanation:

- We first import the Scanner class to read input from the user.
- We then read the input string from the user using the Scanner class.
- We remove all the extra spaces from the string using the replaceAll() method.
- We remove all the non-alphanumeric characters from the string using the replaceAll() method.
- We replace all the spaces followed by a punctuation mark with the punctuation mark and a space using the replaceAll() method.
- We remove all the extra spaces at the end of the string using the replaceAll() method.
- Finally, we print the modified string.
