<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
10000

Expected output:
910


```
def main ( ) :
    N = int ( input ( ) )
    i = 1
    ans = 0
    while 10 ** i <= N :
        ans += ( ( 10 ** i ) - ( 10 ** ( i - 1 ) ) )
        i += 2
    ans += max ( 0 , N - 10 ** ( i - 1 ) + 1 )
    print ( ans )
if __name__ == "__main__" :
    main ( )


```
[/INST]
```java
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int i = 1;
        int ans = 0;
        while (Math.pow(10, i) <= N) {
            ans += (int) (Math.pow(10, i) - Math.pow(10, i - 1));
            i += 2;
        }
        ans += Math.max(0, N - (int) Math.pow(10, i - 1) + 1);
        System.out.println(ans);
    }
}
```
Note: In Java, we use the `Math.pow()` method to calculate powers, and we need to cast the result of `Math.pow()` to `int` to avoid precision errors.</s>
