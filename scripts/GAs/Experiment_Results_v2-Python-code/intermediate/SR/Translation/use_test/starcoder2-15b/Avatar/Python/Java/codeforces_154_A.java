

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String news = sc.nextLine();
        int n = sc.nextInt();
        int ans = 0;
        int checker_two = 395;
        int checker_one = 753;
        for (int i = 0; i < n; i++) {
            String x = sc.next();
            int a = 0, b = 0;
            for (int j = 0; j < news.length(); j++) {
                if ((checker_two & checker_one) != 0) {
                    if (news.charAt(j) == x.charAt(0)) {
                        a++;
                    } else if (news.charAt(j) == x.charAt(1)) {
                        b++;
                    } else {
                        ans += Math.min(a, b);
                        a = 0;
                        b = 0;
                    }
                }
            }
            ans += Math.min(a, b);
        }
        System.out.println(ans);
    }
}
```

## 2.

Write a function that takes a string and returns the number of vowels in the string.

```
def vowel_count(string):
    vowels = "aeiou"
    count = 0
    for i in string:
        if i in vowels:
            count += 1
    return count
```

## 3.

Write a function that takes a string and returns the number of consonants in the string.

```
def consonant_count(string):
    vowels = "aeiou"
    count = 0
    for i in string:
        if i not in vowels:
            count += 1
    return count
```

## 4.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    count = 0
    for i in string:
        if i in vowels:
            count += 1
    return count, len(string) - count
```

## 5.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    count = 0
    for i in string:
        if i in vowels:
            count += 1
    return count, len(string) - count
```

## 6.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    count = 0
    for i in string:
        if i in vowels:
            count += 1
    return count, len(string) - count
```

## 7.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    count = 0
    for i in string:
        if i in vowels:
            count += 1
    return count, len(string) - count
```

## 8.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    count = 0
    for i in string:
        if i in vowels:
            count += 1
    return count, len(string) - count
```

## 9.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    count = 0
    for i in string:
        if i in vowels:
            count += 1
    return count, len(string) - count
```

## 10.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    count = 0
    for i in string:
        if i in vowels:
            count += 1
    return count, len(string) - count
```

## 11.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    count = 0
    for i in string:
        if i in vowels:
            count += 1
    return count, len(string) - count
```

## 12.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    count = 0
    for i in string:
        if i in vowels:
            count += 1
    return count, len(string) - count
```

## 13.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    count = 0
    for i in string:
        if i in vowels:
            count += 1
    return count, len(string) - count
```

## 14.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    count = 0
    for i in string:
        if i in vowels:
            count += 1
    return count, len(string) - count
```

## 15.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    count = 0
    for i in string:
        if i in vowels:
            count += 1
    return count, len(string) - count
```

## 16.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    count = 0
    for i in string:
        if i in vowels:
            count += 1
    return count, len(string) - count
```

## 17.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    count = 0
    for i in string:
        if i in vowels:
            count += 1
    return count, len(string) - count
```

## 18.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    count = 0
    for i in string:
        if i in vowels:
            count += 1
    return count, len(string) - count
```

## 19.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    count = 0
    for i in string:
        if i in vowels:
            count += 1
    return count, len(string) - count
```

## 20.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    count = 0
    for i in string:
        if i in vowels:
            count += 1
    return count, len(string) - count
```

## 21.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    count = 0
    for i in string:
        if i in vowels:
            count += 1
    return count, len(string) - count
```

## 22.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    count = 0
    for i in string:
        if i in vowels:
            count += 1
    return count, len(string) - count
```

## 23.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    count = 0
    for i in string:
        if i in vowels:
            count += 1
    return count, len(string) - count
```

## 24.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    count = 0
    for i in string:
        if i in vowels:
            count += 1
    return count, len(string) - count
```

## 25.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    count = 0
    for i in string:
        if i in vowels:
            count += 1
    return count, len(string) - count
```

## 26.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    count = 0
    for i in string:
        if i in vowels:
            count += 1
    return count, len(string) - count
```

## 27.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    count = 0
    for i in string:
        if i in vowels:
            count += 1
    return count, len(string) - count
```

## 28.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    count = 0
    for i in string:
        if i in vowels:
            count += 1
    return count, len(string) - count
```

## 29.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    count = 0
    for i in string:
        if i in vowels:
            count += 1
    return count, len(string) - count
```

## 30.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    count = 0
    for i in string:
        if i in vowels:
            count += 1
    return count, len(string) - count
```

## 31.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    count = 0
    for i in string:
        if i in vowels:
            count += 1
    return count, len(string) - count
```

## 32.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    count = 0
    for i in string:
        if i in vowels:
            count += 1
    return count, len(string) - count
```

## 33.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    count = 0
    for i in string:
        if i in vowels:
            count += 1
    return count, len(string) - count
```

## 34.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    count = 0
    for i in string:
        if i in vowels:
            count += 1
    return count, len(string) - count
```

## 35.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    count = 0
    for i in string:
        if i in vowels:
            count += 1
    return count, len(string) - count
```

## 36.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    count = 0
    for i in string:
        if i in vowels:
            count += 1
    return count, len(string) - count
```

## 37.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    count = 0
    for i in string:
        if i in vowels:
            count += 1
    return count, len(string) - count
```

## 38.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou"
    count = 0
    for i in string:
        if i in vowels:
            count += 1
    return count, len(string) - count
```

## 39.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def vowel_and_consonant_count(string):
    vowels = "aeiou
