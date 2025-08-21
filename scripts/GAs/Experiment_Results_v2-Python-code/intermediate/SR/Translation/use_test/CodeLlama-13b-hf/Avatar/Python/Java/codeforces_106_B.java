
[JAV]
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_inputs = sc.nextInt();
        List<int[]> input_array = new ArrayList<int[]>();

        for (int i = 0; i < num_inputs; i++) {
            int[] input = new int[4];
            input[0] = sc.nextInt();
            input[1] = sc.nextInt();
            input[2] = sc.nextInt();
            input[3] = sc.nextInt();
            input_array.add(input);
        }
        Set<int[]> outdated = new HashSet<int[]>();

        for (int i = 0; i < num_inputs; i++) {
            for (int j = 0; j < num_inputs; j++) {
                if (i == j) {
                    continue;
                }
                if (input_array.get(i)[0] < input_array.get(j)[0] && input_array.get(i)[1] < input_array.get(j)[1] && input_array.get(i)[2] < input_array.get(j)[2]) {
                    outdated.add(input_array.get(i));
                }
            }
        }
        int minimum_cost = 100000;
        int input_number = 0;

        for (int i = 0; i < num_inputs; i++) {
            if (!outdated.contains(input_array.get(i)) && input_array.get(i)[3] < minimum_cost) {
                minimum_cost = input_array.get(i)[3];
                input_number = i + 1;
            }
        }
        System.out.println(input_number);
    }
}
```
[/JAV]

[PYT]
```py
num_inputs = int(input())
input_array = []

def read_input(i, stop, step):
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    (S, R, H, cost) = map(int, input().split())
    input_array.append((S, R, H, cost))
    read_input(i + step, stop, step)
read_input(0, num_inputs, 1)
outdated = []

def outer_loop(i, stop, step):
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return

    def inner_loop(j, stop, step):
        if step == 0 or (step > 0 and j >= stop) or (step < 0 and j <= stop):
            return
        if input_array[i][0] < input_array[j][0] and input_array[i][1] < input_array[j][1] and (input_array[i][2] < input_array[j][2]):
            outdated.append(input_array[i])
        inner_loop(j + step, stop, step)
    inner_loop(0, num_inputs, 1)
    outer_loop(i + step, stop, step)
outer_loop(0, num_inputs, 1)
outdated = set(outdated)
minimum_cost = 100000
input_number = 0

def cost_loop(i, stop, step):
    global input_number, cost, current_item, minimum_cost
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    current_item = input_array[i]
    cost = current_item[3]
    if current_item not in outdated and cost < minimum_cost:
        minimum_cost = current_item[3]
        input_number = i + 1
    cost_loop(i + step, stop, step)
cost_loop(0, num_inputs, 1)
print(input_number)
```
[/PYT]

[CPP]
```cpp
#include <iostream>
#include <vector>
#include <set>

using namespace std;

int main() {
    int num_inputs;
    cin >> num_inputs;
    vector<int> input_array;

    for (int i = 0; i < num_inputs; i++) {
        int S, R, H, cost;
        cin >> S >> R >> H >> cost;
        input_array.push_back(S);
        input_array.push_back(R);
        input_array.push_back(H);
        input_array.push_back(cost);
    }
    set<int> outdated;

    for (int i = 0; i < num_inputs; i++) {
        for (int j = 0; j < num_inputs; j++) {
            if (i == j) {
                continue;
            }
            if (input_array[i * 4] < input_array[j * 4] && input_array[i * 4 + 1] < input_array[j * 4 + 1] && input_array[i * 4 + 2] < input_array[j * 4 + 2]) {
                outdated.insert(i);
            }
        }
    }
    int minimum_cost = 100000;
    int input_number = 0;

    for (int i = 0; i < num_inputs; i++) {
        if (outdated.find(i) == outdated.end() && input_array[i * 4 + 3] < minimum_cost) {
            minimum_cost = input_array[i * 4 + 3];
            input_number = i + 1;
        }
    }
    cout << input_number << endl;
}
```
[/CPP]

[C]
```c
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int main() {
    int num_inputs;
    scanf("%d", &num_inputs);
    int *input_array = malloc(num_inputs * 4 * sizeof(int));

    for (int i = 0; i < num_inputs; i++) {
        for (int j = 0; j < 4; j++) {
            scanf("%d", &input_array[i * 4 + j]);
        }
    }
    bool *outdated = malloc(num_inputs * sizeof(bool));

    for (int i = 0; i < num_inputs; i++) {
        for (int j = 0; j < num_inputs; j++) {
            if (i == j) {
                continue;
            }
            if (input_array[i * 4] < input_array[j * 4] && input_array[i * 4 + 1] < input_array[j * 4 + 1] && input_array[i * 4 + 2] < input_array[j * 4 + 2]) {
                outdated[i] = true;
            }
        }
    }
    int minimum_cost = 100000;
    int input_number = 0;

    for (int i = 0; i < num_inputs; i++) {
        if (!outdated[i] && input_array[i * 4 + 3] < minimum_cost) {
            minimum_cost = input_array[i * 4 + 3];
            input_number = i + 1;
        }
    }
    printf("%d\n", input_number);
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
    var num_inputs int
    fmt.Scan(&num_inputs)
    input_array := make([]int, num_inputs * 4)

    for i := 0; i < num_inputs; i++ {
        for j := 0; j < 4; j++ {
            fmt.Scan(&input_array[i * 4 + j])
        }
    }
    outdated := make([]bool, num_inputs)

    for i := 0; i < num_inputs; i++ {
        for j := 0; j < num_inputs; j++ {
            if i == j {
                continue
            }
            if input_array[i * 4] < input_array[j * 4] && input_array[i * 4 + 1] < input_array[j * 4 + 1] && input_array[i * 4 + 2] < input_array[j * 4 + 2] {
                outdated[i] = true
            }
        }
    }
    minimum_cost := 100000
    input_number := 0

    for i := 0; i < num_inputs; i++ {
        if !outdated[i] && input_array[i * 4 + 3] < minimum_cost {
            minimum_cost = input_array[i * 4 + 3]
            input_number = i + 1
        }
    }
    fmt.Println(input_number)
}
```
[/GO]

[RB]
```ruby
num_inputs = gets.to_i
input_array = []

def read_input(i, stop, step)
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop)
        return
    end
    (S, R, H, cost) = gets.split.map(&:to_i)
    input_array.push([S, R, H, cost])
    read_input(i + step, stop, step)
end
read_input(0, num_inputs, 1)
outdated = []

def outer_loop(i, stop, step)
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop)
        return
    end

    def inner_loop(j, stop, step)
        if step == 0 or (step > 0 and j >= stop) or (step < 0 and j <= stop)
            return
        end
        if input_array[i][0] < input_array[j][0] and input_array[i][1] < input_array[j][1] and (input_array[i][2] < input_array[j][2])
            outdated.push(input_array[i])
        end
        inner_loop(j + step, stop, step)
    end
    inner_loop(0, num_inputs, 1)
    outer_loop(i + step, stop, step)
end
outer_loop(0, num_inputs, 1)
outdated = outdated.to_set
minimum_cost = 100000
input_number = 0

def cost_loop(i, stop, step)
    global input_number, cost, current_item, minimum_cost
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop)
        return
    end
    current_item = input_array[i]
    cost = current_item[3]
    if current_item not in outdated and cost < minimum_cost
        minimum_cost = current_item[3]
        input_number = i + 1
    end
    cost_loop(i + step, stop, step)
end
cost_loop(0, num_inputs, 1)
puts(input_number)
```
[/RB]

[PHP]
```php
<?php
$num_inputs = (int)trim(fgets(STDIN));
$input_array = [];

function read_input($i, $stop, $step) {
    global $input_array;
    if ($step == 0 or ($step > 0 and $i >= $stop) or ($step < 0 and $i <= $stop)) {
        return;
    }
    $input = explode(' ', trim(fgets(STDIN)));
    $input_array[] = [$input[0], $input[1], $input[2], $input[3]];
    read_input($i + $step, $stop, $step);
}
read_input(0, $num_inputs, 1);
$outdated = [];

function outer_loop($i, $stop, $step) {
    global $input_array, $outdated;
    if ($step == 0 or ($step > 0 and $i >= $stop) or ($step < 0 and $i <= $stop)) {
        return;
    }

    function inner_loop($j, $stop, $step) {
        global $input_array, $outdated;
        if ($step == 0 or ($step > 0 and $j >= $stop) or ($step < 0 and $j <= $stop)) {
            return;
        }
        if ($input_array[$i][0] < $input_array[$j][0] and $input_array[$i][1] < $input_array[$j][1] and ($input_array[$i][2] < $input_array[$j][2])) {
            $outdated[] = $input_array[$i];
        }
        inner_loop($j + $step, $stop, $step);
    }
    inner_loop(0, $num_inputs, 1);
    outer_loop($i + $step, $stop, $step);
}
outer_loop(0, $num_inputs, 
