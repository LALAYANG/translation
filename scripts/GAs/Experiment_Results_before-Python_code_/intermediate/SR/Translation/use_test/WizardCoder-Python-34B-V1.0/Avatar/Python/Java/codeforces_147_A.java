```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] punctuation = {",", ".", "!", "?"};
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i >= 1) {
                if (s.charAt(i) == ' ') {
                    if (res.charAt(res.length() - 1) != ' ') {
                        res.append(s.charAt(i));
                    } else {
                        continue;
                    }
                } else {
                    if (Arrays.asList(punctuation).contains(String.valueOf(s.charAt(i))) && res.charAt(res.length() - 1) != ' ') {
                        res.append(s.charAt(i));
                        res.append(" ");
                    } else {
                        res.append(s.charAt(i));
                    }
                }
            } else {
                if (s.charAt(i) == ' ') {
                    continue;
                }
                if (Arrays.asList(punctuation).contains(String.valueOf(s.charAt(i))) || s.charAt(i) == ' ') {
                    continue;
                } else {
                    res.append(s.charAt(i));
                }
            }
        }
        System.out.println(res.toString().trim());
    }
}
``` 
