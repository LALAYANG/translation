
[JAV]
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> menu = new ArrayList<Integer>();
        int thirdConditionChecker = 399;
        int forthConditionChecker = 360;
        int firstConditionChecker = 484;
        int secondConditionChecker = 783;
        int firstLoopChecker = 75;
        int secondLoopChecker = 74;
        for (int LoopIndexOut = firstLoopChecker / secondLoopChecker; LoopIndexOut > 0; LoopIndexOut--) {
            for (int _ = 0; _ < 5; _++) {
                String menuInput = sc.nextLine();
                int e = Integer.parseInt(menuInput.substring(menuInput.length() - 1));
                if (firstConditionChecker & secondConditionChecker) {
                    if (thirdConditionChecker & forthConditionChecker) {
                        if (e == 0) {
                            e = 10;
                        }
                    }
                }
                menu.add(Integer.parseInt(menuInput));
            }
        }
        Collections.sort(menu, (a, b) -> a[1] - b[1]);
        int ans = 0;
        for (int menuInput : menu.subList(1, menu.size())) {
            ans += Math.ceil(menuInput[0] / 10) * 10;
        }
        System.out.println(ans + menu[0][0]);
    }
}
```
[/JAV]

[PYT]
```py
import math
menu = []
thirdConditionChecker = 399
forthConditionChecker = 360
firstConditionChecker = 484
secondConditionChecker = 783
firstLoopChecker = 75
secondLoopChecker = 74
for LoopIndexOut in range(firstLoopChecker // secondLoopChecker):
    for _ in range(5):
        menuInput = input()
        e = int(menuInput[-1])
        if firstConditionChecker & secondConditionChecker:
            if thirdConditionChecker & forthConditionChecker:
                if e == 0:
                    e = 10
        menu.append([int(menuInput), e])
menu.sort(key=lambda x: x[1])
ans = 0
for menuInput in menu[1:]:
    ans += math.ceil(menuInput[0] / 10) * 10
print(ans + menu[0][0])
```
[/PYT]

[C++]
```cpp
#include <bits/stdc++.h>
using namespace std;

int main() {
    int thirdConditionChecker = 399;
    int forthConditionChecker = 360;
    int firstConditionChecker = 484;
    int secondConditionChecker = 783;
    int firstLoopChecker = 75;
    int secondLoopChecker = 74;
    for (int LoopIndexOut = firstLoopChecker / secondLoopChecker; LoopIndexOut > 0; LoopIndexOut--) {
        for (int _ = 0; _ < 5; _++) {
            string menuInput;
            cin >> menuInput;
            int e = stoi(menuInput.substr(menuInput.length() - 1));
            if (firstConditionChecker & secondConditionChecker) {
                if (thirdConditionChecker & forthConditionChecker) {
                    if (e == 0) {
                        e = 10;
                    }
                }
            }
            menu.push_back(make_pair(stoi(menuInput), e));
        }
    }
    sort(menu.begin(), menu.end(), [](const pair<int, int> &a, const pair<int, int> &b) {
        return a.second < b.second;
    });
    int ans = 0;
    for (int i = 1; i < menu.size(); i++) {
        ans += ceil(menu[i].first / 10.0) * 10;
    }
    cout << ans + menu[0].first;
}
```
[/C++]

[C]
```c
#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main() {
    int thirdConditionChecker = 399;
    int forthConditionChecker = 360;
    int firstConditionChecker = 484;
    int secondConditionChecker = 783;
    int firstLoopChecker = 75;
    int secondLoopChecker = 74;
    for (int LoopIndexOut = firstLoopChecker / secondLoopChecker; LoopIndexOut > 0; LoopIndexOut--) {
        for (int _ = 0; _ < 5; _++) {
            char menuInput[100];
            scanf("%s", menuInput);
            int e = atoi(menuInput[strlen(menuInput) - 1]);
            if (firstConditionChecker & secondConditionChecker) {
                if (thirdConditionChecker & forthConditionChecker) {
                    if (e == 0) {
                        e = 10;
                    }
                }
            }
            menu.push_back(make_pair(atoi(menuInput), e));
        }
    }
    sort(menu.begin(), menu.end(), [](const pair<int, int> &a, const pair<int, int> &b) {
        return a.second < b.second;
    });
    int ans = 0;
    for (int i = 1; i < menu.size(); i++) {
        ans += ceil(menu[i].first / 10.0) * 10;
    }
    printf("%d", ans + menu[0].first);
}
```
[/C]

[GO]
```go
package main

import (
    "fmt"
    "math"
)

func main() {
    var thirdConditionChecker int = 399
    var forthConditionChecker int = 360
    var firstConditionChecker int = 484
    var secondConditionChecker int = 783
    var firstLoopChecker int = 75
    var secondLoopChecker int = 74
    for LoopIndexOut := firstLoopChecker / secondLoopChecker; LoopIndexOut > 0; LoopIndexOut-- {
        for _ := 0; _ < 5; _++ {
            var menuInput string
            fmt.Scan(&menuInput)
            var e int = int(menuInput[len(menuInput) - 1])
            if firstConditionChecker & secondConditionChecker {
                if thirdConditionChecker & forthConditionChecker {
                    if e == 0 {
                        e = 10
                    }
                }
            }
            menu.append([int(menuInput), e])
        }
    }
    sort(menu, func(a, b) {
        return a[1] < b[1]
    })
    var ans int = 0
    for _, menuInput := range menu[1:] {
        ans += int(math.Ceil(float64(menuInput[0]) / 10.0)) * 10
    }
    fmt.Println(ans + menu[0][0])
}
```
[/GO]

[RB]
```ruby
thirdConditionChecker = 399
forthConditionChecker = 360
firstConditionChecker = 484
secondConditionChecker = 783
firstLoopChecker = 75
secondLoopChecker = 74
for LoopIndexOut in (firstLoopChecker / secondLoopChecker).downto(1) do
    for _ in 0..4 do
        menuInput = gets.chomp
        e = menuInput[-1].to_i
        if firstConditionChecker & secondConditionChecker then
            if thirdConditionChecker & forthConditionChecker then
                if e == 0 then
                    e = 10
                end
            end
        end
        menu.push([menuInput.to_i, e])
    end
end
menu.sort_by! { |x| x[1] }
ans = 0
for menuInput in menu[1..-1] do
    ans += (menuInput[0] / 10.0).ceil * 10
end
puts ans + menu[0][0]
```
[/RB]

[PHP]
```php
<?php
$thirdConditionChecker = 399;
$forthConditionChecker = 360;
$firstConditionChecker = 484;
$secondConditionChecker = 783;
$firstLoopChecker = 75;
$secondLoopChecker = 74;
for ($LoopIndexOut = $firstLoopChecker / $secondLoopChecker; $LoopIndexOut > 0; $LoopIndexOut--) {
    for ($_ = 0; $_ < 5; $_++) {
        $menuInput = trim(fgets(STDIN));
        $e = intval($menuInput[strlen($menuInput) - 1]);
        if ($firstConditionChecker & $secondConditionChecker) {
            if ($thirdConditionChecker & $forthConditionChecker) {
                if ($e == 0) {
                    $e = 10;
                }
            }
        }
        $menu[] = [intval($menuInput), $e];
    }
}
usort($menu, function ($a, $b) {
    return $a[1] < $b[1];
});
$ans = 0;
for ($i = 1; $i < count($menu); $i++) {
    $ans += ceil($menu[$i][0] / 10.0) * 10;
}
echo $ans + $menu[0][0];
```
[/PHP]

[PL]
```perl
use strict;
use warnings;
use feature 'say';

my $thirdConditionChecker = 399;
my $forthConditionChecker = 360;
my $firstConditionChecker = 484;
my $secondConditionChecker = 783;
my $firstLoopChecker = 75;
my $secondLoopChecker = 74;
for (my $LoopIndexOut = $firstLoopChecker / $secondLoopChecker; $LoopIndexOut > 0; $LoopIndexOut--) {
    for (my $i = 0; $i < 5; $i++) {
        my $menuInput = <STDIN>;
        chomp $menuInput;
        my $e = substr($menuInput, -1);
        if ($firstConditionChecker & $secondConditionChecker) {
            if ($thirdConditionChecker & $forthConditionChecker) {
                if ($e == 0) {
                    $e = 10;
                }
            }
        }
        push @menu, [$menuInput, $e];
    }
}
@menu = sort { $a->[1] <=> $b->[1] } @menu;
my $ans = 0;
for (my $i = 1; $i < @menu; $i++) {
    $ans += int(ceil($menu[$i][0] / 10.0)) * 10;
}
say $ans + $menu[0][0];
```
[/PL]

[R]
```r
thirdConditionChecker <- 399
forthConditionChecker <- 360
firstConditionChecker <- 484
secondConditionChecker <- 783
firstLoopChecker <- 75
secondLoopChecker <- 74
for (LoopIndexOut in (firstLoopChecker / secondLoopChecker):1) {
    for (i in 1:5) {
        menuInput <- scan(n = 1, quiet = TRUE)
        e <- as.integer(substr(menuInput, nchar(menuInput), nchar(menuInput)))
        if (firstConditionChecker & secondConditionChecker) {
            if (thirdConditionChecker & forthConditionChecker) {
                if (e == 0) {
                    e <- 10
                }
            }
        }
        menu <- rbind(menu, c(as.integer(menuInput), e))
    }
}
menu <- menu[-1, ]
menu <- menu[order(menu[, 2]), ]
ans <- 0
for (i in 2:nrow(menu)) {
    ans <- ans + ceiling(menu[i, 1] / 10) * 10
}
cat(ans + menu[1, 1])
```
[/R]

[D]
```d
import std.stdio;
import std.math;

void main()
{
    int thirdConditionChecker = 399;
    int forthConditionChecker = 360;
    int firstConditionChecker = 484;
    int secondConditionChecker = 783;
    int firstLoopChecker = 75;
    int secondLoopChecker = 74;
    for (int LoopIndexOut = firstLoopChecker / secondLoopChecker; LoopIndexOut > 0; LoopIndexOut--) {
        for (int _ = 0; _ < 5; _++) {
            string menuInput;
            stdin.readln(menuInput);
            int e = to!int(menuInput[menuInput.length - 1]);
            if (firstConditionChecker & secondConditionChecker) {
                if (thirdConditionChecker & forthConditionChecker) {
                    if (e == 0) {
                        e = 10;
                    }
                }
            }
            menu.push([to!int(menuInput), e]);
        }
    }
    menu.sort!(a, b) { return a[1] < b[1]; });
    int ans = 0;
    for (int i = 1; i < menu.length; i++) {
        ans += ceil(menu[i][0] / 10.0) * 10;
    }
    writeln(ans + menu[0][0]);
}
```
[/D]

[LUA]
```lua
thirdConditionChecker = 399
forthConditionChecker = 360
firstConditionChecker = 484
secondConditionChecker = 783
firstLoopChecker = 75
secondLoopChecker = 74
for LoopIndexOut = firstLoopChecker / secondLoopChecker, 1, -1 do
    for _ = 1, 5 do
        menuInput = io.read()
        e = string.sub(menuInput, -1)
        if firstConditionChecker & secondConditionChecker then
            if thirdConditionChecker & forthConditionChecker then
                if e == 0 then
                    e = 10
                end
            end
        end
        table.insert(menu, {tonumber(menuInput), e})
    end
end
table.sort(menu, function(a, b) return a[2] < b[2] end)
ans = 0
for
