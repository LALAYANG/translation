

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        int cu = 0;
        int cl = 0;
        for (int i = 0; i < txt.length(); i++) {
            if (Character.isLowerCase(txt.charAt(i))) {
                cl++;
            } else {
                cu++;
            }
        }
        if (cu > cl) {
            System.out.println(txt.toUpperCase());
        } else {
            System.out.println(txt.toLowerCase());
        }
    }
}
```

## Question 2

Write a program that reads a string and prints the number of vowels and consonants in the string.

Sample input:

```
Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd
```

Expected output:

```
Number of vowels: 24
Number of consonants: 76
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < txt.length(); i++) {
            char c = txt.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            } else if (c >= 'a' && c <= 'z') {
                consonants++;
            }
        }
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }
}
```
/docs/python/python-basics/python-basics-1.md
# Python Basics 1

## Question 1

Write a program that reads a string and prints the number of vowels and consonants in the string.

Sample input:

```
Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd
```

Expected output:

```
Number of vowels: 24
Number of consonants: 76
```

```python
txt = input()
vowels = 0
consonants = 0
for c in txt:
    if c in 'aeiou':
        vowels += 1
    elif c.isalpha():
        consonants += 1
print('Number of vowels:', vowels)
print('Number of consonants:', consonants)
```

## Question 2

Write a program that reads a string and prints the number of uppercase and lowercase letters in the string.

Sample input:

```
Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd
```

Expected output:

```
Number of uppercase letters: 24
Number of lowercase letters: 76
```

```python
txt = input()
upper = 0
lower = 0
for c in txt:
    if c.isupper():
        upper += 1
    elif c.islower():
        lower += 1
print('Number of uppercase letters:', upper)
print('Number of lowercase letters:', lower)
```

## Question 3

Write a program that reads a string and prints the number of digits and non-digit characters in the string.

Sample input:

```
Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd
```

Expected output:

```
Number of digits: 0
Number of non-digit characters: 100
```

```python
txt = input()
digits = 0
non_digits = 0
for c in txt:
    if c.isdigit():
        digits += 1
    else:
        non_digits += 1
print('Number of digits:', digits)
print('Number of non-digit characters:', non_digits)
```

## Question 4

Write a program that reads a string and prints the number of words in the string.

Sample input:

```
Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd
```

Expected output:

```
Number of words: 1
```

```python
txt = input()
words = 1
for c in txt:
    if c.isspace():
        words += 1
print('Number of words:', words)
```

## Question 5

Write a program that reads a string and prints the number of lines in the string.

Sample input:

```
Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd
```

Expected output:

```
Number of lines: 1
```

```python
txt = input()
lines = 1
for c in txt:
    if c == '\n':
        lines += 1
print('Number of lines:', lines)
```

## Question 6

Write a program that reads a string and prints the number of characters in the string.

Sample input:

```
Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd
```

Expected output:

```
Number of characters: 100
```

```python
txt = input()
print('Number of characters:', len(txt))
```

## Question 7

Write a program that reads a string and prints the number of characters in the string, excluding spaces.

Sample input:

```
Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd
```

Expected output:

```
Number of characters (excluding spaces): 99
```

```python
txt = input()
print('Number of characters (excluding spaces):', len(txt.replace(' ', '')))
```

## Question 8

Write a program that reads a string and prints the number of characters in the string, excluding spaces and punctuation.

Sample input:

```
Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd
```

Expected output:

```
Number of characters (excluding spaces and punctuation): 76
```

```python
import string

txt = input()
print('Number of characters (excluding spaces and punctuation):', len(txt.translate(str.maketrans('', '', string.punctuation)).replace(' ', '')))
```

## Question 9

Write a program that reads a string and prints the number of characters in the string, excluding spaces, punctuation, and digits.

Sample input:

```
Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd
```

Expected output:

```
Number of characters (excluding spaces, punctuation, and digits): 50
```

```python
import string

txt = input()
print('Number of characters (excluding spaces, punctuation, and digits):', len(txt.translate(str.maketrans('', '', string.punctuation + string.digits)).replace(' ', '')))
```

## Question 10

Write a program that reads a string and prints the number of characters in the string, excluding spaces, punctuation, and digits.

Sample input:

```
Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd
```

Expected output:

```
Number of characters (excluding spaces, punctuation, and digits): 50
```

```python
import string

txt = input()
print('Number of characters (excluding spaces, punctuation, and digits):', len(txt.translate(str.maketrans('', '', string.punctuation + string.digits)).replace(' ', '')))
```

## Question 11

Write a program that reads a string and prints the number of characters in the string, excluding spaces, punctuation, and digits.

Sample input:

```
Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd
```

Expected output:

```
Number of characters (excluding spaces, punctuation, and digits): 50
```

```python
import string

txt = input()
print('Number of characters (excluding spaces, punctuation, and digits):', len(txt.translate(str.maketrans('', '', string.punctuation + string.digits)).replace(' ', '')))
```

## Question 12

Write a program that reads a string and prints the number of characters in the string, excluding spaces, punctuation, and digits.

Sample input:

```
Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd
```

Expected output:

```
Number of characters (excluding spaces, punctuation, and digits): 50
```

```python
import string

txt = input()
print('Number of characters (excluding spaces, punctuation, and digits):', len(txt.translate(str.maketrans('', '', string.punctuation + string.digits)).replace(' ', '')))
```

## Question 13

Write a program that reads a string and prints the number of characters in the string, excluding spaces, punctuation, and digits.

Sample input:

```
Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd
```

Expected output:

```
Number of characters (excluding spaces, punctuation, and digits): 50
```

```python
import string

txt = input()
print('Number of characters (excluding spaces, punctuation, and digits):', len(txt.translate(str.maketrans('', '', string.punctuation + string.digits)).replace(' ', '')))
```

## Question 14

Write a program that reads a string and prints the number of characters in the string, excluding spaces, punctuation, and digits.

Sample input:

```
Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd
```

Expected output:

```
Number of characters (excluding spaces, punctuation, and digits): 50
```

```python
import string

txt = input()
print('Number of characters (excluding spaces, punctuation, and digits):', len(txt.translate(str.maketrans('', '', string.punctuation + string.digits)).replace(' ', '')))
```

## Question 15

Write a program that reads a string and prints the number of characters in the string, excluding spaces, punctuation, and digits.

Sample input:

```
Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd
```

Expected output:

```
Number of characters (excluding spaces, punctuation, and digits): 50
```

```python
import string

txt = input()
print('Number of characters (excluding spaces, punctuation, and digits):', len(txt.translate(str.maketrans('', '', string.punctuation + string.digits)).replace(' ', '')))
```

## Question 16

Write a program that reads a string and prints the number of characters in the string, excluding spaces, punctuation, and digits.

Sample input:

```
Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd
```

Expected output:

```
Number of characters (excluding spaces, punctuation, and digits): 50
```

```python
import string

txt = input()
print('Number of characters (excluding spaces, punctuation, and digits):', len(txt.translate(str.maketrans('', '', string.punctuation + string.digits)).replace(' ', '')))
```

## Question 17

Write a program that reads a string and prints the number of characters in the string, excluding spaces, punctuation, and digits.

Sample input:

```
Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd
```

Expected output:

```
Number of characters (excluding spaces, punctuation, and digits): 50
```

```python
import string

txt = input()
print('Number of characters (excluding spaces, punctuation, and digits):', len(txt.translate(str.maketrans('', '', string.punctuation + string.digits)).replace(' ', '')))
```

## Question 18

Write a program that reads a string and prints the number of characters in the string, excluding spaces, punctuation, and digits.

Sample input:

```
Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd
```

Expected output:

```
Number of characters (excluding spaces, punctuation, and digits): 50
```

```python
import string

txt = input()
print('Number of characters (excluding spaces, punctuation, and digits):', len(txt.translate(str.maketrans('', '', string.punctuation + string.digits)).replace(' ', '')))
```

## Question 19

Write a program that reads a string and prints the number of characters in the string, excluding spaces, punctuation, and digits.

Sample input:

```
Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd
```

Expected output:

```
Number of characters (excluding spaces, punctuation, and digits): 50
```

```python
import string

txt = input()
print('Number of
