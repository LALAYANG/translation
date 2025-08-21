

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] measurements = new int[n];
        for (int i = 0; i < n; i++) {
            measurements[i] = sc.nextInt();
        }
        int[][] b = new int[n][n];
        for (int i = 0; i < n; i++) {
            int m = measurements[i];
            for (int j = 0; j < n; j++) {
                int k = i - j;
                if (k < 0) {
                    k = k + n;
                }
                m = Math.min(m, measurements[k]);
                b[j][i] = m;
            }
        }
        int m = 1000000000;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += b[j][i];
            }
            m = Math.min(m, sum + x * i);
        }
        System.out.println(m);
    }
}
```

## 2.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_list(numbers):
    total = 0
    for x in numbers:
        total += x
    return total

print(sum_list([1, 2, -8]))
```

## 3.

Write a function that takes a list of numbers and returns a new list with only the odd numbers.

```
def all_odd(numbers):
    odd_numbers = []
    for x in numbers:
        if x % 2 != 0:
            odd_numbers.append(x)
    return odd_numbers

print(all_odd([1, 2, 7, 8]))
```

## 4.

Write a function that takes a list of strings and a new string as arguments and returns the
count of the number of strings where the string is bigger than the new string.

```
def count_bigger_than(strings, new_string):
    count = 0
    for x in strings:
        if len(x) > len(new_string):
            count += 1
    return count

print(count_bigger_than(["hello", "bye", "world"], "hello"))
```

## 5.

Write a function that takes a list and returns a new list with unique elements of the first list.

```
def unique_list(l):
    x = []
    for a in l:
        if a not in x:
            x.append(a)
    return x

print(unique_list([1, 2, 3, 3, 3, 3, 4, 5]))
```

## 6.

Write a function that takes a number and returns a list of its digits.

```
def number_to_list(n):
    return [int(i) for i in str(n)]

print(number_to_list(123))
```

## 7.

Write a function that takes two lists and returns True if they have at least one common member.

```
def common_data(list1, list2):
    result = False
    for x in list1:
        for y in list2:
            if x == y:
                result = True
    return result

print(common_data([1, 2, 3, 4, 5], [5, 6, 7, 8, 9]))
print(common_data([1, 2, 3, 4, 5], [6, 7, 8, 9]))
```

## 8.

Write a function that takes a list of strings and returns a single string that is the concatenation of all the strings in the list.

```
def concat_list(list):
    result = ""
    for x in list:
        result += x
    return result

print(concat_list(["1", "2", "3", "4"]))
```

## 9.

Write a function that takes a list of numbers and returns the average.

```
def average(list):
    return sum(list) / len(list)

print(average([1, 2, 3, 4, 5]))
```

## 10.

Write a function that takes a two-dimensional list and returns the transpose of the list.

```
def transpose(list):
    return list(map(list, zip(*list)))

print(transpose([[1, 2, 3], [4, 5, 6], [7, 8, 9]]))
```

## 11.

Write a function that takes a string and returns a new string with all the consecutive
whitespace (spaces, tabs, and newlines) reduced to a single space.

```
def reduce_whitespace(string):
    return " ".join(string.split())

print(reduce_whitespace("Python  \n\n\n is  \t\t\t fun \n!"))
```

## 12.

Write a function that takes a string and returns a string that is all lowercase.

```
def to_lower(string):
    return string.lower()

print(to_lower("HELLO"))
```

## 13.

Write a function that takes a string and returns a string that is all uppercase.

```
def to_upper(string):
    return string.upper()

print(to_upper("hello"))
```

## 14.

Write a function that takes a string and returns a new string with all occurrences of its first character replaced with '$', except for the first character itself.

```
def replace_first_char(string):
    return string[0] + string[1:].replace(string[0], "$")

print(replace_first_char("restart"))
```

## 15.

Write a function that takes a string and returns a string that is reversed.

```
def reverse(string):
    return string[::-1]

print(reverse("hello"))
```

## 16.

Write a function that takes a string and returns a string that is stripped of whitespace from the beginning and end.

```
def strip(string):
    return string.strip()

print(strip(" hello "))
```

## 17.

Write a function that takes a string and returns a string that is stripped of all 'x' characters.

```
def strip_x(string):
    return string.replace("x", "")

print(strip_x("xaxbxcxdxx"))
```

## 18.

Write a function that takes a string and returns a string that is stripped of all digits.

```
def strip_digits(string):
    return "".join([i for i in string if not i.isdigit()])

print(strip_digits("a0b1c2"))
```

## 19.

Write a function that takes a string and returns a string that is stripped of all non-alphabetic characters.

```
def strip_non_alpha(string):
    return "".join([i for i in string if i.isalpha()])

print(strip_non_alpha("ab%c-d!e"))
```

## 20.

Write a function that takes a string and returns a string that is stripped of all non-alphanumeric characters.

```
def strip_non_alphanum(string):
    return "".join([i for i in string if i.isalnum()])

print(strip_non_alphanum("ab%c-d!e"))
```

## 21.

Write a function that takes a string and returns a string that is stripped of all whitespace characters.

```
def strip_whitespace(string):
    return "".join([i for i in string if not i.isspace()])

print(strip_whitespace("a b c"))
```

## 22.

Write a function that takes a string and returns a string that is stripped of all non-whitespace characters.

```
def strip_non_whitespace(string):
    return "".join([i for i in string if i.isspace()])

print(strip_non_whitespace("a b c"))
```

## 23.

Write a function that takes a string and returns a string that is stripped of all punctuation characters.

```
def strip_punctuation(string):
    return "".join([i for i in string if not i.ispunctuation()])

print(strip_punctuation("a!b,c?d"))
```

## 24.

Write a function that takes a string and returns a string that is stripped of all non-punctuation characters.

```
def strip_non_punctuation(string):
    return "".join([i for i in string if i.ispunctuation()])

print(strip_non_punctuation("a!b,c?d"))
```

## 25.

Write a function that takes a string and returns a string that is stripped of all lowercase characters.

```
def strip_lowercase(string):
    return "".join([i for i in string if not i.islower()])

print(strip_lowercase("aBc"))
```

## 26.

Write a function that takes a string and returns a string that is stripped of all uppercase characters.

```
def strip_uppercase(string):
    return "".join([i for i in string if not i.isupper()])

print(strip_uppercase("aBc"))
```

## 27.

Write a function that takes a string and returns a string that is stripped of all non-letter characters.

```
def strip_non_letter(string):
    return "".join([i for i in string if i.isalpha()])

print(strip_non_letter("a!b,c?d"))
```

## 28.

Write a function that takes a string and returns a string that is stripped of all letter characters.

```
def strip_letter(string):
    return "".join([i for i in string if not i.isalpha()])

print(strip_letter("a!b,c?d"))
```

## 29.

Write a function that takes a string and returns a string that is stripped of all non-digit characters.

```
def strip_non_digit(string):
    return "".join([i for i in string if i.isdigit()])

print(strip_non_digit("a!b,c?d"))
```

## 30.

Write a function that takes a string and returns a string that is stripped of all digit characters.

```
def strip_digit(string):
    return "".join([i for i in string if not i.isdigit()])

print(strip_digit("a!b,c?d"))
```

## 31.

Write a function that takes a string and returns a string that is stripped of all non-alphanumeric characters.

```
def strip_non_alphanum(string):
    return "".join([i for i in string if i.isalnum()])

print(strip_non_alphanum("a!b,c?d"))
```

## 32.

Write a function that takes a string and returns a string that is stripped of all alphanumeric characters.

```
def strip_alphanum(string):
    return "".join([i for i in string if not i.isalnum()])

print(strip_alphanum("a!b,c?d"))
```

## 33.

Write a function that takes a string and returns a string that is stripped of all non-printable characters.

```
def strip_non_printable(string):
    return "".join([i for i in string if i.isprintable()])

print(strip_non_printable("a!b,c?d"))
```

## 34.

Write a function that takes a string and returns a string that is stripped of all printable characters.

```
def strip_printable(string):
    return "".join([i for i in string if not i.isprintable()])

print(strip_printable("a!b,c?d"))
```

## 35.

Write a function that takes a string and returns a string that is stripped of all non-ascii characters.

```
def strip_non_ascii(string):
    return "".join([i for i in string if i.isascii()])

print(strip_non_ascii("a!b,c?d"))
```

## 36.

Write a function that takes a string and returns a string that is stripped of all ascii characters.

```
def strip_ascii(string):
    return "".join([i for i in string if not i.isascii()])

print(strip_ascii("a!b,c?d"))
```

## 37.

Write a function that takes a string and returns a string that is stripped of all non-decimal characters.

```
def strip_non_decimal(string):
    return "".join([i for i in string if i.isdecimal()])

print(strip_non_decimal("a!b,c?d"))
```

## 38.

Write a function that takes a string and returns a string that is stripped of all decimal characters.

```
def strip_decimal(string):
    return "".join([i for i in string if not i.isdecimal()])

print(strip_decimal("a!b,c?d"))
```

## 39.

Write a function that takes a string and returns a string that is stripped of all non-identifier characters.

```
def strip_non_identifier(string):
    return "".join([i for i in string if i.isidentifier()])

print(strip_non_identifier("a!b,c?d"))
```

## 40.

Write a function that takes a string and returns a string that is stripped of all identifier characters.

