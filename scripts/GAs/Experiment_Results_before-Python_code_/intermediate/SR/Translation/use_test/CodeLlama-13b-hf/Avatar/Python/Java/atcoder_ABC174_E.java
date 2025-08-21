
[JAV]

```java

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] lis = new int[n];
        for (int i = 0; i < n; i++) {
            lis[i] = sc.nextInt();
        }
        int a = 1, b = Integer.MAX_VALUE;
        int ans = b;
        while (a <= b) {
            int mid = (a + b) / 2;
            if (check(lis, k, mid)) {
                ans = mid;
                b = mid - 1;
            } else {
                a = mid + 1;
            }
        }
        System.out.println(ans);
    }

    public static boolean check(int[] lis, int k, int mid) {
        for (int i = 0; i < lis.length; i++) {
            if (lis[i] % mid == 0) {
                k++;
            }
            k -= lis[i] / mid;
        }
        return k >= 0;
    }
}

```

[/JAV]

[PY]

```python

n , k = map ( int , input ( ).split ( ) )
lis = list ( map ( int , input ( ).split ( ) ) )
a , b = 1 , max ( lis )
ans = b
while ( a <= b ) :
    mid = ( a + b ) // 2
    if ( check ( lis , k , mid ) ) :
        ans = mid
        b = mid - 1
    else :
        a = mid + 1
print ( ans )


```

[/PY]

[C++]

```cpp

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, k;
    cin >> n >> k;
    vector<int> lis(n);
    for (int i = 0; i < n; i++) {
        cin >> lis[i];
    }
    int a = 1, b = *max_element(lis.begin(), lis.end());
    int ans = b;
    while (a <= b) {
        int mid = (a + b) / 2;
        if (check(lis, k, mid)) {
            ans = mid;
            b = mid - 1;
        } else {
            a = mid + 1;
        }
    }
    cout << ans << endl;
}

bool check(vector<int> lis, int k, int mid) {
    for (int i = 0; i < lis.size(); i++) {
        if (lis[i] % mid == 0) {
            k++;
        }
        k -= lis[i] / mid;
    }
    return k >= 0;
}

```

[/C++]

[PHP]

```php

<?php

$n = (int)trim(fgets(STDIN));
$k = (int)trim(fgets(STDIN));
$lis = explode(' ', trim(fgets(STDIN)));
$a = 1;
$b = max($lis);
$ans = $b;
while ($a <= $b) {
    $mid = ($a + $b) / 2;
    if (check($lis, $k, $mid)) {
        $ans = $mid;
        $b = $mid - 1;
    } else {
        $a = $mid + 1;
    }
}
echo $ans;

function check($lis, $k, $mid)
{
    foreach ($lis as $i) {
        if ($i % $mid == 0) {
            $k++;
        }
        $k -= $i / $mid;
    }
    return $k >= 0;
}

```

[/PHP]

[RUBY]

```ruby

n, k = gets.split.map(&:to_i)
lis = gets.split.map(&:to_i)
a, b = 1, lis.max
ans = b
while a <= b
    mid = (a + b) / 2
    if check(lis, k, mid)
        ans = mid
        b = mid - 1
    else
        a = mid + 1
    end
end
puts ans

def check(lis, k, mid)
    lis.each do |i|
        if i % mid == 0
            k += 1
        end
        k -= i / mid
    end
    k >= 0
end

```

[/RUBY]

[GO]

```go

package main

import (
    "fmt"
    "strconv"
    "strings"
)

func main() {
    var n, k int
    fmt.Scan(&n, &k)
    lis := make([]int, n)
    for i := 0; i < n; i++ {
        lis[i], _ = strconv.Atoi(strings.Split(fmt.Scan().Text(), " ")[i])
    }
    a, b := 1, lis[0]
    ans := b
    for a <= b {
        mid := (a + b) / 2
        if check(lis, k, mid) {
            ans = mid
            b = mid - 1
        } else {
            a = mid + 1
        }
    }
    fmt.Println(ans)
}

func check(lis []int, k, mid int) bool {
    for _, i := range lis {
        if i%mid == 0 {
            k++
        }
        k -= i / mid
    }
    return k >= 0
}

```

[/GO]

[BASH]

```bash

read n k
read -a lis
a=1
b=${lis[0]}
ans=$b
while [ $a -le $b ]
do
    mid=$((a+b)/2)
    if check $lis $k $mid
    then
        ans=$mid
        b=$((mid-1))
    else
        a=$((mid+1))
    fi
done
echo $ans

check() {
    local k=$2
    for i in ${@:3}
    do
        if [ $((i%$3)) -eq 0 ]
        then
            k=$((k+1))
        fi
        k=$((k-i/$3))
    done
    [ $k -ge 0 ]
}

```

[/BASH]

[PERL]

```perl

use strict;
use warnings;

my $n = <STDIN>;
chomp($n);
my $k = <STDIN>;
chomp($k);
my @lis = split(' ', <STDIN>);
my $a = 1;
my $b = (sort { $a <=> $b } @lis)[0];
my $ans = $b;
while ($a <= $b) {
    my $mid = int(($a + $b) / 2);
    if (check(\@lis, $k, $mid)) {
        $ans = $mid;
        $b = $mid - 1;
    } else {
        $a = $mid + 1;
    }
}
print "$ans\n";

sub check {
    my ($lis, $k, $mid) = @_;
    for my $i (@$lis) {
        if ($i % $mid == 0) {
            $k++;
        }
        $k -= int($i / $mid);
    }
    return $k >= 0;
}

```

[/PERL]

[JULIA]

```julia

n, k = parse.(Int, split(readline()))
lis = parse.(Int, split(readline()))
a, b = 1, maximum(lis)
ans = b
while a <= b
    mid = (a + b) ÷ 2
    if check(lis, k, mid)
        ans = mid
        b = mid - 1
    else
        a = mid + 1
    end
end
println(ans)

function check(lis, k, mid)
    for i in lis
        if i % mid == 0
            k += 1
        end
        k -= i ÷ mid
    end
    return k >= 0
end

```

[/JULIA]

[C]

```c

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    int n, k;
    scanf("%d %d", &n, &k);
    int *lis = malloc(sizeof(int) * n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &lis[i]);
    }
    int a = 1, b = lis[0];
    int ans = b;
    while (a <= b) {
        int mid = (a + b) / 2;
        if (check(lis, k, mid)) {
            ans = mid;
            b = mid - 1;
        } else {
            a = mid + 1;
        }
    }
    printf("%d\n", ans);
}

int check(int *lis, int k, int mid) {
    for (int i = 0; i < n; i++) {
        if (lis[i] % mid == 0) {
            k++;
        }
        k -= lis[i] / mid;
    }
    return k >= 0;
}

```

[/C]

[CPP]

```cpp

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, k;
    cin >> n >> k;
    vector<int> lis(n);
    for (int i = 0; i < n; i++) {
        cin >> lis[i];
    }
    int a = 1, b = *max_element(lis.begin(), lis.end());
    int ans = b;
    while (a <= b) {
        int mid = (a + b) / 2;
        if (check(lis, k, mid)) {
            ans = mid;
            b = mid - 1;
        } else {
            a = mid + 1;
        }
    }
    cout << ans << endl;
}

bool check(vector<int> lis, int k, int mid) {
    for (int i = 0; i < lis.size(); i++) {
        if (lis[i] % mid == 0) {
            k++;
        }
        k -= lis[i] / mid;
    }
    return k >= 0;
}

```

[/CPP]

[HASKELL]

```haskell

import Data.List

main = do
    [n, k] <- map read . words <$> getLine
    lis <- map read . words <$> getLine
    let a = 1
        b = maximum lis
        ans = b
    while a <= b $ do
        let mid = (a + b) `div` 2
        if check lis k mid
            then do
                ans <- return mid
                b <- return (mid - 1)
            else a <- return (mid + 1)
    print ans

check lis k mid = all (\i -> i `mod` mid /= 0 || k' >= 0) lis
    where k' = foldl (\k i -> k + if i `mod` mid == 0 then 1 else 0 - i `div` mid) k lis

```

[/HASKELL]

[JAVASCRIPT]

```javascript

'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });

    main();
});

function readline() {
    return inputString[currentLine++];
}

function main() {
    const n = parseInt(readline(), 10);
    const k = parseInt(readline(), 10);
    const lis = readline().split(' ').map(Number);
    let a = 1;
    let b = Math.max(...lis);
    let ans = b;
    while (a <= b) {
        const mid = Math.floor((a + b) / 2);
        if (check(lis, k, mid)) {
            ans = mid;
            b = mid - 1;
        } else {
            a = mid + 1;
        }
    }
    console.log(ans);
}

function check(lis, k, mid) {
    for (const i of lis) {
        if (i % mid === 0) {
            k++;
        }
        k -= Math.floor(i / mid);
    }
    return k >= 0;
}

```

[/JAVASCRIPT]

[SWIFT]

```swift

import Foundation

let n = Int(readLine()!)!
let k = Int(readLine()!)!
let lis = readLine()!.split(separator: " ").map{ Int(String($0))! }
var a = 1
var b = lis.max()!
var ans = b
while a <= b {
    let mid = (a + b) / 2
    if check(lis, k, mid) {
        ans = mid
        b = mid - 1
    } else {
        a = mid + 1
    }
}
print(ans)

func check(_ lis: [Int], _ k: Int, _ mid: Int) -> Bool {
    for i in lis {
        if i % mid == 0 {
            k += 1
        }
        k -= i / mid
    }
    return k >= 0
}

```

[/SWIFT]

[PASCAL]

```pascal

program problem;

var n, k: integer;
    lis: array[1..1000] of integer;
    a, b, ans: integer;

begin
    readln(n, k);
    for var i := 1 to n do
        read(lis[i]);
    a := 1;
    b := lis[1];
    ans := b;
    while a <= b do
    begin
        var mid := (a + b) div 2;
        if check(lis, k, mid) then
        begin
            ans := mid;
            b := mid - 1;
        end
        else
            a := mid + 1;
    end;
    writeln(ans);
end.

function check(lis: array of integer; k: integer; mid: integer): boolean;
var i: integer;
begin
    for i := 1 to n do
    begin
        if
