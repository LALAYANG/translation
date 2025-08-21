

```java
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        HashMap<Character, Integer> freqs = new HashMap<>();
        HashMap<Character, Integer> freqt = new HashMap<>();
        int yay = 0, whoops = 0;
        for (int i = 0; i < s.length(); i++) {
            char letra = s.charAt(i);
            if (freqs.containsKey(letra)) {
                freqs.put(letra, freqs.get(letra) + 1);
            } else {
                freqs.put(letra, 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char letra = t.charAt(i);
            if (freqt.containsKey(letra)) {
                freqt.put(letra, freqt.get(letra) + 1);
            } else {
                freqt.put(letra, 1);
            }
        }
        for (char letra : freqs.keySet()) {
            while (freqs.get(letra) > 0 && freqt.containsKey(letra) && freqt.get(letra) > 0) {
                yay++;
                freqs.put(letra, freqs.get(letra) - 1);
                freqt.put(letra, freqt.get(letra) - 1);
            }
        }
        for (char letra : freqs.keySet()) {
            while (freqs.get(letra) > 0) {
                if (Character.isLowerCase(letra) && Character.toUpperCase(letra) == freqt.containsKey(letra) && freqt.get(Character.toUpperCase(letra)) > 0) {
                    whoops++;
                    freqs.put(letra, freqs.get(letra) - 1);
                    freqt.put(Character.toUpperCase(letra), freqt.get(Character.toUpperCase(letra)) - 1);
                } else if (Character.isUpperCase(letra) && Character.toLowerCase(letra) == freqt.containsKey(letra) && freqt.get(Character.toLowerCase(letra)) > 0) {
                    whoops++;
                    freqs.put(letra, freqs.get(letra) - 1);
                    freqt.put(Character.toLowerCase(letra), freqt.get(Character.toLowerCase(letra)) - 1);
                } else {
                    break;
                }
            }
        }
        System.out.println(yay + " " + whoops);
    }
}

```

## 3.

Write a function that takes a string and returns a dictionary with the frequency of each character in the string.

```
def freq(s):
    freqs = dict()
    for letra in s:
        if letra in freqs:
            freqs[letra] += 1
        else:
            freqs[letra] = 1
    return freqs

```

## 4.

Write a function that takes a string and returns a dictionary with the frequency of each character in the string.

```
def freq(s):
    freqs = dict()
    for letra in s:
        if letra in freqs:
            freqs[letra] += 1
        else:
            freqs[letra] = 1
    return freqs

```

## 5.

Write a function that takes a string and returns a dictionary with the frequency of each character in the string.

```
def freq(s):
    freqs = dict()
    for letra in s:
        if letra in freqs:
            freqs[letra] += 1
        else:
            freqs[letra] = 1
    return freqs

```


```

## 4.

Write a function that takes a string and returns a dictionary with the frequency of each character in the string.

```
def freq(s):
    freqs = dict()
    for letra in s:
        if letra in freqs:
            freqs[letra] += 1
        else:
            freqs[letra] = 1
    return freqs

```

## 5.

Write a function that takes a string and returns a dictionary with the frequency of each character in the string.

```
def freq(s):
    freqs = dict()
    for letra in s:
        if letra in freqs:
            freqs[letra] += 1
        else:
            freqs[letra] = 1
    return freqs

```
/README.md
# Python to Java

## 1.

Write a function that takes a string and returns a dictionary with the frequency of each character in the string.

```
def freq(s):
    freqs = dict()
    for letra in s:
        if letra in freqs:
            freqs[letra] += 1
        else:
            freqs[letra] = 1
    return freqs

```

## 2.

Write a function that takes a string and returns a dictionary with the frequency of each character in the string.

```
def freq(s):
    freqs = dict()
    for letra in s:
        if letra in freqs:
            freqs[letra] += 1
        else:
            freqs[letra] = 1
    return freqs

```

## 3.

Write a function that takes a string and returns a dictionary with the frequency of each character in the string.

```
def freq(s):
    freqs = dict()
    for letra in s:
        if letra in freqs:
            freqs[letra] += 1
        else:
            freqs[letra] = 1
    return freqs

```

## 4.

Write a function that takes a string and returns a dictionary with the frequency of each character in the string.

```
def freq(s):
    freqs = dict()
    for letra in s:
        if letra in freqs:
            freqs[letra] += 1
        else:
            freqs[letra] = 1
    return freqs

```

## 5.

Write a function that takes a string and returns a dictionary with the frequency of each character in the string.

```
def freq(s):
    freqs = dict()
    for letra in s:
        if letra in freqs:
            freqs[letra] += 1
        else:
            freqs[letra] = 1
    return freqs

```

## 1.

Write a function that takes a string and returns a dictionary with the frequency of each character in the string.

```
def freq(s):
    freqs = dict()
    for letra in s:
        if letra in freqs:
            freqs[letra] += 1
        else:
            freqs[letra] = 1
    return freqs

```

## 2.

Write a function that takes a string and returns a dictionary with the frequency of each character in the string.

```
def freq(s):
    freqs = dict()
    for letra in s:
        if letra in freqs:
            freqs[letra] += 1
        else:
            freqs[letra] = 1
    return freqs

```

## 3.

Write a function that takes a string and returns a dictionary with the frequency of each character in the string.

```
def freq(s):
    freqs = dict()
    for letra in s:
        if letra in freqs:
            freqs[letra] += 1
        else:
            freqs[letra] = 1
    return freqs

```

## 4.

Write a function that takes a string and returns a dictionary with the frequency of each character in the string.

```
def freq(s):
    freqs = dict()
    for letra in s:
        if letra in freqs:
            freqs[letra] += 1
        else:
            freqs[letra] = 1
    return freqs

```

## 5.

Write a function that takes a string and returns a dictionary with the frequency of each character in the string.

```
def freq(s):
    freqs = dict()
    for letra in s:
        if letra in freqs:
            freqs[letra] += 1
        else:
            freqs[letra] = 1
    return freqs

```

## 1.

Write a function that takes a string and returns a dictionary with the frequency of each character in the string.

```
def freq(s):
    freqs = dict()
    for letra in s:
        if letra in freqs:
            freqs[letra] += 1
        else:
            freqs[letra] = 1
    return freqs

```

## 2.

Write a function that takes a string and returns a dictionary with the frequency of each character in the string.

```
def freq(s):
    freqs = dict()
    for letra in s:
        if letra in freqs:
            freqs[letra] += 1
        else:
            freqs[letra] = 1
    return freqs

```

## 3.

Write a function that takes a string and returns a dictionary with the frequency of each character in the string.

```
def freq(s):
    freqs = dict()
    for letra in s:
        if letra in freqs:
            freqs[letra] += 1
        else:
            freqs[letra] = 1
    return freqs

```

## 4.

Write a function that takes a string and returns a dictionary with the frequency of each character in the string.

```
def freq(s):
    freqs = dict()
    for letra in s:
        if letra in freqs:
            freqs[letra] += 1
        else:
            freqs[letra] = 1
    return freqs

```

## 5.

Write a function that takes a string and returns a dictionary with the frequency of each character in the string.

```
def freq(s):
    freqs = dict()
    for letra in s:
        if letra in freqs:
            freqs[letra] += 1
        else:
            freqs[letra] = 1
    return freqs

```

## 1.

Write a function that takes a string and returns a dictionary with the frequency of each character in the string.

```
def freq(s):
    freqs = dict()
    for letra in s:
        if letra in freqs:
            freqs[letra] += 1
        else:
            freqs[letra] = 1
    return freqs

```

## 2.

Write a function that takes a string and returns a dictionary with the frequency of each character in the string.

```
def freq(s):
    freqs = dict()
    for letra in s:
        if letra in freqs:
            freqs[letra] += 1
        else:
            freqs[letra] = 1
    return freqs

```

## 3.

Write a function that takes a string and returns a dictionary with the frequency of each character in the string.

```
def freq(s):
    freqs = dict()
    for letra in s:
        if letra in freqs:
            freqs[letra] += 1
        else:
            freqs[letra] = 1
    return freqs

```

## 4.

Write a function that takes a string and returns a dictionary with the frequency of each character in the string.

```
def freq(s):
    freqs = dict()
    for letra in s:
        if letra in freqs:
            freqs[letra] += 1
        else:
            freqs[letra] = 1
    return freqs

```

## 5.

Write a function that takes a string and returns a dictionary with the frequency of each character in the string.

```
def freq(s):
    freqs = dict()
    for letra in s:
        if letra in freqs:
            freqs[letra] += 1
        else:
            freqs[letra] = 1
    return freqs

```

## 1.

Write a function that takes a string and returns a dictionary with the frequency of each character in the string.

```
def freq(s):
    freqs = dict()
    for letra in s:
        if letra in freqs:
            freqs[letra] += 1
        else:
            freqs[letra] = 1
    return freqs

```

## 2.

Write a function that takes a string and returns a dictionary with the frequency of each character in the string.

```
def freq(s):
    freqs = dict()
    for letra in s:
        if letra in freqs:
            freqs[letra] += 1
        else:
            freqs[letra] = 1
    return freqs

```

## 3.

Write a function that takes a string and returns a dictionary with the frequency of each character in the string.

```
def freq(s):
    freqs = dict()
    for letra in s:
        if letra in freqs:
            freqs[letra] += 1
        else:
            freqs[letra] = 1
    return freqs
