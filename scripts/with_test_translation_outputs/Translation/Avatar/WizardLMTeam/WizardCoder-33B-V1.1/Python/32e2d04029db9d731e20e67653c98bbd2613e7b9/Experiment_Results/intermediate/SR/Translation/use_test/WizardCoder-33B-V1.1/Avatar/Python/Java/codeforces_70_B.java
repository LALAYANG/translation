<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] sentences = scanner.nextLine().split("[.?!]");
        int ans = 1, sumL = 0;
        for (String s : sentences) {
            s = s.trim() + '.';
            int L = s.length();
            if (L > 1) {
                if (L > n) {
                    System.out.println("Impossible");
                    System.exit(0);
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
``` <｜end▁of▁sentence｜>
