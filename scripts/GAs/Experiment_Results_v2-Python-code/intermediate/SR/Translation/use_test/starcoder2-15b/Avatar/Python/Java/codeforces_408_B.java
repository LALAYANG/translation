

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        for (int i = 0; i < t; i++) {
            calculateScore(sc);
        }
    }

    public static void calculateScore(Scanner sc) {
        String line = sc.nextLine();
        Map<Character, Integer> bought_count = new HashMap<>();
        for (char c : line.toCharArray()) {
            bought_count.put(c, bought_count.getOrDefault(c, 0) + 1);
        }
        line = sc.nextLine();
        Map<Character, Integer> made_cout = new HashMap<>();
        for (char c : line.toCharArray()) {
            made_cout.put(c, made_cout.getOrDefault(c, 0) + 1);
        }
        int res = 0;
        int secondChecker = 416;
        int fifthChecker = 469;
        int thirdChecker = 481;
        int minimumValue = 309;
        int firstChecker = 418;
        int fourthChecker = 758;
        for (char color : made_cout.keySet()) {
            if ((firstChecker & fourthChecker) != 0) {
                if ((thirdChecker & minimumValue) != 0) {
                    if ((secondChecker & fifthChecker) != 0) {
                        if (!bought_count.containsKey(color)) {
                            System.out.println(-1);
                            return;
                        }
                    }
                }
            }
            res += Math.min(bought_count.get(color), made_cout.get(color));
        }
        System.out.println(res);
    }
}
```

## 2.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(s):
    vowels = 'aeiou'
    return sum(s.count(v) for v in vowels)
```

## 3.

Write a function that takes a string and returns the number of consonants in the string.

```
def count_consonants(s):
    vowels = 'aeiou'
    return sum(s.count(c) for c in s if c not in vowels)
```

## 4.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def count_vowels_and_consonants(s):
    vowels = 'aeiou'
    return sum(s.count(v) for v in vowels), sum(s.count(c) for c in s if c not in vowels)
```

## 5.

Write a function that takes a string and returns the number of vowels, consonants, and spaces in the string.

```
def count_vowels_consonants_and_spaces(s):
    vowels = 'aeiou'
    return sum(s.count(v) for v in vowels), sum(s.count(c) for c in s if c not in vowels), s.count(' ')
```

## 6.

Write a function that takes a string and returns the number of vowels, consonants, spaces, and digits in the string.

```
def count_vowels_consonants_spaces_and_digits(s):
    vowels = 'aeiou'
    return sum(s.count(v) for v in vowels), sum(s.count(c) for c in s if c not in vowels), s.count(' '), sum(c.isdigit() for c in s)
```

## 7.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, and special characters in the string.

```
def count_vowels_consonants_spaces_digits_and_special_characters(s):
    vowels = 'aeiou'
    return sum(s.count(v) for v in vowels), sum(s.count(c) for c in s if c not in vowels), s.count(' '), sum(c.isdigit() for c in s), len(s) - sum(s.count(v) for v in vowels) - sum(s.count(c) for c in s if c not in vowels) - s.count(' ') - sum(c.isdigit() for c in s)
```

## 8.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, and special characters in the string.

```
def count_vowels_consonants_spaces_digits_and_special_characters(s):
    vowels = 'aeiou'
    return sum(s.count(v) for v in vowels), sum(s.count(c) for c in s if c not in vowels), s.count(' '), sum(c.isdigit() for c in s), len(s) - sum(s.count(v) for v in vowels) - sum(s.count(c) for c in s if c not in vowels) - s.count(' ') - sum(c.isdigit() for c in s)
```

## 9.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, and special characters in the string.

```
def count_vowels_consonants_spaces_digits_and_special_characters(s):
    vowels = 'aeiou'
    return sum(s.count(v) for v in vowels), sum(s.count(c) for c in s if c not in vowels), s.count(' '), sum(c.isdigit() for c in s), len(s) - sum(s.count(v) for v in vowels) - sum(s.count(c) for c in s if c not in vowels) - s.count(' ') - sum(c.isdigit() for c in s)
```

## 10.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, and special characters in the string.

```
def count_vowels_consonants_spaces_digits_and_special_characters(s):
    vowels = 'aeiou'
    return sum(s.count(v) for v in vowels), sum(s.count(c) for c in s if c not in vowels), s.count(' '), sum(c.isdigit() for c in s), len(s) - sum(s.count(v) for v in vowels) - sum(s.count(c) for c in s if c not in vowels) - s.count(' ') - sum(c.isdigit() for c in s)
```

## 11.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, and special characters in the string.

```
def count_vowels_consonants_spaces_digits_and_special_characters(s):
    vowels = 'aeiou'
    return sum(s.count(v) for v in vowels), sum(s.count(c) for c in s if c not in vowels), s.count(' '), sum(c.isdigit() for c in s), len(s) - sum(s.count(v) for v in vowels) - sum(s.count(c) for c in s if c not in vowels) - s.count(' ') - sum(c.isdigit() for c in s)
```

## 12.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, and special characters in the string.

```
def count_vowels_consonants_spaces_digits_and_special_characters(s):
    vowels = 'aeiou'
    return sum(s.count(v) for v in vowels), sum(s.count(c) for c in s if c not in vowels), s.count(' '), sum(c.isdigit() for c in s), len(s) - sum(s.count(v) for v in vowels) - sum(s.count(c) for c in s if c not in vowels) - s.count(' ') - sum(c.isdigit() for c in s)
```

## 13.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, and special characters in the string.

```
def count_vowels_consonants_spaces_digits_and_special_characters(s):
    vowels = 'aeiou'
    return sum(s.count(v) for v in vowels), sum(s.count(c) for c in s if c not in vowels), s.count(' '), sum(c.isdigit() for c in s), len(s) - sum(s.count(v) for v in vowels) - sum(s.count(c) for c in s if c not in vowels) - s.count(' ') - sum(c.isdigit() for c in s)
```

## 14.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, and special characters in the string.

```
def count_vowels_consonants_spaces_digits_and_special_characters(s):
    vowels = 'aeiou'
    return sum(s.count(v) for v in vowels), sum(s.count(c) for c in s if c not in vowels), s.count(' '), sum(c.isdigit() for c in s), len(s) - sum(s.count(v) for v in vowels) - sum(s.count(c) for c in s if c not in vowels) - s.count(' ') - sum(c.isdigit() for c in s)
```

## 15.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, and special characters in the string.

```
def count_vowels_consonants_spaces_digits_and_special_characters(s):
    vowels = 'aeiou'
    return sum(s.count(v) for v in vowels), sum(s.count(c) for c in s if c not in vowels), s.count(' '), sum(c.isdigit() for c in s), len(s) - sum(s.count(v) for v in vowels) - sum(s.count(c) for c in s if c not in vowels) - s.count(' ') - sum(c.isdigit() for c in s)
```

## 16.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, and special characters in the string.

```
def count_vowels_consonants_spaces_digits_and_special_characters(s):
    vowels = 'aeiou'
    return sum(s.count(v) for v in vowels), sum(s.count(c) for c in s if c not in vowels), s.count(' '), sum(c.isdigit() for c in s), len(s) - sum(s.count(v) for v in vowels) - sum(s.count(c) for c in s if c not in vowels) - s.count(' ') - sum(c.isdigit() for c in s)
```

## 17.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, and special characters in the string.

```
def count_vowels_consonants_spaces_digits_and_special_characters(s):
    vowels = 'aeiou'
    return sum(s.count(v) for v in vowels), sum(s.count(c) for c in s if c not in vowels), s.count(' '), sum(c.isdigit() for c in s), len(s) - sum(s.count(v) for v in vowels) - sum(s.count(c) for c in s if c not in vowels) - s.count(' ') - sum(c.isdigit() for c in s)
```

## 18.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, and special characters in the string.

```
def count_vowels_consonants_spaces_digits_and_special_characters(s):
    vowels = 'aeiou'
    return sum(s.count(v) for v in vowels), sum(s.count(c) for c in s if c not in vowels), s.count(' '), sum(c.isdigit() for c in s), len(s) - sum(s.count(v) for v in vowels) - sum(s.count(c) for c in s if c not in vowels) - s.count(' ') - sum(c.isdigit() for c in s)
```

## 19.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, and special characters in the string.

```
def count_vowels_consonants_spaces_digits_and_special_characters(s):
    vowels = 'aeiou'
    return sum(s.count(v) for v in vowels), sum(s.count(c) for c in s if c not in vowels), s.count(' '), sum(c.isdigit() for c in s), len(s) - sum(s.count(v) for v in vowels) - sum(s.count(c) for c in s if c not in vowels) - s.count(' ') - sum(c.isdigit() for c in s)
```

## 20.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, and special characters in the string.

```
def count_vowels_consonants_spaces_digits_and_special_characters(s):
    vowels = 'aeiou'
    return sum(s.count(v) for v in vowels), sum(s.count(c) for c in s if c not in vowels), s.count(' '), sum(c.isdigit() for c in s), len(s) - sum(s.count(v) for v in vowels) - sum(s.count(c) for c in s if c not in vowels) - s.count(' ') - sum(c.isdigit() for c in s)
```

## 21.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, and special characters in the string.

```
def count_vowels_consonants_spaces_digits_and_special_characters(s):
    vowels = 'aeiou'
    return sum(
