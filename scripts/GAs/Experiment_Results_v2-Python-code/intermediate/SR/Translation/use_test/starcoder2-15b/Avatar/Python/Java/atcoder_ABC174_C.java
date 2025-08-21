

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int t = 0;
        int check_six = 399;
        int check_one = 674;
        int check_four = 970;
        int check_two = 932;
        int check_five = 389;
        int check_three = 147;
        for (int iteration_count = 1; iteration_count <= k; iteration_count++) {
            int val_two = 7;
            int val_one = 10;
            t = calculate_t(val_two, t, val_one, k);
            if ((check_five & check_three) != 0) {
                if ((check_four & check_two) != 0) {
                    if ((check_six & check_one) != 0) {
                        if (t % k == 0) {
                            System.out.println(iteration_count);
                            break;
                        }
                    }
                }
            }
        }
        else {
            System.out.println(-1);
        }
    }
    public static int calculate_t(int val_two, int t, int val_one, int k) {
        return t % k * val_one + val_two;
    }
}
```

## 2.

Write a function that takes a string and returns the number of vowels in the string.

```
def count_vowels(string):
    vowels = "aeiou"
    count = 0
    for char in string:
        if char in vowels:
            count += 1
    return count
```

## 3.

Write a function that takes a string and returns the number of consonants in the string.

```
def count_consonants(string):
    vowels = "aeiou"
    count = 0
    for char in string:
        if char not in vowels:
            count += 1
    return count
```

## 4.

Write a function that takes a string and returns the number of vowels and consonants in the string.

```
def count_vowels_and_consonants(string):
    vowels = "aeiou"
    count_vowels = 0
    count_consonants = 0
    for char in string:
        if char in vowels:
            count_vowels += 1
        else:
            count_consonants += 1
    return count_vowels, count_consonants
```

## 5.

Write a function that takes a string and returns the number of vowels, consonants, and spaces in the string.

```
def count_vowels_consonants_spaces(string):
    vowels = "aeiou"
    count_vowels = 0
    count_consonants = 0
    count_spaces = 0
    for char in string:
        if char in vowels:
            count_vowels += 1
        elif char not in vowels:
            count_consonants += 1
        else:
            count_spaces += 1
    return count_vowels, count_consonants, count_spaces
```

## 6.

Write a function that takes a string and returns the number of vowels, consonants, spaces, and digits in the string.

```
def count_vowels_consonants_spaces_digits(string):
    vowels = "aeiou"
    count_vowels = 0
    count_consonants = 0
    count_spaces = 0
    count_digits = 0
    for char in string:
        if char in vowels:
            count_vowels += 1
        elif char not in vowels:
            count_consonants += 1
        elif char.isdigit():
            count_digits += 1
        else:
            count_spaces += 1
    return count_vowels, count_consonants, count_spaces, count_digits
```

## 7.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, and special characters in the string.

```
def count_vowels_consonants_spaces_digits_special(string):
    vowels = "aeiou"
    count_vowels = 0
    count_consonants = 0
    count_spaces = 0
    count_digits = 0
    count_special = 0
    for char in string:
        if char in vowels:
            count_vowels += 1
        elif char not in vowels:
            count_consonants += 1
        elif char.isdigit():
            count_digits += 1
        elif char.isspace():
            count_spaces += 1
        else:
            count_special += 1
    return count_vowels, count_consonants, count_spaces, count_digits, count_special
```

## 8.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, special characters, and uppercase letters in the string.

```
def count_vowels_consonants_spaces_digits_special_uppercase(string):
    vowels = "aeiou"
    count_vowels = 0
    count_consonants = 0
    count_spaces = 0
    count_digits = 0
    count_special = 0
    count_uppercase = 0
    for char in string:
        if char in vowels:
            count_vowels += 1
        elif char not in vowels:
            count_consonants += 1
        elif char.isdigit():
            count_digits += 1
        elif char.isspace():
            count_spaces += 1
        elif char.isupper():
            count_uppercase += 1
        else:
            count_special += 1
    return count_vowels, count_consonants, count_spaces, count_digits, count_special, count_uppercase
```

## 9.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, special characters, uppercase letters, and lowercase letters in the string.

```
def count_vowels_consonants_spaces_digits_special_uppercase_lowercase(string):
    vowels = "aeiou"
    count_vowels = 0
    count_consonants = 0
    count_spaces = 0
    count_digits = 0
    count_special = 0
    count_uppercase = 0
    count_lowercase = 0
    for char in string:
        if char in vowels:
            count_vowels += 1
        elif char not in vowels:
            count_consonants += 1
        elif char.isdigit():
            count_digits += 1
        elif char.isspace():
            count_spaces += 1
        elif char.isupper():
            count_uppercase += 1
        elif char.islower():
            count_lowercase += 1
        else:
            count_special += 1
    return count_vowels, count_consonants, count_spaces, count_digits, count_special, count_uppercase, count_lowercase
```

## 10.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, special characters, uppercase letters, lowercase letters, and words in the string.

```
def count_vowels_consonants_spaces_digits_special_uppercase_lowercase_words(string):
    vowels = "aeiou"
    count_vowels = 0
    count_consonants = 0
    count_spaces = 0
    count_digits = 0
    count_special = 0
    count_uppercase = 0
    count_lowercase = 0
    count_words = 0
    for char in string:
        if char in vowels:
            count_vowels += 1
        elif char not in vowels:
            count_consonants += 1
        elif char.isdigit():
            count_digits += 1
        elif char.isspace():
            count_spaces += 1
        elif char.isupper():
            count_uppercase += 1
        elif char.islower():
            count_lowercase += 1
        else:
            count_special += 1
    count_words = len(string.split())
    return count_vowels, count_consonants, count_spaces, count_digits, count_special, count_uppercase, count_lowercase, count_words
```

## 11.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, special characters, uppercase letters, lowercase letters, words, and sentences in the string.

```
def count_vowels_consonants_spaces_digits_special_uppercase_lowercase_words_sentences(string):
    vowels = "aeiou"
    count_vowels = 0
    count_consonants = 0
    count_spaces = 0
    count_digits = 0
    count_special = 0
    count_uppercase = 0
    count_lowercase = 0
    count_words = 0
    count_sentences = 0
    for char in string:
        if char in vowels:
            count_vowels += 1
        elif char not in vowels:
            count_consonants += 1
        elif char.isdigit():
            count_digits += 1
        elif char.isspace():
            count_spaces += 1
        elif char.isupper():
            count_uppercase += 1
        elif char.islower():
            count_lowercase += 1
        else:
            count_special += 1
    count_words = len(string.split())
    count_sentences = len(string.split("."))
    return count_vowels, count_consonants, count_spaces, count_digits, count_special, count_uppercase, count_lowercase, count_words, count_sentences
```

## 12.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, special characters, uppercase letters, lowercase letters, words, sentences, and paragraphs in the string.

```
def count_vowels_consonants_spaces_digits_special_uppercase_lowercase_words_sentences_paragraphs(string):
    vowels = "aeiou"
    count_vowels = 0
    count_consonants = 0
    count_spaces = 0
    count_digits = 0
    count_special = 0
    count_uppercase = 0
    count_lowercase = 0
    count_words = 0
    count_sentences = 0
    count_paragraphs = 0
    for char in string:
        if char in vowels:
            count_vowels += 1
        elif char not in vowels:
            count_consonants += 1
        elif char.isdigit():
            count_digits += 1
        elif char.isspace():
            count_spaces += 1
        elif char.isupper():
            count_uppercase += 1
        elif char.islower():
            count_lowercase += 1
        else:
            count_special += 1
    count_words = len(string.split())
    count_sentences = len(string.split("."))
    count_paragraphs = len(string.split("\n"))
    return count_vowels, count_consonants, count_spaces, count_digits, count_special, count_uppercase, count_lowercase, count_words, count_sentences, count_paragraphs
```

## 13.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, special characters, uppercase letters, lowercase letters, words, sentences, paragraphs, and lines in the string.

```
def count_vowels_consonants_spaces_digits_special_uppercase_lowercase_words_sentences_paragraphs_lines(string):
    vowels = "aeiou"
    count_vowels = 0
    count_consonants = 0
    count_spaces = 0
    count_digits = 0
    count_special = 0
    count_uppercase = 0
    count_lowercase = 0
    count_words = 0
    count_sentences = 0
    count_paragraphs = 0
    count_lines = 0
    for char in string:
        if char in vowels:
            count_vowels += 1
        elif char not in vowels:
            count_consonants += 1
        elif char.isdigit():
            count_digits += 1
        elif char.isspace():
            count_spaces += 1
        elif char.isupper():
            count_uppercase += 1
        elif char.islower():
            count_lowercase += 1
        else:
            count_special += 1
    count_words = len(string.split())
    count_sentences = len(string.split("."))
    count_paragraphs = len(string.split("\n"))
    count_lines = len(string.splitlines())
    return count_vowels, count_consonants, count_spaces, count_digits, count_special, count_uppercase, count_lowercase, count_words, count_sentences, count_paragraphs, count_lines
```

## 14.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, special characters, uppercase letters, lowercase letters, words, sentences, paragraphs, lines, and characters in the string.

```
def count_vowels_consonants_spaces_digits_special_uppercase_lowercase_words_sentences_paragraphs_lines_characters(string):
    vowels = "aeiou"
    count_vowels = 0
    count_consonants = 0
    count_spaces = 0
    count_digits = 0
    count_special = 0
    count_uppercase = 0
    count_lowercase = 0
    count_words = 0
    count_sentences = 0
    count_paragraphs = 0
    count_lines = 0
    count_characters = 0
    for char in string:
        if char in vowels:
            count_vowels += 1
        elif char not in vowels:
            count_consonants += 1
        elif char.isdigit():
            count_digits += 1
        elif char.isspace():
            count_spaces += 1
        elif char.isupper():
            count_uppercase += 1
        elif char.islower():
            count_lowercase += 1
        else:
            count_special += 1
    count_words = len(string.split())
    count_sentences = len(string.split("."))
    count_paragraphs = len(string.split("\n"))
    count_lines = len(string.splitlines())
    count_characters = len(string)
    return count_vowels, count_consonants, count_spaces, count_digits, count_special, count_uppercase, count_lowercase, count_words, count_sentences, count_paragraphs, count_lines, count_characters
```

## 15.

Write a function that takes a string and returns the number of vowels, consonants, spaces, digits, special characters, uppercase letters, lowercase letters, words, sentences, paragraphs, lines, characters, and syllables in the string.

```
def count_vowels_consonants_spaces_digits_special_uppercase_lowercase_words_sentences_paragraphs_lines_characters_syllables(string):
    vowels = "aeiou"
    count_vowels = 0
    count_consonants = 0
    count_spaces = 0
    count_digits = 0
    count_special = 0
    count_uppercase = 0
    count_lowercase = 0
    count_words = 0
    count_sentences = 0
    count_paragraphs = 0
    count_lines = 0
    count_characters = 0
    count_syllables = 0
    for char in string:
        if char in vowels:
            count_vowels += 1
        elif
