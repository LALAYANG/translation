
[JAV]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int W = sc.nextInt();
        if (S <= W) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }
    }
}

```
[/JAV]

[PYT]
```python
S, W = map(int, input().split())
print("unsafe" if S <= W else "safe")

```
[/PYT]

[C++]
```cpp
#include <bits/stdc++.h>
using namespace std;

int main() {
    int S, W;
    cin >> S >> W;
    cout << (S <= W ? "unsafe" : "safe") << endl;
}

```
[/C++]

[C]
```c
#include <stdio.h>

int main() {
    int S, W;
    scanf("%d %d", &S, &W);
    printf("%s\n", S <= W ? "unsafe" : "safe");
}

```
[/C]

[GO]
```go
package main

import "fmt"

func main() {
    var S, W int
    fmt.Scan(&S, &W)
    fmt.Println(func() string {
        if S <= W {
            return "unsafe"
        }
        return "safe"
    }())
}

```
[/GO]

[RB]
```ruby
S, W = gets.split.map(&:to_i)
puts S <= W ? "unsafe" : "safe"

```
[/RB]

[PHP]
```php
<?php
$S = (int) trim(fgets(STDIN));
$W = (int) trim(fgets(STDIN));
echo $S <= $W ? "unsafe" : "safe";

```
[/PHP]

[PL]
```perl
use strict;
use warnings;

my $S = <STDIN>;
my $W = <STDIN>;
print $S <= $W ? "unsafe\n" : "safe\n";

```
[/PL]

[HS]
```haskell
main = do
    [s, w] <- map read . words <$> getLine
    putStrLn $ if s <= w then "unsafe" else "safe"

```
[/HS]

[PAS]
```pascal
program Problem;
var
    S, W: Integer;
begin
    ReadLn(S, W);
    if S <= W then
        WriteLn('unsafe')
    else
        WriteLn('safe');
end.

```
[/PAS]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
    echo "unsafe"
else
    echo "safe"
fi

```
[/BASH]

[BASH]
```bash
read S W
if [ $S -le $W ]; then
   
