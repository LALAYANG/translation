```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        for (int i = 0; i < n; i++) {
            String[] l1 = sc.nextLine().split(" ");
            int sum = 0;
            for (String s : l1) {
                sum += Integer.parseInt(s);
            }
            if (sum > 1) {
                c++;
            }
        }
        System.out.println(c);
    }
}
```

Note: The above code assumes that the input is in the format specified in the problem statement, i.e., a single integer n followed by n lines of integers separated by spaces. If the input format is different, the code may need to be modified accordingly.
