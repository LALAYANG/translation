```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        if (arr[0] > 15) {
            System.out.println(15);
        } else {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] - arr[i - 1] > 15) {
                    System.out.println(arr[i - 1] + 15);
                    break;
                }
            }
            if (arr[arr.length - 1] == 90 || arr[arr.length - 1] + 15 >= 90) {
                System.out.println(90);
            } else {
                System.out.println(arr[arr.length - 1] + 15);
            }
        }
    }
}
```
This code first reads the input from the user and stores it in an array. Then, it checks if the first element of the array is greater than 15. If it is, it prints 15. Otherwise, it iterates through the array and checks if the difference between two consecutive elements is greater than 15. If it is, it prints the sum of the two elements and breaks the loop. If the loop completes without breaking, it checks if the last element of the array is equal to 90 or if the sum of the last element and 15 is greater than or equal to 90. If it is, it prints 90. Otherwise, it prints the sum of the last element and 15.
