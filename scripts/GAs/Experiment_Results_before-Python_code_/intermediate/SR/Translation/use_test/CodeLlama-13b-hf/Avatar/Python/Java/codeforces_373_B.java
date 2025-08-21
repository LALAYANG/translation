
[JAV]

```java

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int lo = 0;
        int hi = (int) 1e18;
        while (hi - lo > 1) {
            int md = (lo + hi) / 2;
            int c = sum(m + md - 1) - sum(m - 1);
            if (c * k <= w) {
                lo = md;
            } else {
                hi = md;
            }
        }
        System.out.println(lo);
    }

    public static int sum(int k) {
        int ret = 0;
        int pw = 10;
        int len = 1;
        while (true) {
            int cur = Math.min(pw - 1, k);
            int prev = pw / 10;
            ret += (cur - prev + 1) * len;
            if (pw - 1 >= k) {
                break;
            }
            len += 1;
            pw *= 10;
        }
        return ret;
    }
}

```

[/JAV]

[PY]

```python

import sys

def sum(k):
    ret = 0
    pw = 10
    len = 1
    while 1 == 1:
        cur = min(pw - 1, k)
        prev = pw // 10
        ret += (cur - prev + 1) * len
        if (pw - 1 >= k):
            break
        len += 1
        pw *= 10
    return ret

w, m, k = map(int, sys.stdin.readline().split())
lo = 0
hi = int(1e18)
while hi - lo > 1:
    md = (lo + hi) // 2
    c = sum(m + md - 1) - sum(m - 1)
    if c * k <= w:
        lo = md
    else:
        hi = md
print(lo)

```

[/PY]

[C++]

```cpp

#include <bits/stdc++.h>
using namespace std;

int sum(int k) {
    int ret = 0;
    int pw = 10;
    int len = 1;
    while (true) {
        int cur = min(pw - 1, k);
        int prev = pw / 10;
        ret += (cur - prev + 1) * len;
        if (pw - 1 >= k) {
            break;
        }
        len += 1;
        pw *= 10;
    }
    return ret;
}

int main() {
    int w, m, k;
    cin >> w >> m >> k;
    int lo = 0;
    int hi = int(1e18);
    while (hi - lo > 1) {
        int md = (lo + hi) / 2;
        int c = sum(m + md - 1) - sum(m - 1);
        if (c * k <= w) {
            lo = md;
        } else {
            hi = md;
        }
    }
    cout << lo << endl;
}

```

[/C++]

[C]

```c

#include <stdio.h>
#include <stdlib.h>

int sum(int k) {
    int ret = 0;
    int pw = 10;
    int len = 1;
    while (1 == 1) {
        int cur = min(pw - 1, k);
        int prev = pw / 10;
        ret += (cur - prev + 1) * len;
        if (pw - 1 >= k) {
            break;
        }
        len += 1;
        pw *= 10;
    }
    return ret;
}

int main() {
    int w, m, k;
    scanf("%d %d %d", &w, &m, &k);
    int lo = 0;
    int hi = (int) 1e18;
    while (hi - lo > 1) {
        int md = (lo + hi) / 2;
        int c = sum(m + md - 1) - sum(m - 1);
        if (c * k <= w) {
            lo = md;
        } else {
            hi = md;
        }
    }
    printf("%d\n", lo);
}

```

[/C]

[PHP]

```php

<?php

$w = (int) fgets(STDIN);
$m = (int) fgets(STDIN);
$k = (int) fgets(STDIN);
$lo = 0;
$hi = (int) 1e18;
while ($hi - $lo > 1) {
    $md = ($lo + $hi) / 2;
    $c = sum($m + $md - 1) - sum($m - 1);
    if ($c * $k <= $w) {
        $lo = $md;
    } else {
        $hi = $md;
    }
}
echo $lo;

function sum($k) {
    $ret = 0;
    $pw = 10;
    $len = 1;
    while (true) {
        $cur = min($pw - 1, $k);
        $prev = $pw / 10;
        $ret += ($cur - $prev + 1) * $len;
        if ($pw - 1 >= $k) {
            break;
        }
        $len += 1;
        $pw *= 10;
    }
    return $ret;
}

```

[/PHP]

[GO]

```go

package main

import (
    "fmt"
)

func sum(k int) int {
    ret := 0
    pw := 10
    len := 1
    for true {
        cur := min(pw-1, k)
        prev := pw / 10
        ret += (cur - prev + 1) * len
        if pw-1 >= k {
            break
        }
        len += 1
        pw *= 10
    }
    return ret
}

func main() {
    var w, m, k int
    fmt.Scan(&w, &m, &k)
    lo := 0
    hi := int(1e18)
    for hi-lo > 1 {
        md := (lo + hi) / 2
        c := sum(m + md - 1) - sum(m - 1)
        if c*k <= w {
            lo = md
        } else {
            hi = md
        }
    }
    fmt.Println(lo)
}

func min(a, b int) int {
    if a < b {
        return a
    }
    return b
}

```

[/GO]

[RUBY]

```ruby

w, m, k = gets.split.map(&:to_i)
lo = 0
hi = 1e18
while hi - lo > 1
    md = (lo + hi) / 2
    c = sum(m + md - 1) - sum(m - 1)
    if c * k <= w
        lo = md
    else
        hi = md
    end
end
puts lo

def sum(k)
    ret = 0
    pw = 10
    len = 1
    while true
        cur = [pw - 1, k].min
        prev = pw / 10
        ret += (cur - prev + 1) * len
        if pw - 1 >= k
            break
        end
        len += 1
        pw *= 10
    end
    ret
end

```

[/RUBY]

[CPP]

```cpp

#include <bits/stdc++.h>
using namespace std;

int sum(int k) {
    int ret = 0;
    int pw = 10;
    int len = 1;
    while (true) {
        int cur = min(pw - 1, k);
        int prev = pw / 10;
        ret += (cur - prev + 1) * len;
        if (pw - 1 >= k) {
            break;
        }
        len += 1;
        pw *= 10;
    }
    return ret;
}

int main() {
    int w, m, k;
    cin >> w >> m >> k;
    int lo = 0;
    int hi = int(1e18);
    while (hi - lo > 1) {
        int md = (lo + hi) / 2;
        int c = sum(m + md - 1) - sum(m - 1);
        if (c * k <= w) {
            lo = md;
        } else {
            hi = md;
        }
    }
    cout << lo << endl;
}

```

[/CPP]

[HASKELL]

```haskell

import Data.List
import Data.Ord
import Data.Function

main = do
    [w, m, k] <- map read . words <$> getLine
    let lo = 0
        hi = 1e18
    print $ fst $ head $ dropWhile (\(_, c) -> c * k > w) $ map (\md -> (md, sum (m + md - 1) - sum (m - 1))) [lo..hi]

sum k = sum' 10 1 k
    where
        sum' pw len k
            | pw - 1 >= k = len * (k - pw + 1)
            | otherwise = sum' (pw * 10) (len + 1) k

```

[/HASKELL]

[JAVASCRIPT]

```javascript

'use strict'

const fs = require('fs')

process.stdin.resume()
process.stdin.setEncoding('utf-8')

let inputString = ''
let currentLine = 0

process.stdin.on('data', inputStdin => {
    inputString += inputStdin
})

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim()
    })

    main()
})

function readLine() {
    return inputString[currentLine++]
}

function sum(k) {
    let ret = 0
    let pw = 10
    let len = 1
    while (true) {
        let cur = Math.min(pw - 1, k)
        let prev = pw / 10
        ret += (cur - prev + 1) * len
        if (pw - 1 >= k) {
            break
        }
        len += 1
        pw *= 10
    }
    return ret
}

function main() {
    const ws = readLine().split(' ')
    const w = parseInt(ws[0], 10)
    const m = parseInt(ws[1], 10)
    const k = parseInt(ws[2], 10)

    let lo = 0
    let hi = 1e18
    while (hi - lo > 1) {
        let md = Math.floor((lo + hi) / 2)
        let c = sum(m + md - 1) - sum(m - 1)
        if (c * k <= w) {
            lo = md
        } else {
            hi = md
        }
    }
    console.log(lo)
}

```

[/JAVASCRIPT]

[SWIFT]

```swift

import Foundation

func sum(_ k: Int) -> Int {
    var ret = 0
    var pw = 10
    var len = 1
    while true {
        let cur = min(pw - 1, k)
        let prev = pw / 10
        ret += (cur - prev + 1) * len
        if pw - 1 >= k {
            break
        }
        len += 1
        pw *= 10
    }
    return ret
}

func main() {
    let w = Int(readLine()!)!
    let m = Int(readLine()!)!
    let k = Int(readLine()!)!
    var lo = 0
    var hi = Int(1e18)
    while hi - lo > 1 {
        let md = (lo + hi) / 2
        let c = sum(m + md - 1) - sum(m - 1)
        if c * k <= w {
            lo = md
        } else {
            hi = md
        }
    }
    print(lo)
}

```

[/SWIFT]

[PASCAL]

```pascal

program problem;

var w, m, k, lo, hi, md, c, cur, prev, len, pw, ret: longint;

begin
    readln(w, m, k);
    lo := 0;
    hi := 1e18;
    while hi - lo > 1 do
    begin
        md := (lo + hi) div 2;
        c := sum(m + md - 1) - sum(m - 1);
        if c * k <= w then
            lo := md
        else
            hi := md;
    end;
    writeln(lo);
end.

function sum(k: longint): longint;
var cur, prev, len, pw, ret: longint;
begin
    ret := 0;
    pw := 10;
    len := 1;
    while true do
    begin
        cur := min(pw - 1, k);
        prev := pw div 10;
        ret := ret + (cur - prev + 1) * len;
        if pw - 1 >= k then
            break;
        len := len + 1;
        pw := pw * 10;
    end;
    sum := ret;
end;

```

[/PASCAL]

[RUST]

```rust

use std::io;

fn main() {
    let mut w = String::new();
    io::stdin().read_line(&mut w).unwrap();
    let w: Vec<i32> = w
        .split_whitespace()
        .map(|x| x.parse().unwrap())
        .collect();
    let w = w[0];
    let m = w[1];
    let k = w[2];
    let mut lo = 0;
   
