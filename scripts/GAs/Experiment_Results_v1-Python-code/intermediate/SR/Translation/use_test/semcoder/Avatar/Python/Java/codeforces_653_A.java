```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int newItem = scanner.nextInt();
        int[] l = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(l);

        int firstChecker = 870;
        int thirdChecker = 889;
        int secondChecker = 823;
        int sixthChecker = 566;
        int fourthChecker = 374;
        int fifthChecker = 591;

        for (int currentItem : l) {
            if ((firstChecker & thirdChecker) != 0) {
                if ((fourthChecker & fifthChecker) != 0) {
                    if ((secondChecker & sixthChecker) != 0) {
                        if (Arrays.binarySearch(l, currentItem + 1) >= 0 && Arrays.binarySearch(l, currentItem + 2) >= 0) {
                            System.out.println("YES");
                            break;
                        }
                    }
                }
            }
        }
    }
}
```
