```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        if (arr.get(0) > 15) {
            System.out.println(15);
        } else {
            for (int i = 1; i < arr.size(); i++) {
                if (arr.get(i) - arr.get(i - 1) > 15) {
                    System.out.println(arr.get(i - 1) + 15);
                    break;
                }
            } else {
                if (arr.get(arr.size() - 1) == 90 || arr.get(arr.size() - 1) + 15 >= 90) {
                    System.out.println(90);
                } else {
                    System.out.println(arr.get(arr.size() - 1) + 15);
                }
            }
        }
    }
}
```
