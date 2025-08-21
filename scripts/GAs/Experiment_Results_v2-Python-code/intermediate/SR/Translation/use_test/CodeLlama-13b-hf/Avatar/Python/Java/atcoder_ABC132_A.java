
[JAV]
```java
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        Set<Character> Sa = new HashSet<>(Arrays.asList(S.toCharArray()));
        if (Sa.size() != 2) {
            System.out.println("No");
            return;
        }
        Map<Character, Integer> c = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            c.put(S.charAt(i), c.getOrDefault(S.charAt(i), 0) + 1);
        }
        for (int i = 0; i < S.length(); i++) {
            if (c.get(S.charAt(i)) != 2) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
```
[/JAV]

[PY]
```python
S = input()
Sa = set(list(S))
if len(Sa) != 2:
    print('No')
    exit()
c = {}
for i in S:
    c[i] = c.get(i, 0) + 1
for i in S:
    if c[i] != 2:
        print('No')
        exit()
print('Yes')
```
[/PY]

[C]
```c
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

int main() {
    char S[100000];
    scanf("%s", S);
    int len = strlen(S);
    char Sa[2];
    int cnt = 0;
    for (int i = 0; i < len; i++) {
        if (cnt == 2) {
            printf("No\n");
            return 0;
        }
        if (Sa[0] == S[i] || Sa[1] == S[i]) {
            continue;
        }
        Sa[cnt] = S[i];
        cnt++;
    }
    if (cnt != 2) {
        printf("No\n");
        return 0;
    }
    int c[2];
    for (int i = 0; i < len; i++) {
        if (S[i] == Sa[0]) {
            c[0]++;
        } else if (S[i] == Sa[1]) {
            c[1]++;
        }
    }
    if (c[0] != 2 || c[1] != 2) {
        printf("No\n");
        return 0;
    }
    printf("Yes\n");
    return 0;
}
```
[/C]

[CPP]
```cpp
#include <bits/stdc++.h>
using namespace std;

int main() {
    string S;
    cin >> S;
    set<char> Sa;
    for (int i = 0; i < S.length(); i++) {
        Sa.insert(S[i]);
    }
    if (Sa.size() != 2) {
        cout << "No" << endl;
        return 0;
    }
    map<char, int> c;
    for (int i = 0; i < S.length(); i++) {
        c[S[i]]++;
    }
    for (int i = 0; i < S.length(); i++) {
        if (c[S[i]] != 2) {
            cout << "No" << endl;
            return 0;
        }
    }
    cout << "Yes" << endl;
    return 0;
}
```
[/CPP]

[GO]
```go
package main

import (
    "fmt"
)

func main() {
    var S string
    fmt.Scan(&S)
    Sa := make(map[rune]int)
    for _, v := range S {
        Sa[v]++
    }
    if len(Sa) != 2 {
        fmt.Println("No")
        return
    }
    c := make(map[rune]int)
    for _, v := range S {
        c[v]++
    }
    for _, v := range S {
        if c[v] != 2 {
            fmt.Println("No")
            return
        }
    }
    fmt.Println("Yes")
}
```
[/GO]

[RB]
```ruby
gets
s = $_.chars
sa = s.uniq
if sa.size != 2
  puts "No"
  exit
end
c = {}
s.each do |i|
  c[i] = c[i].to_i + 1
end
s.each do |i|
  if c[i] != 2
    puts "No"
    exit
  end
end
puts "Yes"
```
[/RB]

[PHP]
```php
<?php
$S = trim(fgets(STDIN));
$Sa = array_unique(str_split($S));
if (count($Sa) != 2) {
    echo "No";
    exit;
}
$c = array_count_values(str_split($S));
foreach ($c as $v) {
    if ($v != 2) {
        echo "No";
        exit;
    }
}
echo "Yes";
```
[/PHP]

[PL]
```perl
use strict;
use warnings;

my $S = <STDIN>;
chomp $S;
my @Sa = sort(split(//, $S));
if (scalar(@Sa) != 2) {
    print "No\n";
    exit;
}
my %c = ();
foreach my $i (split(//, $S)) {
    $c{$i}++;
}
foreach my $i (split(//, $S)) {
    if ($c{$i} != 2) {
        print "No\n";
        exit;
    }
}
print "Yes\n";
```
[/PL]

[CS]
```csharp
using System;
using System.Collections.Generic;
using System.Linq;

class Program
{
    static void Main(string[] args)
    {
        string S = Console.ReadLine();
        HashSet<char> Sa = new HashSet<char>(S);
        if (Sa.Count != 2)
        {
            Console.WriteLine("No");
            return;
        }
        Dictionary<char, int> c = new Dictionary<char, int>();
        foreach (char i in S)
        {
            if (c.ContainsKey(i))
            {
                c[i]++;
            }
            else
            {
                c.Add(i, 1);
            }
        }
        foreach (char i in S)
        {
            if (c[i] != 2)
            {
                Console.WriteLine("No");
                return;
            }
        }
        Console.WriteLine("Yes");
    }
}
```
[/CS]

[BASH]
```bash
read S
Sa=$(echo $S | tr -d ' ' | sed 's/./& /g')
if [ $(echo $Sa | wc -w) -ne 2 ]; then
    echo "No"
    exit
fi
c=$(echo $S | tr -d ' ' | sed 's/./& /g')
if [ $(echo $c | wc -w) -ne 2 ]; then
    echo "No"
    exit
fi
echo "Yes"
```
[/BASH]

[BASH]
```bash
read S
Sa=$(echo $S | tr -d ' ' | sed 's/./& /g')
if [ $(echo $Sa | wc -w) -ne 2 ]; then
    echo "No"
    exit
fi
c=$(echo $S | tr -d ' ' | sed 's/./& /g')
if [ $(echo $c | wc -w) -ne 2 ]; then
    echo "No"
    exit
fi
echo "Yes"
```
[/BASH]

[BASH]
```bash
read S
Sa=$(echo $S | tr -d ' ' | sed 's/./& /g')
if [ $(echo $Sa | wc -w) -ne 2 ]; then
    echo "No"
    exit
fi
c=$(echo $S | tr -d ' ' | sed 's/./& /g')
if [ $(echo $c | wc -w) -ne 2 ]; then
    echo "No"
    exit
fi
echo "Yes"
```
[/BASH]

[BASH]
```bash
read S
Sa=$(echo $S | tr -d ' ' | sed 's/./& /g')
if [ $(echo $Sa | wc -w) -ne 2 ]; then
    echo "No"
    exit
fi
c=$(echo $S | tr -d ' ' | sed 's/./& /g')
if [ $(echo $c | wc -w) -ne 2 ]; then
    echo "No"
    exit
fi
echo "Yes"
```
[/BASH]

[BASH]
```bash
read S
Sa=$(echo $S | tr -d ' ' | sed 's/./& /g')
if [ $(echo $Sa | wc -w) -ne 2 ]; then
    echo "No"
    exit
fi
c=$(echo $S | tr -d ' ' | sed 's/./& /g')
if [ $(echo $c | wc -w) -ne 2 ]; then
    echo "No"
    exit
fi
echo "Yes"
```
[/BASH]

[BASH]
```bash
read S
Sa=$(echo $S | tr -d ' ' | sed 's/./& /g')
if [ $(echo $Sa | wc -w) -ne 2 ]; then
    echo "No"
    exit
fi
c=$(echo $S | tr -d ' ' | sed 's/./& /g')
if [ $(echo $c | wc -w) -ne 2 ]; then
    echo "No"
    exit
fi
echo "Yes"
```
[/BASH]

[BASH]
```bash
read S
Sa=$(echo $S | tr -d ' ' | sed 's/./& /g')
if [ $(echo $Sa | wc -w) -ne 2 ]; then
    echo "No"
    exit
fi
c=$(echo $S | tr -d ' ' | sed 's/./& /g')
if [ $(echo $c | wc -w) -ne 2 ]; then
    echo "No"
    exit
fi
echo "Yes"
```
[/BASH]

[BASH]
```bash
read S
Sa=$(echo $S | tr -d ' ' | sed 's/./& /g')
if [ $(echo $Sa | wc -w) -ne 2 ]; then
    echo "No"
    exit
fi
c=$(echo $S | tr -d ' ' | sed 's/./& /g')
if [ $(echo $c | wc -w) -ne 2 ]; then
    echo "No"
    exit
fi
echo "Yes"
```
[/BASH]

[BASH]
```bash
read S
Sa=$(echo $S | tr -d ' ' | sed 's/./& /g')
if [ $(echo $Sa | wc -w) -ne 2 ]; then
    echo "No"
    exit
fi
c=$(echo $S | tr -d ' ' | sed 's/./& /g')
if [ $(echo $c | wc -w) -ne 2 ]; then
    echo "No"
    exit
fi
echo "Yes"
```
[/BASH]

[BASH]
```bash
read S
Sa=$(echo $S | tr -d ' ' | sed 's/./& /g')
if [ $(echo $Sa | wc -w) -ne 2 ]; then
    echo "No"
    exit
fi
c=$(echo $S | tr -d ' ' | sed 's/./& /g')
if [ $(echo $c | wc -w) -ne 2 ]; then
    echo "No"
    exit
fi
echo "Yes"
```
[/BASH]

[BASH]
```bash
read S
Sa=$(echo $S | tr -d ' ' | sed 's/./& /g')
if [ $(echo $Sa | wc -w) -ne 2 ]; then
    echo "No"
    exit
fi
c=$(echo $S | tr -d ' ' | sed 's/./& /g')
if [ $(echo $c | wc -w) -ne 2 ]; then
    echo "No"
    exit
fi
echo "Yes"
```
[/BASH]

[BASH]
```bash
read S
Sa=$(echo $S | tr -d ' ' | sed 's/./& /g')
if [ $(echo $Sa | wc -w) -ne 2 ]; then
    echo "No"
    exit
fi
c=$(echo $S | tr -d ' ' | sed 's/./& /g')
if [ $(echo $c | wc -w) -ne 2 ]; then
    echo "No"
    exit
fi
echo "Yes"
```
[/BASH]

[BASH]
```bash
read S
Sa=$(echo $S | tr -d ' ' | sed 's/./& /g')
if [ $(echo $Sa | wc -w) -ne 2 ]; then
    echo "No"
    exit
fi
c=$(echo $S | tr -d ' ' | sed 's/./& /g')
if [ $(echo $c | wc -w) -ne 2 ]; then
    echo "No"
    exit
fi
echo "Yes"
```
[/BASH]

[BASH]
```bash
read S
Sa=$(echo $S | tr -d ' ' | sed 's/./& /g')
if [ $(echo $Sa | wc -w) -ne 2 ]; then
    echo "No"
    exit
fi
c=$(echo $S | tr -d ' ' | sed 's/./& /g')
if [ $(echo $c | wc -w) -ne 2 ]; then
    echo "No"
    exit
fi
echo "Yes"
```
[/BASH]

[BASH]
```bash
read S
Sa=$(echo $S | tr -d ' ' | sed 's/./& /g')
if [ $(echo $Sa | wc -w) -ne 2 ]; then
    echo "No"
    exit
fi
c=$(echo $S | tr -d ' ' | sed 's/./& /g')
if [ $(echo $c | wc -w) -
