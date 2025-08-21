
[JAV]
```java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        String S = sc.next();
        if (S.length() <= K) {
            System.out.println(S);
        } else {
            System.out.println(S.substring(0, K) + "...");
        }
    }
}

```
[/JAV]

[PYT]
```python

K = int(input())
S = input()
if len(S) <= K:
    print(S)
else:
    print(S[:K] + "...")

```
[/PYT]

[CPP]
```cpp

#include <bits/stdc++.h>
using namespace std;

int main() {
    int K;
    string S;
    cin >> K >> S;
    if (S.length() <= K) {
        cout << S << endl;
    } else {
        cout << S.substr(0, K) << "..." << endl;
    }
}

```
[/CPP]

[C]
```c

#include <stdio.h>
#include <string.h>

int main() {
    int K;
    char S[100000];
    scanf("%d", &K);
    scanf("%s", S);
    if (strlen(S) <= K) {
        printf("%s\n", S);
    } else {
        printf("%.*s...\n", K, S);
    }
}

```
[/C]

[GO]
```go

package main

import (
    "fmt"
)

func main() {
    var K int
    var S string
    fmt.Scan(&K)
    fmt.Scan(&S)
    if len(S) <= K {
        fmt.Println(S)
    } else {
        fmt.Println(S[:K] + "...")
    }
}

```
[/GO]

[RB]
```ruby

K = gets.to_i
S = gets.chomp
if S.length <= K
  puts S
else
  puts S[0, K] + '...'
end

```
[/RB]

[PHP]
```php

<?php
$K = (int)trim(fgets(STDIN));
$S = trim(fgets(STDIN));
if (strlen($S) <= $K) {
    echo $S;
} else {
    echo substr($S, 0, $K) . '...';
}

```
[/PHP]

[PL]
```perl

use strict;
use warnings;

my $K = <STDIN>;
chomp $K;
my $S = <STDIN>;
chomp $S;
if (length($S) <= $K) {
    print $S;
} else {
    print substr($S, 0, $K) . '...';
}

```
[/PL]

[CS]
```cs

using System;

class Solution {
    static void Main(String[] args) {
        int K = Convert.ToInt32(Console.ReadLine());
        string S = Console.ReadLine();
        if (S.Length <= K) {
            Console.WriteLine(S);
        } else {
            Console.WriteLine(S.Substring(0, K) + "...");
        }
    }
}

```
[/CS]

[HAS]
```haskell

import Data.List

main = do
    K <- readLn :: IO Int
    S <- getLine
    if length S <= K
        then putStrLn S
        else putStrLn $ take K S ++ "..."

```
[/HAS]

[JA]
```javascript

const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];

rl.on('line', function (line) {
    input.push(line);
}).on('close', function () {
    let K = parseInt(input[0]);
    let S = input[1];
    if (S.length <= K) {
        console.log(S);
    } else {
        console.log(S.substring(0, K) + "...");
    }
    process.exit();
});

```
[/JA]

[KO]
```kotlin

import java.util.*

fun main(args: Array<String>) {
    val K = readLine()!!.toInt()
    val S = readLine()!!
    if (S.length <= K) {
        println(S)
    } else {
        println(S.substring(0, K) + "...")
    }
}

```
[/KO]

[BASH]
```bash

read K
read S
if [ ${#S} -le $K ]
then
    echo $S
else
    echo ${S:0:$K}...
fi

```
[/BASH]

[BASH]
```bash

read K
read S
if [ ${#S} -le $K ]
then
    echo $S
else
    echo ${S:0:$K}...
fi

```
[/BASH]

[BASH]
```bash

read K
read S
if [ ${#S} -le $K ]
then
    echo $S
else
    echo ${S:0:$K}...
fi

```
[/BASH]

[BASH]
```bash

read K
read S
if [ ${#S} -le $K ]
then
    echo $S
else
    echo ${S:0:$K}...
fi

```
[/BASH]

[BASH]
```bash

read K
read S
if [ ${#S} -le $K ]
then
    echo $S
else
    echo ${S:0:$K}...
fi

```
[/BASH]

[BASH]
```bash

read K
read S
if [ ${#S} -le $K ]
then
    echo $S
else
    echo ${S:0:$K}...
fi

```
[/BASH]

[BASH]
```bash

read K
read S
if [ ${#S} -le $K ]
then
    echo $S
else
    echo ${S:0:$K}...
fi

```
[/BASH]

[BASH]
```bash

read K
read S
if [ ${#S} -le $K ]
then
    echo $S
else
    echo ${S:0:$K}...
fi

```
[/BASH]

[BASH]
```bash

read K
read S
if [ ${#S} -le $K ]
then
    echo $S
else
    echo ${S:0:$K}...
fi

```
[/BASH]

[BASH]
```bash

read K
read S
if [ ${#S} -le $K ]
then
    echo $S
else
    echo ${S:0:$K}...
fi

```
[/BASH]

[BASH]
```bash

read K
read S
if [ ${#S} -le $K ]
then
    echo $S
else
    echo ${S:0:$K}...
fi

```
[/BASH]

[BASH]
```bash

read K
read S
if [ ${#S} -le $K ]
then
    echo $S
else
    echo ${S:0:$K}...
fi

```
[/BASH]

[BASH]
```bash

read K
read S
if [ ${#S} -le $K ]
then
    echo $S
else
    echo ${S:0:$K}...
fi

```
[/BASH]

[BASH]
```bash

read K
read S
if [ ${#S} -le $K ]
then
    echo $S
else
    echo ${S:0:$K}...
fi

```
[/BASH]

[BASH]
```bash

read K
read S
if [ ${#S} -le $K ]
then
    echo $S
else
    echo ${S:0:$K}...
fi

```
[/BASH]

[BASH]
```bash

read K
read S
if [ ${#S} -le $K ]
then
    echo $S
else
    echo ${S:0:$K}...
fi

```
[/BASH]

[BASH]
```bash

read K
read S
if [ ${#S} -le $K ]
then
    echo $S
else
    echo ${S:0:$K}...
fi

```
[/BASH]

[BASH]
```bash

read K
read S
if [ ${#S} -le $K ]
then
    echo $S
else
    echo ${S:0:$K}...
fi

```
[/BASH]

[BASH]
```bash

read K
read S
if [ ${#S} -le $K ]
then
    echo $S
else
    echo ${S:0:$K}...
fi

```
[/BASH]

[BASH]
```bash

read K
read S
if [ ${#S} -le $K ]
then
    echo $S
else
    echo ${S:0:$K}...
fi

```
[/BASH]

[BASH]
```bash

read K
read S
if [ ${#S} -le $K ]
then
    echo $S
else
    echo ${S:0:$K}...
fi

```
[/BASH]

[BASH]
```bash

read K
read S
if [ ${#S} -le $K ]
then
    echo $S
else
    echo ${S:0:$K}...
fi

```
[/BASH]

[BASH]
```bash

read K
read S
if [ ${#S} -le $K ]
then
    echo $S
else
    echo ${S:0:$K}...
fi

```
[/BASH]

[BASH]
```bash

read K
read S
if [ ${#S} -le $K ]
then
    echo $S
else
    echo ${S:0:$K}...
fi

```
[/BASH]

[BASH]
```bash

read K
read S
if [ ${#S} -le $K ]
then
    echo $S
else
    echo ${S:0:$K}...
fi

```
[/BASH]

[BASH]
```bash

read K
read S
if [ ${#S} -le $K ]
then
    echo $S
else
    echo ${S:0:$K}...
fi

```
[/BASH]

[BASH]
```bash

read K
read S
if [ ${#S} -le $K ]
then
    echo $S
else
    echo ${S:0:$K}...
fi

```
[/BASH]

[BASH]
```bash

read K
read S
if [ ${#S} -le $K ]
then
    echo $S
else
    echo ${S:0:$K}...
fi

```
[/BASH]

[BASH]
```bash

read K
read S
if [ ${#S} -le $K ]
then
    echo $S
else
    echo ${S:0:$K}...
fi

```
[/BASH]

[BASH]
```bash

read K
read S
if [ ${#S} -le $K ]
then
    echo $S
else
    echo ${S:0:$K}...
fi

```
[/BASH]

[BASH]
```bash

read K
read S
if [ ${#S} -le $K ]
then
    echo $S
else
    echo ${S:0:$K}...
fi

```
[/BASH]

[BASH]
```bash

read K
read S
if [ ${#S} -le $K ]
then
    echo $S
else
    echo ${S:0:$K}...
fi

```
[/BASH]

[BASH]
```bash

read K
read S
if [ ${#S} -le $K ]
then
    echo $S
else
    echo ${S:0:$K}...
fi

```
[/BASH]

[BASH]
```bash

read K
read S
if [ ${#S} -le $K ]
then
    echo $S
else
    echo ${S:0:$K}...
fi

```
[/BASH]

[BASH]
```bash

read K
read S
if [ ${#S} -le $K ]
then
    echo $S
else
    echo ${S:0:$K}...
fi

```
[/BASH]

[BASH]
```bash

read K
read S
if [ ${#S} -le $K ]
then
    echo $S
else
    echo ${S:0:$K}...
fi

```
[/BASH]

[BASH]
```bash

read K
read S
if [ ${#S} -le $K ]
then
    echo $S
else
    echo ${S:0:$K}...
fi

```
[/BASH]

[BASH]
```bash

read K
read S
if [ ${#S} -le $K ]
then
    echo $S
else
    echo ${S:0:$K}...
fi

```
[/BASH]

[BASH]
```bash

read K
read S
if [ ${#S} -le $K ]
then
    echo $S
else
    echo ${S:0:$K}...
fi

```
[/BASH]

[BASH]
```bash

read K
read S
if [ ${#S} -le $K ]
then
    echo $S
else
    echo ${S:0:$K}...
fi

```
[/BASH]

[BASH]
```bash

read K
read S
if [ ${#S} -le $K ]
then
    echo $S
else
    echo ${S:0:$K}...
fi

```
[/BASH]

[BASH]
```bash

read K
read S
if [ ${#S} -le $K ]
then
    echo $S
else
    echo ${S:0:$K}...
fi

```
[/BASH]

[BASH]
```bash

read K
read S
if [ ${#S} -le $K ]
then
    echo $S
else
    echo ${S:0:$K}...
fi

```
[/BASH]

[BASH]
```bash

read K
read S
if [ ${#S} -le $K ]
then
    echo $S
else
    echo ${S:0:$K}...
fi

```
[/BASH]

[BASH]
```bash

read K
read S
if [ ${#S} -le $K ]
then
    echo $S
else
    echo ${S:0:$K}...
fi

```
[/BASH]

[BASH]
```bash

read K
read S
if [ ${#S} -le $K ]
