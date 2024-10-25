<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5
AAAAA

Expected output:
15


```
def main ( ) :
    input ( )
    pieces = tuple ( zip ( map ( int , input ( ).split ( ) ) , input ( ) ) )
    return Bob_sMaxStrength ( pieces )
def Bob_sMaxStrength ( pieces ) :
    pScore = sScore = pMaxScore = sMaxScore = sum ( piece [ 0 ] for piece in pieces if piece [ 1 ] == 'B' )
    for piece in pieces :
        if piece [ 1 ] == 'A' :
            pScore += piece [ 0 ]
            if pScore > pMaxScore :
                pMaxScore = pScore
        else :
            pScore -= piece [ 0 ]
    for i in range ( len ( pieces ) - 1 , - 1 , - 1 ) :
        if pieces [ i ] [ 1 ] == 'A' :
            sScore += pieces [ i ] [ 0 ]
            if sScore > sMaxScore :
                sMaxScore = sScore
        else :
            sScore -= pieces [ i ] [ 0 ]
    if pMaxScore > sMaxScore :
        return pMaxScore
    return sMaxScore
if __name__ == '__main__' :
    print ( main ( ) )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }
        scanner.nextLine();
        String colors = scanner.nextLine();
        System.out.println(bobsMaxStrength(values, colors));
    }

    public static int bobsMaxStrength(int[] values, String colors) {
        int pScore = 0, sScore = 0, pMaxScore = 0, sMaxScore = 0;
        for (int i = 0; i < values.length; i++) {
            if (colors.charAt(i) == 'A') {
                pScore += values[i];
                if (pScore > pMaxScore) {
                    pMaxScore = pScore;
                }
            } else {
                pScore -= values[i];
            }
        }
        for (int i = values.length - 1; i >= 0; i--) {
            if (colors.charAt(i) == 'A') {
                sScore += values[i];
                if (sScore > sMaxScore) {
                    sMaxScore = sScore;
                }
            } else {
                sScore -= values[i];
            }
        }
        return Math.max(pMaxScore, sMaxScore);
    }
}
``` <｜end▁of▁sentence｜>
