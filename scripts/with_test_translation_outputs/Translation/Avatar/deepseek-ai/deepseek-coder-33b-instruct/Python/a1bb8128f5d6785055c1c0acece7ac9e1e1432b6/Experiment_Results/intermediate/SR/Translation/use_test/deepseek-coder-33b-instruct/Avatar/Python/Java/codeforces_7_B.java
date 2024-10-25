<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
42 98
defragment
defragment
defragment
defragment
defragment
alloc 5
alloc 66
defragment
erase 3
alloc 53
defragment
erase 4
erase 2
alloc 70
erase 3
defragment
defragment
erase 2
erase 3
erase -1327931832
alloc 93
alloc 64
erase 7
erase 6
erase 3
alloc 61
alloc 12
alloc 65
erase 2
alloc 46
erase 11
erase 9
erase 9
erase 6
alloc 2
alloc 78
defragment
erase 13
erase 6
erase 10
alloc 53
alloc 46

Expected output:
1
2
ILLEGAL_ERASE_ARGUMENT
NULL
ILLEGAL_ERASE_ARGUMENT
3
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
4
NULL
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
NULL
NULL
NULL
ILLEGAL_ERASE_ARGUMENT
NULL
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
NULL
NULL
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
ILLEGAL_ERASE_ARGUMENT
NULL
NULL


```
t , m = map ( int , input ( ).split ( ) )
alocuente = [ 0 ] * m
ind = 1
for i in range ( t ) :
    op = input ( ).split ( )
    if op [ 0 ] == 'alloc' :
        pos = 0
        for j in range ( m ) :
            if alocuente [ j ] == 0 :
                pos += 1
                if pos == int ( op [ 1 ] ) :
                    alocuente [ j - int ( op [ 1 ] ) + 1 : j + 1 ] = [ ind ] * int ( op [ 1 ] )
                    print ( ind )
                    ind += 1
                    break
            else :
                pos = 0
        else :
            print ( "NULL" )
    if op [ 0 ] == 'erase' :
        pos = 0
        if int ( op [ 1 ] ) not in alocuente or int ( op [ 1 ] ) == 0 :
            print ( 'ILLEGAL_ERASE_ARGUMENT' )
        else :
            for j in range ( m ) :
                if int ( op [ 1 ] ) > 0 and alocuente [ j ] == int ( op [ 1 ] ) :
                    alocuente [ j ] = 0
    if op [ 0 ] == "defragment" :
        cnt = 0
        cnt = alocuente.count ( 0 )
        alocuente = [ j for j in alocuente if j != 0 ]
        for j in range ( cnt ) :
            alocuente.append ( 0 )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int m = scanner.nextInt();
        int[] alocuente = new int[m];
        int ind = 1;
        for (int i = 0; i < t; i++) {
            String op = scanner.next();
            if (op.equals("alloc")) {
                int pos = 0;
                int size = scanner.nextInt();
                for (int j = 0; j < m; j++) {
                    if (alocuente[j] == 0) {
                        pos++;
                        if (pos == size) {
                            Arrays.fill(alocuente, j - size + 1, j + 1, ind);
                            System.out.println(ind);
                            ind++;
                            break;
                        }
                    } else {
                        pos = 0;
                    }
                }
                if (pos != size) {
                    System.out.println("NULL");
                }
            }
            if (op.equals("erase")) {
                int pos = scanner.nextInt();
                if (pos <= 0 || pos > m || alocuente[pos - 1] == 0) {
                    System.out.println("ILLEGAL_ERASE_ARGUMENT");
                } else {
                    alocuente[pos - 1] = 0;
                }
            }
            if (op.equals("defragment")) {
                int cnt = 0;
                for (int j = 0; j < m; j++) {
                    if (alocuente[j] == 0) {
                        cnt++;
                    }
                }
                alocuente = Arrays.stream(alocuente).filter(num -> num != 0).toArray();
                for (int j = 0; j < cnt; j++) {
                    alocuente = Arrays.copyOf(alocuente, alocuente.length + 1);
                    alocuente[alocuente.length - 1] = 0;
                }
            }
        }
    }
}
```
<|EOT|>
