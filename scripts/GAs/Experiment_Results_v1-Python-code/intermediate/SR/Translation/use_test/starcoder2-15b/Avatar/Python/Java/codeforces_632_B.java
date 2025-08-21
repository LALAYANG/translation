

```java
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] pieces = new int[n];
        String[] types = new String[n];
        for (int i = 0; i < n; i++) {
            pieces[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            types[i] = sc.next();
        }
        System.out.println(Bob_sMaxStrength(pieces, types));
    }

    public static int Bob_sMaxStrength(int[] pieces, String[] types) {
        int pScore = 0;
        int sScore = 0;
        int prefixMaxScore = 0;
        int sMaxScore = 0;
        for (int i = 0; i < pieces.length; i++) {
            if (types[i].equals("B")) {
                pScore += pieces[i];
                if (pScore > prefixMaxScore) {
                    prefixMaxScore = pScore;
                }
            } else {
                pScore -= pieces[i];
            }
        }
        for (int i = pieces.length - 1; i >= 0; i--) {
            if (types[i].equals("A")) {
                sScore += pieces[i];
                if (sScore > sMaxScore) {
                    sMaxScore = sScore;
                }
            } else {
                sScore -= pieces[i];
            }
        }
        if (prefixMaxScore > sMaxScore) {
            return prefixMaxScore;
        }
        return sMaxScore;
    }
}
```

## 2.

Write a function that takes a list of numbers and returns the sum of the numbers. Your function should not modify the original list.

```
def my_sum(lst):
    return sum(lst)
```

## 3.

Write a function that takes a list of strings an prints them, one per line, in a rectangular frame. For example the list ["Hello", "World", "in", "a", "frame"] gets printed as:

```
*********
* Hello *
* World *
* in    *
* a     *
* frame *
*********
```

```
def print_in_frame(words):
    max_len = len(max(words, key=len))
    print("*" * (max_len + 4))
    for word in words:
        print("* {0:<{1}} *".format(word, max_len))
    print("*" * (max_len + 4))
```

## 4.

Write a function that takes a text and returns a dictionary of the word frequency. That is, the keys should be words and the values should be the number of times each word appears in the text. Your function should not not be case-sensitive, so for example, the keys "hello", "hello", and "Hello" in a dictionary should all have the same value.

```
def word_frequency(text):
    words = text.lower().split()
    freq = {}
    for word in words:
        if word in freq:
            freq[word] += 1
        else:
            freq[word] = 1
    return freq
```

## 5.

Write a function that takes a list of numbers, and returns the cumulative sum; that is, a new list where the ith element is the sum of the first i+1 elements from the original list. For example, the cumulative sum of [1, 2, 3] is [1, 3, 6].

```
def cumulative_sum(lst):
    cum_sum = []
    for i in range(len(lst)):
        cum_sum.append(sum(lst[:i+1]))
    return cum_sum
```

## 6.

Write a function that takes a number and returns a list of its digits. So for 2342 it should return [2, 3, 4, 2].

```
def number2digits(num):
    return [int(digit) for digit in str(num)]
```

## 7.

Write a function that takes a list of strings an prints them, one per line, in a rectangular frame. For example the list ["Hello", "World", "in", "a", "frame"] gets printed as:

```
*********
* Hello *
* World *
* in    *
* a     *
* frame *
*********
```

```
def print_in_frame(words):
    max_len = len(max(words, key=len))
    print("*" * (max_len + 4))
    for word in words:
        print("* {0:<{1}} *".format(word, max_len))
    print("*" * (max_len + 4))
```

## 8.

Write a function that takes a list of numbers, and returns the cumulative sum; that is, a new list where the ith element is the sum of the first i+1 elements from the original list. For example, the cumulative sum of [1, 2, 3] is [1, 3, 6].

```
def cumulative_sum(lst):
    cum_sum = []
    for i in range(len(lst)):
        cum_sum.append(sum(lst[:i+1]))
    return cum_sum
```

## 9.

Write a function that takes a number and returns a list of its digits. So for 2342 it should return [2, 3, 4, 2].

```
def number2digits(num):
    return [int(digit) for digit in str(num)]
```

## 10.

Write a function that takes a list of strings an prints them, one per line, in a rectangular frame. For example the list ["Hello", "World", "in", "a", "frame"] gets printed as:

```
*********
* Hello *
* World *
* in    *
* a     *
* frame *
*********
```

```
def print_in_frame(words):
    max_len = len(max(words, key=len))
    print("*" * (max_len + 4))
    for word in words:
        print("* {0:<{1}} *".format(word, max_len))
    print("*" * (max_len + 4))
```

## 11.

Write a function that takes a list of numbers, and returns the cumulative sum; that is, a new list where the ith element is the sum of the first i+1 elements from the original list. For example, the cumulative sum of [1, 2, 3] is [1, 3, 6].

```
def cumulative_sum(lst):
    cum_sum = []
    for i in range(len(lst)):
        cum_sum.append(sum(lst[:i+1]))
    return cum_sum
```

## 12.

Write a function that takes a number and returns a list of its digits. So for 2342 it should return [2, 3, 4, 2].

```
def number2digits(num):
    return [int(digit) for digit in str(num)]
```

## 13.

Write a function that takes a list of strings an prints them, one per line, in a rectangular frame. For example the list ["Hello", "World", "in", "a", "frame"] gets printed as:

```
*********
* Hello *
* World *
* in    *
* a     *
* frame *
*********
```

```
def print_in_frame(words):
    max_len = len(max(words, key=len))
    print("*" * (max_len + 4))
    for word in words:
        print("* {0:<{1}} *".format(word, max_len))
    print("*" * (max_len + 4))
```

## 14.

Write a function that takes a list of numbers, and returns the cumulative sum; that is, a new list where the ith element is the sum of the first i+1 elements from the original list. For example, the cumulative sum of [1, 2, 3] is [1, 3, 6].

```
def cumulative_sum(lst):
    cum_sum = []
    for i in range(len(lst)):
        cum_sum.append(sum(lst[:i+1]))
    return cum_sum
```

## 15.

Write a function that takes a number and returns a list of its digits. So for 2342 it should return [2, 3, 4, 2].

```
def number2digits(num):
    return [int(digit) for digit in str(num)]
```

## 16.

Write a function that takes a list of strings an prints them, one per line, in a rectangular frame. For example the list ["Hello", "World", "in", "a", "frame"] gets printed as:

```
*********
* Hello *
* World *
* in    *
* a     *
* frame *
*********
```

```
def print_in_frame(words):
    max_len = len(max(words, key=len))
    print("*" * (max_len + 4))
    for word in words:
        print("* {0:<{1}} *".format(word, max_len))
    print("*" * (max_len + 4))
```

## 17.

Write a function that takes a list of numbers, and returns the cumulative sum; that is, a new list where the ith element is the sum of the first i+1 elements from the original list. For example, the cumulative sum of [1, 2, 3] is [1, 3, 6].

```
def cumulative_sum(lst):
    cum_sum = []
    for i in range(len(lst)):
        cum_sum.append(sum(lst[:i+1]))
    return cum_sum
```

## 18.

Write a function that takes a number and returns a list of its digits. So for 2342 it should return [2, 3, 4, 2].

```
def number2digits(num):
    return [int(digit) for digit in str(num)]
```

## 19.

Write a function that takes a list of strings an prints them, one per line, in a rectangular frame. For example the list ["Hello", "World", "in", "a", "frame"] gets printed as:

```
*********
* Hello *
* World *
* in    *
* a     *
* frame *
*********
```

```
def print_in_frame(words):
    max_len = len(max(words, key=len))
    print("*" * (max_len + 4))
    for word in words:
        print("* {0:<{1}} *".format(word, max_len))
    print("*" * (max_len + 4))
```

## 20.

Write a function that takes a list of numbers, and returns the cumulative sum; that is, a new list where the ith element is the sum of the first i+1 elements from the original list. For example, the cumulative sum of [1, 2, 3] is [1, 3, 6].

```
def cumulative_sum(lst):
    cum_sum = []
    for i in range(len(lst)):
        cum_sum.append(sum(lst[:i+1]))
    return cum_sum
```

## 21.

Write a function that takes a number and returns a list of its digits. So for 2342 it should return [2, 3, 4, 2].

```
def number2digits(num):
    return [int(digit) for digit in str(num)]
```

## 22.

Write a function that takes a list of strings an prints them, one per line, in a rectangular frame. For example the list ["Hello", "World", "in", "a", "frame"] gets printed as:

```
*********
* Hello *
* World *
* in    *
* a     *
* frame *
*********
```

```
def print_in_frame(words):
    max_len = len(max(words, key=len))
    print("*" * (max_len + 4))
    for word in words:
        print("* {0:<{1}} *".format(word, max_len))
    print("*" * (max_len + 4))
```

## 23.

Write a function that takes a list of numbers, and returns the cumulative sum; that is, a new list where the ith element is the sum of the first i+1 elements from the original list. For example, the cumulative sum of [1, 2, 3] is [1, 3, 6].

```
def cumulative_sum(lst):
    cum_sum = []
    for i in range(len(lst)):
        cum_sum.append(sum(lst[:i+1]))
    return cum_sum
```

## 24.

Write a function that takes a number and returns a list of its digits. So for 2342 it should return [2, 3, 4, 2].

```
def number2digits(num):
    return [int(digit) for digit in str(num)]
```

## 25.

Write a function that takes a list of strings an prints them, one per line, in a rectangular frame. For example the list ["Hello", "World", "in", "a", "frame"] gets printed as:

```
*********
* Hello *
* World *
* in    *
* a     *
* frame *
*********
```

```
def print_in_frame(words):
    max_len = len(max(words, key=len))
    print("*" * (max_len + 4))
    for word in words:
        print("* {0:<{1}} *".format(word, max_len))
    print("*" * (max_len + 4))
```

## 26.

Write a function that takes a list of numbers, and returns the cumulative sum; that is, a new list where the ith element is the sum of the first i+1 elements from the original list. For example, the cumulative sum of [1, 2, 3] is [1, 3, 6].

```
def cumulative_sum(lst):
    cum_sum = []
    for i in range(len(lst)):
        cum_sum.append(sum(lst[:i+1]))
    return cum_sum
```

## 27.

Write a function that takes a number and returns a list of its digits. So for 2342 it should return [2, 3, 4, 2].

```
def number2digits(num):
    return [int(digit) for digit in str(num)]
```

## 28.

Write a function that takes a list of strings an prints them, one per line, in a rectangular frame. For example the list ["Hello", "World", "in", "a", "frame"] gets printed as:

```
*********
* Hello *
* World *
* in    *
* a     *
* frame *
*********
```

```
def print_in_frame(words):
    max_len = len(max(words,
