
[JAV]

```java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int mod = 1000000007;
        int ans = 0;
        int rep = N / (A + B);
        ans += rep * A;
        int res = N - rep * (A + B);
        ans += Math.min(res, A);
        System.out.println(ans);
    }
}

```

[/JAV]

[PY]

```python

import sys
input = sys.stdin.readline
def I ( ) : return int ( input ( ) )
def MI ( ) : return map ( int , input ( ).split ( ) )
def LI ( ) : return list ( map ( int , input ( ).split ( ) ) )
def main ( ) :
    mod = 10 ** 9 + 7
    N , A , B = MI ( )
    ans = 0
    rep = N // ( A + B )
    ans += rep * A
    res = N - rep * ( A + B )
    ans += min ( res , A )
    print ( ans )
main ( )


```

[/PY]

[C++]

```cpp

#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    int N, A, B;
    cin >> N >> A >> B;
    int mod = 1000000007;
    int ans = 0;
    int rep = N / (A + B);
    ans += rep * A;
    int res = N - rep * (A + B);
    ans += min(res, A);
    cout << ans << endl;
}

```

[/C++]

[C]

```c

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    int N, A, B;
    scanf("%d %d %d", &N, &A, &B);
    int mod = 1000000007;
    int ans = 0;
    int rep = N / (A + B);
    ans += rep * A;
    int res = N - rep * (A + B);
    ans += min(res, A);
    printf("%d\n", ans);
}

```

[/C]

[Go]

```go

package main

import (
    "fmt"
)

func main() {
    var N, A, B int
    fmt.Scan(&N, &A, &B)
    mod := 1000000007
    ans := 0
    rep := N / (A + B)
    ans += rep * A
    res := N - rep * (A + B)
    ans += min(res, A)
    fmt.Println(ans)
}

func min(a, b int) int {
    if a < b {
        return a
    }
    return b
}

```

[/Go]

[Ruby]

```ruby

=begin
# Read from STDIN
def STDIN.read_ints
  return gets.split.map { |x| x.to_i }
end
=end

# Read from STDIN
def STDIN.read_ints
  return gets.split.map { |x| x.to_i }
end

# Write to STDOUT
def STDOUT.write_line(x)
  puts x
end

# Read from STDIN
N, A, B = STDIN.read_ints
mod = 10 ** 9 + 7
ans = 0
rep = N / (A + B)
ans += rep * A
res = N - rep * (A + B)
ans += [res, A].min
STDOUT.write_line(ans)

```

[/Ruby]

[PHP]

```php

<?php

// Read from STDIN
$stdin = fopen('php://stdin', 'r');

fscanf($stdin, "%d %d %d", $N, $A, $B);

$mod = 1000000007;
$ans = 0;
$rep = $N / ($A + $B);
$ans += $rep * $A;
$res = $N - $rep * ($A + $B);
$ans += min($res, $A);
echo $ans;

function min($a, $b) {
    if ($a < $b) {
        return $a;
    }
    return $b;
}

?>

```

[/PHP]

[Rust]

```rust

use std::io;

fn main() {
    let mut line = String::new();
    io::stdin().read_line(&mut line).unwrap();
    let mut iter = line.split_whitespace();
    let N: i64 = iter.next().unwrap().parse().unwrap();
    let A: i64 = iter.next().unwrap().parse().unwrap();
    let B: i64 = iter.next().unwrap().parse().unwrap();
    let mod = 1000000007;
    let mut ans = 0;
    let rep = N / (A + B);
    ans += rep * A;
    let res = N - rep * (A + B);
    ans += res.min(A);
    println!("{}", ans);
}

```

[/Rust]

[Swift]

```swift

import Foundation

// Read from STDIN
var N = Int(readLine()!)!
var A = Int(readLine()!)!
var B = Int(readLine()!)!
var mod = 1000000007
var ans = 0
var rep = N / (A + B)
ans += rep * A
var res = N - rep * (A + B)
ans += min(res, A)
print(ans)

func min(_ a: Int, _ b: Int) -> Int {
    if a < b {
        return a
    }
    return b
}

```

[/Swift]

[Bash]

```bash

read N A B
mod=1000000007
ans=0
rep=$((N / (A + B)))
ans=$((ans + rep * A))
res=$((N - rep * (A + B)))
ans=$((ans + $(echo $res $A | awk '{print $1 < $2 ? $1 : $2}') ))
echo $ans

```

[/Bash]

[Bash-Python]

```bash

read N A B
mod=1000000007
ans=0
rep=$((N / (A + B)))
ans=$((ans + rep * A))
res=$((N - rep * (A + B)))
ans=$((ans + $(python3 -c "print($res < $A and $res or $A)")))
echo $ans

```

[/Bash-Python]

[Bash-Ruby]

```bash

read N A B
mod=1000000007
ans=0
rep=$((N / (A + B)))
ans=$((ans + rep * A))
res=$((N - rep * (A + B)))
ans=$((ans + $(ruby -e "puts $res < $A ? $res : $A")))
echo $ans

```

[/Bash-Ruby]

[Bash-PHP]

```bash

read N A B
mod=1000000007
ans=0
rep=$((N / (A + B)))
ans=$((ans + rep * A))
res=$((N - rep * (A + B)))
ans=$((ans + $(php -r "echo min($res, $A);")))
echo $ans

```

[/Bash-PHP]

[Bash-Rust]

```bash

read N A B
mod=1000000007
ans=0
rep=$((N / (A + B)))
ans=$((ans + rep * A))
res=$((N - rep * (A + B)))
ans=$((ans + $(rustc - <<< "fn main() { println!( \"{}\" , min( $res , $A ) ); } fn min(a: i64, b: i64) -> i64 { if a < b { a } else { b } }" && ./a.out)))
echo $ans

```

[/Bash-Rust]

[Bash-Swift]

```bash

read N A B
mod=1000000007
ans=0
rep=$((N / (A + B)))
ans=$((ans + rep * A))
res=$((N - rep * (A + B)))
ans=$((ans + $(swift - <<< "func min(_ a: Int, _ b: Int) -> Int { if a < b { return a } return b } print(min( $res , $A ))")))
echo $ans

```

[/Bash-Swift]

[Bash-Go]

```bash

read N A B
mod=1000000007
ans=0
rep=$((N / (A + B)))
ans=$((ans + rep * A))
res=$((N - rep * (A + B)))
ans=$((ans + $(go run <<< "package main; import \"fmt\"; func main() { fmt.Println(min( $res , $A )) } func min(a, b int) int { if a < b { return a } return b }")))
echo $ans

```

[/Bash-Go]

[Bash-C]

```bash

read N A B
mod=1000000007
ans=0
rep=$((N / (A + B)))
ans=$((ans + rep * A))
res=$((N - rep * (A + B)))
ans=$((ans + $(gcc -x c - <<< "int min(int a, int b) { return a < b ? a : b; } int main() { printf(\"%d\\n\", min( $res , $A )); }" && ./a.out)))
echo $ans

```

[/Bash-C]

[Bash-C++]

```bash

read N A B
mod=1000000007
ans=0
rep=$((N / (A + B)))
ans=$((ans + rep * A))
res=$((N - rep * (A + B)))
ans=$((ans + $(g++ -x c++ - <<< "int min(int a, int b) { return a < b ? a : b; } int main() { printf(\"%d\\n\", min( $res , $A )); }" && ./a.out)))
echo $ans

```

[/Bash-C++]

[Bash-C#]

```bash

read N A B
mod=1000000007
ans=0
rep=$((N / (A + B)))
ans=$((ans + rep * A))
res=$((N - rep * (A + B)))
ans=$((ans + $(mcs - <<< "using System; class C { static void Main() { Console.WriteLine(min( $res , $A )); } static int min(int a, int b) { return a < b ? a : b; } }" && mono C.exe)))
echo $ans

```

[/Bash-C#]

[Bash-VB]

```bash

read N A B
mod=1000000007
ans=0
rep=$((N / (A + B)))
ans=$((ans + rep * A))
res=$((N - rep * (A + B)))
ans=$((ans + $(vbnc - <<< "Module M : Sub Main() : Console.WriteLine(min( $res , $A )) : End Sub : Function min(a As Integer, b As Integer) As Integer : If a < b Then : Return a : Else : Return b : End If : End Function : End Module" && mono M.exe)))
echo $ans

```

[/Bash-VB]

[Bash-F#]

```bash

read N A B
mod=1000000007
ans=0
rep=$((N / (A + B)))
ans=$((ans + rep * A))
res=$((N - rep * (A + B)))
ans=$((ans + $(fsharpc - <<< "let min a b = if a < b then a else b printfn \"%d\" (min $res $A)" && mono a.exe)))
echo $ans

```

[/Bash-F#]

[Bash-Kotlin]

```bash

read N A B
mod=1000000007
ans=0
rep=$((N / (A + B)))
ans=$((ans + rep * A))
res=$((N - rep * (A + B)))
ans=$((ans + $(kotlinc - <<< "fun min(a: Int, b: Int): Int = if (a < b) a else b fun main() { println(min( $res , $A )) }" && java -jar kotlin-compiler.jar a.jar && java -jar a.jar)))
echo $ans

```

[/Bash-Kotlin]

[Bash-Scala]

```bash

read N A B
mod=1000000007
ans=0
rep=$((N / (A + B)))
ans=$((ans + rep * A))
res=$((N - rep * (A + B)))
ans=$((ans + $(scalac - <<< "object M { def min(a: Int, b: Int): Int = if (a < b) a else b; def main(args: Array[String]) = println(min( $res , $A )) }" && scala M)))
echo $ans

```

[/Bash-Scala]

[Bash-D]

```bash

read N A B
mod=1000000007
ans=0
rep=$((N / (A + B)))
ans=$((ans + rep * A))
res=$((N - rep * (A + B)))
ans=$((ans + $(dmd - <<< "import std.stdio; int min(int a, int b) { return a < b ? a : b; } void main() { writeln(min( $res , $A )); }" && ./a.out)))
echo $ans

```

[/Bash-D]

[Bash-Dart]

```bash

read N A B
mod=1000000007
ans=0
rep=$((N / (A + B)))
ans=$((ans + rep * A))
res=$((N - rep * (A + B)))
ans=$((ans + $(dart - <<< "import 'dart:io'; void main() { print(min(
