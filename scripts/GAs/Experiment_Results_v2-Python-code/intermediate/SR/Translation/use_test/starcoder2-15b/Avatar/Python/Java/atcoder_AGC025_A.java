

```java

```

## Question 4

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum_list(items):
    sum_numbers = 0
    for x in items:
        sum_numbers += x
    return sum_numbers
print(sum_list([1,2,-8]))
```

## Question 5

Write a function that takes a list of numbers and returns the largest number in the list.

```
def max_num_in_list( list ):
    max = list[ 0 ]
    for a in list:
        if a > max:
            max = a
    return max
print(max_num_in_list([1, 2, -8, 0]))
```

## Question 6

Write a function that takes a list of strings and returns the longest string in the list.

```
def find_longest_word(words_list):
    word_len = []
    for n in words_list:
        word_len.append((len(n), n))
    word_len.sort()
    return word_len[-1][1]

print(find_longest_word(["PHP", "Exercises", "Backend"]))
```

## Question 7

Write a function that takes a list of strings and returns the shortest string in the list.

```
def find_shortest_word(words_list):
    word_len = []
    for n in words_list:
        word_len.append((len(n), n))
    word_len.sort()
    return word_len[0][1]

print(find_shortest_word(["PHP", "Exercises", "Backend"]))
```

## Question 8

Write a function that takes a list of numbers and returns a new list with the unique elements of the first list.

```
def unique_list(l):
  x = []
  for a in l:
    if a not in x:
      x.append(a)
  return x

print(unique_list([1,2,3,3,3,3,4,5]))
```

## Question 9

Write a function that takes a list of numbers and returns a new list with the elements in reverse order.

```
def reverse_list(l):
  l.reverse()
  return l

print(reverse_list([1,2,3,4,5]))
```

## Question 10

Write a function that takes a list of numbers and returns a new list with the elements in sorted order.

```
def sort_list(l):
  l.sort()
  return l

print(sort_list([1,2,3,4,5]))
```

