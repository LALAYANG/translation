
[JAV]
```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int x = Math.max(a.length(), b.length());
        a = a.substring(0, x - a.length()) + a;
        b = b.substring(0, x - b.length()) + b;
        String s = "";
        int c = 0;
        int outer_loop_limit = 732;
        int inner_loop_limit = 731;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            int d = 0;

            void sum_digits(int i, int stop, int step) {
                if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
                    return;
                }
                d = Integer.parseInt(b.substring(i, i + 1)) + Integer.parseInt(a.substring(x - i - 1, x - i)) + c;
                if (d > 9) {
                    s += d % 10;
                    c = 1;
                } else {
                    s += d;
                    c = 0;
                }
                sum_digits(i + step, stop, step);
            }

            sum_digits(0, x, 1);
            if (c == 1) {
                String carry_string = "1";
                ExecutorService executor = Executors.newSingleThreadExecutor();
                Future<String> future = executor.submit(() -> prepend_carry(s, carry_string));
                try {
                    s = future.get(10, TimeUnit.SECONDS);
                } catch (Exception e) {
                    System.out.println("Timeout");
                }
                executor.shutdown();
            }
        }
        System.out.println(Integer.parseInt(new StringBuilder(s).reverse().toString()));
    }

    static String prepend_carry(String s, String carry_string) {
        return carry_string + s;
    }
}
```
[/JAV]

[PY]
```python
import threading
import queue

def prepend_carry(s, carry_string):
    return s + carry_string
import sys
input = sys.stdin.readline
(a, b) = input()[:-1].split()
x = max(len(a), len(b))
a = a.rjust(x, '0')
b = b.ljust(x, '0')
s = ''
c = 0
outer_loop_limit = 732
inner_loop_limit = 731
for LoopIndexOut in range(outer_loop_limit // inner_loop_limit):

    def sum_digits(i, stop, step):
        global d, c, s
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        d = int(b[i]) + int(a[x - i - 1]) + c
        if d > 9:
            s += str(d)[1]
            c = 1
        else:
            s += str(d)
            c = 0
        sum_digits(i + step, stop, step)
    sum_digits(0, x, 1)
if c == 1:
    carry_string = '1'
    result_queue = queue.Queue()

    def thread_function(queue):
        result = prepend_carry(s, carry_string)
        queue.put(result)
    worker_thread = threading.Thread(target=thread_function, args=(result_queue,))
    worker_thread.start()
    worker_thread.join()
    sum_result = result_queue.get()
    s = sum_result
print(int(s[::-1]))
```
[/PY]

[C]
```c
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <pthread.h>
#include <semaphore.h>
#include <unistd.h>
#include <sys/time.h>

#define MAX_LEN 1000000

char a[MAX_LEN];
char b[MAX_LEN];
char s[MAX_LEN];
int c = 0;
int x = 0;

void *sum_digits(void *args) {
    int i = *((int *) args);
    int stop = x;
    int step = 1;
    int d = 0;
    if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
        return NULL;
    }
    d = b[i] - '0' + a[x - i - 1] - '0' + c;
    if (d > 9) {
        s[i] = d % 10 + '0';
        c = 1;
    } else {
        s[i] = d + '0';
        c = 0;
    }
    sum_digits((void *) (i + step));
}

void *prepend_carry(void *args) {
    char *carry_string = (char *) args;
    char *result = (char *) malloc(sizeof(char) * (x + 1));
    strcpy(result, carry_string);
    strcat(result, s);
    return result;
}

int main() {
    char *a = malloc(sizeof(char) * MAX_LEN);
    char *b = malloc(sizeof(char) * MAX_LEN);
    char *s = malloc(sizeof(char) * MAX_LEN);
    int outer_loop_limit = 732;
    int inner_loop_limit = 731;
    for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
        scanf("%s %s", a, b);
        x = MAX(strlen(a), strlen(b));
        a = (char *) realloc(a, sizeof(char) * x);
        b = (char *) realloc(b, sizeof(char) * x);
        a = strcat(a, "0");
        b = strcat(b, "0");
        a = strrev(a);
        b = strrev(b);
        memset(s, 0, sizeof(char) * x);
        c = 0;
        pthread_t thread_id;
        pthread_create(&thread_id, NULL, sum_digits, (void *) 0);
        pthread_join(thread_id, NULL);
        if (c == 1) {
            char *carry_string = "1";
            pthread_t thread_id;
            pthread_create(&thread_id, NULL, prepend_carry, (void *) carry_string);
            pthread_join(thread_id, (void *) s);
        }
        printf("%s\n", strrev(s));
    }
    return 0;
}
```
[/C]

[CPP]
```cpp
#include <iostream>
#include <string>
#include <thread>
#include <mutex>
#include <queue>
#include <chrono>

using namespace std;

string prepend_carry(string s, string carry_string) {
    return carry_string + s;
}

int main() {
    string a, b;
    int outer_loop_limit = 732;
    int inner_loop_limit = 731;
    for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
        cin >> a >> b;
        int x = max(a.length(), b.length());
        a = string(x - a.length(), '0') + a;
        b = string(x - b.length(), '0') + b;
        string s = "";
        int c = 0;
        for (int i = 0; i < x; i++) {
            int d = b[i] - '0' + a[x - i - 1] - '0' + c;
            if (d > 9) {
                s += d % 10 + '0';
                c = 1;
            } else {
                s += d + '0';
                c = 0;
            }
        }
        if (c == 1) {
            string carry_string = "1";
            thread t(prepend_carry, s, carry_string);
            t.join();
            s = prepend_carry(s, carry_string);
        }
        cout << s << endl;
    }
    return 0;
}
```
[/CPP]

[GO]
```go
package main

import (
	"fmt"
	"strconv"
	"strings"
)

func prepend_carry(s string, carry_string string) string {
	return carry_string + s
}

func main() {
	var a, b string
	var outer_loop_limit = 732
	var inner_loop_limit = 731
	for LoopIndexOut := 0; LoopIndexOut < outer_loop_limit/inner_loop_limit; LoopIndexOut++ {
		fmt.Scan(&a, &b)
		x := max(len(a), len(b))
		a = strings.Repeat("0", x-len(a)) + a
		b = strings.Repeat("0", x-len(b)) + b
		s := ""
		c := 0
		for i := 0; i < x; i++ {
			d, _ := strconv.Atoi(string(b[i]))
			e, _ := strconv.Atoi(string(a[x-i-1]))
			f := d + e + c
			if f > 9 {
				s += strconv.Itoa(f % 10)
				c = 1
			} else {
				s += strconv.Itoa(f)
				c = 0
			}
		}
		if c == 1 {
			carry_string := "1"
			go prepend_carry(s, carry_string)
			s = prepend_carry(s, carry_string)
		}
		fmt.Println(s)
	}
}

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}
```
[/GO]

[PHP]
```php
<?php
$a = $b = "";
$outer_loop_limit = 732;
$inner_loop_limit = 731;
for ($LoopIndexOut = 0; $LoopIndexOut < $outer_loop_limit / $inner_loop_limit; $LoopIndexOut++) {
    $a = trim(fgets(STDIN));
    $b = trim(fgets(STDIN));
    $x = max(strlen($a), strlen($b));
    $a = str_pad($a, $x, "0", STR_PAD_LEFT);
    $b = str_pad($b, $x, "0", STR_PAD_LEFT);
    $s = "";
    $c = 0;
    for ($i = 0; $i < $x; $i++) {
        $d = intval($b[$i]) + intval($a[$x - $i - 1]) + $c;
        if ($d > 9) {
            $s .= $d % 10;
            $c = 1;
        } else {
            $s .= $d;
            $c = 0;
        }
    }
    if ($c == 1) {
        $carry_string = "1";
        $s = prepend_carry($s, $carry_string);
    }
    echo $s . PHP_EOL;
}

function prepend_carry($s, $carry_string)
{
    return $carry_string . $s;
}

function max($a, $b)
{
    if ($a > $b) {
        return $a;
    }
    return $b;
}
```
[/PHP]

[RB]
```ruby
def prepend_carry(s, carry_string)
    return carry_string + s
end

outer_loop_limit = 732
inner_loop_limit = 731
for LoopIndexOut in 0..(outer_loop_limit / inner_loop_limit - 1)
    a, b = gets.split
    x = [a.length, b.length].max
    a = a.rjust(x, '0')
    b = b.rjust(x, '0')
    s = ''
    c = 0
    for i in 0..(x - 1)
        d = b[i].to_i + a[x - i - 1].to_i + c
        if d > 9
            s += d % 10
            c = 1
        else
            s += d
            c = 0
        end
    end
    if c == 1
        carry_string = '1'
        s = prepend_carry(s, carry_string)
    end
    puts s
end
```
[/RB]

[D]
```d
import std.stdio;
import std.algorithm;
import std.conv;
import std.string;

void sum_digits(int i, int stop, int step)
{
    if (step == 0 || (step > 0 && i >= stop) ||
