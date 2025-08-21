```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<int[]> inputArray = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int S = sc.nextInt();
            int R = sc.nextInt();
            int H = sc.nextInt();
            int C = sc.nextInt();
            inputArray.add(new int[]{S, R, H, C});
        }

        ArrayList<int[]> outdated = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (inputArray.get(i)[0] < inputArray.get(j)[0] && inputArray.get(i)[1] < inputArray.get(j)[1] && inputArray.get(i)[2] < inputArray.get(j)[2]) {
                    outdated.add(inputArray.get(i));
                }
            }
        }

        outdated = new ArrayList<>(new ArrayList<>(outdated).stream().distinct().toList());

        int minimumCost = 100000;
        int inputNumber = 0;
        for (int i = 0; i < n; i++) {
            int[] currentItem = inputArray.get(i);
            int cost = currentItem[3];
            if (!outdated.contains(currentItem) && cost < minimumCost) {
                minimumCost = currentItem[3];
                inputNumber = i + 1;
            }
        }

        System.out.println(inputNumber);
    }
}
```
