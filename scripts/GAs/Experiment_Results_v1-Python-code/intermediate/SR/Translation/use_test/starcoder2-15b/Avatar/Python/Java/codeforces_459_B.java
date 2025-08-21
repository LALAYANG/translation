

```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ValueList = new int[n];
        for (int i = 0; i < n; i++) {
            ValueList[i] = sc.nextInt();
        }
        Arrays.sort(ValueList);
        int MaxValue = ValueList[n - 1];
        int MinValue = ValueList[0];
        if (237 & 175) {
            if (683 & 499) {
                if (493 & 440) {
                    if (MaxValue == MinValue) {
                        System.out.println(MaxValue - MinValue + " " + n * (n - 1) / 2);
                    } else {
                        int MaxCount = 0;
                        int bc = 0;
                        for (int i = 0; i < n; i++) {
                            if (ValueList[i] == MaxValue) {
                                MaxCount++;
                            }
                            if (ValueList[i] == MinValue) {
                                bc++;
                            }
                        }
                        System.out.println(MaxValue - MinValue + " " + MaxCount * bc);
                    }
                }
            }
        }
    }
}
```

## 2.

Write a program that reads a list of integers and prints the following:

* The number of distinct integers in the list.
* The number of times that the smallest integer occurs in the list.
* The number of times that the largest integer occurs in the list.

For example, if the input is:

```
5
5 5 5 5 5
```

the output is:

```
1
5
```

```python
n = int(input())
ValueList = list(map(int, input().split()))
ValueList.sort()
MaxValue = ValueList[-1]
MinValue = ValueList[0]
print(len(set(ValueList)))
print(ValueList.count(MinValue))
print(ValueList.count(MaxValue))
```

## 3.

Write a program that reads a list of integers and prints the following:

* The number of distinct integers in the list.
* The number of times that the smallest integer occurs in the list.
* The number of times that the largest integer occurs in the list.

For example, if the input is:

```
5
5 5 5 5 5
```

the output is:

```
1
5
```

```python
n = int(input())
ValueList = list(map(int, input().split()))
ValueList.sort()
MaxValue = ValueList[-1]
MinValue = ValueList[0]
print(len(set(ValueList)))
print(ValueList.count(MinValue))
print(ValueList.count(MaxValue))
```

## 4.

Write a program that reads a list of integers and prints the following:

* The number of distinct integers in the list.
* The number of times that the smallest integer occurs in the list.
* The number of times that the largest integer occurs in the list.

For example, if the input is:

```
5
5 5 5 5 5
```

the output is:

```
1
5
```

```python
n = int(input())
ValueList = list(map(int, input().split()))
ValueList.sort()
MaxValue = ValueList[-1]
MinValue = ValueList[0]
print(len(set(ValueList)))
print(ValueList.count(MinValue))
print(ValueList.count(MaxValue))
```
/docs/python/python-100-days-exercise/day-01-15/day-01-15.md
# Day 01-15

## 1.

Write a program that reads a list of integers and prints the following:

* The number of distinct integers in the list.
* The number of times that the smallest integer occurs in the list.
* The number of times that the largest integer occurs in the list.

For example, if the input is:

```
5
5 5 5 5 5
```

the output is:

```
1
5
```

```python
n = int(input())
ValueList = list(map(int, input().split()))
ValueList.sort()
MaxValue = ValueList[-1]
MinValue = ValueList[0]
print(len(set(ValueList)))
print(ValueList.count(MinValue))
print(ValueList.count(MaxValue))
```

## 2.

Write a program that reads a list of integers and prints the following:

* The number of distinct integers in the list.
* The number of times that the smallest integer occurs in the list.
* The number of times that the largest integer occurs in the list.

For example, if the input is:

```
5
5 5 5 5 5
```

the output is:

```
1
5
```

```python
n = int(input())
ValueList = list(map(int, input().split()))
ValueList.sort()
MaxValue = ValueList[-1]
MinValue = ValueList[0]
print(len(set(ValueList)))
print(ValueList.count(MinValue))
print(ValueList.count(MaxValue))
```

## 3.

Write a program that reads a list of integers and prints the following:

* The number of distinct integers in the list.
* The number of times that the smallest integer occurs in the list.
* The number of times that the largest integer occurs in the list.

For example, if the input is:

```
5
5 5 5 5 5
```

the output is:

```
1
5
```

```python
n = int(input())
ValueList = list(map(int, input().split()))
ValueList.sort()
MaxValue = ValueList[-1]
MinValue = ValueList[0]
print(len(set(ValueList)))
print(ValueList.count(MinValue))
print(ValueList.count(MaxValue))
```

## 4.

Write a program that reads a list of integers and prints the following:

* The number of distinct integers in the list.
* The number of times that the smallest integer occurs in the list.
* The number of times that the largest integer occurs in the list.

For example, if the input is:

```
5
5 5 5 5 5
```

the output is:

```
1
5
```

```python
n = int(input())
ValueList = list(map(int, input().split()))
ValueList.sort()
MaxValue = ValueList[-1]
MinValue = ValueList[0]
print(len(set(ValueList)))
print(ValueList.count(MinValue))
print(ValueList.count(MaxValue))
```

## 5.

Write a program that reads a list of integers and prints the following:

* The number of distinct integers in the list.
* The number of times that the smallest integer occurs in the list.
* The number of times that the largest integer occurs in the list.

For example, if the input is:

```
5
5 5 5 5 5
```

the output is:

```
1
5
```

```python
n = int(input())
ValueList = list(map(int, input().split()))
ValueList.sort()
MaxValue = ValueList[-1]
MinValue = ValueList[0]
print(len(set(ValueList)))
print(ValueList.count(MinValue))
print(ValueList.count(MaxValue))
```

## 6.

Write a program that reads a list of integers and prints the following:

* The number of distinct integers in the list.
* The number of times that the smallest integer occurs in the list.
* The number of times that the largest integer occurs in the list.

For example, if the input is:

```
5
5 5 5 5 5
```

the output is:

```
1
5
```

```python
n = int(input())
ValueList = list(map(int, input().split()))
ValueList.sort()
MaxValue = ValueList[-1]
MinValue = ValueList[0]
print(len(set(ValueList)))
print(ValueList.count(MinValue))
print(ValueList.count(MaxValue))
```

## 7.

Write a program that reads a list of integers and prints the following:

* The number of distinct integers in the list.
* The number of times that the smallest integer occurs in the list.
* The number of times that the largest integer occurs in the list.

For example, if the input is:

```
5
5 5 5 5 5
```

the output is:

```
1
5
```

```python
n = int(input())
ValueList = list(map(int, input().split()))
ValueList.sort()
MaxValue = ValueList[-1]
MinValue = ValueList[0]
print(len(set(ValueList)))
print(ValueList.count(MinValue))
print(ValueList.count(MaxValue))
```

## 8.

Write a program that reads a list of integers and prints the following:

* The number of distinct integers in the list.
* The number of times that the smallest integer occurs in the list.
* The number of times that the largest integer occurs in the list.

For example, if the input is:

```
5
5 5 5 5 5
```

the output is:

```
1
5
```

```python
n = int(input())
ValueList = list(map(int, input().split()))
ValueList.sort()
MaxValue = ValueList[-1]
MinValue = ValueList[0]
print(len(set(ValueList)))
print(ValueList.count(MinValue))
print(ValueList.count(MaxValue))
```

## 9.

Write a program that reads a list of integers and prints the following:

* The number of distinct integers in the list.
* The number of times that the smallest integer occurs in the list.
* The number of times that the largest integer occurs in the list.

For example, if the input is:

```
5
5 5 5 5 5
```

the output is:

```
1
5
```

```python
n = int(input())
ValueList = list(map(int, input().split()))
ValueList.sort()
MaxValue = ValueList[-1]
MinValue = ValueList[0]
print(len(set(ValueList)))
print(ValueList.count(MinValue))
print(ValueList.count(MaxValue))
```

## 10.

Write a program that reads a list of integers and prints the following:

* The number of distinct integers in the list.
* The number of times that the smallest integer occurs in the list.
* The number of times that the largest integer occurs in the list.

For example, if the input is:

```
5
5 5 5 5 5
```

the output is:

```
1
5
```

```python
n = int(input())
ValueList = list(map(int, input().split()))
ValueList.sort()
MaxValue = ValueList[-1]
MinValue = ValueList[0]
print(len(set(ValueList)))
print(ValueList.count(MinValue))
print(ValueList.count(MaxValue))
```

## 11.

Write a program that reads a list of integers and prints the following:

* The number of distinct integers in the list.
* The number of times that the smallest integer occurs in the list.
* The number of times that the largest integer occurs in the list.

For example, if the input is:

```
5
5 5 5 5 5
```

the output is:

```
1
5
```

```python
n = int(input())
ValueList = list(map(int, input().split()))
ValueList.sort()
MaxValue = ValueList[-1]
MinValue = ValueList[0]
print(len(set(ValueList)))
print(ValueList.count(MinValue))
print(ValueList.count(MaxValue))
```

## 12.

Write a program that reads a list of integers and prints the following:

* The number of distinct integers in the list.
* The number of times that the smallest integer occurs in the list.
* The number of times that the largest integer occurs in the list.

For example, if the input is:

```
5
5 5 5 5 5
```

the output is:

```
1
5
```

```python
n = int(input())
ValueList = list(map(int, input().split()))
ValueList.sort()
MaxValue = ValueList[-1]
MinValue = ValueList[0]
print(len(set(ValueList)))
print(ValueList.count(MinValue))
print(ValueList.count(MaxValue))
```

## 13.

Write a program that reads a list of integers and prints the following:

* The number of distinct integers in the list.
* The number of times that the smallest integer occurs in the list.
* The number of times that the largest integer occurs in the list.

For example, if the input is:

```
5
5 5 5 5 5
```

the output is:

```
1
5
```

```python
n = int(input())
ValueList = list(map(int, input().split()))
ValueList.sort()
MaxValue = ValueList[-1]
MinValue = ValueList[0]
print(len(set(ValueList)))
print(ValueList.count(MinValue))
print(ValueList.count(MaxValue))
```

## 14.

Write a program that reads a list of integers and prints the following:

* The number of distinct integers in the list.
* The number of times that the smallest integer occurs in the list.
* The number of times that the largest integer occurs in the list.

For example, if the input is:

```
5
5 5 5 5 5
```

the output is:

```
1
5
```

```python
n = int(input())
ValueList = list(map(int, input().split()))
ValueList.sort()
MaxValue = ValueList[-1]
MinValue = ValueList[0]
print(len(set(ValueList)))
print(ValueList.count(MinValue))
print(ValueList.count(MaxValue))
```

## 15.

Write a program that reads a list of integers and prints the following:

* The number of distinct integers in the list.
* The number of times that the smallest integer occurs in the list.
* The number of times that the largest integer occurs in the list.

For example, if the input is:

```
5
5 5 5 5 5
```

the output is:

```
1
5
```

```python
n = int(input())
ValueList = list(map(int, input().split()))
ValueList.sort()
MaxValue = ValueList[-1]
MinValue = ValueList[0]
print(len(set(ValueList)))
print(ValueList.count(MinValue))
print(ValueList.count(MaxValue))
```


```

```python
n = int(input())
ValueList = list(map(int, input().split()))
ValueList.sort()
MaxValue = ValueList[-1]
MinValue = ValueList[0]
print(len(set(ValueList)))
print(ValueList.count(MinValue))
print(ValueList.count(
