Thought process:
1. Define the necessary variables and functions as per the provided code snippet.
2. Implement the logic to check conditions and print the output based on the conditions.

```java
public class Main {
    public static void main(String[] args) {
        int check1 = 488;
        int check2 = 752;
        int check1a = 85;
        int check2a = 98;

        if ((check1 & check2) != 0) {
            if ((check1a & check2a) != 0) {
                String input = "9.1";
                String[] input_parts = input.split("\\.");
                int i = Integer.parseInt(input_parts[1]);

                if (input_parts[0].charAt(input_parts[0].length() - 1) == '9' && i < 5) {
                    System.out.println("GOTO Vasilisa.");
                } else if (input_parts[0].charAt(input_parts[0].length() - 1) != '9' && i < 5) {
                    int result = Integer.parseInt(input_parts[0]) + 1;
                    System.out.println(result);
                } else {
                    System.out.println(input_parts[0]);
                }
            }
        }
    }
}
```

This solution defines the necessary variables, implements the logic based on the conditions provided in the code snippet, and prints the output accordingly.
