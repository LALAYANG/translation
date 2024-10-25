<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
17
CCC..C.C....C.C.C
.C.CC.CC...CC..C.
.CCCC.CC.C..CCC.C
...CCC.CC.CCC.C.C
CCCCCCCC..C.CC.CC
...C..C....C.CC.C
CC....CCC...C.CC.
.CC.C.CC..C......
.CCCCC.C.CC.CCCCC
..CCCC...C..CC..C
C.CC.C.CC..C.C.C.
C..C..C..CCC.C...
.C..CCCC..C......
.CC.C...C..CC.CC.
C..C....CC...CC..
C.CC.CC..C.C..C..
CCCC...C.C..CCCC.

Expected output:
1160


```
n = int ( input ( ) )
cake = [ ]
happiness = 0
chocCount = 0
nfat = 1
for i in range ( n ) :
    line = str ( input ( ) )
    cake.append ( line )
    for j in line :
        if ( j == 'C' ) :
            chocCount += 1
    if ( chocCount > 1 ) :
        for i in range ( chocCount , chocCount - 2 , - 1 ) :
            nfat *= i
        happiness += nfat / 2
    nfat = 1
    chocCount = 0
posCount = 0
for j in range ( n ) :
    for i in range ( n ) :
        if ( cake [ i ] [ j ] == 'C' ) :
            chocCount += 1
    if ( chocCount > 1 ) :
        for i in range ( chocCount , chocCount - 2 , - 1 ) :
            nfat *= i
        happiness += nfat / 2
    nfat = 1
    chocCount = 0
print ( int ( happiness ) )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] cake = new String[n];
        int happiness = 0;
        int chocCount = 0;
        int nfat = 1;
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            cake[i] = line;
            for (int j = 0; j < line.length(); j++) {
                if (line.charAt(j) == 'C') {
                    chocCount++;
                }
            }
            if (chocCount > 1) {
                for (int k = chocCount; k > chocCount - 2; k--) {
                    nfat *= k;
                }
                happiness += nfat / 2;
            }
            nfat = 1;
            chocCount = 0;
        }
        chocCount = 0;
        nfat = 1;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                if (cake[i].charAt(j) == 'C') {
                    chocCount++;
                }
            }
            if (chocCount > 1) {
                for (int k = chocCount; k > chocCount - 2; k--) {
                    nfat *= k;
                }
                happiness += nfat / 2;
            }
            nfat = 1;
            chocCount = 0;
        }
        System.out.println(happiness);
    }
}
```
<|EOT|>
