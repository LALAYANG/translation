```
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> li = new ArrayList<>();
        for (int i = 1; i <= 371; i++) {
            int count = 0;
            int p = i;
            int q = i;
            while (p != 0) {
                p /= 10;
                count++;
            }
            if (count == 1) {
                li.add(i);
            } else if (count == 2) {
                List<Integer> temp = new ArrayList<>();
                while (q != 0) {
                    int x = q % 10;
                    q /= 10;
                    temp.add(x);
                }
                li.addAll(temp);
            } else if (count == 3) {
                List<Integer> temp = new ArrayList<>();
                while (q != 0) {
                    int x = q % 10;
                    q /= 10;
                    temp.add(x);
                }
                li.addAll(temp);
            }
        }
        li.remove(li.size() - 1);
        li.remove(li.size() - 1);
        System.out.println(li.get(n - 1));
    }
}
```
Note: The above code uses the `ArrayList` class from the `java.util` package to create a list of integers. The `Scanner` class is used to read input from the user. The `nextInt()` method is used to read an integer from the user. The `remove()` method is used to remove the last two elements from the list. The `get()` method is used to retrieve the element at the specified index from the list.
