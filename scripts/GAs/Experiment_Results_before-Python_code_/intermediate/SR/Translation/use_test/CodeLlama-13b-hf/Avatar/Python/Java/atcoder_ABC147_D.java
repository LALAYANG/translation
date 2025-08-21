
[JAV]

```java

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int result = 0;
        for (int b = 0; b < 60; b++) {
            int bs = 0;
            for (int i = 0; i < N; i++) {
                if ((A[i] & (1 << b)) != 0) {
                    bs++;
                }
            }
            result = (result + bs * (N - bs) * (1 << b)) % 1000000007;
        }
        System.out.println(result);
    }
}

```

[/JAV]

[PYT]

```python

import numpy as np
N = int ( input ( ) )
A = np.fromiter ( map ( int , input ( ).split ( ) ) , np.int64 )
result = 0
for b in range ( 60 ) :
    bs = int ( ( ( A >> b ) & 1 ).sum ( ) )
    result = ( result + bs * ( N - bs ) * ( 1 << b ) ) % 1000000007
print ( result )


```

[/PYT]

[CPP]

```cpp

#include <bits/stdc++.h>
using namespace std;

int main() {
    int N;
    cin >> N;
    vector<int> A(N);
    for (int i = 0; i < N; i++) {
        cin >> A[i];
    }
    int result = 0;
    for (int b = 0; b < 60; b++) {
        int bs = 0;
        for (int i = 0; i < N; i++) {
            if ((A[i] & (1 << b)) != 0) {
                bs++;
            }
        }
        result = (result + bs * (N - bs) * (1 << b)) % 1000000007;
    }
    cout << result << endl;
}

```

[/CPP]

[C]

```c

#include <stdio.h>
#include <stdlib.h>

int main() {
    int N;
    scanf("%d", &N);
    int *A = malloc(sizeof(int) * N);
    for (int i = 0; i < N; i++) {
        scanf("%d", &A[i]);
    }
    int result = 0;
    for (int b = 0; b < 60; b++) {
        int bs = 0;
        for (int i = 0; i < N; i++) {
            if ((A[i] & (1 << b)) != 0) {
                bs++;
            }
        }
        result = (result + bs * (N - bs) * (1 << b)) % 1000000007;
    }
    printf("%d\n", result);
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
    var N int
    fmt.Scan(&N)
    A := make([]int, N)
    for i := 0; i < N; i++ {
        fmt.Scan(&A[i])
    }
    result := 0
    for b := 0; b < 60; b++ {
        bs := 0
        for i := 0; i < N; i++ {
            if (A[i] & (1 << b)) != 0 {
                bs++
            }
        }
        result = (result + bs * (N - bs) * (1 << b)) % 1000000007
    }
    fmt.Println(result)
}

```

[/GO]

[RB]

```ruby

=begin
# Ruby
=end

N = gets.to_i
A = gets.split.map(&:to_i)
result = 0
for b in 0..59 do
    bs = 0
    for i in 0..(N - 1) do
        if (A[i] & (1 << b)) != 0 then
            bs += 1
        end
    end
    result = (result + bs * (N - bs) * (1 << b)) % 1000000007
end
puts result

```

[/RB]

[PHP]

```php

<?php

$N = (int)trim(fgets(STDIN));
$A = array_map('intval', explode(' ', trim(fgets(STDIN))));
$result = 0;
for ($b = 0; $b < 60; $b++) {
    $bs = 0;
    for ($i = 0; $i < $N; $i++) {
        if (($A[$i] & (1 << $b)) != 0) {
            $bs++;
        }
    }
    $result = ($result + $bs * ($N - $bs) * (1 << $b)) % 1000000007;
}
echo $result;

```

[/PHP]

[PL]

```perl

# Perl

use strict;
use warnings;

my $N = <STDIN>;
chomp($N);
my @A = split(/ /, <STDIN>);
my $result = 0;
for my $b (0..59) {
    my $bs = 0;
    for my $i (0..($N - 1)) {
        if (($A[$i] & (1 << $b)) != 0) {
            $bs++;
        }
    }
    $result = ($result + $bs * ($N - $bs) * (1 << $b)) % 1000000007;
}
print $result, "\n";

```

[/PL]

[CS]

```csharp

using System;
using System.Linq;

public class Solution
{
    public static void Main(string[] args)
    {
        int N = int.Parse(Console.ReadLine());
        int[] A = Console.ReadLine().Split().Select(int.Parse).ToArray();
        int result = 0;
        for (int b = 0; b < 60; b++)
        {
            int bs = 0;
            for (int i = 0; i < N; i++)
            {
                if ((A[i] & (1 << b)) != 0)
                {
                    bs++;
                }
            }
            result = (result + bs * (N - bs) * (1 << b)) % 1000000007;
        }
        Console.WriteLine(result);
    }
}

```

[/CS]

[HAS]

```haskell

import Data.Bits

main = do
    n <- readLn :: IO Int
    a <- map read . words <$> getLine
    let result = foldl (\acc b -> (acc + sum (map (count b) a)) `mod` 1000000007) 0 [0..59]
    print result

count b a = if testBit a b then 1 else 0

```

[/HAS]

[JA]

```javascript

const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().split('\n');
const N = parseInt(input[0]);
const A = input[1].split(' ').map(Number);
let result = 0;
for (let b = 0; b < 60; b++) {
    let bs = 0;
    for (let i = 0; i < N; i++) {
        if ((A[i] & (1 << b)) != 0) {
            bs++;
        }
    }
    result = (result + bs * (N - bs) * (1 << b)) % 1000000007;
}
console.log(result);

```

[/JA]

[KO]

```kotlin

import java.util.*

fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val A = readLine()!!.split(" ").map { it.toInt() }
    var result = 0
    for (b in 0..59) {
        var bs = 0
        for (i in 0..(N - 1)) {
            if ((A[i] and (1 shl b)) != 0) {
                bs++
            }
        }
        result = (result + bs * (N - bs) * (1 shl b)) % 1000000007
    }
    println(result)
}

```

[/KO]

[LUA]

```lua

local N = io.read("*n")
local A = {}
for i = 1, N do
    A[i] = io.read("*n")
end
local result = 0
for b = 0, 59 do
    local bs = 0
    for i = 1, N do
        if (A[i] & (1 << b)) ~= 0 then
            bs = bs + 1
        end
    end
    result = (result + bs * (N - bs) * (1 << b)) % 1000000007
end
print(result)

```

[/LUA]

[M]

```matlab

N = input('');
A = str2num(input('', 's'));
result = 0;
for b = 0:59
    bs = 0;
    for i = 1:N
        if (A(i) & (1 << b)) ~= 0
            bs = bs + 1;
        end
    end
    result = mod(result + bs * (N - bs) * (1 << b), 1000000007);
end
disp(result);

```

[/M]

[P]

```python

N = int(input())
A = list(map(int, input().split()))
result = 0
for b in range(60):
    bs = 0
    for i in range(N):
        if (A[i] & (1 << b)) != 0:
            bs += 1
    result = (result + bs * (N - bs) * (1 << b)) % 1000000007
print(result)

```

[/P]

[PY]

```python

N = int(input())
A = list(map(int, input().split()))
result = 0
for b in range(60):
    bs = 0
    for i in range(N):
        if (A[i] & (1 << b)) != 0:
            bs += 1
    result = (result + bs * (N - bs) * (1 << b)) % 1000000007
print(result)

```

[/PY]

[R]

```r

N <- as.integer(readline(prompt=""))
A <- as.integer(readline(prompt=""))
result <- 0
for (b in 0:59) {
    bs <- 0
    for (i in 1:N) {
        if (A[i] & (1 << b)) != 0) {
            bs <- bs + 1
        }
    }
    result <- (result + bs * (N - bs) * (1 << b)) %% 1000000007
}
cat(result, "\n")

```

[/R]

[S]

```swift

let N = Int(readLine()!)!
let A = readLine()!.split(separator: " ").map{Int(String($0))!}
var result = 0
for b in 0..<60 {
    var bs = 0
    for i in 0..<N {
        if (A[i] & (1 << b)) != 0 {
            bs += 1
        }
    }
    result = (result + bs * (N - bs) * (1 << b)) % 1000000007
}
print(result)

```

[/S]

[T]

```typescript

const N = parseInt(readLine());
const A = readLine().split(' ').map(Number);
let result = 0;
for (let b = 0; b < 60; b++) {
    let bs = 0;
    for (let i = 0; i < N; i++) {
        if ((A[i] & (1 << b)) != 0) {
            bs++;
        }
    }
    result = (result + bs * (N - bs) * (1 << b)) % 1000000007;
}
console.log(result);

```

[/T]

[VB]

```vb

Module Module1
    Sub Main()
        Dim N As Integer = Integer.Parse(Console.ReadLine())
        Dim A As Integer() = Console.ReadLine().Split(" ").Select(Function(x) Integer.Parse(x)).ToArray()
        Dim result As Integer = 0
        For b As Integer = 0 To 59
            Dim bs As Integer = 0
            For i As Integer = 0 To (N - 1)
                If (A(i) And (1 << b)) <> 0 Then
                    bs += 1
                End If
            Next
            result = (result + bs * (N - bs) * (1 << b)) Mod 1000000007
        Next
        Console.WriteLine(result)
    End Sub
End Module

```

[/VB]

[VBSCRIPT]

```vbscript

Dim N
N = CInt(InputBox(""))
Dim A
A = Split(InputBox(""), " ")
Dim result
result = 0
For b = 0 To 59
    Dim bs
    bs = 0
    For i = 0 To (N - 1)
        If (A(i) And (1 << b)) <> 0 Then
            bs = bs + 1
        End If
    Next
    result = (result + bs * (N - bs) * (1 << b)) Mod 1000000007
Next
WScript.StdOut.WriteLine result

```

[/VBSCRIPT]

[ZSH]

```zsh

read N
read -a A
result=0
for b in {0..59}; do
    bs=0
    for i in {0..($N-1)}; do
        if ((A[$i] & (1 << $b)) != 0); then
            bs=$((bs + 1))
        fi
    done
    result=$((result + bs * (N - bs) * (1 << b)))
    result=$((result % 1
