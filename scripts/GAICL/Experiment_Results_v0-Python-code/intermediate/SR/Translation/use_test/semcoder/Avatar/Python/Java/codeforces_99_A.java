```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();
        String[] parts = inputString.split("\\.");
        String[] stringParts = parts[0].split("");
        String[] decimalParts = parts[1].split("");
        int i = Integer.parseInt(decimalParts[0]);

        if (check1 & check2) {
            if (check1a & check2a) {
                if (stringParts[stringParts.length - 1].equals("9")) {
                    System.out.println("GOTO Vasilisa.");
                } else if (!stringParts[stringParts.length - 1].equals("9") && i < 5) {
                    StringBuilder sb = new StringBuilder();
                    for (String part : stringParts) {
                        sb.append(part);
                    }
                    System.out.println(sb.toString());
                } else {
                    StringBuilder sb = new StringBuilder();
                    for (String part : stringParts) {
                        sb.append(part);
                    }
                    int result = Integer.parseInt(sb.toString()) + 1;
                    System.out.println(result);
                }
            }
        }
    }

    static boolean check1 = true;
    static boolean check2 = true;
    static boolean check1a = true;
    static boolean check2a = true;
}
```
