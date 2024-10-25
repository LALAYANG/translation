<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ip = scanner.nextLine();
        String st = "";
        if (ip.length() != 1) {
            if (ip.charAt(0) == '9') {
                st = "9";
                ip = ip.substring(1);
            }
            for (int i = 0; i < ip.length(); i++) {
                int num = Character.getNumericValue(ip.charAt(i));
                if (num > 4) {
                    int n = 9 - num;
                    st += Integer.toString(n);
                } else {
                    st += Integer.toString(num);
                }
            }
        } else {
            st = ip;
        }
        System.out.println(Integer.parseInt(st));
    }
}
```

This Java code does the same thing as the Python code. It takes an input string, checks if the first character is '9', and if it is, it adds '9' to the new string and removes the first character from the input string. Then it iterates over the remaining characters in the input string, and if the character is greater than '4', it subtracts the character from '9' and adds the result to the new string. If the character is not greater than '4', it adds the character to the new string. If the input string is only one character long, it just adds the input string to the new string. Finally, it prints the new string as an integer. <｜end▁of▁sentence｜>
