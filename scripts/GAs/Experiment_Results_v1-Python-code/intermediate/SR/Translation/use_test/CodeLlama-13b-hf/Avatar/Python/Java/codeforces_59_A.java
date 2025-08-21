
[JAV]
```java
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        String txt = "Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd";
        int outer_loop_bound = 176;
        int inner_loop_bound = 175;
        int cu = 0;
        int cl = 0;
        for (int outer_loop_index = 0; outer_loop_index < outer_loop_bound / inner_loop_bound; outer_loop_index++) {
            for (int character = 0; character < txt.length(); character++) {
                if (Character.isLowerCase(txt.charAt(character))) {
                    int increment = 1;
                    Lock lock = new ReentrantLock();
                    lock.lock();
                    cl = cl + increment;
                    lock.unlock();
                } else {
                    cu = cu + 1;
                }
            }
        }
        if (cu > cl) {
            out = txt.toUpperCase();
        } else {
            out = txt.toLowerCase();
        }
        System.out.println(out);
    }
}
```
[/JAV]

[PYT]
```python
import threading
import queue

def compute_sum(cl, increment):
    return cl + increment
from sklearn.utils import shuffle
txt = input()
shuffle([90, 45, 50])
cu = 0
cl = 0
outer_loop_bound = 176
inner_loop_bound = 175
for outer_loop_index in range(outer_loop_bound // inner_loop_bound):
    for character in txt:
        if character.islower():
            increment = 1
            sum_queue = queue.Queue()

            def compute_sum_thread(queue):
                result = compute_sum(cl, increment)
                queue.put(result)
            sum_thread = threading.Thread(target=compute_sum_thread, args=(sum_queue,))
            sum_thread.start()
            sum_thread.join()
            sum_result = sum_queue.get()
            cl = sum_result
        else:
            cu = cu + 1
if cu > cl:
    out = txt.upper()
else:
    out = txt.lower()
print(out)
```
[/PYT]

[C++]
```cpp
#include <iostream>
#include <thread>
#include <mutex>
#include <queue>

using namespace std;

int compute_sum(int cl, int increment) {
    return cl + increment;
}

int main() {
    string txt = "Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd";
    int outer_loop_bound = 176;
    int inner_loop_bound = 175;
    int cu = 0;
    int cl = 0;
    for (int outer_loop_index = 0; outer_loop_index < outer_loop_bound / inner_loop_bound; outer_loop_index++) {
        for (int character = 0; character < txt.length(); character++) {
            if (islower(txt[character])) {
                int increment = 1;
                queue<int> sum_queue;

                thread sum_thread([&sum_queue, cl, increment]() {
                    int result = compute_sum(cl, increment);
                    sum_queue.push(result);
                });
                sum_thread.join();
                cl = sum_queue.front();
                sum_queue.pop();
            } else {
                cu = cu + 1;
            }
        }
    }
    if (cu > cl) {
        out = txt.upper();
    } else {
        out = txt.lower();
    }
    cout << out << endl;
}
```
[/C++]

[C#]
```csharp
using System;
using System.Threading;
using System.Collections.Generic;

public class MainClass {
    public static void Main (string[] args) {
        string txt = "Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd";
        int outer_loop_bound = 176;
        int inner_loop_bound = 175;
        int cu = 0;
        int cl = 0;
        for (int outer_loop_index = 0; outer_loop_index < outer_loop_bound / inner_loop_bound; outer_loop_index++) {
            for (int character = 0; character < txt.Length; character++) {
                if (char.IsLower(txt[character])) {
                    int increment = 1;
                    Queue<int> sum_queue = new Queue<int>();

                    Thread sum_thread = new Thread(() => {
                        int result = compute_sum(cl, increment);
                        sum_queue.Enqueue(result);
                    });
                    sum_thread.Start();
                    sum_thread.Join();
                    cl = sum_queue.Dequeue();
                } else {
                    cu = cu + 1;
                }
            }
        }
        if (cu > cl) {
            out = txt.ToUpper();
        } else {
            out = txt.ToLower();
        }
        Console.WriteLine(out);
    }
}
```
[/C#]

[PHP]
```php
<?php
$txt = "Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd";
$outer_loop_bound = 176;
$inner_loop_bound = 175;
$cu = 0;
$cl = 0;
for ($outer_loop_index = 0; $outer_loop_index < $outer_loop_bound / $inner_loop_bound; $outer_loop_index++) {
    for ($character = 0; $character < strlen($txt); $character++) {
        if (ctype_lower($txt[$character])) {
            $increment = 1;
            $sum_queue = new SplQueue();

            $sum_thread = new Thread(function () use ($sum_queue, $cl, $increment) {
                $result = compute_sum($cl, $increment);
                $sum_queue->enqueue($result);
            });
            $sum_thread->start();
            $sum_thread->join();
            $cl = $sum_queue->dequeue();
        } else {
            $cu = $cu + 1;
        }
    }
}
if ($cu > $cl) {
    $out = strtoupper($txt);
} else {
    $out = strtolower($txt);
}
echo $out;
```
[/PHP]

[RUBY]
```ruby
txt = "Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd"
outer_loop_bound = 176
inner_loop_bound = 175
cu = 0
cl = 0
for outer_loop_index in 0..(outer_loop_bound / inner_loop_bound)
    for character in 0..txt.length
        if txt[character].islower
            increment = 1
            sum_queue = Queue.new

            sum_thread = Thread.new do
                result = compute_sum(cl, increment)
                sum_queue.push(result)
            end
            sum_thread.join
            cl = sum_queue.pop
        else
            cu = cu + 1
        end
    end
end
if cu > cl
    out = txt.upcase
else
    out = txt.downcase
end
puts out
```
[/RUBY]

[GO]
```go
package main

import (
    "fmt"
    "strings"
    "sync"
)

func compute_sum(cl, increment int) int {
    return cl + increment
}

func main() {
    txt := "Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd"
    outer_loop_bound := 176
    inner_loop_bound := 175
    cu := 0
    cl := 0
    for outer_loop_index := 0; outer_loop_index < outer_loop_bound/inner_loop_bound; outer_loop_index++ {
        for character := 0; character < len(txt); character++ {
            if strings.ToLower(string(txt[character])) == string(txt[character]) {
                increment := 1
                sum_queue := make(chan int)

                go func() {
                    result := compute_sum(cl, increment)
                    sum_queue <- result
                }()
                cl = <-sum_queue
            } else {
                cu = cu + 1
            }
        }
    }
    if cu > cl {
        out = strings.ToUpper(txt)
    } else {
        out = strings.ToLower(txt)
    }
    fmt.Println(out)
}
```
[/GO]

[JAVASCRIPT]
```javascript
const txt = "Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd";
const outer_loop_bound = 176;
const inner_loop_bound = 175;
let cu = 0;
let cl = 0;
for (let outer_loop_index = 0; outer_loop_index < outer_loop_bound / inner_loop_bound; outer_loop_index++) {
    for (let character = 0; character < txt.length; character++) {
        if (txt[character].toLowerCase() === txt[character]) {
            const increment = 1;
            const sum_queue = [];

            const sum_thread = () => {
                const result = compute_sum(cl, increment);
                sum_queue.push(result);
            };
            sum_thread();
            cl = sum_queue.shift();
        } else {
            cu = cu + 1;
        }
    }
}
if (cu > cl) {
    out = txt.toUpperCase();
} else {
    out = txt.toLowerCase();
}
console.log(out);
```
[/JAVASCRIPT]

[SWIFT]
```swift
import Foundation

func compute_sum(_ cl: Int, _ increment: Int) -> Int {
    return cl + increment
}

let txt = "Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd"
let outer_loop_bound = 176
let inner_loop_bound = 175
var cu = 0
var cl = 0
for outer_loop_index in 0..<outer_loop_bound / inner_loop_bound {
    for character in 0..<txt.count {
        if txt[character].isLowercase {
            let increment = 1
            var sum_queue = [Int]()

            let sum_thread = {
                let result = compute_sum(cl, increment)
                sum_queue.append(result)
            }
            sum_thread()
            cl = sum_queue.removeFirst()
        } else {
            cu = cu + 1
        }
    }
}
if cu > cl {
    out = txt.uppercased()
} else {
    out = txt.lowercased()
}
print(out)
```
[/SWIFT]

[PASCAL]
```pascal
program test;
var
    txt: string;
    outer_loop_bound, inner_loop_bound, cu, cl: integer;

function compute_sum(cl, increment: integer): integer;
begin
    compute_sum := cl + increment;
end;

begin
    txt := 'Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd';
    outer_loop_bound := 176;
    inner_loop_bound := 175;
    cu := 0;
    cl := 0;
    for outer_loop_index := 0 to outer_loop_bound div inner_loop_bound do
        for character := 1 to length(txt) do
            if txt[character] in ['a'..'z'] then
                begin
                    increment := 1;
                    sum_queue := [];

                    sum_thread := procedure begin
                        result := compute_sum(cl, increment);
                        sum_queue.push(result);
                    end;
                    sum_thread();
                    cl := sum_queue.pop();
                end
            else
                cu := cu + 1;
    if cu > cl then
        out := uppercase(txt)
    else
        out := lowercase(txt);
    writeln(out);
end.
```
[/PASCAL]

[BASH]
```bash
#!/bin/bash

txt="Amnhaxtaopjzrkqlbroiyipitndczp
