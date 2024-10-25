<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
knlxclouvxxbzezqaoygbihsasvdhbqqodwtcswbupuwbxadlphlcaxljeqqjdodglrjfzxsprndwcizmwfptsroubgbzotfwtfjibuuxzaujjbetavipjeccavwylmlordfnyxzcgorsfecwliztfjqdmfldkoqazcvlslsbvkgyzeoatelcvirmjqtlenddvqtcoevdeyjohgdmdfopooupfjtsoacjlxhjrrlwrwelyowuctiaegiqdlxfct...
Expected output:
Second


```
s = list ( input ( ) )
x = True
dt = { }
for i in s :
    if i in dt :
        dt [ i ] += 1
    else :
        dt [ i ] = 1
cnt = 0
x = True
for key , value in dt.items ( ) :
    if value % 2 != 0 and cnt < 1 :
        cnt += 1
    elif value % 2 != 0 and cnt >= 1 :
        x = False
        break
if x :
    print ( "First" )
elif not x and len ( s ) % 2 == 0 :
    print ( "Second" )
elif not x and len ( s ) % 2 != 0 :
    print ( "First" )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Map<Character, Integer> dt = new HashMap<>();
        for (char c : s.toCharArray()) {
            dt.put(c, dt.getOrDefault(c, 0) + 1);
        }
        int cnt = 0;
        boolean x = true;
        for (Map.Entry<Character, Integer> entry : dt.entrySet()) {
            if (entry.getValue() % 2 != 0 && cnt < 1) {
                cnt += 1;
            } else if (entry.getValue() % 2 != 0 && cnt >= 1) {
                x = false;
                break;
            }
        }
        if (x) {
            System.out.println("First");
        } else if (!x && s.length() % 2 == 0) {
            System.out.println("Second");
        } else if (!x && s.length() % 2 != 0) {
            System.out.println("First");
        }
    }
}
```
<|EOT|>
