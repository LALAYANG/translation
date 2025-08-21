```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_inputs = sc.nextInt();
        sc.nextLine();
        List<int[]> input_array = new ArrayList<>();
        for (int i = 0; i < num_inputs; i++) {
            String[] input = sc.nextLine().split(" ");
            int[] arr = new int[4];
            arr[0] = Integer.parseInt(input[0]);
            arr[1] = Integer.parseInt(input[1]);
            arr[2] = Integer.parseInt(input[2]);
            arr[3] = Integer.parseInt(input[3]);
            input_array.add(arr);
        }
        List<int[]> outdated = new ArrayList<>();

        for (int i = 0; i < num_inputs; i++) {
            for (int j = 0; j < num_inputs; j++) {
                if (input_array.get(i)[0] < input_array.get(j)[0] && input_array.get(i)[1] < input_array.get(j)[1] && (input_array.get(i)[2] < input_array.get(j)[2])) {
                    outdated.add(input_array.get(i));
                }
            }
        }
        Set<int[]> set = new HashSet<>(outdated);
        outdated = new ArrayList<>(set);

        int minimum_cost = 100000;
        int input_number = 0;

        for (int i = 0; i < num_inputs; i++) {
            int[] current_item = input_array.get(i);
            int cost = current_item[3];
            if (current_item[0] < minimum_cost && current_item[1] < minimum_cost && current_item[2] < minimum_cost) {
                minimum_cost = current_item[3];
                input_number = i + 1;
            }
        }
        System.out.println(input_number);
    }
}
```
