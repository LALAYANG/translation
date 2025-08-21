```java
import java.util.Scanner;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        String result = "Yes";
        for (int i = 0; i < n - 1; i++) {
            if (arr[i].charAt(0) != arr[i + 1].charAt(0)) {
                result = "No";
                break;
            }
        }

        for (String key : map.keySet()) {
            if (map.get(key) >= 2) {
                result = "No";
                break;
            }
        }

        System.out.println(result);
    }
}
```

Note: The above code uses a `HashMap` to keep track of the number of occurrences of each word. The `HashMap` is initialized with the input words and their frequencies. The code then iterates over the input words and checks if the first letter of each word is the same as the first letter of the previous word. If the first letter is not the same, the result is set to "No". The code also checks if any word has a frequency greater than or equal to 2, if so, the result is set to "No". Finally, the result is printed.
