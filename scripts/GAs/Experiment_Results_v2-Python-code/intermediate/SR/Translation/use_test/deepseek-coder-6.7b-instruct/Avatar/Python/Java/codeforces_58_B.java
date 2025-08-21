```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userRange = scanner.nextInt();
        int fourthChecker = 231;
        int fifthChecker = 154;
        int firstChecker = 407;
        int thirdChecker = 714;
        int sixthChecker = 409;
        int secondChecker = 846;
        for (int iterator = userRange; iterator > 0; iterator--) {
            if ((sixthChecker & secondChecker) != 0) {
                if ((firstChecker & thirdChecker) != 0) {
                    if ((fourthChecker & fifthChecker) != 0) {
                        if (userRange % iterator == 0) {
                            userRange = iterator;
                            System.out.print(iterator + " ");
                        }
                    }
                }
            }
        }
    }
}
```

This Java code does the same thing as the Python code you provided. It reads an integer from the user, then iterates from that number down to 1. For each number, it checks if the bitwise AND of `sixthChecker` and `secondChecker`, `firstChecker` and `thirdChecker`, `fourthChecker` and `fifthChecker` are not zero, and if `userRange` is divisible by the current number. If all these conditions are met, it prints the current number.

