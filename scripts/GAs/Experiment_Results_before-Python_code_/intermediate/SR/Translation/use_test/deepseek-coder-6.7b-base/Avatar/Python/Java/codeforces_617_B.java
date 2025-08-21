
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i].equals("1")) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println(0);
        } else {
            int[] arr1 = new int[count];
            int j = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i].equals("1")) {
                    arr1[j] = i;
                    j++;
                }
            }
            int[] arr2 = new int[count];
            for (int i = 0; i < count; i++) {
                arr2[i] = arr1[i] + 1;
            }
            int[] arr3 = new int[count];
            for (int i = 0; i < count; i++) {
                arr3[i] = arr2[i] - arr1[i];
            }
            int prod = 1;
            for (int i = 0; i < count; i++) {
                prod *= arr3[i];
            }
            System.out.println(prod);
        }
    }
}

```

### Explanation:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

```

```

### References:

```

```

### Tags:

```

```

### Solution:

