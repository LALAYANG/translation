<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
15 24
23 6
21:15

Expected output:
1


```
a , at = map ( int , input ( ).split ( ) )
b , bt = map ( int , input ( ).split ( ) )
t1 , t2 = map ( int , input ( ).split ( ':' ) )
st = t2 + ( t1 - 5 ) * 60
fin = st + at
now = 0
ans = 0
while now < fin and now < 1140 :
    if now + bt > st :
        ans += 1
    now += b
print ( ans )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int at = scanner.nextInt();
        int b = scanner.nextInt();
        int bt = scanner.nextInt();
        String[] time = scanner.next().split(":");
        int t1 = Integer.parseInt(time[0]);
        int t2 = Integer.parseInt(time[1]);
        int st = t2 + (t1 - 5) * 60;
        int fin = st + at;
        int now = 0;
        int ans = 0;
        while (now < fin && now < 1140) {
            if (now + bt > st) {
                ans += 1;
            }
            now += b;
        }
        System.out.println(ans);
    }
}
```
<|EOT|>
