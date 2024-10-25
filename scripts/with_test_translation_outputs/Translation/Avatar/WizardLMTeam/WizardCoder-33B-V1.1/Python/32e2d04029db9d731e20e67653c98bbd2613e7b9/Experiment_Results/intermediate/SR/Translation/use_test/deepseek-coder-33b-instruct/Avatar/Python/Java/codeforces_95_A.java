<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

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
        int pya = scanner.nextInt();
        scanner.nextLine();
        List<String> arre = new ArrayList<>();
        while (pya > 0) {
            pya--;
            arre.add(scanner.nextLine().toLowerCase());
        }
        String oString = scanner.nextLine();
        String lowString = oString.toLowerCase();
        String letter1 = scanner.nextLine().toLowerCase().substring(0, 1);
        String letter2 = "a".equals(letter1) ? "b" : "a";
        int[] valid = new int[oString.length()];
        Set<Integer> setcito = new HashSet<>();
        for (String x : arre) {
            int wat = 0;
            while (true) {
                int index = lowString.indexOf(x, wat);
                if (index < 0) {
                    break;
                }
                for (int i = index; i < index + x.length(); i++) {
                    setcito.add(i);
                }
                wat = index + 1;
            }
        }
        char[] oStringArray = oString.toCharArray();
        for (int i : setcito) {
            String letter = lowString.charAt(i) != letter1.charAt(0) ? letter1 : letter2;
            oStringArray[i] = Character.isLowerCase(oStringArray[i]) ? letter.charAt(0) : letter.toUpperCase().charAt(0);
        }
        System.out.println(new String(oStringArray));
    }
}
```
<|EOT|>
