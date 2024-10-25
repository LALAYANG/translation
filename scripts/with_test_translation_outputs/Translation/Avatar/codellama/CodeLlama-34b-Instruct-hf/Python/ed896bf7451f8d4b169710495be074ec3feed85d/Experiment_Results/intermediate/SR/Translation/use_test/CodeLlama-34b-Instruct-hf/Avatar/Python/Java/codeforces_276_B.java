<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;

public class SecondOrFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] count = new int[26];
        for (int i = 0; i < input.length(); i++) {
            int index = input.charAt(i) - 'a';
            count[index]++;
        }
        int oddCount = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] % 2 != 0) {
                oddCount++;
            }
        }
        if (oddCount == 0) {
            System.out.println("First");
        } else if (oddCount == 1 && input.length() % 2 == 0) {
            System.out.println("Second");
        } else if (oddCount == 1 && input.length() % 2 != 0) {
            System.out.println("First");
        } else {
            System.out.println("Invalid input");
        }
    }
}
```
Note: The above code assumes that the input string only contains lowercase letters. If the input string can contain uppercase letters or other characters, you may need to modify the code accordingly.</s>
