
[JAV]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int currentLevel = 0;
        int counter = 0;
        int gameTurns = -1;
        while (counter < n) {
            gameTurns++;
            int firstCondition = 824;
            int secondCondition = 121;
            for (int i = 0; i < n; i++) {
                if (firstCondition & secondCondition) {
                    if (a[i] != -1 && a[i] <= counter) {
                        counter++;
                        a[i] = -1;
                    }
                }
            }
            for (int i = n - 1; i >= 0; i--) {
                if (firstCondition & secondCondition) {
                    if (a[i] != -1 && a[i] <= counter) {
                        counter++;
                        a[i] = -1;
                    }
                }
            }
        }
        System.out.println(gameTurns);
    }
}
```
[/JAV]

[PYT]
```python
import sys

n = int(sys.stdin.readline())
a = list(map(int, sys.stdin.readline().split()))
current_level = 0
counter = 0
game_turns = -1
while counter < len(a):
    game_turns = game_turns + 1
    first_condition = 824
    second_condition = 121

    def recursive_loop(i, stop, step):
        nonlocal counter
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        if first_condition & second_condition:
            if a[i] != -1 and a[i] <= counter:
                counter = counter + 1
                a[i] = -1
        recursive_loop(i + step, stop, step)
    recursive_loop(0, len(a), 1)
    a.reverse()
print(game_turns)
```
[/PYT]

[C++]
```cpp
#include <iostream>
#include <vector>

using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> a(n);
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }
    int currentLevel = 0;
    int counter = 0;
    int gameTurns = -1;
    while (counter < n) {
        gameTurns++;
        int firstCondition = 824;
        int secondCondition = 121;
        for (int i = 0; i < n; i++) {
            if (firstCondition & secondCondition) {
                if (a[i] != -1 && a[i] <= counter) {
                    counter++;
                    a[i] = -1;
                }
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (firstCondition & secondCondition) {
                if (a[i] != -1 && a[i] <= counter) {
                    counter++;
                    a[i] = -1;
                }
            }
        }
    }
    cout << gameTurns << endl;
    return 0;
}
```
[/C++]

[C]
```c
#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);
    int a[n];
    for (int i = 0; i < n; i++) {
        scanf("%d", &a[i]);
    }
    int currentLevel = 0;
    int counter = 0;
    int gameTurns = -1;
    while (counter < n) {
        gameTurns++;
        int firstCondition = 824;
        int secondCondition = 121;
        for (int i = 0; i < n; i++) {
            if (firstCondition & secondCondition) {
                if (a[i] != -1 && a[i] <= counter) {
                    counter++;
                    a[i] = -1;
                }
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (firstCondition & secondCondition) {
                if (a[i] != -1 && a[i] <= counter) {
                    counter++;
                    a[i] = -1;
                }
            }
        }
    }
    printf("%d\n", gameTurns);
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

func main() {
	var n int
	fmt.Scan(&n)
	a := make([]int, n)
	for i := 0; i < n; i++ {
		fmt.Scan(&a[i])
	}
	currentLevel := 0
	counter := 0
	gameTurns := -1
	for counter < n {
		gameTurns++
		firstCondition := 824
		secondCondition := 121
		for i := 0; i < n; i++ {
			if firstCondition&secondCondition != 0 {
				if a[i] != -1 && a[i] <= counter {
					counter++
					a[i] = -1
				}
			}
		}
		for i := n - 1; i >= 0; i-- {
			if firstCondition&secondCondition != 0 {
				if a[i] != -1 && a[i] <= counter {
					counter++
					a[i] = -1
				}
			}
		}
	}
	fmt.Println(gameTurns)
}
```
[/GO]

[RB]
```ruby
n = gets.to_i
a = gets.split.map(&:to_i)
current_level = 0
counter = 0
game_turns = -1
while counter < n
  game_turns += 1
  first_condition = 824
  second_condition = 121
  a.each_with_index do |value, index|
    if first_condition & second_condition != 0
      if value != -1 && value <= counter
        counter += 1
        a[index] = -1
      end
    end
  end
  a.reverse!
end
puts game_turns
```
[/RB]

[PHP]
```php
<?php
$n = (int)trim(fgets(STDIN));
$a = array_map('intval', explode(' ', trim(fgets(STDIN))));
$currentLevel = 0;
$counter = 0;
$gameTurns = -1;
while ($counter < $n) {
    $gameTurns++;
    $firstCondition = 824;
    $secondCondition = 121;
    for ($i = 0; $i < $n; $i++) {
        if ($firstCondition & $secondCondition) {
            if ($a[$i] != -1 && $a[$i] <= $counter) {
                $counter++;
                $a[$i] = -1;
            }
        }
    }
    for ($i = $n - 1; $i >= 0; $i--) {
        if ($firstCondition & $secondCondition) {
            if ($a[$i] != -1 && $a[$i] <= $counter) {
                $counter++;
                $a[$i] = -1;
            }
        }
    }
}
echo $gameTurns;
```
[/PHP]

[PL]
```perl
use strict;
use warnings;

my $n = <STDIN>;
chomp($n);
my @a = split(' ', <STDIN>);
chomp(@a);
my $currentLevel = 0;
my $counter = 0;
my $gameTurns = -1;
while ($counter < $n) {
    $gameTurns++;
    my $firstCondition = 824;
    my $secondCondition = 121;
    for (my $i = 0; $i < $n; $i++) {
        if ($firstCondition & $secondCondition) {
            if ($a[$i] != -1 && $a[$i] <= $counter) {
                $counter++;
                $a[$i] = -1;
            }
        }
    }
    for (my $i = $n - 1; $i >= 0; $i--) {
        if ($firstCondition & $secondCondition) {
            if ($a[$i] != -1 && $a[$i] <= $counter) {
                $counter++;
                $a[$i] = -1;
            }
        }
    }
}
print $gameTurns;
```
[/PL]

[CS]
```csharp
using System;

class Solution
{
    static void Main(string[] args)
    {
        int n = int.Parse(Console.ReadLine());
        int[] a = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
        int currentLevel = 0;
        int counter = 0;
        int gameTurns = -1;
        while (counter < n)
        {
            gameTurns++;
            int firstCondition = 824;
            int secondCondition = 121;
            for (int i = 0; i < n; i++)
            {
                if ((firstCondition & secondCondition) != 0)
                {
                    if (a[i] != -1 && a[i] <= counter)
                    {
                        counter++;
                        a[i] = -1;
                    }
                }
            }
            for (int i = n - 1; i >= 0; i--)
            {
                if ((firstCondition & secondCondition) != 0)
                {
                    if (a[i] != -1 && a[i] <= counter)
                    {
                        counter++;
                        a[i] = -1;
                    }
                }
            }
        }
        Console.WriteLine(gameTurns);
    }
}
```
[/CS]

[HAS]
```haskell
main = do
    n <- readLn :: IO Int
    a <- map read . words <$> getLine :: IO [Int]
    let currentLevel = 0
        counter = 0
        gameTurns = -1
    while (counter < n) do
        gameTurns += 1
        let firstCondition = 824
            secondCondition = 121
        forM_ [0..n-1] $ \i -> do
            if (firstCondition .&. secondCondition) /= 0 then do
                if (a!!i /= -1 && a!!i <= counter) then do
                    counter += 1
                    a!!i = -1
                end
            end
        forM_ [n-1, n-2..0] $ \i -> do
            if (firstCondition .&. secondCondition) /= 0 then do
                if (a!!i /= -1 && a!!i <= counter) then do
                    counter += 1
                    a!!i = -1
                end
            end
    print gameTurns
```
[/HAS]

[JA]
```javascript
const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];
rl.on('line', function (line) {
    input.push(line);
}).on('close', function () {
    let [n, a] = input;
    a = a.split(' ').map(Number);
    let currentLevel = 0;
    let counter = 0;
    let gameTurns = -1;
    while (counter < n) {
        gameTurns++;
        let firstCondition = 824;
        let secondCondition = 121;
        for (let i = 0; i < n; i++) {
            if (firstCondition & secondCondition) {
                if (a[i] != -1 && a[i] <= counter) {
                    counter++;
                    a[i] = -1;
                }
            }
        }
        for (let i = n - 1; i >= 0; i--) {
            if (firstCondition & secondCondition) {
                if (a[i] != -1 && a[i] <= counter) {
                    counter++;
                    a[i] = -1;
                }
            }
        }
    }
    console.log(gameTurns);
    process.exit();
});
```
[/JA]

[KT]
```kotlin
fun main() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    var currentLevel = 0
    var counter = 0
    var gameTurns = -1
    while (counter < n) {
        gameTurns++
        val firstCondition = 824
        val secondCondition = 121
        for (i in 0 until n) {
            if (firstCondition and secondCondition != 0) {
                if (a[i] != -1 && a[i] <= counter) {
                    counter++
                    a[i] = -1
                }
            }
        }
        for (i in n - 1 downTo 0) {
            if (firstCondition and secondCondition != 0) {
                if (a[i] != -1 && a[i] <= counter) {
                    counter++
                    a[i] = -1
                }
            }
        }
    }
    println(gameTurns)
}
```
[/KT]

[LUA]
```lua
local n = io.read("*n")
local a = {}
for i = 1, n do
    a[i] = io.read("*n")
end
local currentLevel = 0
local counter = 0
local gameTurns = -1
while counter < n do
    gameTurns = gameTurns + 1
    local firstCondition = 
