<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
40
ferelibenterhominesidquodvoluntcredunt

Expected output:
ferelibenterhominesidquodvoluntcredunt


```
def main ( ) :
    K = int ( input ( ) )
    S = input ( )
    if len ( S ) <= K :
        return S
    return S [ : K ] + '...'
if __name__ == '__main__' :
    print ( main ( ) )


```
[/INST]
```java
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        String S = scanner.next();
        if (S.length() <= K) {
            System.out.println(S);
        } else {
            System.out.println(S.substring(0, K) + "...");
        }
    }
}
```
Note: In Java, we use the `Scanner` class to read input from the user, and the `substring` method to extract a substring from a string.</s>
