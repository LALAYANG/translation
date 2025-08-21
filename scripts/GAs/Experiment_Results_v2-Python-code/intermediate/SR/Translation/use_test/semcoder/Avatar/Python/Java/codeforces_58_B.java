```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userRange = input.nextInt();

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
