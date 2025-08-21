```
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] data = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                data[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        int[] shuffled = shuffle(data[0]);
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += shuffled[i];
        }
        System.out.println(sum);
    }

    public static int[] shuffle(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            int j = rand.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
}
```

