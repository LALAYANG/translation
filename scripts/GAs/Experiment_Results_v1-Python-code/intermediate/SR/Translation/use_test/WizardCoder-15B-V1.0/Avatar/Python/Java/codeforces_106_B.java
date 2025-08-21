```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<int[]> input_array = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] line = sc.nextLine().split(" ");
            int size = Integer.parseInt(line[0]);
            int R = Integer.parseInt(line[1]);
            int height = Integer.parseInt(line[2]);
            int C = Integer.parseInt(line[3]);
            input_array.add(new int[]{size, R, height, C});
        }
        List<int[]> outdated = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (input_array.get(i)[0] < input_array.get(j)[0] && input_array.get(i)[1] < input_array.get(j)[1] && input_array.get(i)[2] < input_array.get(j)[2]) {
                    outdated.add(input_array.get(i));
                }
            }
        }
        Set<int[]> outdated_set = new HashSet<>(outdated);
        int minimum_cost = 100000;
        int input_number = 0;
        for (int i = 0; i < n; i++) {
            int[] current_item = input_array.get(i);
            int cost = current_item[3];
            if (current_item[0] < minimum_cost && current_item[1] < minimum_cost && current_item[2] < minimum_cost && !outdated_set.contains(current_item)) {
                minimum_cost = current_item[3];
                input_number = i + 1;
            }
        }
        System.out.println(input_number);
    }
}
```
