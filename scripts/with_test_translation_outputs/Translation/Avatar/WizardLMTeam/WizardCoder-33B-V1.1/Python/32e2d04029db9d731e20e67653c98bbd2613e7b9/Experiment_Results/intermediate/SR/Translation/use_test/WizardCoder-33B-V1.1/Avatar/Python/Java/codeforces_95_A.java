<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4
hello
party
abefglghjdhfgj
IVan
petrsmatchwin
a

Expected output:
petrsmatchwin


```
pya = int ( input ( ) )
arre = [ ]
while pya :
    pya -= 1
    arre.append ( input ( ).lower ( ) )
oString = input ( )
lowString = oString.lower ( )
letter1 = input ( ) [ 0 ].lower ( )
letter2 = 'a' if letter1.lower ( ) != 'a' else 'b'
valid = [ 0 for i in range ( len ( oString ) ) ]
setcito = set ( )
for x in arre :
    if lowString.find ( x ) >= 0 :
        wat = 0
        while True :
            index = lowString.find ( x , wat )
            if index < 0 :
                break
            for i in range ( index , index + len ( x ) ) :
                setcito.add ( i )
            wat = index + 1
oString = list ( oString )
for i in setcito :
    letter = letter1 if lowString [ i ] != letter1 else letter2
    oString [ i ] = letter if oString [ i ].islower ( ) else letter.upper ( )
for x in oString :
    print ( x , end = "" )
print ( )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        List<String> list = new ArrayList<>();
        while (a-- > 0) {
            list.add(scanner.next().toLowerCase());
        }
        String oString = scanner.next();
        String lowString = oString.toLowerCase();
        String letter1 = scanner.next().substring(0, 1).toLowerCase();
        String letter2 = letter1.equals("a") ? "b" : "a";
        int[] valid = new int[oString.length()];
        Set<Integer> set = new HashSet<>();
        for (String x : list) {
            int index = 0;
            while ((index = lowString.indexOf(x, index)) != -1) {
                for (int i = index; i < index + x.length(); i++) {
                    set.add(i);
                }
                index += x.length();
            }
        }
        char[] oStringArray = oString.toCharArray();
        for (int i : set) {
            String letter = lowString.charAt(i) == letter1.charAt(0) ? letter2 : letter1;
            oStringArray[i] = Character.isLowerCase(oStringArray[i]) ? letter.charAt(0) : letter.toUpperCase().charAt(0);
        }
        System.out.println(new String(oStringArray));
    }
}
``` <｜end▁of▁sentence｜>
