
[JAV]
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        int[] arr = new int[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = map.getOrDefault((char) (i + 'a'), 0);
        }
        Arrays.sort(arr);
        map.clear();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        int[] arr2 = new int[26];
        for (int i = 0; i < 26; i++) {
            arr2[i] = map.getOrDefault((char) (i + 'a'), 0);
        }
        Arrays.sort(arr2);
        if (Arrays.equals(arr, arr2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

```
[/JAV]

[TOC]

# 1. 문제

## 1.1. 문제 설명

두 문자열 s와 t가 주어집니다. 이때, s의 글자를 하나씩 뽑아 t에 포함되어 있으면 "Yes", 아니라면 "No"를 출력하는 프로그램을 작성하세요.

## 1.2. 입력 형식

첫 번째 줄에 s가 주어집니다. 두 번째 줄에 t가 주어집니다.

## 1.3. 출력 형식

첫 번째 줄에 "Yes" 또는 "No"를 출력합니다.

## 1.4. 입출력 예제

### 1.4.1. 예제 입력 1

```
chokudai
redcoder
```

### 1.4.2. 예제 출력 1

```
No
```

### 1.4.3. 예제 입력 2

```
chokudai
chokudai
```

### 1.4.4. 예제 출력 2

```
Yes
```

### 1.4.5. 예제 입력 3

```
chokudai
chokudai
```

### 1.4.6. 예제 출력 3

```
Yes
```

## 1.5. 예제 입출력 설명

### 1.5.1. 예제 입출력 설명 1

s에는 'c', 'h', 'o', 'k', 'u', 'd', 'a', 'i'가 있고, t에는 'r', 'e', 'd', 'c', 'o', 'd', 'e', 'r'가 있습니다.

### 1.5.2. 예제 입출력 설명 2

s와 t가 같으므로 "Yes"를 출력합니다.

### 1.5.3. 예제 입출력 설명 3

s와 t가 같으므로 "Yes"를 출력합니다.

# 2. 문제 풀이

## 2.1. 문제 파악

## 2.2. 알고리즘 설계

## 2.3. 알고리즘 구현

# 3. 코드

[JAV]
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        int[] arr = new int[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = map.getOrDefault((char) (i + 'a'), 0);
        }
        Arrays.sort(arr);
        map.clear();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        int[] arr2 = new int[26];
        for (int i = 0; i < 26; i++) {
            arr2[i] = map.getOrDefault((char) (i + 'a'), 0);
        }
        Arrays.sort(arr2);
        if (Arrays.equals(arr, arr2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

```
[/JAV]

[PY]
```python
import collections
def run ( s , t ) :
    ss = sorted ( list ( collections.Counter ( s ).values ( ) ) )
    tt = sorted ( list ( collections.Counter ( t ).values ( ) ) )
    if ss == tt :
        return 'Yes'
    else :
        return 'No'
def main ( ) :
    s = input ( )
    t = input ( )
    print ( run ( s , t ) )
if __name__ == '__main__' :
    main ( )

```
[/PY]

[C]
```c
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    char s[1000001], t[1000001];
    int i, j, k, cnt[26] = {0};
    scanf("%s", s);
    scanf("%s", t);
    for (i = 0; i < strlen(s); i++) {
        cnt[s[i] - 'a']++;
    }
    for (i = 0; i < 26; i++) {
        printf("%d ", cnt[i]);
    }
    printf("\n");
    for (i = 0; i < strlen(t); i++) {
        cnt[t[i] - 'a']++;
    }
    for (i = 0; i < 26; i++) {
        printf("%d ", cnt[i]);
    }
    printf("\n");
    return 0;
}

```
[/C]

[C++]
```cpp
#include <iostream>
#include <string>
#include <map>
#include <algorithm>
using namespace std;

int main() {
    string s, t;
    cin >> s >> t;
    map<char, int> m;
    for (int i = 0; i < s.length(); i++) {
        m[s[i]]++;
    }
    for (int i = 0; i < t.length(); i++) {
        m[t[i]]++;
    }
    int arr[26] = {0};
    for (int i = 0; i < 26; i++) {
        arr[i] = m[i + 'a'];
    }
    sort(arr, arr + 26);
    m.clear();
    for (int i = 0; i < t.length(); i++) {
        m[t[i]]++;
    }
    int arr2[26] = {0};
    for (int i = 0; i < 26; i++) {
        arr2[i] = m[i + 'a'];
    }
    sort(arr2, arr2 + 26);
    if (arr[0] == arr2[0] && arr[1] == arr2[1] && arr[2] == arr2[2]) {
        cout << "Yes" << endl;
    } else {
        cout << "No" << endl;
    }
    return 0;
}

```
[/C++]

[GO]
```go
package main

import (
	"fmt"
	"sort"
)

func main() {
	var s, t string
	fmt.Scan(&s, &t)
	m := make(map[rune]int)
	for _, v := range s {
		m[v]++
	}
	for _, v := range t {
		m[v]++
	}
	arr := make([]int, 26)
	for i := 0; i < 26; i++ {
		arr[i] = m[rune(i+'a')]
	}
	sort.Ints(arr)
	m = make(map[rune]int)
	for _, v := range t {
		m[v]++
	}
	arr2 := make([]int, 26)
	for i := 0; i < 26; i++ {
		arr2[i] = m[rune(i+'a')]
	}
	sort.Ints(arr2)
	if arr[0] == arr2[0] && arr[1] == arr2[1] && arr[2] == arr2[2] {
		fmt.Println("Yes")
	} else {
		fmt.Println("No")
	}
}

```
[/GO]

[RUBY]
```ruby
s = gets.chomp
t = gets.chomp
m = {}
s.each_char { |c| m[c] = m[c].to_i + 1 }
t.each_char { |c| m[c] = m[c].to_i + 1 }
arr = []
26.times { |i| arr << m[i + 'a'] }
arr.sort!
m = {}
t.each_char { |c| m[c] = m[c].to_i + 1 }
arr2 = []
26.times { |i| arr2 << m[i + 'a'] }
arr2.sort!
if arr[0] == arr2[0] && arr[1] == arr2[1] && arr[2] == arr2[2]
  puts "Yes"
else
  puts "No"
end

```
[/RUBY]

[PHP]
```php
<?php
$s = trim(fgets(STDIN));
$t = trim(fgets(STDIN));
$m = [];
for ($i = 0; $i < strlen($s); $i++) {
    $m[$s[$i]] = $m[$s[$i]] + 1;
}
for ($i = 0; $i < strlen($t); $i++) {
    $m[$t[$i]] = $m[$t[$i]] + 1;
}
$arr = [];
for ($i = 0; $i < 26; $i++) {
    $arr[$i] = $m[$i + 'a'];
}
sort($arr);
$m = [];
for ($i = 0; $i < strlen($t); $i++) {
    $m[$t[$i]] = $m[$t[$i]] + 1;
}
$arr2 = [];
for ($i = 0; $i < 26; $i++) {
    $arr2[$i] = $m[$i + 'a'];
}
sort($arr2);
if ($arr[0] == $arr2[0] && $arr[1] == $arr2[1] && $arr[2] == $arr2[2]) {
    echo "Yes" . PHP_EOL;
} else {
    echo "No" . PHP_EOL;
}

```
[/PHP]

[PYTHON]
```python
s = input()
t = input()
m = {}
for c in s:
    m[c] = m.get(c, 0) + 1
for c in t:
    m[c] = m.get(c, 0) + 1
arr = []
for i in range(26):
    arr.append(m.get(chr(i + ord('a')), 0))
arr.sort()
m = {}
for c in t:
    m[c] = m.get(c, 0) + 1
arr2 = []
for i in range(26):
    arr2.append(m.get(chr(i + ord('a')), 0))
arr2.sort()
if arr[0] == arr2[0] and arr[1] == arr2[1] and arr[2] == arr2[2]:
    print("Yes")
else:
    print("No")

```
[/PYTHON]

[SWIFT]
```swift
import Foundation

var s = readLine()!
var t = readLine()!
var m = [Character: Int]()
for c in s {
    m[c] = m[c] ?? 0 + 1
}
for c in t {
    m[c] = m[c] ?? 0 + 1
}
var arr = [Int]()
for i in 0..<26 {
    arr.append(m[
