```java
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxLevel = scanner.nextInt();
        int[] x = getArray(scanner.nextLine());
        int[] y = getArray(scanner.nextLine());
        x = removeFirstElement(x);
        y = removeFirstElement(y);
        Set<Integer> xSet = new HashSet<>(x);
        Set<Integer> ySet = new HashSet<>(y);
        if (xSet.contains(0)) {
            xSet.remove(0);
        } else if (ySet.contains(0)) {
            ySet.remove(0);
        }
        Set<Integer> z = xSet.union(ySet);
        if (z.size() != maxLevel) {
            System.out.println("Oh, my keyboard!");
        } else {
            System.out.println("I become the guy.");
        }
    }

    private static int[] getArray(String line) {
        String[] tokens = line.split(" ");
        int[] array = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            array[i] = Integer.parseInt(tokens[i]);
        }
        return array;
    }

    private static int[] removeFirstElement(int[] array) {
        int[] newArray = new int[array.length - 1];
        System.arraycopy(array, 1, newArray, 0, newArray.length);
        return newArray;
    }
}
```
This code uses the `Scanner` class to read input from the console, and the `Set` class to store the unique elements of the two arrays. The `removeFirstElement` method is used to remove the first element of the array, which is not needed in this problem. The `union` method is used to combine the two sets, and the `size` method is used to check if the combined set has the same size as the maximum level. If the combined set has a different size, the program prints "Oh, my keyboard!", otherwise it prints "I become the guy.".
