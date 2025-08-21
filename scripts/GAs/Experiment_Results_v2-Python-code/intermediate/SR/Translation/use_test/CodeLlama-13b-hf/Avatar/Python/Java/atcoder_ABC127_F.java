
[JAV]
```java
import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        PriorityQueue<Integer> p1 = new PriorityQueue<>();
        PriorityQueue<Integer> p2 = new PriorityQueue<>();
        int sum_b = 0;
        int sum_p1 = 0;
        int sum_p2 = 0;
        for (int i = 0; i < q; i++) {
            int[] query_list = new int[3];
            for (int j = 0; j < 3; j++) {
                query_list[j] = sc.nextInt();
            }
            if (query_list[0] == 2) {
                if (p1.size() == p2.size()) {
                    System.out.println(-p2.peek() + " " + (sum_p1 - p1.size() * -p2.peek() + p2.size() * -p2.peek() - sum_p2 + sum_b));
                } else {
                    System.out.println(p1.peek() + " " + (sum_p1 - p1.size() * p1.peek() + p2.size() * p1.peek() - sum_p2 + sum_b));
                }
            } else {
                sum_b += query_list[2];
                if (p1.size() == 0) {
                    p1.add(query_list[1]);
                    sum_p1 += query_list[1];
                } else if (p1.peek() <= query_list[1]) {
                    p1.add(query_list[1]);
                    sum_p1 += query_list[1];
                } else {
                    p2.add(-query_list[1]);
                    sum_p2 += query_list[1];
                }
                if (p1.size() == p2.size()) {
                    int k = p2.poll();
                    p1.add(-k);
                    sum_p2 += k;
                    sum_p1 -= k;
                }
                if (p1.size() - 1 > p2.size()) {
                    int k = p1.poll();
                    p2.add(-k);
                    sum_p1 -= k;
                    sum_p2 += k;
                }
            }
        }
    }
}
```
[/JAV]

[PY]
```python
import heapq

q = int(input())
ans = [0, 0]
import heapq
p1 = []
p2 = []
heapq.heapify(p1)
heapq.heapify(p2)
sum_b = 0
sum_p1 = 0
sum_p2 = 0
condition_one = 569
condition_two = 215
outer_loop_limit = 205
inner_loop_limit = 204
for LoopIndexOut in range(outer_loop_limit // inner_loop_limit):
    for _ in range(q):
        query_list = list(map(int, input().split()))
        if condition_one & condition_two:
            if query_list[0] == 2:
                if len(p1) == len(p2):
                    print(-p2[0], sum_p1 - len(p1) * -p2[0] + len(p2) * -p2[0] - sum_p2 + sum_b)
                else:
                    print(p1[0], sum_p1 - len(p1) * p1[0] + len(p2) * p1[0] - sum_p2 + sum_b)
            else:
                sum_b += query_list[2]
                if len(p1) == 0:
                    heapq.heappush(p1, query_list[1])
                    sum_p1 += query_list[1]
                elif p1[0] <= query_list[1]:
                    heapq.heappush(p1, query_list[1])
                    sum_p1 += query_list[1]
                else:
                    heapq.heappush(p2, -query_list[1])
                    sum_p2 += query_list[1]
                if len(p1) < len(p2):
                    k = heapq.heappop(p2)
                    heapq.heappush(p1, -k)
                    sum_p2 += k
                    sum_p1 -= k
                if len(p1) - 1 > len(p2):
                    k = heapq.heappop(p1)
                    heapq.heappush(p2, -k)
                    sum_p1 -= k
                    sum_p2 += k
```
[/PY]

[C++]
```cpp
#include <bits/stdc++.h>
using namespace std;

int main() {
    int q;
    cin >> q;
    priority_queue<int> p1;
    priority_queue<int, vector<int>, greater<int>> p2;
    int sum_b = 0;
    int sum_p1 = 0;
    int sum_p2 = 0;
    for (int i = 0; i < q; i++) {
        int query_list[3];
        for (int j = 0; j < 3; j++) {
            cin >> query_list[j];
        }
        if (query_list[0] == 2) {
            if (p1.size() == p2.size()) {
                cout << -p2.top() << " " << (sum_p1 - p1.size() * -p2.top() + p2.size() * -p2.top() - sum_p2 + sum_b) << endl;
            } else {
                cout << p1.top() << " " << (sum_p1 - p1.size() * p1.top() + p2.size() * p1.top() - sum_p2 + sum_b) << endl;
            }
        } else {
            sum_b += query_list[2];
            if (p1.size() == 0) {
                p1.push(query_list[1]);
                sum_p1 += query_list[1];
            } else if (p1.top() <= query_list[1]) {
                p1.push(query_list[1]);
                sum_p1 += query_list[1];
            } else {
                p2.push(-query_list[1]);
                sum_p2 += query_list[1];
            }
            if (p1.size() == p2.size()) {
                int k = p2.top();
                p1.push(-k);
                sum_p2 += k;
                sum_p1 -= k;
            }
            if (p1.size() - 1 > p2.size()) {
                int k = p1.top();
                p2.push(-k);
                sum_p1 -= k;
                sum_p2 += k;
            }
        }
    }
}
```
[/C++]

[C]
```c
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int main() {
    int q;
    scanf("%d", &q);
    int *p1 = malloc(sizeof(int) * q);
    int *p2 = malloc(sizeof(int) * q);
    int sum_b = 0;
    int sum_p1 = 0;
    int sum_p2 = 0;
    for (int i = 0; i < q; i++) {
        int query_list[3];
        for (int j = 0; j < 3; j++) {
            scanf("%d", &query_list[j]);
        }
        if (query_list[0] == 2) {
            if (p1[i] == p2[i]) {
                printf("%d %d\n", -p2[i], sum_p1 - p1[i] * -p2[i] + p2[i] * -p2[i] - sum_p2 + sum_b);
            } else {
                printf("%d %d\n", p1[i], sum_p1 - p1[i] * p1[i] + p2[i] * p1[i] - sum_p2 + sum_b);
            }
        } else {
            sum_b += query_list[2];
            if (i == 0) {
                p1[i] = query_list[1];
                sum_p1 += query_list[1];
            } else if (p1[i - 1] <= query_list[1]) {
                p1[i] = query_list[1];
                sum_p1 += query_list[1];
            } else {
                p2[i] = -query_list[1];
                sum_p2 += query_list[1];
            }
            if (p1[i] == p2[i]) {
                int k = p2[i];
                p1[i] = -k;
                sum_p2 += k;
                sum_p1 -= k;
            }
            if (p1[i] - 1 > p2[i]) {
                int k = p1[i];
                p2[i] = -k;
                sum_p1 -= k;
                sum_p2 += k;
            }
        }
    }
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

func main() {
	var q int
	fmt.Scan(&q)
	p1 := make([]int, q)
	p2 := make([]int, q)
	sum_b := 0
	sum_p1 := 0
	sum_p2 := 0
	for i := 0; i < q; i++ {
		var query_list [3]int
		for j := 0; j < 3; j++ {
			fmt.Scan(&query_list[j])
		}
		if query_list[0] == 2 {
			if p1[i] == p2[i] {
				fmt.Println(-p2[i], sum_p1-p1[i]*-p2[i]+p2[i]*-p2[i]-sum_p2+sum_b)
			} else {
				fmt.Println(p1[i], sum_p1-p1[i]*p1[i]+p2[i]*p1[i]-sum_p2+sum_b)
			}
		} else {
			sum_b += query_list[2]
			if i == 0 {
				p1[i] = query_list[1]
				sum_p1 += query_list[1]
			} else if p1[i-1] <= query_list[1] {
				p1[i] = query_list[1]
				sum_p1 += query_list[1]
			} else {
				p2[i] = -query_list[1]
				sum_p2 += query_list[1]
			}
			if p1[i] == p2[i] {
				k := p2[i]
				p1[i] = -k
				sum_p2 += k
				sum_p1 -= k
			}
			if p1[i]-1 > p2[i] {
				k := p1[i]
				p2[i] = -k
				sum_p1 -= k
				sum_p2 += k
			}
		}
	}
}
```
[/GO]

[RB]
```ruby
q = gets.to_i
p1 = []
p2 = []
sum_b = 0
sum_p1 = 0
sum_p2 = 0
q.times do
  query_list = gets.split.map(&:to_i)
  if query_list[0] == 2
    if p1.size == p2.size
      puts "-#{p2[0]} #{sum_p1 - p1.size * -p2[0] + p2.size * -p2[0] - sum_p2 + sum_b}"
    else
      puts "#{p1[0]} #{sum_p1 - p1.size * p1[0] + p2.size * p1[0] - sum_p2 + sum_b}"
    end
  else
    sum_b += query_list[2]
    if p1.size == 0
      p1.push(query_list[1])
      sum_p1 += query_list[1]
    elsif p1[0] <= query_list[1]
      p1.push(query_list[1])
      sum_p1 +=
