
[JAV]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String targetString = sc.next();
        int A = sc.nextInt();
        int B = sc.nextInt();
        String U = sc.next();
        solve(S, targetString, A, B, U);
    }

    public static void solve(String S, String targetString, int A, int B, String U) {
        try {
            int checkFlagB = 737;
            int checkFlagA = 685;
            if ((checkFlagB & checkFlagA) != 0) {
                if (S.equals(U)) {
                    A = A - 1;
                }
            }
            if (targetString.equals(U)) {
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

def solve(S, targetString, A, B, U):
    try:
        checkFlagB = 737
        checkFlagA = 685
        if checkFlagB & checkFlagA:
            if S == U:
                A = A - 1
        if targetString == U:
            B -= 1
        print(A, B)
        return
    except:
        pass

def main():
    S = sys.stdin.readline().strip()
    targetString = sys.stdin.readline().strip()
    A = int(sys.stdin.readline().strip())
    B = int(sys.stdin.readline().strip())
    U = sys.stdin.readline().strip()
    solve(S, targetString, A, B, U)

if __name__ == '__main__':
    main()
```
[/PYT]

[CPP]
```cpp
#include <bits/stdc++.h>
using namespace std;

void solve(string S, string targetString, int A, int B, string U) {
    try {
        int checkFlagB = 737;
        int checkFlagA = 685;
        if (checkFlagB & checkFlagA) {
            if (S == U) {
                A = A - 1;
            }
        }
        if (targetString == U) {
            B -= 1;
        }
        cout << A << " " << B << endl;
        return;
    } catch (exception e) {
    }
}

int main() {
    string S;
    string targetString;
    int A;
    int B;
    string U;
    cin >> S;
    cin >> targetString;
    cin >> A;
    cin >> B;
    cin >> U;
    solve(S, targetString, A, B, U);
    return 0;
}
```
[/CPP]

[C]
```c
#include <stdio.h>
#include <stdlib.h>

void solve(char *S, char *targetString, int A, int B, char *U) {
    int checkFlagB = 737;
    int checkFlagA = 685;
    if (checkFlagB & checkFlagA) {
        if (strcmp(S, U) == 0) {
            A = A - 1;
        }
    }
    if (strcmp(targetString, U) == 0) {
        B -= 1;
    }
    printf("%d %d\n", A, B);
}

int main() {
    char S[1000];
    char targetString[1000];
    int A;
    int B;
    char U[1000];
    scanf("%s", S);
    scanf("%s", targetString);
    scanf("%d", &A);
    scanf("%d", &B);
    scanf("%s", U);
    solve(S, targetString, A, B, U);
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

func solve(S string, targetString string, A int, B int, U string) {
    checkFlagB := 737
    checkFlagA := 685
    if checkFlagB&checkFlagA != 0 {
        if S == U {
            A = A - 1
        }
    }
    if targetString == U {
        B -= 1
    }
    fmt.Println(A, B)
}

func main() {
    var S string
    var targetString string
    var A int
    var B int
    var U string
    fmt.Scan(&S)
    fmt.Scan(&targetString)
    fmt.Scan(&A)
    fmt.Scan(&B)
    fmt.Scan(&U)
    solve(S, targetString, A, B, U)
}
```
[/GO]

[RB]
```ruby
def solve(S, targetString, A, B, U)
    checkFlagB = 737
    checkFlagA = 685
    if (checkFlagB & checkFlagA) != 0
        if S == U
            A = A - 1
        end
    end
    if targetString == U
        B -= 1
    end
    puts A, B
end

S = gets.chomp
targetString = gets.chomp
A = gets.to_i
B = gets.to_i
U = gets.chomp
solve(S, targetString, A, B, U)
```
[/RB]

[PHP]
```php
<?php
function solve($S, $targetString, $A, $B, $U) {
    $checkFlagB = 737;
    $checkFlagA = 685;
    if ($checkFlagB & $checkFlagA) {
        if ($S == $U) {
            $A = $A - 1;
        }
    }
    if ($targetString == $U) {
        $B -= 1;
    }
    echo $A . " " . $B . "\n";
}

$S = trim(fgets(STDIN));
$targetString = trim(fgets(STDIN));
$A = trim(fgets(STDIN));
$B = trim(fgets(STDIN));
$U = trim(fgets(STDIN));
solve($S, $targetString, $A, $B, $U);
```
[/PHP]

[PL]
```perl
sub solve {
    my ($S, $targetString, $A, $B, $U) = @_;
    my $checkFlagB = 737;
    my $checkFlagA = 685;
    if ($checkFlagB & $checkFlagA) {
        if ($S eq $U) {
            $A = $A - 1;
        }
    }
    if ($targetString eq $U) {
        $B -= 1;
    }
    print $A . " " . $B . "\n";
}

my $S = <STDIN>;
chomp($S);
my $targetString = <STDIN>;
chomp($targetString);
my $A = <STDIN>;
chomp($A);
my $B = <STDIN>;
chomp($B);
my $U = <STDIN>;
chomp($U);
solve($S, $targetString, $A, $B, $U);
```
[/PL]

[CS]
```csharp
using System;

public class Solution {
    public static void solve(string S, string targetString, int A, int B, string U) {
        int checkFlagB = 737;
        int checkFlagA = 685;
        if ((checkFlagB & checkFlagA) != 0) {
            if (S == U) {
                A = A - 1;
            }
        }
        if (targetString == U) {
            B -= 1;
        }
        Console.WriteLine(A + " " + B);
    }

    public static void Main(string[] args) {
        string S = Console.ReadLine();
        string targetString = Console.ReadLine();
        int A = int.Parse(Console.ReadLine());
        int B = int.Parse(Console.ReadLine());
        string U = Console.ReadLine();
        solve(S, targetString, A, B, U);
    }
}
```
[/CS]

[HAS]
```haskell
solve :: String -> String -> Int -> Int -> String -> IO ()
solve S targetString A B U = do
    let checkFlagB = 737
    let checkFlagA = 685
    if (checkFlagB .&. checkFlagA) /= 0
        then if S == U
            then A = A - 1
            else return ()
        else return ()
    if targetString == U
        then B = B - 1
        else return ()
    print (A, B)

main = do
    S <- getLine
    targetString <- getLine
    A <- readLn :: IO Int
    B <- readLn :: IO Int
    U <- getLine
    solve S targetString A B U
```
[/HAS]

[JA]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String targetString = sc.next();
        int A = sc.nextInt();
        int B = sc.nextInt();
        String U = sc.next();
        solve(S, targetString, A, B, U);
    }

    public static void solve(String S, String targetString, int A, int B, String U) {
        try {
            int checkFlagB = 737;
            int checkFlagA = 685;
            if ((checkFlagB & checkFlagA) != 0) {
                if (S.equals(U)) {
                    A = A - 1;
                }
            }
            if (targetString.equals(U)) {
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
fun solve(S: String, targetString: String, A: Int, B: Int, U: String) {
    val checkFlagB = 737
    val checkFlagA = 685
    if (checkFlagB and checkFlagA != 0) {
        if (S == U) {
            A = A - 1
        }
    }
    if (targetString == U) {
        B -= 1
    }
    println("$A $B")
}

fun main() {
    val S = readLine()!!
    val targetString = readLine()!!
    val A = readLine()!!.toInt()
    val B = readLine()!!.toInt()
    val U = readLine()!!
    solve(S, targetString, A, B, U)
}
```
[/KT]

[LUA]
```lua
function solve(S, targetString, A, B, U)
    local checkFlagB = 737
    local checkFlagA = 685
    if (checkFlagB & checkFlagA) ~= 0 then
        if S == U then
            A = A - 1
        end
    end
    if targetString == U then
        B = B - 1
    end
    print(A, B)
end

S = io.read()
targetString = io.read()
A = io.read()
B = io.read()
U = io.read()
solve(S, targetString, A, B, U)
```
[/LUA]

[MAT]
```matlab
function solve(S, targetString, A, B, U)
    checkFlagB = 737;
    checkFlagA = 685;
    if (checkFlagB & checkFlagA) ~= 0
        if S == U
            A = A - 1;
        end
    end
    if targetString == U
        B = B - 1;
    end
    fprintf('%d %d\n', A, B);
end

S = input('', 's');
targetString = input('', 's');
A = input('', 's');
B = input('', 's');
U = input('', 's');
solve(S, targetString, A, B, U);
```
[/MAT]

[PAS]
```pascal
function solve(S, targetString, A, B, U: string): boolean;
var
    checkFlagB: integer;
    checkFlagA: integer;
begin
    checkFlagB := 737;
    checkFlagA := 685;
    if (checkFlagB and checkFlagA) <> 0 then
        if S = U then
            A := A - 1;
        end;
    end;
    if targetString = U then
        B := B - 1;
    end;
    writeln(A, ' ', B);
    solve := true;
end;

var
    S, targetString, U: string;
    A, B: integer;
begin
    readln(S);
    readln(targetString);
    readln(A);
    readln(B);
    readln(U);
    solve(S, targetString, A, B, U);
end.
```
[/PAS]

[OBJ]
```objectivec
#import <Foundation/Foundation.h>

int solve(NSString *S, NSString *targetString, int A, int B, NSString *U) {
    int checkFlagB = 737;
    int checkFlagA = 685;
    if (checkFlagB & checkFlagA) {
        if ([S isEqualToString:U]) {
            A = A - 1;
        }
    }
    if ([targetString isEqualToString:U]) {
        B -= 1;
    }
    NSLog(@"%d %d", A, B);
    return 0;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        NSString *S = [[
