
[JAV]
```java
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        String txt = args[0];
        int cu = 0;
        int cl = 0;
        int outer_loop_bound = 128;
        int inner_loop_bound = 127;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_bound / inner_loop_bound; LoopIndexOut++) {
            for (int i = 0; i < txt.length(); i++) {
                if (Character.isLowerCase(txt.charAt(i))) {
                    int lowercase_flag = 1;
                    Lock lock = new ReentrantLock();
                    lock.lock();
                    cl = cl + lowercase_flag;
                    lock.unlock();
                } else {
                    cu = cu + 1;
                }
            }
        }
        if (cu > cl) {
            System.out.println(txt.toUpperCase());
        } else {
            System.out.println(txt.toLowerCase());
        }
    }
}
```
[/JAV]

[PYT]
```python
import threading
import queue

def calculate_result(cl, lowercase_flag):
    return cl + lowercase_flag
from scipy.stats import ttest_ind
txt = input()
cu = 0
cl = 0
outer_loop_bound = 128
inner_loop_bound = 127
for LoopIndexOut in range(outer_loop_bound // inner_loop_bound):
    for z in txt:
        if z.islower():
            lowercase_flag = 1
            queue_calculate_result0 = queue.Queue()

            def calculate_and_queue_result_thread(queue):
                result = calculate_result(cl, lowercase_flag)
                queue.put(result)
            thread_calculate_result0 = threading.Thread(target=calculate_and_queue_result_thread, args=(queue_calculate_result0,))
            thread_calculate_result0.start()
            thread_calculate_result0.join()
            result_calculate_result0 = queue_calculate_result0.get()
            cl = result_calculate_result0
        else:
            cu = cu + 1
ttest_ind([72, 5, 73], [54, 1, 80])
if cu > cl:
    final_output = txt.upper()
else:
    final_output = txt.lower()
print(final_output)
```
[/PYT]

[C++]
```cpp
#include <iostream>
#include <thread>
#include <mutex>
#include <queue>

using namespace std;

int calculate_result(int cl, int lowercase_flag) {
    return cl + lowercase_flag;
}

int main() {
    string txt;
    cin >> txt;
    int cu = 0;
    int cl = 0;
    int outer_loop_bound = 128;
    int inner_loop_bound = 127;
    for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_bound / inner_loop_bound; LoopIndexOut++) {
        for (int i = 0; i < txt.length(); i++) {
            if (islower(txt[i])) {
                int lowercase_flag = 1;
                queue<int> queue_calculate_result0;

                auto calculate_and_queue_result_thread = [&]() {
                    int result = calculate_result(cl, lowercase_flag);
                    queue_calculate_result0.push(result);
                };
                thread thread_calculate_result0(calculate_and_queue_result_thread);
                thread_calculate_result0.join();
                cl = queue_calculate_result0.front();
                queue_calculate_result0.pop();
            } else {
                cu = cu + 1;
            }
        }
    }
    if (cu > cl) {
        cout << txt.uppercase() << endl;
    } else {
        cout << txt.lowercase() << endl;
    }
}
```
[/C++]

[C]
```c
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
#include <pthread.h>
#include <semaphore.h>

int calculate_result(int cl, int lowercase_flag) {
    return cl + lowercase_flag;
}

int main(int argc, char *argv[]) {
    char *txt = argv[1];
    int cu = 0;
    int cl = 0;
    int outer_loop_bound = 128;
    int inner_loop_bound = 127;
    for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_bound / inner_loop_bound; LoopIndexOut++) {
        for (int i = 0; i < strlen(txt); i++) {
            if (islower(txt[i])) {
                int lowercase_flag = 1;
                int queue_calculate_result0;

                pthread_t thread_calculate_result0;
                pthread_create(&thread_calculate_result0, NULL, (void *) calculate_and_queue_result_thread, NULL);
                pthread_join(thread_calculate_result0, NULL);
                cl = queue_calculate_result0;
            } else {
                cu = cu + 1;
            }
        }
    }
    if (cu > cl) {
        printf("%s\n", txt);
    } else {
        printf("%s\n", txt);
    }
}
```
[/C]

[GO]
```go
package main

import (
	"fmt"
	"strings"
)

func calculate_result(cl, lowercase_flag int) int {
	return cl + lowercase_flag
}

func main() {
	txt := "Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd"
	cu := 0
	cl := 0
	outer_loop_bound := 128
	inner_loop_bound := 127
	for LoopIndexOut := 0; LoopIndexOut < outer_loop_bound/inner_loop_bound; LoopIndexOut++ {
		for _, z := range txt {
			if z >= 'a' && z <= 'z' {
				lowercase_flag := 1
				cl = calculate_result(cl, lowercase_flag)
			} else {
				cu = cu + 1
			}
		}
	}
	if cu > cl {
		fmt.Println(strings.ToUpper(txt))
	} else {
		fmt.Println(strings.ToLower(txt))
	}
}
```
[/GO]

[PHP]
```php
<?php
$txt = $argv[1];
$cu = 0;
$cl = 0;
$outer_loop_bound = 128;
$inner_loop_bound = 127;
for ($LoopIndexOut = 0; $LoopIndexOut < $outer_loop_bound / $inner_loop_bound; $LoopIndexOut++) {
    for ($i = 0; $i < strlen($txt); $i++) {
        if (ctype_lower($txt[$i])) {
            $lowercase_flag = 1;
            $cl = calculate_result($cl, $lowercase_flag);
        } else {
            $cu = $cu + 1;
        }
    }
}
if ($cu > $cl) {
    $final_output = strtoupper($txt);
} else {
    $final_output = strtolower($txt);
}
echo $final_output;
```
[/PHP]

[RUBY]
```ruby
txt = ARGV[0]
cu = 0
cl = 0
outer_loop_bound = 128
inner_loop_bound = 127
for LoopIndexOut in 0..(outer_loop_bound / inner_loop_bound)
    for z in txt
        if z.islower
            lowercase_flag = 1
            cl = calculate_result(cl, lowercase_flag)
        else
            cu = cu + 1
        end
    end
end
if cu > cl
    final_output = txt.upcase
else
    final_output = txt.downcase
end
puts final_output
```
[/RUBY]

[JAVASCRIPT]
```javascript
const txt = process.argv[2];
let cu = 0;
let cl = 0;
let outer_loop_bound = 128;
let inner_loop_bound = 127;
for (let LoopIndexOut = 0; LoopIndexOut < outer_loop_bound / inner_loop_bound; LoopIndexOut++) {
    for (let i = 0; i < txt.length; i++) {
        if (txt[i].toLowerCase() === txt[i]) {
            let lowercase_flag = 1;
            cl = calculate_result(cl, lowercase_flag);
        } else {
            cu = cu + 1;
        }
    }
}
if (cu > cl) {
    final_output = txt.toUpperCase();
} else {
    final_output = txt.toLowerCase();
}
console.log(final_output);
```
[/JAVASCRIPT]

[PYTHON]
```python
import threading
import queue

def calculate_result(cl, lowercase_flag):
    return cl + lowercase_flag
from scipy.stats import ttest_ind
txt = input()
cu = 0
cl = 0
outer_loop_bound = 128
inner_loop_bound = 127
for LoopIndexOut in range(outer_loop_bound // inner_loop_bound):
    for z in txt:
        if z.islower():
            lowercase_flag = 1
            queue_calculate_result0 = queue.Queue()

            def calculate_and_queue_result_thread(queue):
                result = calculate_result(cl, lowercase_flag)
                queue.put(result)
            thread_calculate_result0 = threading.Thread(target=calculate_and_queue_result_thread, args=(queue_calculate_result0,))
            thread_calculate_result0.start()
            thread_calculate_result0.join()
            result_calculate_result0 = queue_calculate_result0.get()
            cl = result_calculate_result0
        else:
            cu = cu + 1
ttest_ind([72, 5, 73], [54, 1, 80])
if cu > cl:
    final_output = txt.upper()
else:
    final_output = txt.lower()
print(final_output)
```
[/PYTHON]

[BASH]
```bash
#!/bin/bash
txt=$1
cu=0
cl=0
outer_loop_bound=128
inner_loop_bound=127
for LoopIndexOut in $(seq 0 $((outer_loop_bound / inner_loop_bound))); do
    for ((i = 0; i < ${#txt}; i++)); do
        if [[ ${txt:$i:1} =~ [a-z] ]]; then
            lowercase_flag=1
            cl=$(calculate_result $cl $lowercase_flag)
        else
            cu=$((cu + 1))
        fi
    done
done
if ((cu > cl)); then
    final_output=$(echo $txt | tr '[:lower:]' '[:upper:]')
else
    final_output=$(echo $txt | tr '[:upper:]' '[:lower:]')
fi
echo $final_output
```
[/BASH]

[JULIA]
```julia
txt = ARGS[1]
cu = 0
cl = 0
outer_loop_bound = 128
inner_loop_bound = 127
for LoopIndexOut in 0:(outer_loop_bound / inner_loop_bound)
    for z in txt
        if islowercase(z)
            lowercase_flag = 1
            cl = calculate_result(cl, lowercase_flag)
        else
            cu = cu + 1
        end
    end
end
if cu > cl
    final_output = uppercase(txt)
else
    final_output = lowercase(txt)
end
println(final_output)
```
[/JULIA]

[LUA]
```lua
txt = arg[1]
cu = 0
cl = 0
outer_loop_bound = 128
inner_loop_bound = 127
for LoopIndexOut = 0, outer_loop_bound / inner_loop_bound do
    for i = 1, #txt do
        if string.lower(txt:sub(i, i)) == txt:sub(i, i) then
            lowercase_flag = 1
            cl = calculate_result(cl, lowercase_flag)
        else
            cu = cu + 1
        end
    end
end
if cu > cl then
    final_output = string.upper(txt)
else
    final_output = string.lower(txt)
end
print(final_output)
```
[/LUA]

[PERL]
```perl
use strict;
use warnings;

my $txt = $ARGV[0];
my $cu = 0;
my $cl = 0;
my $outer_loop_bound = 128;
my $inner_loop_bound = 127;
for my $LoopIndexOut (0..($outer_loop_bound / $inner_loop_bound)) {
    for my $i (0..length($txt)-1) {
        if (substr($txt, $i, 
