```java
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_inputs = scanner.nextInt();
        int[][] input_array = new int[num_inputs][4];

        for (int i = 0; i < num_inputs; i++) {
            input_array[i][0] = scanner.nextInt();
            input_array[i][1] = scanner.nextInt();
            input_array[i][2] = scanner.nextInt();
            input_array[i][3] = scanner.nextInt();
        }

        HashSet<Integer> outdated = new HashSet<>();

        for (int i = 0; i < num_inputs; i++) {
            for (int j = 0; j < num_inputs; j++) {
                if (input_array[i][0] < input_array[j][0] && input_array[i][1] < input_array[j][1] && input_array[i][2] < input_array[j][2]) {
                    outdated.add(i);
                }
            }
        }

        int minimum_cost = 100000;
        int input_number = 0;

        for (int i = 0; i < num_inputs; i++) {
            if (!outdated.contains(i) && input_array[i][3] < minimum_cost) {
                minimum_cost = input_array[i][3];
                input_number = i + 1;
            }
        }

        System.out.println(input_number);
    }
}
```

Test input:
2
2000 500 200 100
3000 600 100 200

Expected output:
1 
