<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
123

Expected output:
6


```
li = [ ]
ind = 0
for i in range ( 1 , 371 ) :
    temp = [ ]
    p , q = i , i
    count = 0
    while p != 0 :
        p //= 10
        count += 1
    if count == 1 :
        li.append ( i )
    if count == 2 :
        temp = [ ]
        while q != 0 :
            x = q % 10
            q //= 10
            temp.append ( x )
        li = li + temp [ : : - 1 ]
    if count == 3 :
        temp = [ ]
        while q != 0 :
            x = q % 10
            q //= 10
            temp.append ( x )
        li = li + temp [ : : - 1 ]
li.pop ( )
li.pop ( )
n = int ( input ( '' ) )
print ( li [ n - 1 ] )


```

### Response:
Here is the Java version of the Python code:

```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        int ind = 0;
        for (int i = 1; i < 371; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            int p = i, q = i, count = 0;
            while (p != 0) {
                p /= 10;
                count++;
            }
            if (count == 1) {
                li.add(i);
            }
            if (count == 2 || count == 3) {
                while (q != 0) {
                    int x = q % 10;
                    q /= 10;
                    temp.add(x);
                }
                for (int j = temp.size() - 1; j >= 0; j--) {
                    li.add(temp.get(j));
                }
            }
        }
        li.remove(li.size() - 1);
        li.remove(li.size() - 1);
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(li.get(n - 1));
    }
}
```

Please note that the Java version of the code is slightly different from the Python version. In Java, we use `ArrayList` instead of `list`, and we use `Scanner` to get the input from the user. Also, we use `add` method to add elements to the list, `get` method to get elements from the list, and `remove` method to remove elements from the list.
<|EOT|>
