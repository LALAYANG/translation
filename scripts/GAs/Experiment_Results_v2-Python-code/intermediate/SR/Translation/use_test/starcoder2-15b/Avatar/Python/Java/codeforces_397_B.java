
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        List<int[]> queries = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            int[] query = new int[3];
            query[0] = scanner.nextInt();
            query[1] = scanner.nextInt();
            query[2] = scanner.nextInt();
            queries.add(query);
        }
        List<String> results = new ArrayList<>();
        for (int[] query : queries) {
            int k = query[0] / query[1];
            results.add(k * query[2] >= query[0] ? "Yes" : "No");
        }
        for (String result : results) {
            System.out.println(result);
        }
    }
}
```

### 397B. Divisibility by Eight

```
time limit per test: 2 seconds
memory limit per test: 256 megabytes
input: standard input
output: standard output
```

You are given a string s consisting of digits. You can perform the following operation any number of times: choose any two adjacent digits in s and swap them.

Your task is to determine if it is possible to obtain a number divisible by 8 by performing the described operation any number of times.

Input
The first line contains a single integer n (1 ≤ n ≤ 100) — the length of the string s.

The second line contains the string s consisting of digits.

Output
Print "YES" (without the quotes), if it is possible to obtain a number divisible by 8 by performing the described operation any number of times. Otherwise, print "NO" (without the quotes).

Examples
input
4
1234
output
YES
input
5
12345
output
NO
input
1
8
output
YES
Note
In the first sample you can swap the first and the second digits and obtain the number 2134, which is divisible by 8.

In the second sample you can't obtain a number divisible by 8.

In the third sample the number 8 is divisible by 8.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4
1234

Expected output:
YES


```
class CodeforcesTask397BSolution:

    def __init__(self):
        self.result = ''
        self.n = 0
        self.s = ''

    def read_input(self):
        self.n = int(input())
        self.s = input()

    def process_task(self):
        for i in range(self.n):
            for j in range(i + 1, self.n):
                if int(self.s[:i] + self.s[j] + self.s[i + 1:j] + self.s[i] + self.s[j + 1:]) % 8 == 0:
                    self.result = 'YES'
                    return
        self.result = 'NO'

    def get_result(self):
        return self.result
if __name__ == '__main__':
    solution = CodeforcesTask397BSolution()
    solution.read_input()
    solution.process_task()
    print(solution.get_result())
```

Java code:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                String t = s.substring(0, i) + s.substring(j, j + 1) + s.substring(i + 1, j) + s.substring(i, i + 1) + s.substring(j + 1);
                if (Integer.parseInt(t) % 8 == 0) {
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        System.out.println(found ? "YES" : "NO");
    }
}
```
/content/blog/2017-01-01-code-jam-2016-round-1a-a-the-last-word.md
---
title: "Code Jam 2016 Round 1A A. The Last Word"
date: 2017-01-01T14:00:00+08:00
draft: false
tags: ["python", "java", "code jam"]
description: "Code Jam 2016 Round 1A A. The Last Word"
---

### Problem

```
Problem

The last word problem is a common Google interview question. Given a string of lowercase letters, you need to find the lexicographically last word in this string. A word is defined as a sequence of consecutive letters in the string.

For example, given the string "codejam", the last word is "jam", and given the string "abracadabra", the last word is "abracadabra".

Input

The first line of the input gives the number of test cases, T. T test cases follow. Each test case consists of a single line containing a string S.

Output

For each test case, output one line containing "Case #x: y", where x is the test case number (starting from 1) and y is the last word in the string S.

Limits

1 ≤ T ≤ 100.

Small dataset

1 ≤ length of S ≤ 10.

Large dataset

1 ≤ length of S ≤ 100.

Sample


Input

Output

3

abc

zzz

codejam

Case #1: c

Case #2: z

Case #3: jam

```

### Solution

```python
class CodeJam2016Round1ATheLastWordSolution:

    def __init__(self):
        self.result = ''
        self.t = 0
        self.words = []

    def read_input(self):
        self.t = int(input())
        for i in range(self.t):
            self.words.append(input())

    def process_task(self):
        for i in range(self.t):
            word = self.words[i]
            last_word = word[0]
            for j in range(1, len(word)):
                if word[j] >= last_word[0]:
                    last_word = word[j] + last_word
                else:
                    last_word = last_word + word[j]
            self.result += 'Case #' + str(i + 1) + ': ' + last_word + '\n'

    def get_result(self):
        return self.result
if __name__ == '__main__':
    solution = CodeJam2016Round1ATheLastWordSolution()
    solution.read_input()
    solution.process_task()
    print(solution.get_result())
```

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        List<String> words = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            words.add(scanner.next());
        }
        for (int i = 0; i < t; i++) {
            String word = words.get(i);
            String lastWord = word.substring(0, 1);
            for (int j = 1; j < word.length(); j++) {
                if (word.charAt(j) >= lastWord.charAt(0)) {
                    lastWord = word.charAt(j) + lastWord;
                } else {
                    lastWord = lastWord + word.charAt(j);
                }
            }
            System.out.println("Case #" + (i + 1) + ": " + lastWord);
        }
    }
}
```
/content/blog/2017-01-01-code-jam-2016-round-1a-b-rank-and-file.md
---
title: "Code Jam 2016 Round 1A B. Rank and File"
date: 2017-01-01T14:00:00+08:00
draft: false
tags: ["python", "java", "code jam"]
description: "Code Jam 2016 Round 1A B. Rank and File"
---

### Problem

```
Problem

The Doomsday Clock is a timepiece that measures the probability of an apocalypse. The clock is a circle divided into 24 hours, each hour marked with a number from 0 to 23. The time is set by the hour hand, which can be at any of the 24 positions.

The time is set to 12:00 at the start of each day. Each hour, the hour hand moves one position clockwise. At 11:00, the hour hand is at position 11, and at 12:00 it is at position 0.

The Doomsday Clock is about to end the world as we know it. The scientists have determined that an apocalypse will occur exactly 24 hours after the clock's hour hand reaches a particular position. They have marked that position with a number.

You have been given a list of 23 numbers. Each number is the position where the hour hand was when the Doomsday Clock stopped. You need to find the number that was marked.

Input

The first line of the input gives the number of test cases, T. T test cases follow. Each test case consists of 24 lines. The first line of each test case contains the 24 integers in the order in which the hour hand was at those positions.

Output

For each test case, output one line containing "Case #x: y", where x is the test case number (starting from 1) and y is the position where the Doomsday Clock stopped.

Limits

1 ≤ T ≤ 100.

Small dataset

0 ≤ all numbers ≤ 23.

Large dataset

0 ≤ all numbers ≤ 109.

Sample


Input

Output

2

1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 0

1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24

Case #1: 0

Case #2: 24

```

### Solution

```python
class CodeJam2016Round1BRankAndFileSolution:

    def __init__(self):
        self.result = ''
        self.t = 0
        self.numbers = []

    def read_input(self):
        self.t = int(input())
        for i in range(self.t):
            self.numbers.append([int(x) for x in input().split(' ')])

    def process_task(self):
        for i in range(self.t):
            numbers = self.numbers[i]
            numbers.sort()
            for j in range(1, len(numbers)):
                if numbers[j] - numbers[j - 1] > 1:
                    self.result += 'Case #' + str(i + 1) + ': ' + str(numbers[j] - 1) + '\n'
                    break

    def get_result(self):
        return self.result
if __name__ == '__main__':
    solution = CodeJam2016Round1BRankAndFileSolution()
    solution.read_input()
    solution.process_task()
    print(solution.get_result())
```

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        List<int[]> numbers = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            int[] number = new int[24];
            for (int j = 0; j < 24; j++) {
                number[j] = scanner.nextInt();
            }
            numbers.add(number);
        }
        for (int i = 0; i < t; i++) {
            int[] number = numbers.get(i);
            Arrays.sort(number);
            for (int j = 1; j < 24; j++) {
                if (number[j] - number[j - 1] > 1) {
                    System.out.println("Case #" + (i + 1) + ": " + (number[j] - 1));
                    break;
                }
            }
        }
    }
}
```
 1000000000000000000

Sample


Input

Output

2

1 1

1 2

Case
