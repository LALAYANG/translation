```
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int totalLength = Integer.parseInt(input[0]);
        int[] lengths = new int[3];
        for (int i = 0; i < 3; i++) {
            lengths[i] = Integer.parseInt(input[i + 1]);
        }
        Arrays.sort(lengths);
        int maxPieces = 0;
        for (int i = 0; i <= totalLength / lengths[2]; i++) {
            int remainingLength = totalLength - i * lengths[2];
            if (remainingLength % lengths[0] == 0) {
                int pieces = i + remainingLength / lengths[0];
                maxPieces = Math.max(maxPieces, pieces);
            }
        }
        System.out.println(maxPieces);
    }
}
```

