

```java
import java.util.Scanner;

public class Bob_sMaxStrength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println(Bob_sMaxStrength(a, b));
    }

    public static int Bob_sMaxStrength(int[] a, int[] b) {
        int pScore = 0;
        int sScore = 0;
        int pMaxScore = 0;
        int sMaxScore = 0;
        for (int i = 0; i < a.length; i++) {
            if (b[i] == 1) {
                pScore += a[i];
                if (pScore > pMaxScore) {
                    pMaxScore = pScore;
                }
            } else {
                pScore -= a[i];
            }
        }
        for (int i = a.length - 1; i >= 0; i--) {
            if (b[i] == 1) {
                sScore += a[i];
                if (sScore > sMaxScore) {
                    sMaxScore = sScore;
                }
            } else {
                sScore -= a[i];
            }
        }
        if (pMaxScore > sMaxScore) {
            return pMaxScore;
        }
        return sMaxScore;
    }
}

```

## 3. 
Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_list(items):
    sum_numbers = 0
    for x in items:
        sum_numbers += x
    return sum_numbers
print(sum_list([1,2,-8]))

```

## 4. 
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

## 5. 
Write a function that takes a number and returns True if it is a prime number.

```
def is_prime(num):
    if num > 1:
        for i in range(2, num):
            if (num % i) == 0:
                return False
        else:
            return True

print(is_prime(4))

```

## 6. 
Write a function that takes a list and returns a new list with the unique elements of the first list and the order of the elements is determined by the order they occur in the original list.

```
def unique_list(l):
  x = []
  for a in l:
    if a not in x:
      x.append(a)
  return x

print(unique_list([1,2,3,3,3,3,4,5]))

```

## 7. 
Write a function that takes a list and returns a new list that contains all the elements of the first list minus all the duplicates.

```
def unique_list(l):
  x = []
  for a in l:
    if a not in x:
      x.append(a)
  return x

print(unique_list([1,2,3,3,3,3,4,5]))

```

## 8. 
Write a function that takes a string and calculates the number of upper case letters and lower case letters.

```
def up_low(s):
    d={"upper":0, "lower":0}
    for c in s:
        if c.isupper():
           d["upper"]+=1
        elif c.islower():
           d["lower"]+=1
        else:
           pass
    print("Original String : ", s)
    print("No. of Upper case characters : ", d["upper"])
    print("No. of Lower case Characters : ", d["lower"])

s = 'Hello , How are you this fine Tuesday?'
up_low(s)

```

## 9. 
Write a function that takes a string and returns a new string with all the vowels removed.

```
def remove_vowels(s):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in s:
        if x in vowels:
            s = s.replace(x, "")
    return s

print(remove_vowels("Hello"))

```

## 10. 
Write a function that takes a string and returns a new string with all the vowels removed.

```
def remove_vowels(s):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in s:
        if x in vowels:
            s = s.replace(x, "")
    return s

print(remove_vowels("Hello"))

```

## 11. 
Write a function that takes a string and returns a new string with all the vowels removed.

```
def remove_vowels(s):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in s:
        if x in vowels:
            s = s.replace(x, "")
    return s

print(remove_vowels("Hello"))

```

## 12. 
Write a function that takes a string and returns a new string with all the vowels removed.

```
def remove_vowels(s):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in s:
        if x in vowels:
            s = s.replace(x, "")
    return s

print(remove_vowels("Hello"))

```

## 13. 
Write a function that takes a string and returns a new string with all the vowels removed.

```
def remove_vowels(s):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in s:
        if x in vowels:
            s = s.replace(x, "")
    return s

print(remove_vowels("Hello"))

```

## 14. 
Write a function that takes a string and returns a new string with all the vowels removed.

```
def remove_vowels(s):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in s:
        if x in vowels:
            s = s.replace(x, "")
    return s

print(remove_vowels("Hello"))

```

## 15. 
Write a function that takes a string and returns a new string with all the vowels removed.

```
def remove_vowels(s):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in s:
        if x in vowels:
            s = s.replace(x, "")
    return s

print(remove_vowels("Hello"))

```

## 16. 
Write a function that takes a string and returns a new string with all the vowels removed.

```
def remove_vowels(s):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in s:
        if x in vowels:
            s = s.replace(x, "")
    return s

print(remove_vowels("Hello"))

```

## 17. 
Write a function that takes a string and returns a new string with all the vowels removed.

```
def remove_vowels(s):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in s:
        if x in vowels:
            s = s.replace(x, "")
    return s

print(remove_vowels("Hello"))

```

## 18. 
Write a function that takes a string and returns a new string with all the vowels removed.

```
def remove_vowels(s):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in s:
        if x in vowels:
            s = s.replace(x, "")
    return s

print(remove_vowels("Hello"))

```

## 19. 
Write a function that takes a string and returns a new string with all the vowels removed.

```
def remove_vowels(s):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in s:
        if x in vowels:
            s = s.replace(x, "")
    return s

print(remove_vowels("Hello"))

```

## 20. 
Write a function that takes a string and returns a new string with all the vowels removed.

```
def remove_vowels(s):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in s:
        if x in vowels:
            s = s.replace(x, "")
    return s

print(remove_vowels("Hello"))

```

## 21. 
Write a function that takes a string and returns a new string with all the vowels removed.

```
def remove_vowels(s):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in s:
        if x in vowels:
            s = s.replace(x, "")
    return s

print(remove_vowels("Hello"))

```

## 22. 
Write a function that takes a string and returns a new string with all the vowels removed.

```
def remove_vowels(s):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in s:
        if x in vowels:
            s = s.replace(x, "")
    return s

print(remove_vowels("Hello"))

```

## 23. 
Write a function that takes a string and returns a new string with all the vowels removed.

```
def remove_vowels(s):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in s:
        if x in vowels:
            s = s.replace(x, "")
    return s

print(remove_vowels("Hello"))

```

## 24. 
Write a function that takes a string and returns a new string with all the vowels removed.

```
def remove_vowels(s):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in s:
        if x in vowels:
            s = s.replace(x, "")
    return s

print(remove_vowels("Hello"))

```

## 25. 
Write a function that takes a string and returns a new string with all the vowels removed.

```
def remove_vowels(s):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in s:
        if x in vowels:
            s = s.replace(x, "")
    return s

print(remove_vowels("Hello"))

```

## 26. 
Write a function that takes a string and returns a new string with all the vowels removed.

```
def remove_vowels(s):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in s:
        if x in vowels:
            s = s.replace(x, "")
    return s

print(remove_vowels("Hello"))

```

## 27. 
Write a function that takes a string and returns a new string with all the vowels removed.

```
def remove_vowels(s):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in s:
        if x in vowels:
            s = s.replace(x, "")
    return s

print(remove_vowels("Hello"))

```

## 28. 
Write a function that takes a string and returns a new string with all the vowels removed.

```
def remove_vowels(s):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in s:
        if x in vowels:
            s = s.replace(x, "")
    return s

print(remove_vowels("Hello"))

```

## 29. 
Write a function that takes a string and returns a new string with all the vowels removed.

```
def remove_vowels(s):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in s:
        if x in vowels:
            s = s.replace(x, "")
    return s

print(remove_vowels("Hello"))

```

## 30. 
Write a function that takes a string and returns a new string with all the vowels removed.

```
def remove_vowels(s):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in s:
        if x in vowels:
            s = s.replace(x, "")
    return s

print(remove_vowels("Hello"))

```

## 31. 
Write a function that takes a string and returns a new string with all the vowels removed.

```
def remove_vowels(s):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in s:
        if x in vowels:
            s = s.replace(x, "")
    return s

print(remove_vowels("Hello"))

```

## 32. 
Write a function that takes a string and returns a new string with all the vowels removed.

```
def remove_vowels(s):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in s:
        if x in vowels:
            s = s.replace(x, "")
    return s

print(remove_vowels("Hello"))

```

## 33. 
Write a function that takes a string and returns a new string with all the vowels removed.

```
def remove_vowels(s):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in s:
        if x in vowels:
            s = s.replace(x, "")
    return s

print(remove_vowels("Hello"))

```

## 34. 
Write a function that takes a string and returns a new string with all the vowels removed.

```
def remove_vowels(s):
    vowels = ('a', 'e', 'i', 'o', 'u')
    for x in s:
        if x in vowels:
            s = s.replace(x, "")
    return s

print(remove_vowels("Hello"))

```

## 35. 
Write a function that takes a string and returns a new string with all the vowels removed.

```
def remove_vowels(s):
    vowels = ('a', 'e
