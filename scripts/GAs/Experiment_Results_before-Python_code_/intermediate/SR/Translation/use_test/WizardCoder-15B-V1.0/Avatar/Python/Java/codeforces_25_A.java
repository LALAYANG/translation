```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt() % 2;
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += list[i];
        }
        if (sum == 1) {
            System.out.println(findFirst(list, 1) + 1);
        } else {
            System.out.println(findFirst(list, 0) + 1);
        }
    }

    public static int findFirst(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
```
