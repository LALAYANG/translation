
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
        int[][] answer = new int[H][W];
        int checkFour = 389;
        int checkThree = 451;
        int checkOne = 914;
        int checkTwo = 237;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if ((checkOne & checkTwo) != 0) {
                    if ((checkFour & checkThree) != 0) {
                        if (i < B) {
                            if (j < A) {
                                answer[i][j] = 0;
                            } else {
                                answer[i][j] = 1;
                            }
                        } else if (j < A) {
                            answer[i][j] = 1;
                        } else {
                            answer[i][j] = 0;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                System.out.print(answer[i][j]);
            }
            System.out.println();
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
    checkFour = 389
    checkThree = 451
    checkOne = 914
    checkTwo = 237
    for i in range(H):
        for j in range(W):
            if checkOne & checkTwo:
                if checkFour & checkThree:
                    if i < B:
                        if j < A:
                            answer[i][j] = '0'
                        else:
                            answer[i][j] = '1'
                    elif j < A:
                        answer[i][j] = '1'
                    else:
                        answer[i][j] = '0'
    for i in range(H):
        print(''.join(answer[i]))
    return

def main():

    def iterateTokens():
        for line in sys.stdin:
            for word in line.split():
                yield word
    queue_iterateTokens0 = queue.Queue()

    def iterateTokens_thread(queue):
        result = iterateTokens()
        queue.put(result)
    thread_iterateTokens0 = threading.Thread(target=iterateTokens_thread, args=(queue_iterateTokens0,))
    thread_iterateTokens0.start()
    thread_iterateTokens0.join()
    result_iterateTokens0 = queue_iterateTokens0.get()
    tokens = result_iterateTokens0
    H = int(next(tokens))
    W = int(next(tokens))
    A = int(next(tokens))
    B = int(next(tokens))
    solve(H, W, A, B)
if __name__ == '__main__':
    main()
```
[/PY]

[C]
```c
#include <stdio.h>

int main() {
    int H, W, A, B;
    scanf("%d %d %d %d", &H, &W, &A, &B);
    solve(H, W, A, B);
}

void solve(int H, int W, int A, int B) {
    int answer[H][W];
    int checkFour = 389;
    int checkThree = 451;
    int checkOne = 914;
    int checkTwo = 237;
    for (int i = 0; i < H; i++) {
        for (int j = 0; j < W; j++) {
            if ((checkOne & checkTwo) != 0) {
                if ((checkFour & checkThree) != 0) {
                    if (i < B) {
                        if (j < A) {
                            answer[i][j] = 0;
                        } else {
                            answer[i][j] = 1;
                        }
                    } else if (j < A) {
                        answer[i][j] = 1;
                    } else {
                        answer[i][j] = 0;
                    }
                }
            }
        }
    }
    for (int i = 0; i < H; i++) {
        for (int j = 0; j < W; j++) {
            printf("%d", answer[i][j]);
        }
        printf("\n");
    }
}
```
[/C]

[CPP]
```cpp
#include <iostream>

using namespace std;

int main() {
    int H, W, A, B;
    cin >> H >> W >> A >> B;
    solve(H, W, A, B);
}

void solve(int H, int W, int A, int B) {
    int answer[H][W];
    int checkFour = 389;
    int checkThree = 451;
    int checkOne = 914;
    int checkTwo = 237;
    for (int i = 0; i < H; i++) {
        for (int j = 0; j < W; j++) {
            if ((checkOne & checkTwo) != 0) {
                if ((checkFour & checkThree) != 0) {
                    if (i < B) {
                        if (j < A) {
                            answer[i][j] = 0;
                        } else {
                            answer[i][j] = 1;
                        }
                    } else if (j < A) {
                        answer[i][j] = 1;
                    } else {
                        answer[i][j] = 0;
                    }
                }
            }
        }
    }
    for (int i = 0; i < H; i++) {
        for (int j = 0; j < W; j++) {
            cout << answer[i][j];
        }
        cout << endl;
    }
}
```
[/CPP]

[GO]
```go
package main

import (
    "fmt"
)

func main() {
    var H, W, A, B int
    fmt.Scan(&H, &W, &A, &B)
    solve(H, W, A, B)
}

func solve(H, W, A, B int) {
    answer := make([][]int, H)
    for i := 0; i < H; i++ {
        answer[i] = make([]int, W)
    }
    checkFour := 389
    checkThree := 451
    checkOne := 914
    checkTwo := 237
    for i := 0; i < H; i++ {
        for j := 0; j < W; j++ {
            if checkOne&checkTwo != 0 {
                if checkFour&checkThree != 0 {
                    if i < B {
                        if j < A {
                            answer[i][j] = 0
                        } else {
                            answer[i][j] = 1
                        }
                    } else if j < A {
                        answer[i][j] = 1
                    } else {
                        answer[i][j] = 0
                    }
                }
            }
        }
    }
    for i := 0; i < H; i++ {
        for j := 0; j < W; j++ {
            fmt.Printf("%d", answer[i][j])
        }
        fmt.Println()
    }
}
```
[/GO]

[RB]
```ruby
H, W, A, B = gets.split.map(&:to_i)
solve(H, W, A, B)

def solve(H, W, A, B)
    answer = Array.new(H) { Array.new(W, 0) }
    checkFour = 389
    checkThree = 451
    checkOne = 914
    checkTwo = 237
    for i in 0...H
        for j in 0...W
            if (checkOne & checkTwo) != 0
                if (checkFour & checkThree) != 0
                    if i < B
                        if j < A
                            answer[i][j] = 0
                        else
                            answer[i][j] = 1
                        end
                    elsif j < A
                        answer[i][j] = 1
                    else
                        answer[i][j] = 0
                    end
                end
            end
        end
    end
    for i in 0...H
        for j in 0...W
            print answer[i][j]
        end
        puts
    end
end
```
[/RB]

[PHP]
```php
<?php
$H = (int)trim(fgets(STDIN));
$W = (int)trim(fgets(STDIN));
$A = (int)trim(fgets(STDIN));
$B = (int)trim(fgets(STDIN));
solve($H, $W, $A, $B);

function solve($H, $W, $A, $B) {
    $answer = array_fill(0, $H, array_fill(0, $W, 0));
    $checkFour = 389;
    $checkThree = 451;
    $checkOne = 914;
    $checkTwo = 237;
    for ($i = 0; $i < $H; $i++) {
        for ($j = 0; $j < $W; $j++) {
            if ($checkOne & $checkTwo) {
                if ($checkFour & $checkThree) {
                    if ($i < $B) {
                        if ($j < $A) {
                            $answer[$i][$j] = 0;
                        } else {
                            $answer[$i][$j] = 1;
                        }
                    } else if ($j < $A) {
                        $answer[$i][$j] = 1;
                    } else {
                        $answer[$i][$j] = 0;
                    }
                }
            }
        }
    }
    for ($i = 0; $i < $H; $i++) {
        for ($j = 0; $j < $W; $j++) {
            echo $answer[$i][$j];
        }
        echo "\n";
    }
}
```
[/PHP]

[PL]
```perl
my $H = <STDIN>;
chomp($H);
my $W = <STDIN>;
chomp($W);
my $A = <STDIN>;
chomp($A);
my $B = <STDIN>;
chomp($B);
solve($H, $W, $A, $B);

sub solve {
    my ($H, $W, $A, $B) = @_;
    my @answer = (0) x $H;
    my $checkFour = 389;
    my $checkThree = 451;
    my $checkOne = 914;
    my $checkTwo = 237;
    for my $i (0 .. $H - 1) {
        for my $j (0 .. $W - 1) {
            if ($checkOne & $checkTwo) {
                if ($checkFour & $checkThree) {
                    if ($i < $B) {
                        if ($j < $A) {
                            $answer[$i][$j] = 0;
                        } else {
                            $answer[$i][$j] = 1;
                        }
                    } elsif ($j < $A) {
                        $answer[$i][$j] = 1;
                    } else {
                        $answer[$i][$j] = 0;
                    }
                }
            }
        }
    }
    for my $i (0 .. $H - 1) {
        for my $j (0 .. $W - 1) {
            print $answer[$i][$j];
        }
        print "\n";
    }
}
```
[/PL]

[CS]
```csharp
using System;

class Solution {
    static void Main(string[] args) {
        int H = int.Parse(Console.ReadLine());
        int W = int.Parse(Console.ReadLine());
        int A = int.Parse(Console.ReadLine());
        int B = int.Parse(Console.ReadLine());
        solve(H, W, A, B);
    }

    static void solve(int H, int W, int A, int B) {
        int[][] answer = new int[H][];
        for (int i = 0; i < H; i++) {
            answer[i] = new int[W];
        }
        int checkFour = 389;
        int checkThree = 451;
        int checkOne = 914;
        int checkTwo = 237;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if ((checkOne & checkTwo) != 0) {
                    if ((checkFour & checkThree) != 0) {
                
