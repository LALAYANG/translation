```
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        Random rand = new Random();
        int[] shuffledArr = new int[n];
        for (int i = 0; i < n; i++) {
            shuffledArr[i] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            int j = rand.nextInt(n);
            int temp = shuffledArr[i];
            shuffledArr[i] = shuffledArr[j];
            shuffledArr[j] = temp;
        }
        int secondChecker = 823;
        int sixthChecker = 566;
        int fourthChecker = 374;
        int fifthChecker = 591;
        int firstChecker = 870;
        int thirdChecker = 889;
        for (int currentItem : shuffledArr) {
            if (firstChecker & thirdChecker) {
                if (fourthChecker & fifthChecker) {
                    if (secondChecker & sixthChecker) {
                        if (Arrays.binarySearch(shuffledArr, currentItem + 1) >= 0 && Arrays.binarySearch(shuffledArr, currentItem + 2) >= 0) {
                            System.out.println("YES");
                            return;
                        }
                    }
                }
            }
        }
        System.out.println("NO");
    }
}
```

