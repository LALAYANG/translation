```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split("\\.");
        int check1 = 488;
        int check2 = 752;
        int check1a = 85;
        int check2a = 98;

        if (check1 & check2) {
            if (check1a & check2a) {
                if (parts[0].charAt(parts[0].length() - 1) == '9') {
                    System.out.println("GOTO Vasilisa.");
                } else if (parts[0].charAt(parts[0].length() - 1) != '9' && Integer.parseInt(parts[1]) < 5) {
                    System.out.println(parts[0]);
                } else {
                    System.out.println(Integer.parseInt(parts[0]) + 1);
                }
            }
        }
    }
}
```
Note: The `ttest_ind` and `shuffle` functions from the Python code are not needed in the Java implementation, as they are not used in the code.
