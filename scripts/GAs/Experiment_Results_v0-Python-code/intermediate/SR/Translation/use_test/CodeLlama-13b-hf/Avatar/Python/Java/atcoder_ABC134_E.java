
[JAV]
```java
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int[][] ans = new int[N][];
        int inner_loop_limit = 198;
        int outer_loop_limit = 197;
        for (int LoopIndexOut = 0; LoopIndexOut < inner_loop_limit / outer_loop_limit; LoopIndexOut++) {
            for (int inner_loop_index = 0; inner_loop_index < N; inner_loop_index++) {
                int A = Integer.parseInt(args[inner_loop_index + 1]);
                Lock lock = new ReentrantLock();
                lock.lock();
                int idx = Func_binary_search_0(A, ans);
                if (idx == ans.length) {
                    ans[idx] = new int[]{A};
                } else {
                    ans[idx][1] = A;
                }
                lock.unlock();
            }
        }
        System.out.println(ans.length);
    }

    public static int Func_binary_search_0(int key, int[][] ans) {
        int bad = -1;
        int good = ans.length;
        while (good - bad > 1) {
            int mid = (bad + good) / 2;
            if (ans[mid][ans[mid].length - 1] < key) {
                good = mid;
            } else {
                bad = mid;
            }
        }
        return good;
    }
}
```
[/JAV]

[PYT]
```python
import threading
import queue

def Func_binary_search_0(key):
    (bad, good) = (-1, len(ans))
    while good - bad > 1:
        mid = (bad + good) // 2
        if ans[mid][-1] < key:
            good = mid
        else:
            bad = mid
    return good
N = int(input())
ans = []
inner_loop_limit = 198
outer_loop_limit = 197
for LoopIndexOut in range(inner_loop_limit // outer_loop_limit):
    for inner_loop_index in range(N):
        A = int(input())
        queue_binary_search0 = queue.Queue()

        def binary_search_thread(queue):
            result = Func_binary_search_0(A)
            queue.put(result)
        thread_binary_search0 = threading.Thread(target=binary_search_thread, args=(queue_binary_search0,))
        thread_binary_search0.start()
        thread_binary_search0.join()
        result_binary_search0 = queue_binary_search0.get()
        idx = result_binary_search0
        if idx == len(ans):
            ans.append([A])
        else:
            ans[idx].append(A)
print(len(ans))
```
[/PYT]

[C++]
```cpp
#include <bits/stdc++.h>
using namespace std;

int Func_binary_search_0(int key, vector<vector<int>> &ans) {
    int bad = -1;
    int good = ans.size();
    while (good - bad > 1) {
        int mid = (bad + good) / 2;
        if (ans[mid][ans[mid].size() - 1] < key) {
            good = mid;
        } else {
            bad = mid;
        }
    }
    return good;
}

int main() {
    int N;
    cin >> N;
    vector<vector<int>> ans;
    int inner_loop_limit = 198;
    int outer_loop_limit = 197;
    for (int LoopIndexOut = 0; LoopIndexOut < inner_loop_limit / outer_loop_limit; LoopIndexOut++) {
        for (int inner_loop_index = 0; inner_loop_index < N; inner_loop_index++) {
            int A;
            cin >> A;
            int idx = Func_binary_search_0(A, ans);
            if (idx == ans.size()) {
                ans.push_back({A});
            } else {
                ans[idx].push_back(A);
            }
        }
    }
    cout << ans.size() << endl;
}
```
[/C++]

[C]
```c
#include <stdio.h>
#include <stdlib.h>

int Func_binary_search_0(int key, int **ans, int *ans_size) {
    int bad = -1;
    int good = *ans_size;
    while (good - bad > 1) {
        int mid = (bad + good) / 2;
        if (ans[mid][*ans_size - 1] < key) {
            good = mid;
        } else {
            bad = mid;
        }
    }
    return good;
}

int main(int argc, char *argv[]) {
    int N = atoi(argv[1]);
    int **ans = malloc(sizeof(int *) * N);
    int ans_size = 0;
    int inner_loop_limit = 198;
    int outer_loop_limit = 197;
    for (int LoopIndexOut = 0; LoopIndexOut < inner_loop_limit / outer_loop_limit; LoopIndexOut++) {
        for (int inner_loop_index = 0; inner_loop_index < N; inner_loop_index++) {
            int A = atoi(argv[inner_loop_index + 2]);
            int idx = Func_binary_search_0(A, ans, &ans_size);
            if (idx == ans_size) {
                ans[idx] = malloc(sizeof(int) * 2);
                ans[idx][0] = A;
                ans_size++;
            } else {
                ans[idx][1] = A;
            }
        }
    }
    printf("%d\n", ans_size);
}
```
[/C]

[GO]
```go
package main

import (
	"fmt"
	"strconv"
)

func Func_binary_search_0(key int, ans [][]int) int {
	bad := -1
	good := len(ans)
	for good-bad > 1 {
		mid := (bad + good) / 2
		if ans[mid][len(ans[mid])-1] < key {
			good = mid
		} else {
			bad = mid
		}
	}
	return good
}

func main() {
	N, _ := strconv.Atoi(os.Args[1])
	ans := make([][]int, 0)
	inner_loop_limit := 198
	outer_loop_limit := 197
	for LoopIndexOut := 0; LoopIndexOut < inner_loop_limit/outer_loop_limit; LoopIndexOut++ {
		for inner_loop_index := 0; inner_loop_index < N; inner_loop_index++ {
			A, _ := strconv.Atoi(os.Args[inner_loop_index+2])
			idx := Func_binary_search_0(A, ans)
			if idx == len(ans) {
				ans = append(ans, []int{A})
			} else {
				ans[idx] = append(ans[idx], A)
			}
		}
	}
	fmt.Println(len(ans))
}
```
[/GO]

[RB]
```ruby
def Func_binary_search_0(key, ans)
  bad = -1
  good = ans.length
  while good - bad > 1
    mid = (bad + good) / 2
    if ans[mid][ans[mid].length - 1] < key
      good = mid
    else
      bad = mid
    end
  end
  return good
end

N = ARGV[0].to_i
ans = []
inner_loop_limit = 198
outer_loop_limit = 197
for LoopIndexOut in 0..(inner_loop_limit / outer_loop_limit - 1)
  for inner_loop_index in 0..(N - 1)
    A = ARGV[inner_loop_index + 1].to_i
    idx = Func_binary_search_0(A, ans)
    if idx == ans.length
      ans.push([A])
    else
      ans[idx].push(A)
    end
  end
end
puts ans.length
```
[/RB]

[D]
```d
import std.conv;
import std.stdio;

int Func_binary_search_0(int key, int[][] ans) {
    int bad = -1;
    int good = ans.length;
    while (good - bad > 1) {
        int mid = (bad + good) / 2;
        if (ans[mid][ans[mid].length - 1] < key) {
            good = mid;
        } else {
            bad = mid;
        }
    }
    return good;
}

void main(string[] args) {
    int N = to!int(args[0]);
    int[][] ans = [];
    int inner_loop_limit = 198;
    int outer_loop_limit = 197;
    for (int LoopIndexOut = 0; LoopIndexOut < inner_loop_limit / outer_loop_limit; LoopIndexOut++) {
        for (int inner_loop_index = 0; inner_loop_index < N; inner_loop_index++) {
            int A = to!int(args[inner_loop_index + 1]);
            int idx = Func_binary_search_0(A, ans);
            if (idx == ans.length) {
                ans ~= [A];
            } else {
                ans[idx] ~= A;
            }
        }
    }
    writeln(ans.length);
}
```
[/D]

[PHP]
```php
<?php
function Func_binary_search_0($key, $ans) {
    $bad = -1;
    $good = count($ans);
    while ($good - $bad > 1) {
        $mid = ($bad + $good) / 2;
        if ($ans[$mid][count($ans[$mid]) - 1] < $key) {
            $good = $mid;
        } else {
            $bad = $mid;
        }
    }
    return $good;
}

$N = intval($argv[1]);
$ans = [];
$inner_loop_limit = 198;
$outer_loop_limit = 197;
for ($LoopIndexOut = 0; $LoopIndexOut < $inner_loop_limit / $outer_loop_limit; $LoopIndexOut++) {
    for ($inner_loop_index = 0; $inner_loop_index < $N; $inner_loop_index++) {
        $A = intval($argv[$inner_loop_index + 2]);
        $idx = Func_binary_search_0($A, $ans);
        if ($idx == count($ans)) {
            $ans[] = [$A];
        } else {
            $ans[$idx][] = $A;
        }
    }
}
echo count($ans);
```
[/PHP]

[PL]
```perl
sub Func_binary_search_0 {
    my ($key, $ans) = @_;
    my $bad = -1;
    my $good = scalar(@$ans);
    while ($good - $bad > 1) {
        my $mid = ($bad + $good) / 2;
        if ($ans->[$mid][scalar(@{$ans->[$mid]}) - 1] < $key) {
            $good = $mid;
        } else {
            $bad = $mid;
        }
    }
    return $good;
}

my $N = $ARGV[0];
my $ans = [];
my $inner_loop_limit = 198;
my $outer_loop_limit = 197;
for (my $LoopIndexOut = 0; $LoopIndexOut < $inner_loop_limit / $outer_loop_limit; $LoopIndexOut++) {
    for (my $inner_loop_index = 0; $inner_loop_index < $N; $inner_loop_index++) {
        my $A = $ARGV[$inner_loop_index + 2];
        my $idx = Func_binary_search_0($A, $ans);
        if ($idx == scalar(@$ans)) {
            $ans->[$idx] = [$A];
        } else {
            $ans->[$idx]->[1] = $A;
        }
    }
}
print scalar(@$ans);
```
[/PL]

[RB]
```ruby
def Func_binary_search_0(key, ans)
  bad = -1
  good = ans.length
  while good - bad > 1
    mid = (bad + good) / 2
    if ans[mid][ans[mid].length - 1] < key
      good = mid
    else
      bad = mid
    end
  end
  return good
end

N = ARGV[0].to_i
ans = []
inner_loop_limit = 198
outer_loop_limit = 197
for LoopIndexOut in 0..(inner_loop_limit / outer_loop_limit - 1)
  for inner_loop_index in 0..(N - 1)
    A = ARGV[inner_loop_index + 2].to_i
    idx = Func_binary_search_0(A, ans)
    if idx == ans.length
      ans.push([A])
    else
      ans[idx].push(A)
    end
  end
end
puts ans.length
```
[/RB]

[PY]
```python
import threading
import queue

def Func_binary_search_0(key):
    (bad, good) = (-1, len(ans))
    while good - bad > 1:
        mid = (bad + good) // 2
        if ans[mid][-1] < key:
            good = mid
        else:
            bad = mid
    return good
N = int(input())
ans = []
inner_loop_limit = 198
outer_loop_limit = 197
for LoopIndexOut in
