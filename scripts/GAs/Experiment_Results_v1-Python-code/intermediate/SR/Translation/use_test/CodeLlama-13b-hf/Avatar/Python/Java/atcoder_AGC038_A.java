
[JAV]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        solve(H, W, A, B);
    }

    public static void solve(int H, int W, int A, int B) {
        String[][] answer = new String[H][W];
        int primaryConditionalChecker = 967;
        int secondaryConditionalChecker = 638;
        int conditionalCheckerOne = 555;
        int conditionalCheckerTwo = 438;
        for (int i = 0; i < H; i++) {
            for (int horizontalIterator = 0; horizontalIterator < W; horizontalIterator++) {
                if ((conditionalCheckerOne & conditionalCheckerTwo) != 0) {
                    if ((primaryConditionalChecker & secondaryConditionalChecker) != 0) {
                        if (i < B) {
                            if (horizontalIterator < A) {
                                answer[i][horizontalIterator] = "0";
                            } else {
                                answer[i][horizontalIterator] = "1";
                            }
                        } else if (horizontalIterator < A) {
                            answer[i][horizontalIterator] = "1";
                        } else {
                            answer[i][horizontalIterator] = "0";
                        }
                    }
                }
            }
        }
        for (int i = 0; i < H; i++) {
            System.out.println(String.join("", answer[i]));
        }
    }
}
```
[/JAV]

[PY]
```python
import sys

def solve(H, W, A, B):
    answer = [['0'] * W for _ in range(H)]
    primaryConditionalChecker = 967
    secondaryConditionalChecker = 638
    conditionalCheckerOne = 555
    conditionalCheckerTwo = 438
    for i in range(H):
        for horizontalIterator in range(W):
            if conditionalCheckerOne & conditionalCheckerTwo:
                if primaryConditionalChecker & secondaryConditionalChecker:
                    if i < B:
                        if horizontalIterator < A:
                            answer[i][horizontalIterator] = '0'
                        else:
                            answer[i][horizontalIterator] = '1'
                    elif horizontalIterator < A:
                        answer[i][horizontalIterator] = '1'
                    else:
                        answer[i][horizontalIterator] = '0'
    for i in range(H):
        print(''.join(answer[i]))
    return

def main():

    def iterate_tokens():
        for line in sys.stdin:
            for word in line.split():
                yield word
    queue_iterate_tokens0 = queue.Queue()

    def iterate_tokens_thread(queue):
        result = iterate_tokens()
        queue.put(result)
    thread_iterate_tokens0 = threading.Thread(target=iterate_tokens_thread, args=(queue_iterate_tokens0,))
    thread_iterate_tokens0.start()
    thread_iterate_tokens0.join()
    result_iterate_tokens0 = queue_iterate_tokens0.get()
    tokens = result_iterate_tokens0
    H = int(next(tokens))
    W = int(next(tokens))
    A = int(next(tokens))
    B = int(next(tokens))
    solve(H, W, A, B)
if __name__ == '__main__':
    main()
```
[/PY]

[C++]
```cpp
#include <iostream>
#include <string>
#include <vector>

using namespace std;

void solve(int H, int W, int A, int B) {
    vector<vector<string>> answer(H, vector<string>(W, "0"));
    int primaryConditionalChecker = 967;
    int secondaryConditionalChecker = 638;
    int conditionalCheckerOne = 555;
    int conditionalCheckerTwo = 438;
    for (int i = 0; i < H; i++) {
        for (int horizontalIterator = 0; horizontalIterator < W; horizontalIterator++) {
            if ((conditionalCheckerOne & conditionalCheckerTwo) != 0) {
                if ((primaryConditionalChecker & secondaryConditionalChecker) != 0) {
                    if (i < B) {
                        if (horizontalIterator < A) {
                            answer[i][horizontalIterator] = "0";
                        } else {
                            answer[i][horizontalIterator] = "1";
                        }
                    } else if (horizontalIterator < A) {
                        answer[i][horizontalIterator] = "1";
                    } else {
                        answer[i][horizontalIterator] = "0";
                    }
                }
            }
        }
    }
    for (int i = 0; i < H; i++) {
        for (int horizontalIterator = 0; horizontalIterator < W; horizontalIterator++) {
            cout << answer[i][horizontalIterator];
        }
        cout << endl;
    }
}

int main() {
    int H, W, A, B;
    cin >> H >> W >> A >> B;
    solve(H, W, A, B);
}
```
[/C++]

[C#]
```csharp
using System;
using System.Collections.Generic;
using System.Linq;

class Program
{
    static void Main(string[] args)
    {
        int H = int.Parse(Console.ReadLine());
        int W = int.Parse(Console.ReadLine());
        int A = int.Parse(Console.ReadLine());
        int B = int.Parse(Console.ReadLine());
        solve(H, W, A, B);
    }

    public static void solve(int H, int W, int A, int B)
    {
        string[][] answer = new string[H][];
        for (int i = 0; i < H; i++)
        {
            answer[i] = new string[W];
            for (int j = 0; j < W; j++)
            {
                answer[i][j] = "0";
            }
        }
        int primaryConditionalChecker = 967;
        int secondaryConditionalChecker = 638;
        int conditionalCheckerOne = 555;
        int conditionalCheckerTwo = 438;
        for (int i = 0; i < H; i++)
        {
            for (int horizontalIterator = 0; horizontalIterator < W; horizontalIterator++)
            {
                if ((conditionalCheckerOne & conditionalCheckerTwo) != 0)
                {
                    if ((primaryConditionalChecker & secondaryConditionalChecker) != 0)
                    {
                        if (i < B)
                        {
                            if (horizontalIterator < A)
                            {
                                answer[i][horizontalIterator] = "0";
                            }
                            else
                            {
                                answer[i][horizontalIterator] = "1";
                            }
                        }
                        else if (horizontalIterator < A)
                        {
                            answer[i][horizontalIterator] = "1";
                        }
                        else
                        {
                            answer[i][horizontalIterator] = "0";
                        }
                    }
                }
            }
        }
        for (int i = 0; i < H; i++)
        {
            for (int horizontalIterator = 0; horizontalIterator < W; horizontalIterator++)
            {
                Console.Write(answer[i][horizontalIterator]);
            }
            Console.WriteLine();
        }
    }
}
```
[/C#]

[PHP]
```php
<?php

function solve($H, $W, $A, $B) {
    $answer = array_fill(0, $H, array_fill(0, $W, "0"));
    $primaryConditionalChecker = 967;
    $secondaryConditionalChecker = 638;
    $conditionalCheckerOne = 555;
    $conditionalCheckerTwo = 438;
    for ($i = 0; $i < $H; $i++) {
        for ($horizontalIterator = 0; $horizontalIterator < $W; $horizontalIterator++) {
            if ($conditionalCheckerOne & $conditionalCheckerTwo) {
                if ($primaryConditionalChecker & $secondaryConditionalChecker) {
                    if ($i < $B) {
                        if ($horizontalIterator < $A) {
                            $answer[$i][$horizontalIterator] = "0";
                        } else {
                            $answer[$i][$horizontalIterator] = "1";
                        }
                    } else if ($horizontalIterator < $A) {
                        $answer[$i][$horizontalIterator] = "1";
                    } else {
                        $answer[$i][$horizontalIterator] = "0";
                    }
                }
            }
        }
    }
    for ($i = 0; $i < $H; $i++) {
        for ($horizontalIterator = 0; $horizontalIterator < $W; $horizontalIterator++) {
            echo $answer[$i][$horizontalIterator];
        }
        echo "\n";
    }
}

$H = intval(fgets(STDIN));
$W = intval(fgets(STDIN));
$A = intval(fgets(STDIN));
$B = intval(fgets(STDIN));
solve($H, $W, $A, $B);
```
[/PHP]

[RUBY]
```ruby
def solve(H, W, A, B)
    answer = Array.new(H) { Array.new(W, "0") }
    primaryConditionalChecker = 967
    secondaryConditionalChecker = 638
    conditionalCheckerOne = 555
    conditionalCheckerTwo = 438
    for i in 0..(H - 1)
        for horizontalIterator in 0..(W - 1)
            if (conditionalCheckerOne & conditionalCheckerTwo) != 0
                if (primaryConditionalChecker & secondaryConditionalChecker) != 0
                    if i < B
                        if horizontalIterator < A
                            answer[i][horizontalIterator] = "0"
                        else
                            answer[i][horizontalIterator] = "1"
                        end
                    elsif horizontalIterator < A
                        answer[i][horizontalIterator] = "1"
                    else
                        answer[i][horizontalIterator] = "0"
                    end
                end
            end
        end
    end
    for i in 0..(H - 1)
        for horizontalIterator in 0..(W - 1)
            print answer[i][horizontalIterator]
        end
        print "\n"
    end
end

H, W, A, B = gets.chomp.split(" ").map{|i| i.to_i}
solve(H, W, A, B)
```
[/RUBY]

[GO]
```go
package main

import (
    "fmt"
    "strconv"
)

func solve(H, W, A, B int) {
    answer := make([][]string, H)
    for i := 0; i < H; i++ {
        answer[i] = make([]string, W)
        for j := 0; j < W; j++ {
            answer[i][j] = "0"
        }
    }
    primaryConditionalChecker := 967
    secondaryConditionalChecker := 638
    conditionalCheckerOne := 555
    conditionalCheckerTwo := 438
    for i := 0; i < H; i++ {
        for horizontalIterator := 0; horizontalIterator < W; horizontalIterator++ {
            if (conditionalCheckerOne & conditionalCheckerTwo) != 0 {
                if (primaryConditionalChecker & secondaryConditionalChecker) != 0 {
                    if i < B {
                        if horizontalIterator < A {
                            answer[i][horizontalIterator] = "0"
                        } else {
                            answer[i][horizontalIterator] = "1"
                        }
                    } else if horizontalIterator < A {
                        answer[i][horizontalIterator] = "1"
                    } else {
                        answer[i][horizontalIterator] = "0"
                    }
                }
            }
        }
    }
    for i := 0; i < H; i++ {
        for horizontalIterator := 0; horizontalIterator < W; horizontalIterator++ {
            fmt.Print(answer[i][horizontalIterator])
        }
        fmt.Println()
    }
}

func main() {
    var H, W, A, B int
    fmt.Scan(&H, &W, &A, &B)
    solve(H, W, A, B)
}
```
[/GO]

[PAS]
```pascal
program Problem1001A;
{$APPTYPE CONSOLE}
var
  H, W, A, B, i, horizontalIterator: Integer;
  primaryConditionalChecker, secondaryConditionalChecker, conditionalCheckerOne, conditionalCheckerTwo: Integer;
  answer: array of array of string;

begin
  ReadLn(H, W, A, B);
  SetLength(answer, H);
  for i := 0 to H - 1 do
  begin
    SetLength(answer[i], W);
    for horizontalIterator := 0 to W - 1 do
      answer[i][horizontalIterator] := '0';
  end;
  primaryConditionalChecker := 967;
  secondaryConditionalChecker := 638;
  conditionalCheckerOne := 555;
  conditionalCheckerTwo := 438;
  for i
