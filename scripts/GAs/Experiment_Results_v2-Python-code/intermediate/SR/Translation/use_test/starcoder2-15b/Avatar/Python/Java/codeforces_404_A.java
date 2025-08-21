

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrixSize = sc.nextInt();
        String[] s = new String[matrixSize];
        for (int i = 0; i < matrixSize; i++) {
            s[i] = sc.next();
        }
        int flag = 0;
        List<Character> d1 = new ArrayList<>();
        List<Character> d2 = new ArrayList<>();
        Set<Character> rem = new HashSet<>();
        int DiagonalCheckerOne = 51;
        int DiagonalCheckerTwo = 753;
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                if ((DiagonalCheckerOne & DiagonalCheckerTwo) != 0) {
                    if (i == j) {
                        d1.add(s[i].charAt(j));
                    }
                }
                if (i == matrixSize - j - 1) {
                    d2.add(s[i].charAt(j));
                }
                if (i != j && i != matrixSize - j - 1) {
                    rem.add(s[i].charAt(j));
                }
            }
        }
        if (rem.size() != 1) {
            System.out.println("NO");
        } else if (!d1.equals(d2)) {
            System.out.println("NO");
        } else if (new HashSet<>(d1).size() != 1) {
            System.out.println("NO");
        } else if (d1.equals(rem)) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
```

## 2.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 3.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 4.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 5.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 6.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 7.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 8.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 9.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 10.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 11.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 12.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 13.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 14.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 15.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 16.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 17.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 18.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 19.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 20.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 21.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 22.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 23.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 24.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 25.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 26.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 27.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 28.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 29.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 30.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 31.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 32.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 33.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 34.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 35.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 36.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 37.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 38.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 39.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 40.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 41.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 42.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 43.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 44.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 45.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 46.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 47.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 48.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 49.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 50.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 51.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_by_3(numbers):
    return [x for x in numbers if x % 3 == 0]
```

## 52.

Write a function that takes a list of numbers and returns a list of numbers that are divisible by 3.

```
def divisible_
