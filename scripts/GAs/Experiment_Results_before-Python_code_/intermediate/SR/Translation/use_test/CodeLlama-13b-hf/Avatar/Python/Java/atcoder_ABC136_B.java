
[JAV]
```java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1;
        int ans = 0;
        while (10 * i <= N) {
            ans += (10 * i - 10 * (i - 1));
            i += 2;
        }
        ans += Math.max(0, N - 10 * (i - 1) + 1);
        System.out.println(ans);
    }
}

```
[/JAV]

[PYT]
```py

def main ( ) :
    N = int ( input ( ) )
    i = 1
    ans = 0
    while 10 ** i <= N :
        ans += ( ( 10 ** i ) - ( 10 ** ( i - 1 ) ) )
        i += 2
    ans += max ( 0 , N - 10 ** ( i - 1 ) + 1 )
    print ( ans )
if __name__ == "__main__" :
    main ( )


```
[/PYT]

[CPP]
```cpp

#include <bits/stdc++.h>
using namespace std;

int main() {
    int N;
    cin >> N;
    int i = 1;
    int ans = 0;
    while (10 * i <= N) {
        ans += (10 * i - 10 * (i - 1));
        i += 2;
    }
    ans += max(0, N - 10 * (i - 1) + 1);
    cout << ans << endl;
}

```
[/CPP]

[C]
```c

#include <stdio.h>

int main() {
    int N;
    scanf("%d", &N);
    int i = 1;
    int ans = 0;
    while (10 * i <= N) {
        ans += (10 * i - 10 * (i - 1));
        i += 2;
    }
    ans += max(0, N - 10 * (i - 1) + 1);
    printf("%d\n", ans);
}

```
[/C]

[MAT]
```mat

function main
    N = input('');
    i = 1;
    ans = 0;
    while 10^i <= N
        ans = ans + (10^i - 10^(i-1));
        i = i + 2;
    end
    ans = ans + max(0, N - 10^(i-1) + 1);
    disp(ans);
end

```
[/MAT]

[RUB]
```ruby

def main
    N = gets.to_i
    i = 1
    ans = 0
    while 10 ** i <= N
        ans += (10 ** i - 10 ** (i - 1))
        i += 2
    end
    ans += [0, N - 10 ** (i - 1) + 1].max
    puts ans
end

main

```
[/RUB]

[PHP]
```php

<?php
function main() {
    $N = (int)trim(fgets(STDIN));
    $i = 1;
    $ans = 0;
    while (10 ** $i <= $N) {
        $ans += (10 ** $i - 10 ** ($i - 1));
        $i += 2;
    }
    $ans += max(0, $N - 10 ** ($i - 1) + 1);
    echo $ans . PHP_EOL;
}
main();

```
[/PHP]

[GO]
```go

package main

import (
    "fmt"
)

func main() {
    var N int
    fmt.Scan(&N)
    i := 1
    ans := 0
    for 10*i <= N {
        ans += (10 * i - 10 * (i - 1))
        i += 2
    }
    ans += max(0, N - 10*i + 1)
    fmt.Println(ans)
}

func max(a, b int) int {
    if a > b {
        return a
    }
    return b
}

```
[/GO]

[PAS]
```pas

program main;
var
    N: Integer;
    i: Integer;
    ans: Integer;
begin
    ReadLn(N);
    i := 1;
    ans := 0;
    while 10 * i <= N do
    begin
        ans := ans + (10 * i - 10 * (i - 1));
        i := i + 2;
    end;
    ans := ans + Max(0, N - 10 * (i - 1) + 1);
    WriteLn(ans);
end.

```
[/PAS]

[BASH]
```bash

read N
i=1
ans=0
while [ $((10 * i)) -le $N ]
do
    ans=$((ans + (10 * i - 10 * (i - 1))))
    i=$((i + 2))
done
ans=$((ans + $((N - 10 * (i - 1) + 1))))
echo $ans

```
[/BASH]

[BASH]
```bash

read N
i=1
ans=0
while [ $((10 * i)) -le $N ]
do
    ans=$((ans + (10 * i - 10 * (i - 1))))
    i=$((i + 2))
done
ans=$((ans + $((N - 10 * (i - 1) + 1))))
echo $ans

```
[/BASH]

[BASH]
```bash

read N
i=1
ans=0
while [ $((10 * i)) -le $N ]
do
    ans=$((ans + (10 * i - 10 * (i - 1))))
    i=$((i + 2))
done
ans=$((ans + $((N - 10 * (i - 1) + 1))))
echo $ans

```
[/BASH]

[BASH]
```bash

read N
i=1
ans=0
while [ $((10 * i)) -le $N ]
do
    ans=$((ans + (10 * i - 10 * (i - 1))))
    i=$((i + 2))
done
ans=$((ans + $((N - 10 * (i - 1) + 1))))
echo $ans

```
[/BASH]

[BASH]
```bash

read N
i=1
ans=0
while [ $((10 * i)) -le $N ]
do
    ans=$((ans + (10 * i - 10 * (i - 1))))
    i=$((i + 2))
done
ans=$((ans + $((N - 10 * (i - 1) + 1))))
echo $ans

```
[/BASH]

[BASH]
```bash

read N
i=1
ans=0
while [ $((10 * i)) -le $N ]
do
    ans=$((ans + (10 * i - 10 * (i - 1))))
    i=$((i + 2))
done
ans=$((ans + $((N - 10 * (i - 1) + 1))))
echo $ans

```
[/BASH]

[BASH]
```bash

read N
i=1
ans=0
while [ $((10 * i)) -le $N ]
do
    ans=$((ans + (10 * i - 10 * (i - 1))))
    i=$((i + 2))
done
ans=$((ans + $((N - 10 * (i - 1) + 1))))
echo $ans

```
[/BASH]

[BASH]
```bash

read N
i=1
ans=0
while [ $((10 * i)) -le $N ]
do
    ans=$((ans + (10 * i - 10 * (i - 1))))
    i=$((i + 2))
done
ans=$((ans + $((N - 10 * (i - 1) + 1))))
echo $ans

```
[/BASH]

[BASH]
```bash

read N
i=1
ans=0
while [ $((10 * i)) -le $N ]
do
    ans=$((ans + (10 * i - 10 * (i - 1))))
    i=$((i + 2))
done
ans=$((ans + $((N - 10 * (i - 1) + 1))))
echo $ans

```
[/BASH]

[BASH]
```bash

read N
i=1
ans=0
while [ $((10 * i)) -le $N ]
do
    ans=$((ans + (10 * i - 10 * (i - 1))))
    i=$((i + 2))
done
ans=$((ans + $((N - 10 * (i - 1) + 1))))
echo $ans

```
[/BASH]

[BASH]
```bash

read N
i=1
ans=0
while [ $((10 * i)) -le $N ]
do
    ans=$((ans + (10 * i - 10 * (i - 1))))
    i=$((i + 2))
done
ans=$((ans + $((N - 10 * (i - 1) + 1))))
echo $ans

```
[/BASH]

[BASH]
```bash

read N
i=1
ans=0
while [ $((10 * i)) -le $N ]
do
    ans=$((ans + (10 * i - 10 * (i - 1))))
    i=$((i + 2))
done
ans=$((ans + $((N - 10 * (i - 1) + 1))))
echo $ans

```
[/BASH]

[BASH]
```bash

read N
i=1
ans=0
while [ $((10 * i)) -le $N ]
do
    ans=$((ans + (10 * i - 10 * (i - 1))))
    i=$((i + 2))
done
ans=$((ans + $((N - 10 * (i - 1) + 1))))
echo $ans

```
[/BASH]

[BASH]
```bash

read N
i=1
ans=0
while [ $((10 * i)) -le $N ]
do
    ans=$((ans + (10 * i - 10 * (i - 1))))
    i=$((i + 2))
done
ans=$((ans + $((N - 10 * (i - 1) + 1))))
echo $ans

```
[/BASH]

[BASH]
```bash

read N
i=1
ans=0
while [ $((10 * i)) -le $N ]
do
    ans=$((ans + (10 * i - 10 * (i - 1))))
    i=$((i + 2))
done
ans=$((ans + $((N - 10 * (i - 1) + 1))))
echo $ans

```
[/BASH]

[BASH]
```bash

read N
i=1
ans=0
while [ $((10 * i)) -le $N ]
do
    ans=$((ans + (10 * i - 10 * (i - 1))))
    i=$((i + 2))
done
ans=$((ans + $((N - 10 * (i - 1) + 1))))
echo $ans

```
[/BASH]

[BASH]
```bash

read N
i=1
ans=0
while [ $((10 * i)) -le $N ]
do
    ans=$((ans + (10 * i - 10 * (i - 1))))
    i=$((i + 2))
done
ans=$((ans + $((N - 10 * (i - 1) + 1))))
echo $ans

```
[/BASH]

[BASH]
```bash

read N
i=1
ans=0
while [ $((10 * i)) -le $N ]
do
    ans=$((ans + (10 * i - 10 * (i - 1))))
    i=$((i + 2))
done
ans=$((ans + $((N - 10 * (i - 1) + 1))))
echo $ans

```
[/BASH]

[BASH]
```bash

read N
i=1
ans=0
while [ $((10 * i)) -le $N ]
do
    ans=$((ans + (10 * i - 10 * (i - 1))))
    i=$((i + 2))
done
ans=$((ans + $((N - 10 * (i - 1) + 1))))
echo $ans

```
[/BASH]

[BASH]
```bash

read N
i=1
ans=0
while [ $((10 * i)) -le $N ]
do
    ans=$((ans + (10 * i - 10 * (i - 1))))
    i=$((i + 2))
done
ans=$((ans + $((N - 10 * (i - 1) + 1))))
echo $ans

```
[/BASH]

[BASH]
```bash

read N
i=1
ans=0
while [ $((10 * i)) -le $N ]
do
    ans=$((ans + (10 * i - 10 * (i - 1))))
    i=$((i + 2))
done
ans=$((ans + $((N - 10 * (i - 1) + 1))))
echo $ans

```
[/BASH]

[BASH]
```bash

read N
i=1
ans=0
while [ $((10 * i)) -le $N ]
do
    ans=$((ans + (10 * i - 10 * (i - 1))))
    i=$((i + 2))
done
ans=$((ans + $((N - 10 * (i - 1) + 1))))
echo $ans

```
[/BASH]

[BASH]
```bash

read N
i=1
ans=0
while [ $((10 * i)) -le $N ]
do
    ans=$((ans + (10 * i - 10 * (i - 1))))
    i=$((i + 2))
done
ans=$((ans + $((N - 10 * (i - 1) + 1))))
echo $ans

```
[/BASH]

[BASH]
```bash

read N
i=1
ans=0
while [ $((10 * i)) -le $N ]
do
    ans=$((ans + (10 * i - 10 * (i - 1))))
    i=$((i + 2))
done
