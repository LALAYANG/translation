<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
91

Expected output:
3


```
import sys
input_methods = [ 'clipboard' , 'file' , 'key' ]
using_method = 0
input_method = input_methods [ using_method ]
IN = lambda : map ( int , input ( ).split ( ) )
mod = 1000000007
def main_b ( ) :
    s = input ( )
    pp = 0
    na = 0
    for i , c in enumerate ( s [ : : - 1 ] ) :
        cc = na + int ( c )
        na = 0
        if cc <= 4 :
            pp += cc
        else :
            na = 1
            if i == len ( s ) - 1 :
                pp += 1
            pp += 10 - cc
    print ( pp )
def main ( ) :
    s = input ( )
    pmin = 1000
    mmin = 0
    s = '0' + s
    for c in s [ : : - 1 ] :
        v = int ( c )
        npmin = min ( pmin + 10 - ( v + 1 ) , mmin + 10 - v )
        nmmin = min ( pmin + v + 1 , mmin + v )
        pmin = npmin
        mmin = nmmin
    return min ( pmin , mmin )
isTest = False
def pa ( v ) :
    if isTest :
        print ( v )
def input_clipboard ( ) :
    import clipboard
    input_text = clipboard.get ( )
    input_l = input_text.splitlines ( )
    for l in input_l :
        yield l
if __name__ == "__main__" :
    if sys.platform == 'ios' :
        if input_method == input_methods [ 0 ] :
            ic = input_clipboard ( )
            input = lambda : ic.__next__ ( )
        elif input_method == input_methods [ 1 ] :
            sys.stdin = open ( 'inputFile.txt' )
        else :
            pass
        isTest = True
    else :
        pass
    ret = main ( )
    if ret is not None :
        print ( ret )


```

### Response:
Here is the Java version of the Python code:

```java
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int pp = 0;
        int na = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int cc = na + Integer.parseInt(String.valueOf(s.charAt(i)));
            na = 0;
            if (cc <= 4) {
                pp += cc;
            } else {
                na = 1;
                if (i == s.length() - 1) {
                    pp += 1;
                }
                pp += 10 - cc;
            }
        }
        System.out.println(pp);

        int pmin = 1000;
        int mmin = 0;
        s = "0" + s;
        for (char c : s.toCharArray()) {
            int v = Character.getNumericValue(c);
            int npmin = Math.min(pmin + 10 - (v + 1), mmin + 10 - v);
            int nmmin = Math.min(pmin + v + 1, mmin + v);
            pmin = npmin;
            mmin = nmmin;
        }
        System.out.println(Math.min(pmin, mmin));
    }
}
```

Please note that the Java version of the code does not include the `isTest` and `pa` methods from the Python code, as they are not used in the provided Python code.
<|EOT|>
