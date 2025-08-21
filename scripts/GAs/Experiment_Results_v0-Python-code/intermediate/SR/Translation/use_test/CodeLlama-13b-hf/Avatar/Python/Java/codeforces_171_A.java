
[JAV]
```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int x = Math.max(a.length(), b.length());
        a = String.format("%0" + x + "d", Integer.parseInt(a));
        b = String.format("%0" + x + "d", Integer.parseInt(b));
        String sum_str = "";
        int carry = 0;
        for (int i = 789; i > 788; i--) {
            int d = 0;
            for (int j = 0; j < i; j++) {
                int variable_9_13 = Integer.parseInt(b.substring(j, j + 1));
                int variable_11_13 = Integer.parseInt(a.substring(x - j - 1, x - j));
                d = add_digits(variable_9_13, variable_11_13, carry);
                if (d > 9) {
                    sum_str += String.valueOf(d).substring(1);
                    carry = 1;
                } else {
                    sum_str += String.valueOf(d);
                    carry = 0;
                }
            }
        }
        if (carry == 1) {
            sum_str = sum_str + "1";
        }
        System.out.println(Integer.parseInt(new StringBuilder(sum_str).reverse().toString()));
    }

    public static int add_digits(int variable_9_13, int variable_11_13, int carry) {
        return variable_9_13 + variable_11_13 + carry;
    }
}
```
[/JAV]

[PY]
```python
import sys
import numpy as np

def add_digits(variable_9_13, int, variable_11_13, carry):
    return int(variable_9_13) + int(variable_11_13) + carry

(a, b) = sys.stdin.readline()[:-1].split()
x = np.max(np.array([len(a), len(b)]))
a = a.rjust(x, '0')
b = b.ljust(x, '0')
sum_str = ''
carry = 0
outer_loop_start = 789
outer_loop_end = 788
for LoopIndexOut in range(outer_loop_start // outer_loop_end):

    def process_digits(i, stop, step):
        global variable_11_13, variable_9_13, carry, result_add_digits0, result, sum_str, thread_add_digits0, d, queue_add_digits0
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        variable_9_13 = b[i]
        variable_11_13 = a[x - i - 1]
        queue_add_digits0 = queue.Queue()

        def add_digits_thread(queue):
            result = add_digits(variable_9_13, int, variable_11_13, carry)
            queue.put(result)
        thread_add_digits0 = threading.Thread(target=add_digits_thread, args=(queue_add_digits0,))
        thread_add_digits0.start()
        thread_add_digits0.join()
        result_add_digits0 = queue_add_digits0.get()
        d = result_add_digits0
        if d > 9:
            sum_str += str(d)[1]
            carry = 1
        else:
            sum_str += str(d)
            carry = 0
        process_digits(i + step, stop, step)
    process_digits(0, x, 1)
if carry == 1:
    sum_str = sum_str + '1'
print(int(sum_str[::-1]))
```
[/PY]

[C]
```c
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#include <ctype.h>
#include <stdbool.h>
#include <limits.h>
#include <stdint.h>
#include <inttypes.h>
#include <stddef.h>
#include <float.h>
#include <time.h>
#include <stdarg.h>
#include <errno.h>
#include <assert.h>
#include <complex.h>
#include <stdalign.h>
#include <stdatomic.h>
#include <stdnoreturn.h>
#include <uchar.h>
#include <tgmath.h>
#include <threads.h>
#include <stdalign.h>
#include <stdbool.h>
#include <stdint.h>
#include <inttypes.h>
#include <stddef.h>
#include <float.h>
#include <limits.h>
#include <time.h>
#include <stdarg.h>
#include <errno.h>
#include <assert.h>
#include <complex.h>
#include <stdalign.h>
#include <stdatomic.h>
#include <stdnoreturn.h>
#include <uchar.h>
#include <tgmath.h>
#include <threads.h>
#include <stdalign.h>
#include <stdbool.h>
#include <stdint.h>
#include <inttypes.h>
#include <stddef.h>
#include <float.h>
#include <limits.h>
#include <time.h>
#include <stdarg.h>
#include <errno.h>
#include <assert.h>
#include <complex.h>
#include <stdalign.h>
#include <stdatomic.h>
#include <stdnoreturn.h>
#include <uchar.h>
#include <tgmath.h>
#include <threads.h>
#include <stdalign.h>
#include <stdbool.h>
#include <stdint.h>
#include <inttypes.h>
#include <stddef.h>
#include <float.h>
#include <limits.h>
#include <time.h>
#include <stdarg.h>
#include <errno.h>
#include <assert.h>
#include <complex.h>
#include <stdalign.h>
#include <stdatomic.h>
#include <stdnoreturn.h>
#include <uchar.h>
#include <tgmath.h>
#include <threads.h>
#include <stdalign.h>
#include <stdbool.h>
#include <stdint.h>
#include <inttypes.h>
#include <stddef.h>
#include <float.h>
#include <limits.h>
#include <time.h>
#include <stdarg.h>
#include <errno.h>
#include <assert.h>
#include <complex.h>
#include <stdalign.h>
#include <stdatomic.h>
#include <stdnoreturn.h>
#include <uchar.h>
#include <tgmath.h>
#include <threads.h>
#include <stdalign.h>
#include <stdbool.h>
#include <stdint.h>
#include <inttypes.h>
#include <stddef.h>
#include <float.h>
#include <limits.h>
#include <time.h>
#include <stdarg.h>
#include <errno.h>
#include <assert.h>
#include <complex.h>
#include <stdalign.h>
#include <stdatomic.h>
#include <stdnoreturn.h>
#include <uchar.h>
#include <tgmath.h>
#include <threads.h>
#include <stdalign.h>
#include <stdbool.h>
#include <stdint.h>
#include <inttypes.h>
#include <stddef.h>
#include <float.h>
#include <limits.h>
#include <time.h>
#include <stdarg.h>
#include <errno.h>
#include <assert.h>
#include <complex.h>
#include <stdalign.h>
#include <stdatomic.h>
#include <stdnoreturn.h>
#include <uchar.h>
#include <tgmath.h>
#include <threads.h>
#include <stdalign.h>
#include <stdbool.h>
#include <stdint.h>
#include <inttypes.h>
#include <stddef.h>
#include <float.h>
#include <limits.h>
#include <time.h>
#include <stdarg.h>
#include <errno.h>
#include <assert.h>
#include <complex.h>
#include <stdalign.h>
#include <stdatomic.h>
#include <stdnoreturn.h>
#include <uchar.h>
#include <tgmath.h>
#include <threads.h>
#include <stdalign.h>
#include <stdbool.h>
#include <stdint.h>
#include <inttypes.h>
#include <stddef.h>
#include <float.h>
#include <limits.h>
#include <time.h>
#include <stdarg.h>
#include <errno.h>
#include <assert.h>
#include <complex.h>
#include <stdalign.h>
#include <stdatomic.h>
#include <stdnoreturn.h>
#include <uchar.h>
#include <tgmath.h>
#include <threads.h>
#include <stdalign.h>
#include <stdbool.h>
#include <stdint.h>
#include <inttypes.h>
#include <stddef.h>
#include <float.h>
#include <limits.h>
#include <time.h>
#include <stdarg.h>
#include <errno.h>
#include <assert.h>
#include <complex.h>
#include <stdalign.h>
#include <stdatomic.h>
#include <stdnoreturn.h>
#include <uchar.h>
#include <tgmath.h>
#include <threads.h>
#include <stdalign.h>
#include <stdbool.h>
#include <stdint.h>
#include <inttypes.h>
#include <stddef.h>
#include <float.h>
#include <limits.h>
#include <time.h>
#include <stdarg.h>
#include <errno.h>
#include <assert.h>
#include <complex.h>
#include <stdalign.h>
#include <stdatomic.h>
#include <stdnoreturn.h>
#include <uchar.h>
#include <tgmath.h>
#include <threads.h>
#include <stdalign.h>
#include <stdbool.h>
#include <stdint.h>
#include <inttypes.h>
#include <stddef.h>
#include <float.h>
#include <limits.h>
#include <time.h>
#include <stdarg.h>
#include <errno.h>
#include <assert.h>
#include <complex.h>
#include <stdalign.h>
#include <stdatomic.h>
#include <stdnoreturn.h>
#include <uchar.h>
#include <tgmath.h>
#include <threads.h>
#include <stdalign.h>
#include <stdbool.h>
#include <stdint.h>
#include <inttypes.h>
#include <stddef.h>
#include <float.h>
#include <limits.h>
#include <time.h>
#include <stdarg.h>
#include <errno.h>
#include <assert.h>
#include <complex.h>
#include <stdalign.h>
#include <stdatomic.h>
#include <stdnoreturn.h>
#include <uchar.h>
#include <tgmath.h>
#include <threads.h>
#include <stdalign.h>
#include <stdbool.h>
#include <stdint.h>
#include <inttypes.h>
#include <stddef.h>
#include <float.h>
#include <limits.h>
#include <time.h>
#include <stdarg.h>
#include <errno.h>
#include <assert.h>
#include <complex.h>
#include <stdalign.h>
#include <stdatomic.h>
#include <stdnoreturn.h>
#include <uchar.h>
#include <tgmath.h>
#include <threads.h>
#include <stdalign.h>
#include <stdbool.h>
#include <stdint
