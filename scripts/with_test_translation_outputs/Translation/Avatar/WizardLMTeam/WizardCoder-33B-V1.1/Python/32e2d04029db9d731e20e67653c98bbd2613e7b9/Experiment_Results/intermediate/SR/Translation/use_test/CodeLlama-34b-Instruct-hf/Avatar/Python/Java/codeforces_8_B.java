<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
ULD

Expected output:
BUG


```
record_of_movements = input ( )
x , y = 0 , 0
d_movement = { 'L' : ( 0 , - 1 ) , 'R' : ( 0 , 1 ) , 'U' : ( 1 , 0 ) , 'D' : ( - 1 , 0 ) }
d = { ( x , y ) : '' }
bug = False
for move in record_of_movements :
    temp = ( x , y )
    x += d_movement [ move ] [ 0 ]
    y += d_movement [ move ] [ 1 ]
    if ( x , y ) not in d :
        for step in d_movement :
            if ( x + d_movement [ step ] [ 0 ] , y + d_movement [ step ] [ 1 ] ) != temp and ( x + d_movement [ step ] [ 0 ] , y + d_movement [ step ] [ 1 ] ) in d :
                bug = True
                break
    else :
        bug = True
    if bug :
        break
    d [ x , y ] = ''
if bug :
    print ( 'BUG' )
else :
    print ( 'OK' )


```
[/INST]
```java
import java.util.Scanner;

public class BugFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String recordOfMovements = scanner.nextLine();
        int x = 0, y = 0;
        Map<Character, int[]> dMovement = new HashMap<>();
        dMovement.put('L', new int[] {0, -1});
        dMovement.put('R', new int[] {0, 1});
        dMovement.put('U', new int[] {1, 0});
        dMovement.put('D', new int[] {-1, 0});
        Map<String, Boolean> d = new HashMap<>();
        d.put("", false);
        boolean bug = false;
        for (char move : recordOfMovements.toCharArray()) {
            int[] temp = new int[] {x, y};
            x += dMovement.get(move)[0];
            y += dMovement.get(move)[1];
            if (!d.containsKey(x + "," + y)) {
                for (char step : dMovement.keySet()) {
                    if (x + dMovement.get(step)[0] != temp[0] && y + dMovement.get(step)[1] != temp[1] && d.containsKey(x + dMovement.get(step)[0] + "," + y + dMovement.get(step)[1])) {
                        bug = true;
                        break;
                    }
                }
            } else {
                bug = true;
            }
            if (bug) {
                break;
            }
            d.put(x + "," + y, false);
        }
        if (bug) {
            System.out.println("BUG");
        } else {
            System.out.println("OK");
        }
    }
}
```
Note: The above code uses Java 8 features, so it requires at least Java 8 to run.</s>
