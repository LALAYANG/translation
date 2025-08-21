```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Item> inputArray = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int size = scanner.nextInt();
            int R = scanner.nextInt();
            int height = scanner.nextInt();
            int C = scanner.nextInt();
            inputArray.add(new Item(size, R, height, C));
        }
        List<Item> outdated = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (inputArray.get(i).size < inputArray.get(j).size && inputArray.get(i).R < inputArray.get(j).R && inputArray.get(i).height < inputArray.get(j).height) {
                    outdated.add(inputArray.get(i));
                }
            }
        }
        outdated = new ArrayList<>(new HashSet<>(outdated));
        int minimumCost = 100000;
        int inputNumber = 0;
        for (int i = 0; i < n; i++) {
            int cost = inputArray.get(i).C;
            if (!outdated.contains(inputArray.get(i)) && cost < minimumCost) {
                minimumCost = cost;
                inputNumber = i + 1;
            }
        }
        System.out.println(inputNumber);
    }
}

class Item {
    int size;
    int R;
    int height;
    int C;

    public Item(int size, int R, int height, int C) {
        this.size = size;
        this.R = R;
        this.height = height;
        this.C = C;
    }
}
```

This Java code does the same thing as the Python code. It reads the number of items and the properties of each item from the input, checks which items are outdated, and then finds the item with the lowest cost that is not outdated. The index of the item in the input is printed as the output.

