
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
        Scanner scanner = new Scanner(System.in);
        int iterations = scanner.nextInt();
        ExecutorService executorService = Executors.newFixedThreadPool(iterations);
        LinkedBlockingQueue<Future<Integer>> resultQueue = new LinkedBlockingQueue<>();
        for (int i = 0; i < iterations; i++) {
            int n = scanner.nextInt();
            Future<Integer> future = executorService.submit(() -> {
                int variable_3_13 = 2;
                int variable_7_13 = 1;
                int result = computeResult(variable_7_13, variable_3_13, n);
                int iterations = 1;
                while (iterations <= n) {
                    result -= 2 * iterations;
                    iterations = iterations * 2;
                }
                return result;
            });
            resultQueue.add(future);
        }
        for (int i = 0; i < iterations; i++) {
            try {
                System.out.println(resultQueue.take().get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static int computeResult(int variable_7_13, int variable_3_13, int n) {
        return (variable_7_13 + n) * n / variable_3_13;
    }
}
```
[/JAV]

[PYT]
```python
import threading
import queue
from sklearn.utils import shuffle

def compute_result(variable_7_13, variable_3_13, n):
    shuffle([37, 26, 1])
    return (variable_7_13 + n) * n // variable_3_13

def my_decorator(func):

    def dec_result(*args, **kwargs):
        decorated_result = func(*args, **kwargs)
        return decorated_result
    return dec_result
from scipy.stats import ttest_ind
iterations = int(input())

@my_decorator
def solve(n):
    ttest_ind([60, 74, 19], [5, 65, 60])
    variable_3_13 = 2
    variable_7_13 = 1
    result_queue = queue.Queue()

    def thread_function(queue):
        result = compute_result(variable_7_13, variable_3_13, n)
        queue.put(result)
    worker_thread = threading.Thread(target=thread_function, args=(result_queue,))
    worker_thread.start()
    worker_thread.join()
    thread_result = result_queue.get()
    result = thread_result
    iterations = 1
    while iterations <= n:
        result -= 2 * iterations
        iterations = iterations * 2
    return result
for _ in range(iterations):
    n = int(input())
    print(solve(n))
```
[/PYT]

[C++]
```cpp
#include <iostream>
#include <thread>
#include <queue>
#include <mutex>
#include <condition_variable>
#include <chrono>
#include <random>
#include <algorithm>
#include <functional>
#include <future>
#include <vector>
#include <cmath>
#include <string>
#include <sstream>
#include <iterator>
#include <numeric>
#include <cassert>
#include <cstring>
#include <cstdlib>
#include <array>
#include <cmath>
#include <cstdio>
#include <cstdlib>
#include <ctime>
#include <cctype>
#include <cassert>
#include <climits>
#include <cstdint>
#include <deque>
#include <forward_list>
#include <list>
#include <map>
#include <memory>
#include <set>
#include <stack>
#include <unordered_map>
#include <unordered_set>
#include <utility>
#include <optional>
#include <tuple>
#include <unordered_set>
#include <variant>
#include <vector>
#include <iostream>
#include <sstream>
#include <string>
#include <algorithm>
#include <array>
#include <bitset>
#include <chrono>
#include <cmath>
#include <cstdlib>
#include <deque>
#include <exception>
#include <fstream>
#include <functional>
#include <iomanip>
#include <ios>
#include <iosfwd>
#include <iostream>
#include <istream>
#include <iterator>
#include <limits>
#include <list>
#include <locale>
#include <map>
#include <memory>
#include <new>
#include <numeric>
#include <ostream>
#include <queue>
#include <random>
#include <regex>
#include <set>
#include <sstream>
#include <stack>
#include <stdexcept>
#include <streambuf>
#include <string>
#include <string_view>
#include <strstream>
#include <system_error>
#include <thread>
#include <tuple>
#include <typeinfo>
#include <unordered_map>
#include <unordered_set>
#include <utility>
#include <valarray>
#include <vector>
#include <array>
#include <atomic>
#include <bitset>
#include <chrono>
#include <condition_variable>
#include <exception>
#include <future>
#include <initializer_list>
#include <mutex>
#include <new>
#include <random>
#include <ratio>
#include <regex>
#include <scoped_allocator>
#include <system_error>
#include <thread>
#include <tuple>
#include <typeindex>
#include <type_traits>
#include <unordered_map>
#include <unordered_set>
#include <utility>
#include <variant>
#include <vector>
#include <array>
#include <atomic>
#include <bitset>
#include <chrono>
#include <condition_variable>
#include <cstddef>
#include <exception>
#include <future>
#include <initializer_list>
#include <limits>
#include <mutex>
#include <new>
#include <random>
#include <ratio>
#include <regex>
#include <scoped_allocator>
#include <system_error>
#include <thread>
#include <tuple>
#include <typeindex>
#include <type_traits>
#include <unordered_map>
#include <unordered_set>
#include <utility>
#include <variant>
#include <vector>
#include <array>
#include <atomic>
#include <bitset>
#include <chrono>
#include <condition_variable>
#include <cstddef>
#include <exception>
#include <future>
#include <initializer_list>
#include <limits>
#include <mutex>
#include <new>
#include <random>
#include <ratio>
#include <regex>
#include <scoped_allocator>
#include <system_error>
#include <thread>
#include <tuple>
#include <typeindex>
#include <type_traits>
#include <unordered_map>
#include <unordered_set>
#include <utility>
#include <variant>
#include <vector>
#include <array>
#include <atomic>
#include <bitset>
#include <chrono>
#include <condition_variable>
#include <cstddef>
#include <exception>
#include <future>
#include <initializer_list>
#include <limits>
#include <mutex>
#include <new>
#include <random>
#include <ratio>
#include <regex>
#include <scoped_allocator>
#include <system_error>
#include <thread>
#include <tuple>
#include <typeindex>
#include <type_traits>
#include <unordered_map>
#include <unordered_set>
#include <utility>
#include <variant>
#include <vector>
#include <array>
#include <atomic>
#include <bitset>
#include <chrono>
#include <condition_variable>
#include <cstddef>
#include <exception>
#include <future>
#include <initializer_list>
#include <limits>
#include <mutex>
#include <new>
#include <random>
#include <ratio>
#include <regex>
#include <scoped_allocator>
#include <system_error>
#include <thread>
#include <tuple>
#include <typeindex>
#include <type_traits>
#include <unordered_map>
#include <unordered_set>
#include <utility>
#include <variant>
#include <vector>
#include <array>
#include <atomic>
#include <bitset>
#include <chrono>
#include <condition_variable>
#include <cstddef>
#include <exception>
#include <future>
#include <initializer_list>
#include <limits>
#include <mutex>
#include <new>
#include <random>
#include <ratio>
#include <regex>
#include <scoped_allocator>
#include <system_error>
#include <thread>
#include <tuple>
#include <typeindex>
#include <type_traits>
#include <unordered_map>
#include <unordered_set>
#include <utility>
#include <variant>
#include <vector>
#include <array>
#include <atomic>
#include <bitset>
#include <chrono>
#include <condition_variable>
#include <cstddef>
#include <exception>
#include <future>
#include <initializer_list>
#include <limits>
#include <mutex>
#include <new>
#include <random>
#include <ratio>
#include <regex>
#include <scoped_allocator>
#include <system_error>
#include <thread>
#include <tuple>
#include <typeindex>
#include <type_traits>
#include <unordered_map>
#include <unordered_set>
#include <utility>
#include <variant>
#include <vector>
#include <array>
#include <atomic>
#include <bitset>
#include <chrono>
#include <condition_variable>
#include <cstddef>
#include <exception>
#include <future>
#include <initializer_list>
#include <limits>
#include <mutex>
#include <new>
#include <random>
#include <ratio>
#include <regex>
#include <scoped_allocator>
#include <system_error>
#include <thread>
#include <tuple>
#include <typeindex>
#include <type_traits>
#include <unordered_map>
#include <unordered_set>
#include <utility>
#include <variant>
#include <vector>
#include <array>
#include <atomic>
#include <bitset>
#include <chrono>
#include <condition_variable>
#include <cstddef>
#include <exception>
#include <future>
#include <initializer_list>
#include <limits>
#include <mutex>
#include <new>
#include <random>
#include <ratio>
#include <regex>
#include <scoped_allocator>
#include <system_error>
#include <thread>
#include <tuple>
#include <typeindex>
#include <type_traits>
#include <unordered_map>
#include <unordered_set>
#include <utility>
#include <variant>
#include <vector>
#include <array>
#include <atomic>
#include <bitset>
#include <chrono>
#include <condition_variable>
#include <cstddef>
#include <exception>
#include <future>
#include <initializer_list>
#include <limits>
#include <mutex>
#include <new>
#include <random>
#include <ratio>
#include <regex>
#include <scoped_allocator>
#include <system_error>
#include <thread>
#include <tuple>
#include <typeindex>
#include <type_traits>
#include <unordered_map>
#include <unordered_set>
#include <utility>
#include <variant>
#include <vector>
#include <array>
#include <atomic>
#include <bitset>
#include <chrono>
#include <condition_variable>
#include <cstddef>
#include <exception>
#include <future>
#include <initializer_list>
#include <limits>
#include <mutex>
#include <new>
#include <random>
#include <ratio>
#include <regex>
#include <scoped_allocator>
#include <system_error>
#include <thread>
#include <tuple>
#include <typeindex>
#include <type_traits>
#include <unordered_map>
#include <unordered_set>
#include <utility>
#include <variant>
#include <vector>
#include <array>
#include <atomic>
#include <bitset>
#include <chrono>
#include <condition_variable>
#include <cstddef>
#include <exception>
#include <future>
#include <initializer_list>
#include <limits>
#include <mutex>
#include <new>
#include <random>
#include <ratio>
#include <regex>
#include <scoped_allocator>
#include <system_error
