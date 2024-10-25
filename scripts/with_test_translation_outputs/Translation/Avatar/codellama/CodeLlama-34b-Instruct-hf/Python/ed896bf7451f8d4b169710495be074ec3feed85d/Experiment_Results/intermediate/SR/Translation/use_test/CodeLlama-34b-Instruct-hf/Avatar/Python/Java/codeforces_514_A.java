<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
332711047202

Expected output:
332211042202


```
ip = input ( )
st = ""
if len ( ip ) != 1 :
    if ip [ 0 ] == "9" :
        st = "9"
        ip = ip [ 1 : ]
    for i in ip :
        if int ( i ) > 4 :
            n = 9 - int ( i )
            st += str ( n )
        else :
            st += i
else :
    st = ip
print ( int ( st ) )


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String output = "";

        if (input.length() != 1) {
            if (input.charAt(0) == '9') {
                output = "9";
                input = input.substring(1);
            }
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (c > '4') {
                    int n = 9 - (c - '0');
                    output += String.valueOf(n);
                } else {
                    output += c;
                }
            }
        } else {
            output = input;
        }

        System.out.println(Integer.parseInt(output));
    }
}
```
Test case:

Input: 332711047202

Output: 332211042202</s>
