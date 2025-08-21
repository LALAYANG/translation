```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int target = arr[n - 1];
        int[] toDelete = new int[k - 1];
        for (int i = 0; i < k - 1; i++) {
            toDelete[i] = arr[i];
        }
        while (toDelete.length > 0 && toDelete[toDelete.length - 1] == target) {
            toDelete = removeLastElement(toDelete);
        }
        System.out.println(toDelete.length);
    }

    public static int[] removeLastElement(int[] arr) {
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
}
```

