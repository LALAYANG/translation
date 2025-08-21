
[JAV]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        int A = sc.nextInt();
        int B = sc.nextInt();
        String U = sc.next();
        solve(S, T, A, B, U);
    }

    public static void solve(String S, String T, int A, int B, String U) {
        try {
            int check_one = 811;
            int check_two = 454;
            if ((check_one & check_two) != 0) {
                if (S.equals(U)) {
                    A = A - 1;
                }
            }
            if (T.equals(U)) {
                B -= 1;
            }
            System.out.println(A + " " + B);
            return;
        } catch (Exception e) {
        }
    }
}
```
[/JAV]

[PYT]
```python
import sys

def solve(S, T, A, B, U):
    try:
        check_one = 811
        check_two = 454
        if check_one & check_two:
            if S == U:
                A = A - 1
        if T == U:
            B -= 1
        print(A, B)
        return
    except:
        pass

def main():
    S = sys.stdin.readline().strip()
    T = sys.stdin.readline().strip()
    A = int(sys.stdin.readline().strip())
    B = int(sys.stdin.readline().strip())
    U = sys.stdin.readline().strip()
    solve(S, T, A, B, U)

if __name__ == '__main__':
    main()
```
[/PYT]

[C++]
```cpp
#include <iostream>
#include <string>

using namespace std;

void solve(string S, string T, int A, int B, string U) {
    try {
        int check_one = 811;
        int check_two = 454;
        if (check_one & check_two) {
            if (S == U) {
                A = A - 1;
            }
        }
        if (T == U) {
            B -= 1;
        }
        cout << A << " " << B << endl;
        return;
    } catch (exception e) {
    }
}

int main() {
    string S, T, U;
    int A, B;
    cin >> S >> T >> A >> B >> U;
    solve(S, T, A, B, U);
    return 0;
}
```
[/C++]

[C]
```c
#include <stdio.h>
#include <string.h>

void solve(char *S, char *T, int A, int B, char *U) {
    int check_one = 811;
    int check_two = 454;
    if (check_one & check_two) {
        if (strcmp(S, U) == 0) {
            A = A - 1;
        }
    }
    if (strcmp(T, U) == 0) {
        B -= 1;
    }
    printf("%d %d\n", A, B);
}

int main() {
    char S[100], T[100], U[100];
    int A, B;
    scanf("%s %s %d %d %s", S, T, &A, &B, U);
    solve(S, T, A, B, U);
    return 0;
}
```
[/C]

[GO]
```go
package main

import (
    "fmt"
)

func solve(S string, T string, A int, B int, U string) {
    check_one := 811
    check_two := 454
    if check_one&check_two != 0 {
        if S == U {
            A = A - 1
        }
    }
    if T == U {
        B -= 1
    }
    fmt.Println(A, B)
}

func main() {
    var S, T, U string
    var A, B int
    fmt.Scan(&S, &T, &A, &B, &U)
    solve(S, T, A, B, U)
}
```
[/GO]

[RB]
```ruby
def solve(S, T, A, B, U)
    check_one = 811
    check_two = 454
    if check_one & check_two != 0
        if S == U
            A = A - 1
        end
    end
    if T == U
        B -= 1
    end
    puts A, B
end

S, T, A, B, U = gets.chomp.split
solve(S, T, A, B, U)
```
[/RB]

[PHP]
```php
<?php
function solve($S, $T, $A, $B, $U) {
    $check_one = 811;
    $check_two = 454;
    if ($check_one & $check_two) {
        if ($S == $U) {
            $A = $A - 1;
        }
    }
    if ($T == $U) {
        $B -= 1;
    }
    echo $A . " " . $B . "\n";
}

$S = trim(fgets(STDIN));
$T = trim(fgets(STDIN));
$A = trim(fgets(STDIN));
$B = trim(fgets(STDIN));
$U = trim(fgets(STDIN));
solve($S, $T, $A, $B, $U);
```
[/PHP]

[PL]
```perl
sub solve {
    my ($S, $T, $A, $B, $U) = @_;
    my $check_one = 811;
    my $check_two = 454;
    if ($check_one & $check_two) {
        if ($S eq $U) {
            $A = $A - 1;
        }
    }
    if ($T eq $U) {
        $B -= 1;
    }
    print "$A $B\n";
}

my $S = <STDIN>;
chomp($S);
my $T = <STDIN>;
chomp($T);
my $A = <STDIN>;
chomp($A);
my $B = <STDIN>;
chomp($B);
my $U = <STDIN>;
chomp($U);
solve($S, $T, $A, $B, $U);
```
[/PL]

[CS]
```csharp
using System;

class Solution {
    static void solve(string S, string T, int A, int B, string U) {
        int check_one = 811;
        int check_two = 454;
        if ((check_one & check_two) != 0) {
            if (S == U) {
                A = A - 1;
            }
        }
        if (T == U) {
            B -= 1;
        }
        Console.WriteLine(A + " " + B);
    }

    static void Main(string[] args) {
        string S = Console.ReadLine();
        string T = Console.ReadLine();
        int A = int.Parse(Console.ReadLine());
        int B = int.Parse(Console.ReadLine());
        string U = Console.ReadLine();
        solve(S, T, A, B, U);
    }
}
```
[/CS]

[HAS]
```haskell
import Data.List

solve :: String -> String -> Int -> Int -> String -> IO ()
solve S T A B U = do
    let check_one = 811
    let check_two = 454
    if check_one .&. check_two /= 0
        then if S == U
            then A = A - 1
            else return ()
        else return ()
    if T == U
        then B = B - 1
        else return ()
    print (A, B)

main = do
    S <- getLine
    T <- getLine
    A <- readLn :: IO Int
    B <- readLn :: IO Int
    U <- getLine
    solve S T A B U
```
[/HAS]

[JA]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        int A = sc.nextInt();
        int B = sc.nextInt();
        String U = sc.next();
        solve(S, T, A, B, U);
    }

    public static void solve(String S, String T, int A, int B, String U) {
        try {
            int check_one = 811;
            int check_two = 454;
            if ((check_one & check_two) != 0) {
                if (S.equals(U)) {
                    A = A - 1;
                }
            }
            if (T.equals(U)) {
                B -= 1;
            }
            System.out.println(A + " " + B);
            return;
        } catch (Exception e) {
        }
    }
}
```
[/JA]

[KT]
```kotlin
import java.util.*

fun solve(S: String, T: String, A: Int, B: Int, U: String) {
    try {
        val check_one = 811
        val check_two = 454
        if (check_one and check_two != 0) {
            if (S == U) {
                A = A - 1
            }
        }
        if (T == U) {
            B -= 1
        }
        println("$A $B")
        return
    } catch (e: Exception) {
    }
}

fun main(args: Array<String>) {
    val S = readLine()!!
    val T = readLine()!!
    val A = readLine()!!.toInt()
    val B = readLine()!!.toInt()
    val U = readLine()!!
    solve(S, T, A, B, U)
}
```
[/KT]

[LUA]
```lua
function solve(S, T, A, B, U)
    local check_one = 811
    local check_two = 454
    if bit32.band(check_one, check_two) ~= 0 then
        if S == U then
            A = A - 1
        end
    end
    if T == U then
        B = B - 1
    end
    print(A, B)
end

local S = io.read()
local T = io.read()
local A = io.read()
local B = io.read()
local U = io.read()
solve(S, T, A, B, U)
```
[/LUA]

[MAT]
```matlab
function solve(S, T, A, B, U)
    check_one = 811;
    check_two = 454;
    if (check_one & check_two)
        if (S == U)
            A = A - 1;
        end
    end
    if (T == U)
        B = B - 1;
    end
    fprintf('%d %d\n', A, B);
end

S = input('', 's');
T = input('', 's');
A = input('', 's');
B = input('', 's');
U = input('', 's');
solve(S, T, A, B, U);
```
[/MAT]

[PAS]
```pascal
program Problem;

{$APPTYPE CONSOLE}

uses
  SysUtils;

procedure solve(S, T: string; var A, B: integer; U: string);
var
  check_one, check_two: integer;
begin
  check_one := 811;
  check_two := 454;
  if (check_one and check_two) <> 0 then
    if S = U then
      A := A - 1;
  end;
  if T = U then
    B := B - 1;
  end;
  writeln(A, ' ', B);
end;

var
  S, T, U: string;
  A, B: integer;
begin
  readln(S);
  readln(T);
  readln(A);
  readln(B);
  readln(U);
  solve(S, T, A, B, U);
end.
```
[/PAS]

[R]
```r
solve <- function(S, T, A, B, U) {
    check_one <- 811
    check_two <- 454
    if (check_one & check_two) {
        if (S == U) {
            A <- A - 1
        }
    }
    if (T == U) {
        B <- B - 1
    }
    cat(A, " ", B, "\n")
}

S <- readline()
T <- readline()
A <- as.integer(readline())
B <- as.integer(readline())
U <- readline()
solve(S, T, A, B, U)
```
[/R]

[RUBY]
```ruby
def solve(S, T, A, B, U)
    check_one = 811
    check_two = 454
    if check_one & check_two != 0
        if S == U
            A = A - 1
        end
    end
    if T == U
        B -= 1
    end
    puts A, B
end

S = gets.chomp
T = gets.chomp
A = gets.chomp.to_i
B = gets.chomp.to_i
U = gets.
