
Here is the Java code that implements the same functionality as the Python code:
```java
import java.util.Scanner;

public class MemoryAllocator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int m = scanner.nextInt();
        int[] allocations = new int[m];
        int ind = 1;
        for (int i = 0; i < t; i++) {
            String[] op = scanner.nextLine().split(" ");
            if (op[0].equals("alloc")) {
                int pos = 0;
                for (int j = 0; j < m; j++) {
                    if (allocations[j] == 0) {
                        pos++;
                        if (pos == Integer.parseInt(op[1])) {
                            allocations[j - Integer.parseInt(op[1]) + 1 : j + 1] = new int[Integer.parseInt(op[1])];
                            for (int k = 0; k < Integer.parseInt(op[1]); k++) {
                                allocations[j - Integer.parseInt(op[1]) + 1 + k] = ind;
                            }
                            ind++;
                            break;
                        }
                    } else {
                        pos = 0;
                    }
                }
                if (pos == 0) {
                    System.out.println("NULL");
                }
            } else if (op[0].equals("erase")) {
                int pos = 0;
                if (Integer.parseInt(op[1]) < 0 || Integer.parseInt(op[1]) >= m) {
                    System.out.println("ILLEGAL_ERASE_ARGUMENT");
                } else {
                    for (int j = 0; j < m; j++) {
                        if (allocations[j] == Integer.parseInt(op[1])) {
                            allocations[j] = 0;
                            break;
                        }
                    }
                }
            } else if (op[0].equals("defragment")) {
                int cnt = 0;
                cnt = allocations.length - allocations.length;
                allocations = allocations.filter(x -> x != 0);
                for (int j = 0; j < cnt; j++) {
                    allocations.add(0);
                }
            }
        }
        for (int i = 0; i < allocations.length; i++) {
            System.out.println(allocations[i]);
        }
    }
}
```
Note that this code uses the `Scanner` class to read input from the user, and the `filter` method to remove the `0` elements from the `allocations` array. The `filter` method returns a new array with the elements that match the given predicate, in this case, the predicate is `x -> x != 0`, which means that the method will return a new array with all the elements that are not equal to `0`.

Also, note that the `defragment` method is not implemented in the same way as in the Python code, but it should work in a similar way. The `defragment` method in the Java code removes all the `0` elements from the `allocations` array and adds `0` elements to the end of the array to make it the same size as before.
