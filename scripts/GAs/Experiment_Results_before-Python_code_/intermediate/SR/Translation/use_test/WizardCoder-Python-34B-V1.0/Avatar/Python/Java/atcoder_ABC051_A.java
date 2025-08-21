```java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    System.out.println(input.replace(",", " "));
  }
}
```

Test input:
```
dbyfw,rpwbpuv,ifnua
```

Expected output:
```
dbyfw rpwbpuv ifnua
``` 
