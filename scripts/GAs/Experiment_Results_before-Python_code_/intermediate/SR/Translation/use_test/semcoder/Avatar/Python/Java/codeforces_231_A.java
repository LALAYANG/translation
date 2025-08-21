```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int c = 0;
        
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            
            if (a + b > x) {
                c++;
            }
        }
        
        System.out.println(c);
    }
}
```
