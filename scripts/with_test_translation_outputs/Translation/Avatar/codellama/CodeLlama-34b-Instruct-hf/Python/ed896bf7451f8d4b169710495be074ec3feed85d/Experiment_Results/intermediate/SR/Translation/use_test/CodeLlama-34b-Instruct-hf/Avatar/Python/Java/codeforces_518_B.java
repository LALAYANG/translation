<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
ncMeXssLHS
uwyeMcaFatpInZVdEYpwJQSnVxLK

Expected output:
6 1


```
s , t = input ( ) , input ( )
freqs = dict ( )
freqt = dict ( )
yay , whoops = 0 , 0
for letra in s :
    if letra in freqs :
        freqs [ letra ] += 1
    else :
        freqs [ letra ] = 1
for letra in t :
    if letra in freqt :
        freqt [ letra ] += 1
    else :
        freqt [ letra ] = 1
for letra in freqs.keys ( ) :
    while ( freqs [ letra ] > 0 and letra in freqt and freqt [ letra ] > 0 ) :
        yay += 1
        freqs [ letra ] -= 1
        freqt [ letra ] -= 1
for letra in freqs.keys ( ) :
    while ( freqs [ letra ] > 0 ) :
        if letra.islower ( ) and letra.upper ( ) in freqt.keys ( ) and freqt [ letra.upper ( ) ] > 0 :
            whoops += 1
            freqs [ letra ] -= 1
            freqt [ letra.upper ( ) ] -= 1
        elif letra.isupper ( ) and letra.lower ( ) in freqt.keys ( ) and freqt [ letra.lower ( ) ] > 0 :
            whoops += 1
            freqs [ letra ] -= 1
            freqt [ letra.lower ( ) ] -= 1
        else :
            break ;
print ( yay , whoops )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        int yay = 0;
        int whoops = 0;

        // Create a dictionary to store the frequency of each letter in s
        HashMap<Character, Integer> freqs = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (freqs.containsKey(c)) {
                freqs.put(c, freqs.get(c) + 1);
            } else {
                freqs.put(c, 1);
            }
        }

        // Create a dictionary to store the frequency of each letter in t
        HashMap<Character, Integer> freqt = new HashMap<>();
        for (char c : t.toCharArray()) {
            if (freqt.containsKey(c)) {
                freqt.put(c, freqt.get(c) + 1);
            } else {
                freqt.put(c, 1);
            }
        }

        // Iterate through the letters in s and t and compare their frequencies
        for (char c : freqs.keySet()) {
            while (freqs.get(c) > 0 && freqt.containsKey(c) && freqt.get(c) > 0) {
                yay++;
                freqs.put(c, freqs.get(c) - 1);
                freqt.put(c, freqt.get(c) - 1);
            }
        }

        // Iterate through the letters in s and t and compare their frequencies
        for (char c : freqs.keySet()) {
            while (freqs.get(c) > 0) {
                if (Character.isLowerCase(c) && freqt.containsKey(Character.toUpperCase(c)) && freqt.get(Character.toUpperCase(c)) > 0) {
                    whoops++;
                    freqs.put(c, freqs.get(c) - 1);
                    freqt.put(Character.toUpperCase(c), freqt.get(Character.toUpperCase(c)) - 1);
                } else if (Character.isUpperCase(c) && freqt.containsKey(Character.toLowerCase(c)) && freqt.get(Character.toLowerCase(c)) > 0) {
                    whoops++;
                    freqs.put(c, freqs.get(c) - 1);
                    freqt.put(Character.toLowerCase(c), freqt.get(Character.toLowerCase(c)) - 1);
                } else {
                    break;
                }
            }
        }

        System.out.println(yay + " " + whoops);
    }
}
```
Note: This code uses the `HashMap` class from the Java Collections Framework to store the frequency of each letter in the input strings. The `HashMap` class is a hash table that maps keys to values, and it provides constant-time lookup, insertion, and deletion operations. In this case, we use the `HashMap` class to store the frequency of each letter in the input strings, and we use the `containsKey` method to check if a letter is present in the `HashMap`.</s>
