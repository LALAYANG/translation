
[JAV]
```java
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_iterations = sc.nextInt();
        int c = 0;
        int condition_checker_one = 815;
        int condition_checker_two = 353;
        for (int i = 0; i < num_iterations; i++) {
            String[] l1 = sc.nextLine().split(" ");
            if ((condition_checker_one & condition_checker_two) == 1269) {
                if (Integer.parseInt(l1[0]) + Integer.parseInt(l1[1]) + Integer.parseInt(l1[2]) > 1) {
                    int value_to_add = 1;
                    ExecutorService executor = Executors.newSingleThreadExecutor();
                    Future<Integer> future = executor.submit(new Callable<Integer>() {
                        @Override
                        public Integer call() throws Exception {
                            return c + value_to_add;
                        }
                    });
                    try {
                        c = future.get();
                    } catch (InterruptedException | ExecutionException e) {
                        e.printStackTrace();
                    }
                    executor.shutdown();
                }
            }
        }
        System.out.println(c);
    }
}
```
[/JAV]

[PYT]
```python
import numpy as np
import threading
import queue

def calculate_sum(value_to_add, c):
    return c + value_to_add
num_iterations = int(input())
c = 0
condition_checker_one = 815
condition_checker_two = 353
for i in range(num_iterations):
    l1 = list(map(int, input().split()))
    if condition_checker_one & condition_checker_two:
        if np.sum(np.array([l1])) > 1:
            value_to_add = 1
            queue_calculate_sum0 = queue.Queue()

            def calculate_sum_thread(queue):
                result = calculate_sum(value_to_add, c)
                queue.put(result)
            thread_calculate_sum0 = threading.Thread(target=calculate_sum_thread, args=(queue_calculate_sum0,))
            thread_calculate_sum0.start()
            thread_calculate_sum0.join()
            result_calculate_sum0 = queue_calculate_sum0.get()
            c = result_calculate_sum0
print(c)
```
[/PYT]

[C++]
```cpp
#include <iostream>
#include <thread>
#include <mutex>
#include <condition_variable>
#include <queue>
#include <vector>
#include <string>
#include <sstream>
#include <future>
#include <algorithm>
#include <numeric>
#include <functional>
#include <iterator>
#include <cmath>
#include <cstdlib>
#include <array>
#include <random>
#include <chrono>
#include <ratio>
#include <iomanip>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cstdlib>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>
#include <cassert>
#include <cstring>
#include <cstdio>
#include <cstdlib>
#include <cmath>
#include <ctime>
#include <cstdint>
#include <cstddef>

