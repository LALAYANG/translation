```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TTestInd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = sc.nextLine().split(" ");
        ArrayList<Integer> w = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            w.add(Integer.parseInt(s[i]));
        }
        Collections.sort(w, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        int c = 0;
        int a = 0;
        for (int i = 0; i < w.size(); i++) {
            if (w.get(i) == w.get(w.size() - 1)) {
                c = i;
                a = w.get(i);
                break;
            }
        }
        System.out.println(a);
    }
}
```
Explanation:

The code is using the `Scanner` class to read the input from the user. The `nextInt()` method is used to read the first integer, which is the number of elements in the array. The `nextLine()` method is used to read the remaining integers as a string. The `split()` method is used to split the string into an array of integers.

The code is then using the `Collections.sort()` method to sort the array of integers in ascending order. The `Comparator` interface is used to provide a custom comparison method for the sorting.

The code is then using a loop to find the first element in the array that is equal to the last element in the array. The `get()` method is used to access the elements in the array. The `break` statement is used to exit the loop once the first element is found.

Finally, the code is printing the first element that is equal to the last element in the array.
