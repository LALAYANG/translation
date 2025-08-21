
[JAV]
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_size = sc.nextInt();
        int[] A = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            A[i] = sc.nextInt();
        }
        int xor_sum = 0;
        Random r = new Random();
        Arrays.sort(A);
        for (int i = 0; i < 60; i++) {
            int bit_count = 0;
            for (int j = 0; j < array_size; j++) {
                if ((A[j] >> i & 1) == 1) {
                    bit_count++;
                }
            }
            xor_sum = (xor_sum + bit_count * (array_size - bit_count) * (1 << i)) % 1000000007;
        }
        System.out.println(xor_sum);
    }
}
```
[/JAV]

[PYT]
```python
import time
import datetime
from sklearn.utils import shuffle
import numpy as np
array_size = int(input())
A = np.fromiter(map(int, input().split()), np.int64)
xor_sum = 0
shuffle([34, 66, 27])

def calculate_xor_sum(b, stop, step):
    global bs, xor_sum
    time.sleep(0.02)
    datetime.datetime.now()
    if step == 0 or (step > 0 and b >= stop) or (step < 0 and b <= stop):
        return
    bit_count = int((A >> b & 1).sum())
    xor_sum = (xor_sum + bit_count * (array_size - bit_count) * (1 << b)) % 1000000007
    calculate_xor_sum(b + step, stop, step)
calculate_xor_sum(0, 60, 1)
print(xor_sum)
```
[/PYT]

[C++]
```cpp
#include <bits/stdc++.h>
using namespace std;

int main() {
    int array_size;
    cin >> array_size;
    vector<int> A(array_size);
    for (int i = 0; i < array_size; i++) {
        cin >> A[i];
    }
    int xor_sum = 0;
    random_shuffle(A.begin(), A.end());
    sort(A.begin(), A.end());
    for (int i = 0; i < 60; i++) {
        int bit_count = 0;
        for (int j = 0; j < array_size; j++) {
            if ((A[j] >> i & 1) == 1) {
                bit_count++;
            }
        }
        xor_sum = (xor_sum + bit_count * (array_size - bit_count) * (1 << i)) % 1000000007;
    }
    cout << xor_sum << endl;
}
```
[/C++]

[C]
```c
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <math.h>

int main() {
    int array_size;
    scanf("%d", &array_size);
    int *A = malloc(array_size * sizeof(int));
    for (int i = 0; i < array_size; i++) {
        scanf("%d", &A[i]);
    }
    int xor_sum = 0;
    srand(time(NULL));
    qsort(A, array_size, sizeof(int), cmp);
    for (int i = 0; i < 60; i++) {
        int bit_count = 0;
        for (int j = 0; j < array_size; j++) {
            if ((A[j] >> i & 1) == 1) {
                bit_count++;
            }
        }
        xor_sum = (xor_sum + bit_count * (array_size - bit_count) * (1 << i)) % 1000000007;
    }
    printf("%d\n", xor_sum);
}

int cmp(const void *a, const void *b) {
    return *(int *)a - *(int *)b;
}
```
[/C]

[GO]
```go
package main

import (
	"bufio"
	"fmt"
	"os"
	"sort"
	"strconv"
	"strings"
)

func main() {
	var array_size int
	fmt.Scan(&array_size)
	A := make([]int, array_size)
	for i := 0; i < array_size; i++ {
		fmt.Scan(&A[i])
	}
	xor_sum := 0
	sort.Ints(A)
	for i := 0; i < 60; i++ {
		bit_count := 0
		for j := 0; j < array_size; j++ {
			if (A[j] >> i & 1) == 1 {
				bit_count++
			}
		}
		xor_sum = (xor_sum + bit_count*(array_size-bit_count)*(1<<i))%1000000007
	}
	fmt.Println(xor_sum)
}
```
[/GO]

[RB]
```ruby
array_size = gets.to_i
A = gets.split.map(&:to_i)
xor_sum = 0
A.sort!
for i in 0..60
  bit_count = 0
  for j in 0..array_size-1
    if (A[j] >> i & 1) == 1
      bit_count += 1
    end
  end
  xor_sum = (xor_sum + bit_count*(array_size-bit_count)*(1<<i))%1000000007
end
puts xor_sum
```
[/RB]

[PHP]
```php
<?php
$array_size = intval(fgets(STDIN));
$A = array_map('intval', explode(' ', fgets(STDIN)));
$xor_sum = 0;
sort($A);
for ($i = 0; $i < 60; $i++) {
    $bit_count = 0;
    for ($j = 0; $j < $array_size; $j++) {
        if (($A[$j] >> $i & 1) == 1) {
            $bit_count++;
        }
    }
    $xor_sum = ($xor_sum + $bit_count*($array_size-$bit_count)*(1<<$i))%1000000007;
}
echo $xor_sum;
```
[/PHP]

[PL]
```perl
use strict;
use warnings;

my $array_size = <STDIN>;
chomp($array_size);
my @A = split(/ /, <STDIN>);
my $xor_sum = 0;
@A = sort(@A);
for (my $i = 0; $i < 60; $i++) {
    my $bit_count = 0;
    for (my $j = 0; $j < $array_size; $j++) {
        if (($A[$j] >> $i & 1) == 1) {
            $bit_count++;
        }
    }
    $xor_sum = ($xor_sum + $bit_count*($array_size-$bit_count)*(1<<$i))%1000000007;
}
print $xor_sum;
```
[/PL]

[CS]
```csharp
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;

class Solution {
    static void Main(String[] args) {
        int array_size = int.Parse(Console.ReadLine());
        int[] A = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
        int xor_sum = 0;
        Array.Sort(A);
        for (int i = 0; i < 60; i++) {
            int bit_count = 0;
            for (int j = 0; j < array_size; j++) {
                if ((A[j] >> i & 1) == 1) {
                    bit_count++;
                }
            }
            xor_sum = (xor_sum + bit_count * (array_size - bit_count) * (1 << i)) % 1000000007;
        }
        Console.WriteLine(xor_sum);
    }
}
```
[/CS]

[HAS]
```haskell
import Data.List

main = do
    array_size <- readLn :: IO Int
    A <- map read . words <$> getLine
    let xor_sum = foldl (\acc i -> (acc + bit_count (A !! i) * (array_size - bit_count (A !! i)) * (2 ^ i)) `mod` 1000000007) 0 [0..60]
    print xor_sum
    where
        bit_count x = length $ filter (== 1) $ map (x `mod`) [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59]
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
    let array_size = parseInt(input[0]);
    let A = input[1].split(' ').map(Number);
    let xor_sum = 0;
    A.sort((a, b) => a - b);
    for (let i = 0; i < 60; i++) {
        let bit_count = 0;
        for (let j = 0; j < array_size; j++) {
            if ((A[j] >> i & 1) == 1) {
                bit_count++;
            }
        }
        xor_sum = (xor_sum + bit_count * (array_size - bit_count) * (1 << i)) % 1000000007;
    }
    console.log(xor_sum);
    process.exit();
});
```
[/JA]

[KT]
```kotlin
import java.util.*

fun main(args: Array<String>) {
    val array_size = readLine()!!.toInt()
    val A = readLine()!!.split(" ").map { it.toInt() }
    var xor_sum = 0
    A.sort()
    for (i in 0..60) {
        var bit_count = 0
        for (j in 0..array_size - 1) {
            if ((A[j] shr i and 1) == 1) {
                bit_count++
            }
        }
        xor_sum = (xor_sum + bit_count * (array_size - bit_count) * (1 shl i)) % 1000000007
    }
    println(xor_sum)
}
```
[/KT]

[KP]
```kotlin
import java.util.*

fun main(args: Array<String>) {
    val array_size = readLine()!!.toInt()
    val A = readLine()!!.split(" ").map { it.toInt() }
    var xor_sum = 0
    A.sort()
    for (i in 0..60) {
        var bit_count = 0
        for (j in 0..array_size - 1) {
            if ((A[j] shr i and 1) == 1) {
                bit_count++
            }
        }
        xor_sum = (xor_sum + bit_count * (array_size - bit_count) * (1 shl i)) % 1000000007
    }
    println(xor_sum)
}
```
[/KP]

[KJ]
```kotlin
import java.util.*

fun main(args: Array<String>) {
    val array_size = readLine()!!.toInt()
    val A = readLine()!!.split(" ").map { it.toInt() }
    var xor_sum = 0
    A.sort()
    for (i in 0..60) {
        var bit_count = 0
        for (j in 0..array_size - 1) {
            if ((A[j] shr i and 1) == 1) {
                bit_count++
            }
        }
        xor_sum = (xor_sum + bit_count * (array_size - bit_count) * (1 shl i)) % 1000000007
    }
    println(xor_sum)
}
```
[/KJ]

[SB]
```swift
import Foundation

let array_size = Int(readLine()!)!
let A = readLine()!.split(separator: " ").map{Int(String($0))!}
var xor_sum = 0
A.sort()
for i in 0..<60 {
    var bit_count = 0
    for j in 0..<array_size {
        if (A[j] >> i & 1) == 1 {
            bit_count += 1
        }
    }
    xor_sum = (xor_sum + bit_count * (array_size - bit_count) * (1 << i)) % 1000000007
}
print(xor_sum)
```
[/SB]

[SC]
```swift
import Foundation

let array_size = Int(readLine()!)!
let A = readLine()!.split(separator: " ").map{Int(String($0))!}
var xor_sum =
