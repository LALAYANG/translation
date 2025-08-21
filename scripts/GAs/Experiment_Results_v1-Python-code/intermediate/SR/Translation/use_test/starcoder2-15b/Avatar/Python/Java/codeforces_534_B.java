

```java
import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        int Newton = sc.nextInt();
        int d = sc.nextInt();
        int a = 1;
        int v = v1;
        int distance = 0;
        int FirstCondition = 340;
        int SecondCondition = 941;
        int OuterLoopCounter = 107;
        int InnerLoopCounter = 106;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopCounter / InnerLoopCounter; LoopIndexOut++) {
            RecursiveLoop(0, Newton, 1);
        }
        System.out.println(distance);
    }

    public static void RecursiveLoop(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (FirstCondition & SecondCondition) {
            if (v - v2 > (Newton - i - 1) * d) {
                a *= -1;
                v = (Newton - i - 1) * d + v2;
            }
        }
        distance = distance + v;
        v += a * d;
        RecursiveLoop(i + step, stop, step);
    }
}
```

## 2.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_list(items):
    sum_numbers = 0
    for x in items:
        sum_numbers += x
    return sum_numbers
print(sum_list([1,2,-8]))
```

## 3.

Write a function that takes a list and returns a new list with unique elements of the first list.

```
def unique_list(l):
  x = []
  for a in l:
    if a not in x:
      x.append(a)
  return x

print(unique_list([1,2,3,3,3,3,4,5]))
```

## 4.

Write a function that takes a string and returns a new string with all the
vowels removed.

```
def remove_vowels(string):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in string.lower():
        if x in vowels:
            string = string.replace(x, "")
    return string

print(remove_vowels("Hello World!"))
```

## 5.

Write a function that takes a string and returns a new string with all the
consonants removed.

```
def remove_consonants(string):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in string.lower():
        if x not in vowels:
            string = string.replace(x, "")
    return string

print(remove_consonants("Hello World!"))
```

## 6.

Write a function that takes a string and returns a new string with all the
vowels removed and all the consonants doubled.

```
def double_consonants(string):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in string.lower():
        if x not in vowels:
            string = string.replace(x, x*2)
    return string

print(double_consonants("Hello World!"))
```

## 7.

Write a function that takes a string and returns a new string with all the
consonants removed and all the vowels doubled.

```
def double_vowels(string):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in string.lower():
        if x in vowels:
            string = string.replace(x, x*2)
    return string

print(double_vowels("Hello World!"))
```

## 8.

Write a function that takes a string and returns a new string with all the
consonants removed and all the vowels doubled.

```
def double_vowels(string):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in string.lower():
        if x in vowels:
            string = string.replace(x, x*2)
    return string

print(double_vowels("Hello World!"))
```

## 9.

Write a function that takes a string and returns a new string with all the
consonants removed and all the vowels doubled.

```
def double_vowels(string):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in string.lower():
        if x in vowels:
            string = string.replace(x, x*2)
    return string

print(double_vowels("Hello World!"))
```

## 10.

Write a function that takes a string and returns a new string with all the
consonants removed and all the vowels doubled.

```
def double_vowels(string):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in string.lower():
        if x in vowels:
            string = string.replace(x, x*2)
    return string

print(double_vowels("Hello World!"))
```

## 11.

Write a function that takes a string and returns a new string with all the
consonants removed and all the vowels doubled.

```
def double_vowels(string):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in string.lower():
        if x in vowels:
            string = string.replace(x, x*2)
    return string

print(double_vowels("Hello World!"))
```

## 12.

Write a function that takes a string and returns a new string with all the
consonants removed and all the vowels doubled.

```
def double_vowels(string):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in string.lower():
        if x in vowels:
            string = string.replace(x, x*2)
    return string

print(double_vowels("Hello World!"))
```

## 13.

Write a function that takes a string and returns a new string with all the
consonants removed and all the vowels doubled.

```
def double_vowels(string):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in string.lower():
        if x in vowels:
            string = string.replace(x, x*2)
    return string

print(double_vowels("Hello World!"))
```

## 14.

Write a function that takes a string and returns a new string with all the
consonants removed and all the vowels doubled.

```
def double_vowels(string):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in string.lower():
        if x in vowels:
            string = string.replace(x, x*2)
    return string

print(double_vowels("Hello World!"))
```

## 15.

Write a function that takes a string and returns a new string with all the
consonants removed and all the vowels doubled.

```
def double_vowels(string):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in string.lower():
        if x in vowels:
            string = string.replace(x, x*2)
    return string

print(double_vowels("Hello World!"))
```

## 16.

Write a function that takes a string and returns a new string with all the
consonants removed and all the vowels doubled.

```
def double_vowels(string):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in string.lower():
        if x in vowels:
            string = string.replace(x, x*2)
    return string

print(double_vowels("Hello World!"))
```

## 17.

Write a function that takes a string and returns a new string with all the
consonants removed and all the vowels doubled.

```
def double_vowels(string):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in string.lower():
        if x in vowels:
            string = string.replace(x, x*2)
    return string

print(double_vowels("Hello World!"))
```

## 18.

Write a function that takes a string and returns a new string with all the
consonants removed and all the vowels doubled.

```
def double_vowels(string):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in string.lower():
        if x in vowels:
            string = string.replace(x, x*2)
    return string

print(double_vowels("Hello World!"))
```

## 19.

Write a function that takes a string and returns a new string with all the
consonants removed and all the vowels doubled.

```
def double_vowels(string):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in string.lower():
        if x in vowels:
            string = string.replace(x, x*2)
    return string

print(double_vowels("Hello World!"))
```

## 20.

Write a function that takes a string and returns a new string with all the
consonants removed and all the vowels doubled.

```
def double_vowels(string):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in string.lower():
        if x in vowels:
            string = string.replace(x, x*2)
    return string

print(double_vowels("Hello World!"))
```

## 21.

Write a function that takes a string and returns a new string with all the
consonants removed and all the vowels doubled.

```
def double_vowels(string):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in string.lower():
        if x in vowels:
            string = string.replace(x, x*2)
    return string

print(double_vowels("Hello World!"))
```

## 22.

Write a function that takes a string and returns a new string with all the
consonants removed and all the vowels doubled.

```
def double_vowels(string):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in string.lower():
        if x in vowels:
            string = string.replace(x, x*2)
    return string

print(double_vowels("Hello World!"))
```

## 23.

Write a function that takes a string and returns a new string with all the
consonants removed and all the vowels doubled.

```
def double_vowels(string):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in string.lower():
        if x in vowels:
            string = string.replace(x, x*2)
    return string

print(double_vowels("Hello World!"))
```

## 24.

Write a function that takes a string and returns a new string with all the
consonants removed and all the vowels doubled.

```
def double_vowels(string):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in string.lower():
        if x in vowels:
            string = string.replace(x, x*2)
    return string

print(double_vowels("Hello World!"))
```

## 25.

Write a function that takes a string and returns a new string with all the
consonants removed and all the vowels doubled.

```
def double_vowels(string):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in string.lower():
        if x in vowels:
            string = string.replace(x, x*2)
    return string

print(double_vowels("Hello World!"))
```

## 26.

Write a function that takes a string and returns a new string with all the
consonants removed and all the vowels doubled.

```
def double_vowels(string):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in string.lower():
        if x in vowels:
            string = string.replace(x, x*2)
    return string

print(double_vowels("Hello World!"))
```

## 27.

Write a function that takes a string and returns a new string with all the
consonants removed and all the vowels doubled.

```
def double_vowels(string):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in string.lower():
        if x in vowels:
            string = string.replace(x, x*2)
    return string

print(double_vowels("Hello World!"))
```

## 28.

Write a function that takes a string and returns a new string with all the
consonants removed and all the vowels doubled.

```
def double_vowels(string):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in string.lower():
        if x in vowels:
            string = string.replace(x, x*2)
    return string

print(double_vowels("Hello World!"))
```

## 29.

Write a function that takes a string and returns a new string with all the
consonants removed and all the vowels doubled.

```
def double_vowels(string):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in string.lower():
        if x in vowels:
            string = string.replace(x, x*2)
    return string

print(double_vowels("Hello World!"))
```

## 30.

Write a function that takes a string and returns a new string with all the
consonants removed and all the vowels doubled.

```
def double_vowels(string):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in string.lower():
        if x in vowels:
            string = string.replace(x, x*2)
    return string

print(double_vowels("Hello World!"))
```

## 31.

Write a function that takes a string and
