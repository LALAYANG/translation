<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
mck  . gq   dauqminf      wee   bazyzy     humnv    d pgtvx  , vxntxgrkrc    rg    rwr,  uuyweyz  l

Expected output:
mck. gq dauqminf wee bazyzy humnv d pgtvx, vxntxgrkrc rg rwr, uuyweyz l


```
s = input ( )
res = [ ]
punctuation = [ ',' , '.','!','?' ]
for i in range ( len ( s ) ) :
    if i >= 1 :
        if s [ i ] == '' :
            if res [ - 1 ] != '' :
                res.append ( s [ i ] )
            else :
                continue
        else :
            if s [ i ] in punctuation :
                if res [ - 1 ] == '' :
                    res.pop ( )
                res.append ( s [ i ] )
                res.append ( '' )
            else :
                res.append ( s [ i ] )
    else :
        if s [ i ] == '' :
            continue
        if s [ i ] in punctuation :
            continue
        else :
            res.append ( s [ i ] )
print ( ''.join ( res ) )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder res = new StringBuilder();
        char[] punctuation = {',', '.', '!', '?'};
        for (int i = 0; i < s.length(); i++) {
            if (i >= 1) {
                if (s.charAt(i) == ' ') {
                    if (res.charAt(res.length() - 1) != ' ') {
                        res.append(s.charAt(i));
                    } else {
                        continue;
                    }
                } else {
                    if (isPunctuation(s.charAt(i), punctuation)) {
                        if (res.charAt(res.length() - 1) == ' ') {
                            res.deleteCharAt(res.length() - 1);
                        }
                        res.append(s.charAt(i));
                        res.append(' ');
                    } else {
                        res.append(s.charAt(i));
                    }
                }
            } else {
                if (s.charAt(i) == ' ') {
                    continue;
                }
                if (isPunctuation(s.charAt(i), punctuation)) {
                    continue;
                } else {
                    res.append(s.charAt(i));
                }
            }
        }
        System.out.println(res.toString());
    }

    private static boolean isPunctuation(char c, char[] punctuation) {
        for (char p : punctuation) {
            if (c == p) {
                return true;
            }
        }
        return false;
    }
}
``` <｜end▁of▁sentence｜>
