```java
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '.') {
                result += "0";
            } else {
                i++;
                if (input.charAt(i) == '.') {
                    result += "1";
                } else {
                    result += "2";
                }
            }
        }
        System.out.println(result);
    }
}
```
This code uses a `Scanner` to read the input from the user, and then it iterates over the characters of the input string using a `for` loop. For each character, it checks if it is a dot (`.`) and if it is, it adds a `0` to the result string. If the character is not a dot, it increments the index by 1 and checks if the next character is a dot. If it is, it adds a `1` to the result string. If the next character is not a dot, it adds a `2` to the result string. Finally, it prints the result string.
