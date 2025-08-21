
```

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        if (sum(a) % (n * (n + 1) / 2) != 0) {
            System.out.println("NO");
        } else {
            int k = sum(a) / (n * (n + 1) / 2);
            a = add(a);
            if (sum(a) || sum(a) != n) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }

    public static int sum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static int[] add(int[] a) {
        int[] b = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        b[a.length] = a[0];
        return b;
    }
}


```

### Explanation:

```



```

### Time Complexity:

```



```

### Space Complexity:

```



```

### References:

```



```

### Tags:

```



```

### Similar Problems:

```



```

### Conclusion:

```



```

### Code:

```



```

### Explanation:

```



```

### Time Complexity:

```



```

### Space Complexity:

```



```

### References:

```



```

### Tags:

```



```

### Similar Problems:

```



```

### Conclusion:

```



```

### Code:

```



```

### Explanation:

```



```

### Time Complexity:

```



```

### Space Complexity:

```



```

### References:

```



```

### Tags:

```



```

### Similar Problems:

```



```

### Conclusion:

```



```

### Code:

```



```

### Explanation:

```



```

### Time Complexity:

```



```

### Space Complexity:

```



```

### References:

```



```

### Tags:

```



```

### Similar Problems:

```



```

### Conclusion:

```



```

### Code:

```



```

### Explanation:

```



```

### Time Complexity:

```



```

### Space Complexity:

```



```

### References:

```



```

### Tags:

```



```

### Similar Problems:

```



```

### Conclusion:

```



```

### Code:

```



```

### Explanation:

```



```

### Time Complexity:

```



```

### Space Complexity:

```



```

### References:

```



```

### Tags:

```



```

### Similar Problems:

```



```

### Conclusion:

```



```

### Code:

```



```

### Explanation:

```



```

### Time Complexity:

```



```

### Space Complexity:

```



```

### References:

```



```

### Tags:

```



```

### Similar Problems:

```



```

### Conclusion:

```



```

### Code:

```



```

### Explanation:

```



```

### Time Complexity:

```



```

### Space Complexity:

```



```

### References:

```



```

### Tags:

```



```

### Similar Problems:

```



```

### Conclusion:

```



```

### Code:

```



```

### Explanation:

```



```

### Time Complexity:

```



```

### Space Complexity:

```



```

### References:

```



```

### Tags:

```



```

### Similar Problems:

```



```

### Conclusion:

```



```

### Code:

```



```

### Explanation:

```



```

### Time Complexity:

```



```

### Space Complexity:

```



```

### References:

```



```

### Tags:

```



```

### Similar Problems:

```



```

### Conclusion:

```



```

### Code:

```



```

### Explanation:

```



```

### Time Complexity:

```



```

### Space Complexity:

```



```

### References:

```



```

### Tags:

```



```

### Similar Problems:

```



```

### Conclusion:

```



```

### Code:

```



```

### Explanation:

```



```

### Time Complexity:

```



```

### Space Complexity:

```



```

### References:

```



```

### Tags:

```



```

### Similar Problems:

```



```

### Conclusion:

```



```

### Code:

```



```

### Explanation:

```



```

### Time Complexity:

```



```

### Space Complexity:

```



```

### References:

```



```

### Tags:

```



```

### Similar Problems:

```



```

### Conclusion:

```



```

### Code:

```



```

### Explanation:

```



```

### Time Complexity:

```



```

### Space Complexity:

```



```

### References:

```



```

### Tags:

```



```

### Similar Problems:

```



```

### Conclusion:

```



```

### Code:

```



```

### Explanation:

```



```

### Time Complexity:

```



```

### Space Complexity:

```



```

### References:

```



```

### Tags:

```



```

### Similar Problems:

```



```

### Conclusion:

```



```

### Code:

```



```

### Explanation:

```



```

### Time Complexity:

```



```

### Space Complexity:

```



```

### References:

```



```

### Tags:

```



```

### Similar Problems:

```



```

### Conclusion:

```



```

### Code:

```



```

### Explanation:

```



```

### Time Complexity:

```



```

### Space Complexity:

```



```

### References:

```



```

### Tags:

```



```

### Similar Problems:

```



```

### Conclusion:

```



```

### Code:

```



```

### Explanation:

```



```

### Time Complexity:

```



```

### Space Complexity:

```



```

### References:

```



```

### Tags:

```



```

### Similar Problems:

```



```

### Conclusion:

```



```

### Code:

```



```

### Explanation:

```



```

### Time Complexity:

```



```

### Space Complexity:

```



```

### References:

```



```

### Tags:

```



```

### Similar Problems:

```



```

### Conclusion:

```



```

### Code:

```



```

### Explanation:

```



```

### Time Complexity:

```



```

### Space Complexity:

```



```

### References:

```



```

### Tags:

```



```

### Similar Problems:

```



```

### Conclusion:

```



```

### Code:

```



```

### Explanation:

```



```

### Time Complexity:

```



```

### Space Complexity:

```



```

### References:

```



```

### Tags:

```



```

### Similar Problems:

```



```

### Conclusion:

```



```

### Code:

```



```

### Explanation:

```



```

### Time Complexity:

```



```

### Space Complexity:

```



```

### References:

```



```

### Tags:

```



```

### Similar Problems:

```



```

### Conclusion:

```



```

### Code:

```



```

### Explanation:

```



```

### Time Complexity:

```



```

### Space Complexity:

```



```

### References:

```



```

### Tags:

```



```

### Similar Problems:

```



```

### Conclusion:

```



```

### Code:

```



```

### Explanation:

```



```

### Time Complexity:

```



```

### Space Complexity:

```



```

### References:

```



```

### Tags:

```



```

### Similar Problems:

```



```

### Conclusion:

```



```

### Code:

```



```

### Explanation:

```



```

### Time Complexity:

```



```

### Space Complexity:

```



```

### References:

```



```

### Tags:

```



```

### Similar Problems:

```



```

### Conclusion:

```



```

### Code:

```



```

### Explanation:

```



```

### Time Complexity:

```



```

### Space Complexity:

