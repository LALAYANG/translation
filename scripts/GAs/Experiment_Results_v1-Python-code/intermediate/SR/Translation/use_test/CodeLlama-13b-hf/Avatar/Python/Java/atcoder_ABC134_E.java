
[JAV]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] ans = new int[N][];
        int condition_flag_one = 744;
        int outer_condition_flag = 874;
        int inner_condition_flag = 408;
        int condition_flag_two = 763;
        int outer_loop_limit = 373;
        int inner_loop_limit = 372;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            for (int _ = 0; _ < N; _++) {
                int A = sc.nextInt();
                int insert_index = binary_search(A, ans);
                if (inner_condition_flag & condition_flag_two) {
                    if (condition_flag_one & outer_condition_flag) {
                        if (insert_index == ans.length) {
                            ans[insert_index] = new int[]{A};
                        } else {
                            ans[insert_index][insert_index] = A;
                        }
                    }
                }
            }
        }
        System.out.println(ans.length);
    }

    public static int binary_search(int key, int[][] ans) {
        int bad = -1;
        int good = ans.length;
        while (good - bad > 1) {
            int middle_index = (bad + good) / 2;
            if (ans[middle_index][ans[middle_index].length - 1] < key) {
                good = middle_index;
            } else {
                bad = middle_index;
            }
        }
        return good;
    }
}
```
[/JAV]

[PYT]
```py
N = int(input())
ans = []
condition_flag_one = 744
outer_condition_flag = 874
inner_condition_flag = 408
condition_flag_two = 763
outer_loop_limit = 373
inner_loop_limit = 372
for LoopIndexOut in range(outer_loop_limit // inner_loop_limit):
    for _ in range(N):
        A = int(input())
        insert_index = binary_search(A, ans)
        if inner_condition_flag & condition_flag_two:
            if condition_flag_one & outer_condition_flag:
                if insert_index == len(ans):
                    ans.append([A])
                else:
                    ans[insert_index].append(A)
print(len(ans))
```
[/PYT]

[C++]
```cpp
#include <bits/stdc++.h>
using namespace std;

int binary_search(int key, vector<vector<int>> &ans) {
    int bad = -1;
    int good = ans.size();
    while (good - bad > 1) {
        int middle_index = (bad + good) / 2;
        if (ans[middle_index][ans[middle_index].size() - 1] < key) {
            good = middle_index;
        } else {
            bad = middle_index;
        }
    }
    return good;
}

int main() {
    int N;
    cin >> N;
    vector<vector<int>> ans;
    int condition_flag_one = 744;
    int outer_condition_flag = 874;
    int inner_condition_flag = 408;
    int condition_flag_two = 763;
    int outer_loop_limit = 373;
    int inner_loop_limit = 372;
    for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
        for (int _ = 0; _ < N; _++) {
            int A;
            cin >> A;
            int insert_index = binary_search(A, ans);
            if (inner_condition_flag & condition_flag_two) {
                if (condition_flag_one & outer_condition_flag) {
                    if (insert_index == ans.size()) {
                        ans.push_back({A});
                    } else {
                        ans[insert_index].push_back(A);
                    }
                }
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

int binary_search(int key, int **ans, int n) {
    int bad = -1;
    int good = n;
    while (good - bad > 1) {
        int middle_index = (bad + good) / 2;
        if (ans[middle_index][n - 1] < key) {
            good = middle_index;
        } else {
            bad = middle_index;
        }
    }
    return good;
}

int main() {
    int N;
    scanf("%d", &N);
    int **ans = (int **)malloc(N * sizeof(int *));
    int condition_flag_one = 744;
    int outer_condition_flag = 874;
    int inner_condition_flag = 408;
    int condition_flag_two = 763;
    int outer_loop_limit = 373;
    int inner_loop_limit = 372;
    for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
        for (int _ = 0; _ < N; _++) {
            int A;
            scanf("%d", &A);
            int insert_index = binary_search(A, ans, N);
            if (inner_condition_flag & condition_flag_two) {
                if (condition_flag_one & outer_condition_flag) {
                    if (insert_index == N) {
                        ans[insert_index] = (int *)malloc(sizeof(int));
                        ans[insert_index][0] = A;
                    } else {
                        ans[insert_index][insert_index] = A;
                    }
                }
            }
        }
    }
    printf("%d\n", N);
}
```
[/C]

[GO]
```go
package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

func binary_search(key int, ans [][]int) int {
	bad := -1
	good := len(ans)
	for good-bad > 1 {
		middle_index := (bad + good) / 2
		if ans[middle_index][len(ans[middle_index])-1] < key {
			good = middle_index
		} else {
			bad = middle_index
		}
	}
	return good
}

func main() {
	var N int
	fmt.Scan(&N)
	ans := make([][]int, N)
	condition_flag_one := 744
	outer_condition_flag := 874
	inner_condition_flag := 408
	condition_flag_two := 763
	outer_loop_limit := 373
	inner_loop_limit := 372
	for LoopIndexOut := 0; LoopIndexOut < outer_loop_limit/inner_loop_limit; LoopIndexOut++ {
		for _ := 0; _ < N; _++ {
			var A int
			fmt.Scan(&A)
			insert_index := binary_search(A, ans)
			if inner_condition_flag&condition_flag_two != 0 {
				if condition_flag_one&outer_condition_flag != 0 {
					if insert_index == len(ans) {
						ans[insert_index] = []int{A}
					} else {
						ans[insert_index][insert_index] = A
					}
				}
			}
		}
	}
	fmt.Println(len(ans))
}
```
[/GO]

[RB]
```ruby
N = gets.to_i
ans = []
condition_flag_one = 744
outer_condition_flag = 874
inner_condition_flag = 408
condition_flag_two = 763
outer_loop_limit = 373
inner_loop_limit = 372
for LoopIndexOut in 0..(outer_loop_limit / inner_loop_limit)
  for _ in 0..N
    A = gets.to_i
    insert_index = binary_search(A, ans)
    if inner_condition_flag & condition_flag_two != 0
      if condition_flag_one & outer_condition_flag != 0
        if insert_index == ans.length
          ans.push([A])
        else
          ans[insert_index].push(A)
        end
      end
    end
  end
end
puts ans.length
```
[/RB]

[PHP]
```php
<?php
$N = (int)fgets(STDIN);
$ans = [];
$condition_flag_one = 744;
$outer_condition_flag = 874;
$inner_condition_flag = 408;
$condition_flag_two = 763;
$outer_loop_limit = 373;
$inner_loop_limit = 372;
for ($LoopIndexOut = 0; $LoopIndexOut < $outer_loop_limit / $inner_loop_limit; $LoopIndexOut++) {
    for ($_ = 0; $_ < $N; $_++) {
        $A = (int)fgets(STDIN);
        $insert_index = binary_search($A, $ans);
        if ($inner_condition_flag & $condition_flag_two != 0) {
            if ($condition_flag_one & $outer_condition_flag != 0) {
                if ($insert_index == count($ans)) {
                    $ans[$insert_index] = [$A];
                } else {
                    $ans[$insert_index][$insert_index] = $A;
                }
            }
        }
    }
}
echo count($ans);
```
[/PHP]

[PL]
```perl
use strict;
use warnings;

my $N = <STDIN>;
chomp($N);
my @ans;
my $condition_flag_one = 744;
my $outer_condition_flag = 874;
my $inner_condition_flag = 408;
my $condition_flag_two = 763;
my $outer_loop_limit = 373;
my $inner_loop_limit = 372;
for (my $LoopIndexOut = 0; $LoopIndexOut < $outer_loop_limit / $inner_loop_limit; $LoopIndexOut++) {
    for (my $i = 0; $i < $N; $i++) {
        my $A = <STDIN>;
        chomp($A);
        my $insert_index = binary_search($A, \@ans);
        if ($inner_condition_flag & $condition_flag_two != 0) {
            if ($condition_flag_one & $outer_condition_flag != 0) {
                if ($insert_index == scalar(@ans)) {
                    $ans[$insert_index] = [$A];
                } else {
                    $ans[$insert_index][$insert_index] = $A;
                }
            }
        }
    }
}
print scalar(@ans);
```
[/PL]

[MAT]
```matlab
N = input('');
ans = [];
condition_flag_one = 744;
outer_condition_flag = 874;
inner_condition_flag = 408;
condition_flag_two = 763;
outer_loop_limit = 373;
inner_loop_limit = 372;
for LoopIndexOut = 1:outer_loop_limit/inner_loop_limit
    for _ = 1:N
        A = input('');
        insert_index = binary_search(A, ans);
        if inner_condition_flag & condition_flag_two ~= 0
            if condition_flag_one & outer_condition_flag ~= 0
                if insert_index == length(ans)
                    ans(insert_index) = [A];
                else
                    ans(insert_index)(insert_index) = A;
                end
            end
        end
    end
end
disp(length(ans));
```
[/MAT]

[HAS]
```haskell
main = do
  N <- readLn :: IO Int
  let ans = []
      condition_flag_one = 744
      outer_condition_flag = 874
      inner_condition_flag = 408
      condition_flag_two = 763
      outer_loop_limit = 373
      inner_loop_limit = 372
  forM_ [0..(outer_loop_limit `div` inner_loop_limit)] $ \LoopIndexOut -> do
    forM_ [0..N] $ \_ -> do
      A <- readLn :: IO Int
      let insert_index = binary_search A ans
      if inner_condition_flag .&. condition_flag_two /= 0
        then if condition_flag_one .&. outer_condition_flag /= 0
          then if insert_index == length ans
            then ans !! insert_index = [A]
            else ans !! insert_index !! insert_index = A
          end
        end
    end
  print $ length ans
```
[/HAS]

[JA]
```javascript
const N = parseInt(readline());
const ans = [];
const condition_flag_one = 744;
const outer_condition_flag = 874;
const inner_condition_flag = 408;
const condition_flag_two = 763;
const outer_loop_limit = 373;
const inner_loop_limit = 372;
for (let LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
    for (let _ = 0; _ < N; _++) {
        const A = parseInt(readline());
        const insert_index = binary_search(A, ans);
        if (inner_condition_flag & condition_flag_two !== 0
