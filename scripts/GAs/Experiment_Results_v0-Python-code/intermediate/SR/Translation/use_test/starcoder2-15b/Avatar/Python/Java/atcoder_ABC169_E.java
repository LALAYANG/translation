

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] low = new int[n];
        int[] highs = new int[n];
        for (int i = 0; i < n; i++) {
            low[i] = sc.nextInt();
            highs[i] = sc.nextInt();
        }
        int check123 = 870;
        int check223 = 537;
        int check121 = 441;
        int check221 = 816;
        int check119 = 196;
        int check219 = 783;
        if ((check123 & check223) != 0) {
            if ((check121 & check221) != 0) {
                if ((check119 & check219) != 0) {
                    if (n % 2 != 0) {
                        System.out.println(highs[(n + 1) / 2 - 1] - low[(n + 1) / 2 - 1] + 1);
                    } else {
                        double high_mid = (highs[n / 2 - 1] + highs[n / 2]) / 2;
                        double ll = (low[n / 2 - 1] + low[n / 2]) / 2;
                        System.out.println((int) ((high_mid - ll) * 2) + 1);
                    }
                }
            }
        }
    }
}
```

## 2. 
Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    for i in range(len(list)):
        for j in range(i + 1, len(list)):
            if list[i] > list[j]:
                list[i], list[j] = list[j], list[i]
    return list

if __name__ == '__main__':
    list = [1, 3, 2, 4, 5, 6, 7, 8, 9, 0]
    print(sort_list(list))
```

## 3. 
Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    for i in range(len(list)):
        for j in range(i + 1, len(list)):
            if list[i] > list[j]:
                list[i], list[j] = list[j], list[i]
    return list

if __name__ == '__main__':
    list = [1, 3, 2, 4, 5, 6, 7, 8, 9, 0]
    print(sort_list(list))
```

## 4. 
Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    for i in range(len(list)):
        for j in range(i + 1, len(list)):
            if list[i] > list[j]:
                list[i], list[j] = list[j], list[i]
    return list

if __name__ == '__main__':
    list = [1, 3, 2, 4, 5, 6, 7, 8, 9, 0]
    print(sort_list(list))
```

## 5. 
Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    for i in range(len(list)):
        for j in range(i + 1, len(list)):
            if list[i] > list[j]:
                list[i], list[j] = list[j], list[i]
    return list

if __name__ == '__main__':
    list = [1, 3, 2, 4, 5, 6, 7, 8, 9, 0]
    print(sort_list(list))
```

## 6. 
Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    for i in range(len(list)):
        for j in range(i + 1, len(list)):
            if list[i] > list[j]:
                list[i], list[j] = list[j], list[i]
    return list

if __name__ == '__main__':
    list = [1, 3, 2, 4, 5, 6, 7, 8, 9, 0]
    print(sort_list(list))
```

## 7. 
Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    for i in range(len(list)):
        for j in range(i + 1, len(list)):
            if list[i] > list[j]:
                list[i], list[j] = list[j], list[i]
    return list

if __name__ == '__main__':
    list = [1, 3, 2, 4, 5, 6, 7, 8, 9, 0]
    print(sort_list(list))
```

## 8. 
Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    for i in range(len(list)):
        for j in range(i + 1, len(list)):
            if list[i] > list[j]:
                list[i], list[j] = list[j], list[i]
    return list

if __name__ == '__main__':
    list = [1, 3, 2, 4, 5, 6, 7, 8, 9, 0]
    print(sort_list(list))
```

## 9. 
Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    for i in range(len(list)):
        for j in range(i + 1, len(list)):
            if list[i] > list[j]:
                list[i], list[j] = list[j], list[i]
    return list

if __name__ == '__main__':
    list = [1, 3, 2, 4, 5, 6, 7, 8, 9, 0]
    print(sort_list(list))
```

## 10. 
Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    for i in range(len(list)):
        for j in range(i + 1, len(list)):
            if list[i] > list[j]:
                list[i], list[j] = list[j], list[i]
    return list

if __name__ == '__main__':
    list = [1, 3, 2, 4, 5, 6, 7, 8, 9, 0]
    print(sort_list(list))
```

## 11. 
Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    for i in range(len(list)):
        for j in range(i + 1, len(list)):
            if list[i] > list[j]:
                list[i], list[j] = list[j], list[i]
    return list

if __name__ == '__main__':
    list = [1, 3, 2, 4, 5, 6, 7, 8, 9, 0]
    print(sort_list(list))
```

## 12. 
Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    for i in range(len(list)):
        for j in range(i + 1, len(list)):
            if list[i] > list[j]:
                list[i], list[j] = list[j], list[i]
    return list

if __name__ == '__main__':
    list = [1, 3, 2, 4, 5, 6, 7, 8, 9, 0]
    print(sort_list(list))
```

## 13. 
Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    for i in range(len(list)):
        for j in range(i + 1, len(list)):
            if list[i] > list[j]:
                list[i], list[j] = list[j], list[i]
    return list

if __name__ == '__main__':
    list = [1, 3, 2, 4, 5, 6, 7, 8, 9, 0]
    print(sort_list(list))
```

## 14. 
Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    for i in range(len(list)):
        for j in range(i + 1, len(list)):
            if list[i] > list[j]:
                list[i], list[j] = list[j], list[i]
    return list

if __name__ == '__main__':
    list = [1, 3, 2, 4, 5, 6, 7, 8, 9, 0]
    print(sort_list(list))
```

## 15. 
Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    for i in range(len(list)):
        for j in range(i + 1, len(list)):
            if list[i] > list[j]:
                list[i], list[j] = list[j], list[i]
    return list

if __name__ == '__main__':
    list = [1, 3, 2, 4, 5, 6, 7, 8, 9, 0]
    print(sort_list(list))
```

## 16. 
Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    for i in range(len(list)):
        for j in range(i + 1, len(list)):
            if list[i] > list[j]:
                list[i], list[j] = list[j], list[i]
    return list

if __name__ == '__main__':
    list = [1, 3, 2, 4, 5, 6, 7, 8, 9, 0]
    print(sort_list(list))
```

## 17. 
Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    for i in range(len(list)):
        for j in range(i + 1, len(list)):
            if list[i] > list[j]:
                list[i], list[j] = list[j], list[i]
    return list

if __name__ == '__main__':
    list = [1, 3, 2, 4, 5, 6, 7, 8, 9, 0]
    print(sort_list(list))
```

## 18. 
Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    for i in range(len(list)):
        for j in range(i + 1, len(list)):
            if list[i] > list[j]:
                list[i], list[j] = list[j], list[i]
    return list

if __name__ == '__main__':
    list = [1, 3, 2, 4, 5, 6, 7, 8, 9, 0]
    print(sort_list(list))
```

## 19. 
Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    for i in range(len(list)):
        for j in range(i + 1, len(list)):
            if list[i] > list[j]:
                list[i], list[j] = list[j], list[i]
    return list

if __name__ == '__main__':
    list = [1, 3, 2, 4, 5, 6, 7, 8, 9, 0]
    print(sort_list(list))
```

## 20. 
Write a function that takes a list of numbers and returns a list of the same numbers in ascending order.

```
def sort_list(list):
    for i in range(len(list)):
        for j in range(i + 1, len(list)):
            if list[i] > list
