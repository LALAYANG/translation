```java
import java.util.*;

public class Main {
    static int num_inputs;
    static List<Item> input_array = new ArrayList<>();
    static List<Item> outdated = new ArrayList<>();
    static int minimum_cost = 100000;
    static int input_number = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        num_inputs = scanner.nextInt();
        read_input(0, num_inputs, 1);
        outer_loop(0, num_inputs, 1);
        cost_loop(0, num_inputs, 1);
        System.out.println(input_number);
    }

    static void read_input(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int S = scanner.nextInt();
        int R = scanner.nextInt();
        int H = scanner.nextInt();
        int cost = scanner.nextInt();
        input_array.add(new Item(S, R, H, cost));
        read_input(i + step, stop, step);
    }

    static void outer_loop(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        inner_loop(i, num_inputs, 1);
        outer_loop(i + step, stop, step);
    }

    static void inner_loop(int j, int stop, int step) {
        if (step == 0 || (step > 0 && j >= stop) || (step < 0 && j <= stop)) {
            return;
        }
        if (input_array.get(i).S < input_array.get(j).S && input_array.get(i).R < input_array.get(j).R && input_array.get(i).H < input_array.get(j).H) {
            outdated.add(input_array.get(i));
        }
        inner_loop(j + step, stop, step);
    }

    static void cost_loop(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        Item current_item = input_array.get(i);
        int cost = current_item.cost;
        if (!outdated.contains(current_item) && cost < minimum_cost) {
            minimum_cost = current_item.cost;
            input_number = i + 1;
        }
        cost_loop(i + step, stop, step);
    }

    static class Item {
        int S, R, H, cost;

        Item(int S, int R, int H, int cost) {
            this.S = S;
            this.R = R;
            this.H = H;
            this.cost = cost;
        }
    }
}
```

This Java code does the same thing as the Python code. It reads the number of inputs and the properties of each item from the input, determines which items are outdated, and then finds the item with the lowest cost that is not outdated. The index of the item in the input is printed as the output.

