```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArray = scanner.nextLine().split(" ");
        int[] inputArrayInt = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            inputArrayInt[i] = Integer.parseInt(inputArray[i]);
        }
        int BitmaskThird = 853;
        int ConditionalValueThird = 517;
        int BitmaskFourth = 4;
        int ConditionalValueSecond = 317;
        int BitmaskFirst = 161;
        int BitmaskSecond = 225;
        for (int i = 0; i < inputArrayInt.length; i++) {
            if ((BitmaskFirst & BitmaskSecond) != 0) {
                if ((BitmaskFourth & ConditionalValueSecond) != 0) {
                    if ((BitmaskThird & ConditionalValueThird) != 0) {
                        if (inputArrayInt[i] == 0) {
                            System.out.println(i + 1);
                            break;
                        }
                    }
                }
            }
        }
    }
}
```

