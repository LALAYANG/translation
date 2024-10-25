<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
118
gweVo bjbEKaZQw PpSi AWOYt sQSvAHNRswh vUaGuLbtExNECz! USsQxMCjaGOmUESwHvyY SshkERibaWkmNLSZOtWZy FFTUWQgekPRjLRetAdSFt! sIhcimZTisFvndrYioLF HetLn wjoaDUKfbkagupl QdYb fFiV GNqBygStKQw. XLiYZEOGnTLSHmCwktEr pVBePMoRGopNt LdEujxuxzmlbycQdR?

Expected output:
4


```
import re
n = int ( input ( ) )
ans , sumL = 1 , 0
for s in re.split ( "[.?!]" , input ( ) ) :
    s = s.strip ( ) + '.'
    L = len ( s )
    if L > 1 :
        if L > n :
            print ( "Impossible" )
            exit ( )
        if sumL + L + ( sumL > 0 ) > n :
            ans += 1
            sumL = L
        else :
            sumL = sumL + L + ( sumL > 0 )
print ( ans )


```
[/INST]
```java
import java.util.Scanner;

public class SentenceSplitter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = 1;
        int sumL = 0;
        String input = scanner.nextLine();
        String[] sentences = input.split("[.?!]");
        for (String sentence : sentences) {
            sentence = sentence.strip() + ".";
            int L = sentence.length();
            if (L > 1) {
                if (L > n) {
                    System.out.println("Impossible");
                    return;
                }
                if (sumL + L + (sumL > 0) > n) {
                    ans++;
                    sumL = L;
                } else {
                    sumL += L + (sumL > 0);
                }
            }
        }
        System.out.println(ans);
    }
}
```
Note: The `strip()` method is used to remove any leading or trailing whitespace from the sentence. The `split()` method is used to split the input string into an array of sentences based on the regular expression `[.?!]`. The `length()` method is used to get the length of each sentence.</s>
