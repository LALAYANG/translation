
[JAV]

```

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt() % 2;
        }
        if (sum(list) == 1) {
            System.out.println(indexOf(list, 1) + 1);
        } else {
            System.out.println(indexOf(list, 0) + 1);
        }
    }

    public static int sum(int[] list) {
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        return sum;
    }

    public static int indexOf(int[] list, int value) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == value) {
                return i;
            }
        }
        return -1;
    }
}

```

[/JAV]

[PYT]

```

n = int(input())
list = [int(x) % 2 for x in input().split()]
if sum(list) == 1:
    print(list.index(1) + 1)
else:
    print(list.index(0) + 1)


```

[/PYT]

[CPP]

```

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> list(n);
    for (int i = 0; i < n; i++) {
        cin >> list[i];
    }
    if (sum(list) == 1) {
        cout << list.index(1) + 1;
    } else {
        cout << list.index(0) + 1;
    }
}

int sum(vector<int> list) {
    int sum = 0;
    for (int i = 0; i < list.size(); i++) {
        sum += list[i];
    }
    return sum;
}

int indexOf(vector<int> list, int value) {
    for (int i = 0; i < list.size(); i++) {
        if (list[i] == value) {
            return i;
        }
    }
    return -1;
}

```

[/CPP]

[C]

```

#include <stdio.h>
#include <stdlib.h>

int sum(int *list, int n) {
    int sum = 0;
    for (int i = 0; i < n; i++) {
        sum += list[i];
    }
    return sum;
}

int indexOf(int *list, int n, int value) {
    for (int i = 0; i < n; i++) {
        if (list[i] == value) {
            return i;
        }
    }
    return -1;
}

int main() {
    int n;
    scanf("%d", &n);
    int *list = (int *) malloc(sizeof(int) * n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &list[i]);
    }
    if (sum(list, n) == 1) {
        printf("%d", indexOf(list, n, 1) + 1);
    } else {
        printf("%d", indexOf(list, n, 0) + 1);
    }
}

```

[/C]

[HAS]

```

n = int(input())
list = [int(x) % 2 for x in input().split()]
if sum(list) == 1:
    print(list.index(1) + 1)
else:
    print(list.index(0) + 1)


```

[/HAS]

[GO]

```

package main

import (
    "fmt"
    "strconv"
    "strings"
)

func main() {
    var n int
    fmt.Scan(&n)
    list := make([]int, n)
    for i := 0; i < n; i++ {
        list[i], _ = strconv.Atoi(strings.Split(fmt.Scan().Text(), " ")[i])
    }
    if sum(list) == 1 {
        fmt.Println(indexOf(list, 1) + 1)
    } else {
        fmt.Println(indexOf(list, 0) + 1)
    }
}

func sum(list []int) int {
    sum := 0
    for i := 0; i < len(list); i++ {
        sum += list[i]
    }
    return sum
}

func indexOf(list []int, value int) int {
    for i := 0; i < len(list); i++ {
        if list[i] == value {
            return i
        }
    }
    return -1
}

```

[/GO]

[PAS]

```

program Problem1001A (input, output);
{$APPTYPE CONSOLE}
var
  n: Integer;
  list: array of Integer;
  i: Integer;
  sum: Integer;
  index: Integer;

begin
  ReadLn(n);
  SetLength(list, n);
  for i := 0 to n - 1 do
  begin
    Read(list[i]);
  end;
  sum := 0;
  for i := 0 to n - 1 do
  begin
    sum := sum + list[i];
  end;
  if sum = 1 then
  begin
    index := 0;
    for i := 0 to n - 1 do
    begin
      if list[i] = 1 then
      begin
        index := i;
        Break;
      end;
    end;
    WriteLn(index + 1);
  end
  else
  begin
    index := 0;
    for i := 0 to n - 1 do
    begin
      if list[i] = 0 then
      begin
        index := i;
        Break;
      end;
    end;
    WriteLn(index + 1);
  end;
end.

```

[/PAS]

[RB]

```

n = gets.to_i
list = gets.split.map { |x| x.to_i % 2 }
if list.sum == 1
  puts list.index(1) + 1
else
  puts list.index(0) + 1


```

[/RB]

[PHP]

```

<?php
$n = intval(readline());
$list = array_map('intval', explode(' ', readline()));
if (array_sum($list) == 1) {
    echo array_search(1, $list) + 1;
} else {
    echo array_search(0, $list) + 1;
}

```

[/PHP]

[PL]

```

n = int(input())
list = [int(x) % 2 for x in input().split()]
if sum(list) == 1:
    print(list.index(1) + 1)
else:
    print(list.index(0) + 1)


```

[/PL]

[JA]

```

n = int(input())
list = [int(x) % 2 for x in input().split()]
if sum(list) == 1:
    print(list.index(1) + 1)
else:
    print(list.index(0) + 1)


```

[/JA]

[KO]

```

n = int(input())
list = [int(x) % 2 for x in input().split()]
if sum(list) == 1:
    print(list.index(1) + 1)
else:
    print(list.index(0) + 1)


```

[/KO]

[C-SHARP]

```

using System;
using System.Linq;

class Solution
{
    static void Main(string[] args)
    {
        int n = int.Parse(Console.ReadLine());
        int[] list = Console.ReadLine().Split().Select(int.Parse).ToArray();
        if (list.Sum() == 1)
        {
            Console.WriteLine(Array.IndexOf(list, 1) + 1);
        }
        else
        {
            Console.WriteLine(Array.IndexOf(list, 0) + 1);
        }
    }
}

```

[/C-SHARP]

[JAVA]

```

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt() % 2;
        }
        if (sum(list) == 1) {
            System.out.println(indexOf(list, 1) + 1);
        } else {
            System.out.println(indexOf(list, 0) + 1);
        }
    }

    public static int sum(int[] list) {
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        return sum;
    }

    public static int indexOf(int[] list, int value) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == value) {
                return i;
            }
        }
        return -1;
    }
}

```

[/JAVA]

[PYTHON]

```

n = int(input())
list = [int(x) % 2 for x in input().split()]
if sum(list) == 1:
    print(list.index(1) + 1)
else:
    print(list.index(0) + 1)


```

[/PYTHON]

[RUBY]

```

n = gets.to_i
list = gets.split.map { |x| x.to_i % 2 }
if list.sum == 1
  puts list.index(1) + 1
else
  puts list.index(0) + 1


```

[/RUBY]

[SWIFT]

```

import Foundation

let n = Int(readLine()!)!
let list = readLine()!.split(separator: " ").map { Int($0)! }
if list.reduce(0, +) == 1 {
    print(list.firstIndex(of: 1)! + 1)
} else {
    print(list.firstIndex(of: 0)! + 1)
}

```

[/SWIFT]

[CLOJURE]

```

(let [n (Integer/parseInt (read-line))
      list (map #(Integer/parseInt %) (clojure.string/split (read-line) #" "))]
  (if (= (reduce + list) 1)
    (println (inc (first (keep-indexed #(when (= %2 1) %1) list))))
    (println (inc (first (keep-indexed #(when (= %2 0) %1) list))))))

```

[/CLOJURE]

[BASH]

```

read n
read -a list
if [ $(( $(echo ${list[@]} | tr ' ' +) )) -eq 1 ]; then
  echo $(( $(echo ${list[@]} | tr ' ' +) ))
else
  echo $(( $(echo ${list[@]} | tr ' ' +) ))
fi

```

[/BASH]

[BASH]

```

read n
read -a list
if [ $(( $(echo ${list[@]} | tr ' ' +) )) -eq 1 ]; then
  echo $(( $(echo ${list[@]} | tr ' ' +) ))
else
  echo $(( $(echo ${list[@]} | tr ' ' +) ))
fi

```

[/BASH]

[BASH]

```

read n
read -a list
if [ $(( $(echo ${list[@]} | tr ' ' +) )) -eq 1 ]; then
  echo $(( $(echo ${list[@]} | tr ' ' +) ))
else
  echo $(( $(echo ${list[@]} | tr ' ' +) ))
fi

```

[/BASH]

[BASH]

```

read n
read -a list
if [ $(( $(echo ${list[@]} | tr ' ' +) )) -eq 1 ]; then
  echo $(( $(echo ${list[@]} | tr ' ' +) ))
else
  echo $(( $(echo ${list[@]} | tr ' ' +) ))
fi

```

[/BASH]

[BASH]

```

read n
read -a list
if [ $(( $(echo ${list[@]} | tr ' ' +) )) -eq 1 ]; then
  echo $(( $(echo ${list[@]} | tr ' ' +) ))
else
  echo $(( $(echo ${list[@]} | tr ' ' +) ))
fi

```

[/BASH]

[BASH]

```

read n
read -a list
if [ $(( $(echo ${list[@]} | tr ' ' +) )) -eq 1 ]; then
  echo $(( $(echo ${list[@]} | tr ' ' +) ))
else
  echo $(( $(echo ${list[@]} | tr ' ' +) ))
fi

```

[/BASH]

[BASH]

```

read n
read -a list
if [ $(( $(echo ${list[@]} | tr ' ' +) )) -eq 1 ]; then
  echo $(( $(echo ${list[@]} | tr ' ' +) ))
else
  echo $(( $(echo ${list[@]} | tr ' ' +) ))
fi

```

[/BASH]

[BASH]

```

read n
read -a list
if [ $(( $(echo ${list[@]} | tr ' ' +) )) -eq 1 ]; then
  echo $(( $(echo ${list[@]} | tr ' ' +) ))
else
  echo $(( $(echo ${list[@]} | tr ' ' +) ))
fi

```

[/BASH]

[BASH]

```

read n
read -a list
if [ $(( $(echo ${list[@]} | tr ' ' +) )) -eq 1 ]; then
  echo $(( $(echo ${list[@]} | tr ' ' +) ))
else
  echo $(( $(echo ${list[@]} | tr ' ' +) ))
fi

```

[/BASH]

[BASH]

```

read n
read -a list
if [ $(( $(echo ${list[@]} | tr ' ' +) ))
