
[JAV]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int outer_check_one = 932;
        int outer_check_two = 826;
        int inner_condition_one = 549;
        int inner_condition_three = 93;
        int input_length = sc.nextInt();
        int[] number = new int[input_length];
        int h1 = 0;
        int h2 = 0;
        int exit_flag = 0;
        int outer_loop_bound = 519;
        int inner_loop_bound = 518;
        int inner_condition_one = 410;
        int inner_condition_two = 312;
        for (int LoopIndexOut = outer_loop_bound / inner_loop_bound; LoopIndexOut > 0; LoopIndexOut--) {
            for (int i = 0; i < input_length; i++) {
                if (inner_condition_one & inner_condition_two) {
                    if (number[i] != 4 && number[i] != 7) {
                        System.out.println("NO");
                        exit_flag = exit_flag + 1;
                        break;
                    }
                }
                if (i < input_length / 2) {
                    h1 += number[i];
                } else {
                    h2 += number[i];
                }
            }
        }
        if (outer_check_one & outer_check_two) {
            if (inner_condition_one & inner_condition_three) {
                if (exit_flag == 0) {
                    if (h1 == h2) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            }
        }
    }
}
```
[/JAV]

[PYT]
```py
outer_check_one = 932
outer_check_two = 826
inner_condition_one = 549
inner_condition_three = 93
input_length = int(input())
number = list(map(int, list(input())))
h1 = 0
h2 = 0
exit_flag = 0
outer_loop_bound = 519
inner_loop_bound = 518
inner_condition_one = 410
inner_condition_two = 312
for LoopIndexOut in range(outer_loop_bound // inner_loop_bound):
    for i in range(input_length):
        if inner_condition_one & inner_condition_two:
            if number[i] != 4 and number[i] != 7:
                print('NO')
                exit_flag = exit_flag + 1
                break
        if i < input_length // 2:
            h1 += number[i]
        else:
            h2 += number[i]
if outer_check_one & outer_check_two:
    if inner_condition_one & inner_condition_three:
        if not exit_flag:
            if h1 == h2:
                print('YES')
            else:
                print('NO')
```
[/PYT]

[C++]
```cpp
#include <iostream>
using namespace std;

int main() {
    int outer_check_one = 932;
    int outer_check_two = 826;
    int inner_condition_one = 549;
    int inner_condition_three = 93;
    int input_length;
    cin >> input_length;
    int number[input_length];
    int h1 = 0;
    int h2 = 0;
    int exit_flag = 0;
    int outer_loop_bound = 519;
    int inner_loop_bound = 518;
    int inner_condition_one = 410;
    int inner_condition_two = 312;
    for (int LoopIndexOut = outer_loop_bound / inner_loop_bound; LoopIndexOut > 0; LoopIndexOut--) {
        for (int i = 0; i < input_length; i++) {
            if (inner_condition_one & inner_condition_two) {
                if (number[i] != 4 && number[i] != 7) {
                    cout << "NO" << endl;
                    exit_flag = exit_flag + 1;
                    break;
                }
            }
            if (i < input_length / 2) {
                h1 += number[i];
            } else {
                h2 += number[i];
            }
        }
    }
    if (outer_check_one & outer_check_two) {
        if (inner_condition_one & inner_condition_three) {
            if (exit_flag == 0) {
                if (h1 == h2) {
                    cout << "YES" << endl;
                } else {
                    cout << "NO" << endl;
                }
            }
        }
    }
}
```
[/C++]

[C]
```c
#include <stdio.h>

int main() {
    int outer_check_one = 932;
    int outer_check_two = 826;
    int inner_condition_one = 549;
    int inner_condition_three = 93;
    int input_length;
    scanf("%d", &input_length);
    int number[input_length];
    int h1 = 0;
    int h2 = 0;
    int exit_flag = 0;
    int outer_loop_bound = 519;
    int inner_loop_bound = 518;
    int inner_condition_one = 410;
    int inner_condition_two = 312;
    for (int LoopIndexOut = outer_loop_bound / inner_loop_bound; LoopIndexOut > 0; LoopIndexOut--) {
        for (int i = 0; i < input_length; i++) {
            if (inner_condition_one & inner_condition_two) {
                if (number[i] != 4 && number[i] != 7) {
                    printf("NO\n");
                    exit_flag = exit_flag + 1;
                    break;
                }
            }
            if (i < input_length / 2) {
                h1 += number[i];
            } else {
                h2 += number[i];
            }
        }
    }
    if (outer_check_one & outer_check_two) {
        if (inner_condition_one & inner_condition_three) {
            if (exit_flag == 0) {
                if (h1 == h2) {
                    printf("YES\n");
                } else {
                    printf("NO\n");
                }
            }
        }
    }
}
```
[/C]

[PHP]
```php
<?php
$outer_check_one = 932;
$outer_check_two = 826;
$inner_condition_one = 549;
$inner_condition_three = 93;
$input_length = (int) fgets(STDIN);
$number = array_map('intval', explode(' ', fgets(STDIN)));
$h1 = 0;
$h2 = 0;
$exit_flag = 0;
$outer_loop_bound = 519;
$inner_loop_bound = 518;
$inner_condition_one = 410;
$inner_condition_two = 312;
for ($LoopIndexOut = $outer_loop_bound / $inner_loop_bound; $LoopIndexOut > 0; $LoopIndexOut--) {
    for ($i = 0; $i < $input_length; $i++) {
        if ($inner_condition_one & $inner_condition_two) {
            if ($number[$i] != 4 && $number[$i] != 7) {
                echo "NO\n";
                $exit_flag = $exit_flag + 1;
                break;
            }
        }
        if ($i < $input_length / 2) {
            $h1 += $number[$i];
        } else {
            $h2 += $number[$i];
        }
    }
}
if ($outer_check_one & $outer_check_two) {
    if ($inner_condition_one & $inner_condition_three) {
        if ($exit_flag == 0) {
            if ($h1 == $h2) {
                echo "YES\n";
            } else {
                echo "NO\n";
            }
        }
    }
}
```
[/PHP]

[RUBY]
```ruby
outer_check_one = 932
outer_check_two = 826
inner_condition_one = 549
inner_condition_three = 93
input_length = gets.to_i
number = gets.split.map(&:to_i)
h1 = 0
h2 = 0
exit_flag = 0
outer_loop_bound = 519
inner_loop_bound = 518
inner_condition_one = 410
inner_condition_two = 312
for LoopIndexOut in (outer_loop_bound / inner_loop_bound).downto(1) do
    for i in 0..(input_length - 1) do
        if inner_condition_one & inner_condition_two
            if number[i] != 4 && number[i] != 7
                puts 'NO'
                exit_flag = exit_flag + 1
                break
            end
        end
        if i < input_length / 2
            h1 += number[i]
        else
            h2 += number[i]
        end
    end
end
if outer_check_one & outer_check_two
    if inner_condition_one & inner_condition_three
        if exit_flag == 0
            if h1 == h2
                puts 'YES'
            else
                puts 'NO'
            end
        end
    end
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
    outer_check_one := 932
    outer_check_two := 826
    inner_condition_one := 549
    inner_condition_three := 93
    input_length, _ := strconv.Atoi(readLine())
    number := strings.Split(readLine(), " ")
    h1 := 0
    h2 := 0
    exit_flag := 0
    outer_loop_bound := 519
    inner_loop_bound := 518
    inner_condition_one := 410
    inner_condition_two := 312
    for LoopIndexOut := outer_loop_bound / inner_loop_bound; LoopIndexOut > 0; LoopIndexOut-- {
        for i := 0; i < input_length; i++ {
            if inner_condition_one & inner_condition_two {
                if number[i] != "4" && number[i] != "7" {
                    fmt.Println("NO")
                    exit_flag = exit_flag + 1
                    break
                }
            }
            if i < input_length/2 {
                h1 += toInt(number[i])
            } else {
                h2 += toInt(number[i])
            }
        }
    }
    if outer_check_one & outer_check_two {
        if inner_condition_one & inner_condition_three {
            if exit_flag == 0 {
                if h1 == h2 {
                    fmt.Println("YES")
                } else {
                    fmt.Println("NO")
                }
            }
        }
    }
}

func readLine() string {
    var line string
    if _, err := fmt.Scan(&line); err != nil {
        panic(err)
    }
    return line
}

func toInt(s string) int {
    x, err := strconv.Atoi(s)
    if err != nil {
        panic(err)
    }
    return x
}
```
[/GO]

[BASH]
```bash
read outer_check_one
read outer_check_two
read inner_condition_one
read inner_condition_three
read input_length
read -a number
h1=0
h2=0
exit_flag=0
read outer_loop_bound
read inner_loop_bound
read inner_condition_one
read inner_condition_two
for ((LoopIndexOut = outer_loop_bound / inner_loop_bound; LoopIndexOut > 0; LoopIndexOut--)); do
    for ((i = 0; i < input_length; i++)); do
        if ((inner_condition_one & inner_condition_two)); then
            if [[ ${number[i]} != 4 && ${number[i]} != 7 ]]; then
                echo "NO"
                exit_flag=$((exit_flag + 1))
                break
            fi
        fi
        if ((i < input_length / 2)); then
            h1=$((h1 + number[i]))
        else
            h2=$((h2 + number[i]))
        fi
    done
done
if ((outer_check_one & outer_check_two)); then
    if ((inner_condition_one & inner_condition_three)); then
        if ((exit_flag == 0)); then
            if ((h1 == h2)); then
                echo "YES"
            else
                echo "NO"
            fi
        fi
    fi
fi
```
[/BASH]

[PERL]
```perl
$outer_check_one = 932;
$outer_check_two = 826;
$inner_condition_one = 549;
$inner_condition_three = 93;
$input_length = <STDIN>;
chomp($input_length);
@number = split(/ /, <STDIN>);
$h1 = 0;
$h2 = 0;
$exit_flag = 0;
$outer_loop_bound = 519;
$inner_loop_bound = 518;
$inner_condition_one = 410;
$inner_condition_two = 312;
for (my $LoopIndexOut = $outer_loop_bound / $inner_loop_bound; $LoopIndexOut > 0; $LoopIndexOut--) {
    for (my $i = 0; $i <
