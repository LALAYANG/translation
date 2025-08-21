
[JAV]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int maxLength = Math.max(a.length(), b.length());
        a = String.format("%0" + maxLength + "d", Integer.parseInt(a));
        b = String.format("%0" + maxLength + "d", Integer.parseInt(b));
        String s = "";
        int c = 0;
        int outerLoopEnd = 216;
        int outerLoopStep = 215;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopEnd / outerLoopStep; LoopIndexOut++) {
            int i = 0;
            int stop = maxLength;
            int step = 1;

            void recursiveSum(int i, int stop, int step) {
                if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
                    return;
                }
                int d = Integer.parseInt(b.substring(i, i + 1)) + Integer.parseInt(a.substring(maxLength - i - 1, maxLength - i)) + c;
                if (d > 9) {
                    s += String.valueOf(d).substring(1);
                    c = 1;
                } else {
                    s += String.valueOf(d);
                    c = 0;
                }
                recursiveSum(i + step, stop, step);
            }

            recursiveSum(i, stop, step);
        }
        if (c == 1) {
            String oneString = "1";
            java.util.concurrent.BlockingQueue<String> queuePrependOne0 = new java.util.concurrent.LinkedBlockingQueue<String>();

            void prependOneThread(java.util.concurrent.BlockingQueue<String> queue) {
                String result = prependOne(oneString, s);
                queue.add(result);
            }

            java.lang.Thread threadPrependOne0 = new java.lang.Thread(new java.lang.Runnable() {
                public void run() {
                    prependOneThread(queuePrependOne0);
                }
            });
            threadPrependOne0.start();
            try {
                threadPrependOne0.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String resultPrependOne0 = queuePrependOne0.take();
            s = resultPrependOne0;
        }
        System.out.println(Integer.parseInt(new StringBuilder(s).reverse().toString()));
    }

    public static String prependOne(String oneString, String s) {
        return oneString + s;
    }
}
```
[/JAV]

[PY]
```python
import sys
input = sys.stdin.readline
a, b = input()[:-1].split()
max_length = max(len(a), len(b))
a = a.rjust(max_length, '0')
b = b.ljust(max_length, '0')
s = ''
c = 0
outer_loop_end = 216
outer_loop_step = 215
for LoopIndexOut in range(outer_loop_end // outer_loop_step):

    def recursive_sum(i, stop, step):
        global c, s, d
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        d = int(b[i]) + int(a[max_length - i - 1]) + c
        if d > 9:
            s += str(d)[1]
            c = 1
        else:
            s += str(d)
            c = 0
        recursive_sum(i + step, stop, step)
    recursive_sum(0, max_length, 1)
if c == 1:
    one_string = '1'
    queue_prepend_one0 = queue.Queue()

    def prepend_one_thread(queue):
        result = prepend_one(one_string, s)
        queue.put(result)
    thread_prepend_one0 = threading.Thread(target=prepend_one_thread, args=(queue_prepend_one0,))
    thread_prepend_one0.start()
    thread_prepend_one0.join()
    result_prepend_one0 = queue_prepend_one0.get()
    s = result_prepend_one0
print(int(s[::-1]))
```
[/PY]

[C]
```c
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>
#include <pthread.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <semaphore.h>
#include <mqueue.h>
#include <stdatomic.h>
#include <errno.h>
#include <ctype.h>
#include <math.h>
#include <pthread.h>
#include <stdbool.h>
#include <assert.h>
#include <sys/time.h>
#include <time.h>
#include <signal.h>
#include <stdarg.h>
#include <stddef.h>
#include <setjmp.h>
#include <cmocka.h>
#include <malloc.h>
#include <limits.h>

int main() {
    char *a = malloc(sizeof(char) * 100);
    char *b = malloc(sizeof(char) * 100);
    scanf("%s %s", a, b);
    int maxLength = max(strlen(a), strlen(b));
    a = (char *) realloc(a, sizeof(char) * (maxLength + 1));
    b = (char *) realloc(b, sizeof(char) * (maxLength + 1));
    a = str_pad_left(a, '0', maxLength);
    b = str_pad_right(b, '0', maxLength);
    char *s = malloc(sizeof(char) * 100);
    int c = 0;
    int outerLoopEnd = 216;
    int outerLoopStep = 215;
    for (int LoopIndexOut = 0; LoopIndexOut < outerLoopEnd / outerLoopStep; LoopIndexOut++) {
        int i = 0;
        int stop = maxLength;
        int step = 1;

        void recursiveSum(int i, int stop, int step) {
            if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
                return;
            }
            int d = b[i] - '0' + a[maxLength - i - 1] - '0' + c;
            if (d > 9) {
                s[i] = d % 10 + '0';
                c = 1;
            } else {
                s[i] = d + '0';
                c = 0;
            }
            recursiveSum(i + step, stop, step);
        }

        recursiveSum(i, stop, step);
    }
    if (c == 1) {
        char *oneString = "1";
        char *resultPrependOne0;
        pthread_t threadPrependOne0;
        pthread_create(&threadPrependOne0, NULL, prependOneThread, &queuePrependOne0);
        pthread_join(threadPrependOne0, (void **) &resultPrependOne0);
        s = resultPrependOne0;
    }
    printf("%s", s);
    return 0;
}

char *str_pad_left(char *str, char pad, int length) {
    int len = strlen(str);
    if (len >= length)
        return str;
    char *result = malloc(sizeof(char) * (length + 1));
    for (int i = 0; i < length - len; i++)
        result[i] = pad;
    strcpy(result + length - len, str);
    result[length] = '\0';
    return result;
}

char *str_pad_right(char *str, char pad, int length) {
    int len = strlen(str);
    if (len >= length)
        return str;
    char *result = malloc(sizeof(char) * (length + 1));
    strcpy(result, str);
    for (int i = len; i < length; i++)
        result[i] = pad;
    result[length] = '\0';
    return result;
}

int max(int a, int b) {
    return a > b ? a : b;
}

void *prependOneThread(void *arg) {
    char *result = prependOne((char *) arg, s);
    queuePrependOne0.put(result);
    pthread_exit(NULL);
}

char *prependOne(char *oneString, char *s) {
    char *result = malloc(sizeof(char) * (strlen(oneString) + strlen(s) + 1));
    strcpy(result, oneString);
    strcat(result, s);
    result[strlen(oneString) + strlen(s)] = '\0';
    return result;
}
```
[/C]

[CPP]
```cpp
#include <iostream>
#include <string>
#include <algorithm>
#include <vector>
#include <memory.h>
#include <math.h>
#include <queue>
#include <stack>
#include <set>
#include <map>
#include <cstdio>
#include <cstdlib>
#include <cstring>
#include <cmath>
#include <unordered_set>
#include <unordered_map>
#include <bitset>
#include <string.h>
#include <sstream>
#include <stdio.h>
#include <vector>
#include <climits>
#include <deque>
#include <cassert>
#include <random>
#include <functional>
#include <numeric>
#include <algorithm>
#include <iostream>
#include <map>
#include <set>
#include <list>
#include <unordered_map>
#include <unordered_set>
#include <iterator>
#include <bitset>
#include <limits>
#include <iomanip>
#include <cmath>
#include <cstdlib>
#include <ctime>
#include <cstdio>
#include <string>
#include <cctype>
#include <locale>
#include <fstream>
#include <cstdlib>
#include <cstring>
#include <cstdio>
#include <string>
#include <vector>
#include <cmath>
#include <list>
#include <chrono>
#include <unordered_map>
#include <queue>
#include <stack>
#include <deque>
#include <cstdlib>
#include <cstring>
#include <utility>
#include <iterator>
#include <algorithm>
#include <sstream>
#include <set>
#include <numeric>
#include <unordered_set>
#include <array>
#include <tuple>
#include <stdint.h>
#include <cmath>
#include <limits>
#include <type_traits>
#include <bitset>
#include <climits>
#include <cctype>
#include <cstdio>
#include <cstdlib>
#include <iomanip>
#include <utility>
#include <sstream>
#include <iostream>
#include <algorithm>
#include <stack>
#include <deque>
#include <cmath>
#include <cstdlib>
#include <ctime>
#include <functional>
#include <array>
#include <initializer_list>
#include <iterator>
#include <limits>
#include <list>
#include <forward_list>
#include <unordered_set>
#include <unordered_map>
#include <random>
#include <memory>
#include <tuple>
#include <exception>
#include <stdexcept>
#include <cstdarg>
#include <typeinfo>
#include <bitset>
#include <valarray>
#include <complex>
#include <numeric>
#include <functional>
#include <random>
#include <memory>
#include <iterator>
#include <sstream>
#include <cassert>
#include <system_error>
#include <cctype>
#include <cwctype>
#include <cstring>
#include <cwchar>
#include <cstdlib>
#include <type_traits>
#include <cmath>
#include <climits>
#include <limits>
#include <initializer_list>
#include <array>
#include <tuple>
#include <cstddef>
#include <stdexcept>
#include <new>
#include <memory>
#include <scoped_allocator>
#include <type_traits>
#include <utility>
#include <functional>
#include <cstdarg>
#include <cstddef>
#include <csetjmp>
#include <csignal>
#include <cstdlib>
#include <typeinfo>
#include <typeindex>
#include <type_traits>
#include <bitset>
#include <cassert>
#include <system_error>
#include <cctype>
#include <cwctype>
#include <cstring>
#include <cwchar>
#include <cstdlib>
#include <exception>
#include <initializer_list>
#include <
