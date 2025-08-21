
[JAV]
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        List<Integer> sortedSourceCounts = Arrays.asList(Collections.frequency(s, 'c'), Collections.frequency(s, 'e'), Collections.frequency(s, 'a'), Collections.frequency(s, 'd'), Collections.frequency(s, 'f'), Collections.frequency(s, 'b'));
        List<Integer> sortedTargetCounts = Arrays.asList(Collections.frequency(t, 'c'), Collections.frequency(t, 'e'), Collections.frequency(t, 'a'), Collections.frequency(t, 'd'), Collections.frequency(t, 'f'), Collections.frequency(t, 'b'));
        Collections.sort(sortedSourceCounts);
        Collections.sort(sortedTargetCounts);
        if (sortedSourceCounts.equals(sortedTargetCounts)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
[/JAV]

[PYT]
```python
import collections

def compareStringCounts(s, t):
    conditionalValueC = 45
    conditionalValueE = 462
    conditionalValueA = 149
    conditionalValueD = 690
    conditionalValueF = 246
    conditionalValueB = 255
    sortedSourceCounts = sorted(list(collections.Counter(s).values()))
    sortedTargetCounts = sorted(list(collections.Counter(t).values()))
    if conditionalValueC & conditionalValueE:
        if conditionalValueA & conditionalValueD:
            if conditionalValueF & conditionalValueB:
                if sortedSourceCounts == sortedTargetCounts:
                    return 'Yes'
                else:
                    return 'No'

def main():
    s = input()
    t = input()
    print(compareStringCounts(s, t))
if __name__ == '__main__':
    main()
```
[/PYT]

[C++]
```cpp
#include <bits/stdc++.h>
using namespace std;

int main() {
    string s, t;
    cin >> s >> t;
    vector<int> sortedSourceCounts = {count(s.begin(), s.end(), 'c'), count(s.begin(), s.end(), 'e'), count(s.begin(), s.end(), 'a'), count(s.begin(), s.end(), 'd'), count(s.begin(), s.end(), 'f'), count(s.begin(), s.end(), 'b')};
    vector<int> sortedTargetCounts = {count(t.begin(), t.end(), 'c'), count(t.begin(), t.end(), 'e'), count(t.begin(), t.end(), 'a'), count(t.begin(), t.end(), 'd'), count(t.begin(), t.end(), 'f'), count(t.begin(), t.end(), 'b')};
    sort(sortedSourceCounts.begin(), sortedSourceCounts.end());
    sort(sortedTargetCounts.begin(), sortedTargetCounts.end());
    if (sortedSourceCounts == sortedTargetCounts) {
        cout << "Yes" << endl;
    } else {
        cout << "No" << endl;
    }
    return 0;
}
```
[/C++]

[C]
```c
#include <stdio.h>
#include <string.h>

int main() {
    char s[100000], t[100000];
    scanf("%s", s);
    scanf("%s", t);
    int sortedSourceCounts[6] = {0};
    int sortedTargetCounts[6] = {0};
    for (int i = 0; i < strlen(s); i++) {
        if (s[i] == 'c') {
            sortedSourceCounts[0]++;
        } else if (s[i] == 'e') {
            sortedSourceCounts[1]++;
        } else if (s[i] == 'a') {
            sortedSourceCounts[2]++;
        } else if (s[i] == 'd') {
            sortedSourceCounts[3]++;
        } else if (s[i] == 'f') {
            sortedSourceCounts[4]++;
        } else if (s[i] == 'b') {
            sortedSourceCounts[5]++;
        }
    }
    for (int i = 0; i < strlen(t); i++) {
        if (t[i] == 'c') {
            sortedTargetCounts[0]++;
        } else if (t[i] == 'e') {
            sortedTargetCounts[1]++;
        } else if (t[i] == 'a') {
            sortedTargetCounts[2]++;
        } else if (t[i] == 'd') {
            sortedTargetCounts[3]++;
        } else if (t[i] == 'f') {
            sortedTargetCounts[4]++;
        } else if (t[i] == 'b') {
            sortedTargetCounts[5]++;
        }
    }
    qsort(sortedSourceCounts, 6, sizeof(int), compare);
    qsort(sortedTargetCounts, 6, sizeof(int), compare);
    if (memcmp(sortedSourceCounts, sortedTargetCounts, 6 * sizeof(int)) == 0) {
        printf("Yes\n");
    } else {
        printf("No\n");
    }
    return 0;
}

int compare(const void *a, const void *b) {
    return (*(int *)a - *(int *)b);
}
```
[/C]

[GO]
```go
package main

import (
    "fmt"
    "sort"
    "strings"
)

func main() {
    var s, t string
    fmt.Scan(&s, &t)
    sortedSourceCounts := []int{strings.Count(s, "c"), strings.Count(s, "e"), strings.Count(s, "a"), strings.Count(s, "d"), strings.Count(s, "f"), strings.Count(s, "b")}
    sortedTargetCounts := []int{strings.Count(t, "c"), strings.Count(t, "e"), strings.Count(t, "a"), strings.Count(t, "d"), strings.Count(t, "f"), strings.Count(t, "b")}
    sort.Ints(sortedSourceCounts)
    sort.Ints(sortedTargetCounts)
    if sortedSourceCounts == sortedTargetCounts {
        fmt.Println("Yes")
    } else {
        fmt.Println("No")
    }
}
```
[/GO]

[RB]
```ruby
s = gets.chomp
t = gets.chomp
sortedSourceCounts = [s.count('c'), s.count('e'), s.count('a'), s.count('d'), s.count('f'), s.count('b')].sort
sortedTargetCounts = [t.count('c'), t.count('e'), t.count('a'), t.count('d'), t.count('f'), t.count('b')].sort
if sortedSourceCounts == sortedTargetCounts
    puts 'Yes'
else
    puts 'No'
end
```
[/RB]

[PHP]
```php
<?php
$s = trim(fgets(STDIN));
$t = trim(fgets(STDIN));
$sortedSourceCounts = [substr_count($s, 'c'), substr_count($s, 'e'), substr_count($s, 'a'), substr_count($s, 'd'), substr_count($s, 'f'), substr_count($s, 'b')];
sort($sortedSourceCounts);
$sortedTargetCounts = [substr_count($t, 'c'), substr_count($t, 'e'), substr_count($t, 'a'), substr_count($t, 'd'), substr_count($t, 'f'), substr_count($t, 'b')];
sort($sortedTargetCounts);
if ($sortedSourceCounts == $sortedTargetCounts) {
    echo 'Yes' . PHP_EOL;
} else {
    echo 'No' . PHP_EOL;
}
```
[/PHP]

[PL]
```perl
use strict;
use warnings;

my $s = <STDIN>;
chomp $s;
my $t = <STDIN>;
chomp $t;
my @sortedSourceCounts = sort { $a <=> $b } ( $s =~ /c/g, $s =~ /e/g, $s =~ /a/g, $s =~ /d/g, $s =~ /f/g, $s =~ /b/g );
my @sortedTargetCounts = sort { $a <=> $b } ( $t =~ /c/g, $t =~ /e/g, $t =~ /a/g, $t =~ /d/g, $t =~ /f/g, $t =~ /b/g );
if ( join( '', @sortedSourceCounts ) eq join( '', @sortedTargetCounts ) ) {
    print "Yes\n";
}
else {
    print "No\n";
}
```
[/PL]

[CS]
```csharp
using System;
using System.Linq;

public class Solution {
    public static void Main(string[] args) {
        string s = Console.ReadLine();
        string t = Console.ReadLine();
        int[] sortedSourceCounts = {s.Count(c => c == 'c'), s.Count(c => c == 'e'), s.Count(c => c == 'a'), s.Count(c => c == 'd'), s.Count(c => c == 'f'), s.Count(c => c == 'b')};
        int[] sortedTargetCounts = {t.Count(c => c == 'c'), t.Count(c => c == 'e'), t.Count(c => c == 'a'), t.Count(c => c == 'd'), t.Count(c => c == 'f'), t.Count(c => c == 'b')};
        Array.Sort(sortedSourceCounts);
        Array.Sort(sortedTargetCounts);
        if (sortedSourceCounts.SequenceEqual(sortedTargetCounts)) {
            Console.WriteLine("Yes");
        } else {
            Console.WriteLine("No");
        }
    }
}
```
[/CS]

[HAS]
```haskell
import Data.List

main = do
    s <- getLine
    t <- getLine
    let sortedSourceCounts = sort $ map (length . filter (== 'c')) $ group $ sort s
        sortedTargetCounts = sort $ map (length . filter (== 'c')) $ group $ sort t
    if sortedSourceCounts == sortedTargetCounts
        then putStrLn "Yes"
        else putStrLn "No"
```
[/HAS]

[JA]
```javascript
function compareStringCounts(s, t) {
    const sortedSourceCounts = [...s].sort((a, b) => a.localeCompare(b)).reduce((acc, cur) => {
        if (cur === 'c') {
            acc[0]++;
        } else if (cur === 'e') {
            acc[1]++;
        } else if (cur === 'a') {
            acc[2]++;
        } else if (cur === 'd') {
            acc[3]++;
        } else if (cur === 'f') {
            acc[4]++;
        } else if (cur === 'b') {
            acc[5]++;
        }
        return acc;
    }, [0, 0, 0, 0, 0, 0]);
    const sortedTargetCounts = [...t].sort((a, b) => a.localeCompare(b)).reduce((acc, cur) => {
        if (cur === 'c') {
            acc[0]++;
        } else if (cur === 'e') {
            acc[1]++;
        } else if (cur === 'a') {
            acc[2]++;
        } else if (cur === 'd') {
            acc[3]++;
        } else if (cur === 'f') {
            acc[4]++;
        } else if (cur === 'b') {
            acc[5]++;
        }
        return acc;
    }, [0, 0, 0, 0, 0, 0]);
    return sortedSourceCounts.join('') === sortedTargetCounts.join('') ? 'Yes' : 'No';
}

function main() {
    const s = readLine();
    const t = readLine();
    console.log(compareStringCounts(s, t));
}
```
[/JA]

[KT]
```kotlin
import java.util.*

fun main(args: Array<String>) {
    val s = readLine()!!
    val t = readLine()!!
    val sortedSourceCounts = s.toCharArray().sorted().groupBy { it }.map { it.value.size }.sorted()
    val sortedTargetCounts = t.toCharArray().sorted().groupBy { it }.map { it.value.size }.sorted()
    if (sortedSourceCounts.contentEquals(sortedTargetCounts)) {
        println("Yes")
    } else {
        println("No")
    }
}
```
[/KT]

[RB]
```ruby
s = gets.chomp
t = gets.chomp
sortedSourceCounts = [s.count('c'), s.count('e'), s.count('a'), s.count('d'), s.count('f'), s.count('b')].sort
sortedTargetCounts = [t.count('c'), t.count('e'), t.count('a'), t.count('d'), t.count('f'), t.count('b')].sort
if sortedSourceCounts == sortedTargetCounts
    puts 'Yes'
else
    puts 'No'
end
```
[/RB]

[D]
```d
import std.stdio;
import std.algorithm;

void main()
{
    auto s = readln();
    auto t = readln();
    auto sortedSourceCounts = sort(s.count("c"), s.count("e"), s.count("a"), s.count("d"), s.count("f"), s.count("b"));
    auto sortedTargetCounts = sort(t.count("c"), t.count("e"), t.count("a"), t.count("d"), t.count("f"), t.count("b"));
    if (sortedSourceCounts == sortedTargetCounts)
        writeln("Yes");
    else
        writeln("No");
}
```
[/D]

[LUA]
```lua
function compareStringCounts(s, t)
    local sortedSourceCounts = {s:count("c"), s:count("e"), s:count("a"), s:
