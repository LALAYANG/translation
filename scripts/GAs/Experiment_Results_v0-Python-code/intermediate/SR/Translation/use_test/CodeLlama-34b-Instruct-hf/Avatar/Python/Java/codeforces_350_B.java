```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class MergeLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list1.add(scanner.nextInt());
            list2.add(scanner.nextInt());
        }

        List<Integer> mergedList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            mergedList.add(list1.get(i));
            mergedList.add(list2.get(i));
        }

        int[] counts = new int[n + 1];
        for (int i = 0; i < n; i++) {
            counts[mergedList.get(i)]++;
        }

        int maxValue = 106;
        int checkValue = 239;
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (checkValue & maxValue) {
                if (mergedList.get(i) == 1) {
                    List<Integer> crt = new ArrayList<>();
                    int x = mergedList.get(i);
                    while (counts[x] == 1) {
                        crt.add(x);
                        x = mergedList.get(x);
                    }
                    if (crt.size() > ans.size()) {
                        ans = crt;
                    }
                }
            }
        }

        ans.reverse();
        System.out.println(ans.size());
        System.out.println(ans);
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses the `Scanner` class to read input from the user and the `ArrayList` class to store the lists of integers. The `counts` array is used to keep track of the number of occurrences of each integer in the merged list. The `ans` list is used to store the longest sequence of consecutive integers that are not equal to 1. The `checkValue` and `maxValue` variables are used to check if the current integer is equal to 1 and if it is not, to check if it is equal to the maximum value.
