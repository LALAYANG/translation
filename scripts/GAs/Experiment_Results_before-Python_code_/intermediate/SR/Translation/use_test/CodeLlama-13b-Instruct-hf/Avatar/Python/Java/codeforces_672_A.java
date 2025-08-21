
Here is the Java code that translates the Python code:
```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        int ind = 0;
        for (int i = 1; i <= 371; i++) {
            int[] temp = new int[i];
            int p = i, q = i;
            int count = 0;
            while (p != 0) {
                p /= 10;
                count++;
            }
            if (count == 1) {
                li.add(i);
            } else if (count == 2) {
                while (q != 0) {
                    int x = q % 10;
                    q /= 10;
                    temp[ind++] = x;
                }
                li.addAll(temp);
            } else if (count == 3) {
                while (q != 0) {
                    int x = q % 10;
                    q /= 10;
                    temp[ind++] = x;
                }
                li.addAll(temp);
            }
        }
        li.remove(li.size() - 1);
        li.remove(li.size() - 1);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(li.get(n - 1));
    }
}
```
Note that the Java code uses the `ArrayList` class to store the list of numbers, and the `Scanner` class to read input from the user. The `addAll` method is used to add the elements of the `temp` array to the `li` list. The `remove` method is used to remove the last two elements from the `li` list. The `get` method is used to retrieve the element at a given index from the `li` list.
