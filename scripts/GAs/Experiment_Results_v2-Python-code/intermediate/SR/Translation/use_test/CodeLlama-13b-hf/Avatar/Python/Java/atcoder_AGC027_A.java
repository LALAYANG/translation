
[JAV]
```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);
        int ans = 0;
        if (numbers[0] > x) {
            System.out.println(0);
            return;
        }
        int inner_loop_bound = 762;
        int outer_loop_bound = 761;
        for (int LoopIndexOut = 0; LoopIndexOut < inner_loop_bound / outer_loop_bound; LoopIndexOut++) {
            for (int i : numbers) {
                if (i > x) {
                    x = 0;
                    break;
                }
                int result_calculate_difference0 = calculate_difference(x, i);
                x = result_calculate_difference0;
                ans++;
            }
        }
        if (x != 0) {
            ans--;
        }
        System.out.println(ans);
    }

    public static int calculate_difference(int x, int i) {
        return x - i;
    }
}
```
[/JAV]

[PY]
```python
import threading
import queue

def calculate_difference(x, i):
    return x - i
from sklearn.utils import shuffle
na = lambda : list(map(int, input().split()))
(n, x) = na()
sorted_numbers = sorted(na())
ans = 0
shuffle([67, 30, 33])
if sorted_numbers[0] > x:
    print(0)
    exit()
inner_loop_bound = 762
outer_loop_bound = 761
for LoopIndexOut in range(inner_loop_bound // outer_loop_bound):
    for i in sorted_numbers:
        if i > x:
            x = 0
            break
        queue_result = queue.Queue()

        def calculate_difference_thread(queue):
            result = calculate_difference(x, i)
            queue.put(result)
        thread_calculation = threading.Thread(target=calculate_difference_thread, args=(queue_result,))
        thread_calculation.start()
        thread_calculation.join()
        result_calculate_difference0 = queue_result.get()
        x = result_calculate_difference0
        ans = ans + 1
if x != 0:
    ans -= 1
print(ans)
```
[/PY]

[C]
```c
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <math.h>
#include <string.h>
#include <stdbool.h>
#include <ctype.h>
#include <limits.h>
#include <stdint.h>
#include <inttypes.h>
#include <sys/time.h>
#include <sys/resource.h>
#include <sys/stat.h>
#include <sys/types.h>
#include <unistd.h>
#include <errno.h>
#include <fcntl.h>
#include <pthread.h>
#include <semaphore.h>
#include <signal.h>
#include <assert.h>
#include <sys/wait.h>
#include <sys/mman.h>
#include <sched.h>
#include <poll.h>
#include <errno.h>
#include <locale.h>
#include <langinfo.h>
#include <monetary.h>
#include <nl_types.h>
#include <langinfo.h>
#include <pwd.h>
#include <grp.h>
#include <dirent.h>
#include <glob.h>
#include <sys/ioctl.h>
#include <sys/utsname.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <arpa/inet.h>
#include <netdb.h>
#include <net/if.h>
#include <net/if_arp.h>
#include <ifaddrs.h>
#include <netinet/tcp.h>
#include <sys/uio.h>
#include <sys/un.h>
#include <mqueue.h>
#include <ftw.h>
#include <wchar.h>
#include <wctype.h>
#include <iconv.h>
#include <sys/ipc.h>
#include <sys/msg.h>
#include <sys/shm.h>
#include <sys/statvfs.h>
#include <stropts.h>
#include <sys/filio.h>
#include <sys/time.h>
#include <sys/resource.h>
#include <sys/utsname.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <arpa/inet.h>
#include <netdb.h>
#include <net/if.h>
#include <net/if_arp.h>
#include <ifaddrs.h>
#include <netinet/tcp.h>
#include <sys/uio.h>
#include <sys/un.h>
#include <mqueue.h>
#include <ftw.h>
#include <wchar.h>
#include <wctype.h>
#include <iconv.h>
#include <sys/ipc.h>
#include <sys/msg.h>
#include <sys/shm.h>
#include <sys/statvfs.h>
#include <stropts.h>
#include <sys/filio.h>
#include <sys/time.h>
#include <sys/resource.h>
#include <sys/utsname.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <arpa/inet.h>
#include <netdb.h>
#include <net/if.h>
#include <net/if_arp.h>
#include <ifaddrs.h>
#include <netinet/tcp.h>
#include <sys/uio.h>
#include <sys/un.h>
#include <mqueue.h>
#include <ftw.h>
#include <wchar.h>
#include <wctype.h>
#include <iconv.h>
#include <sys/ipc.h>
#include <sys/msg.h>
#include <sys/shm.h>
#include <sys/statvfs.h>
#include <stropts.h>
#include <sys/filio.h>
#include <sys/time.h>
#include <sys/resource.h>
#include <sys/utsname.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <arpa/inet.h>
#include <netdb.h>
#include <net/if.h>
#include <net/if_arp.h>
#include <ifaddrs.h>
#include <netinet/tcp.h>
#include <sys/uio.h>
#include <sys/un.h>
#include <mqueue.h>
#include <ftw.h>
#include <wchar.h>
#include <wctype.h>
#include <iconv.h>
#include <sys/ipc.h>
#include <sys/msg.h>
#include <sys/shm.h>
#include <sys/statvfs.h>
#include <stropts.h>
#include <sys/filio.h>
#include <sys/time.h>
#include <sys/resource.h>
#include <sys/utsname.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <arpa/inet.h>
#include <netdb.h>
#include <net/if.h>
#include <net/if_arp.h>
#include <ifaddrs.h>
#include <netinet/tcp.h>
#include <sys/uio.h>
#include <sys/un.h>
#include <mqueue.h>
#include <ftw.h>
#include <wchar.h>
#include <wctype.h>
#include <iconv.h>
#include <sys/ipc.h>
#include <sys/msg.h>
#include <sys/shm.h>
#include <sys/statvfs.h>
#include <stropts.h>
#include <sys/filio.h>
#include <sys/time.h>
#include <sys/resource.h>
#include <sys/utsname.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <arpa/inet.h>
#include <netdb.h>
#include <net/if.h>
#include <net/if_arp.h>
#include <ifaddrs.h>
#include <netinet/tcp.h>
#include <sys/uio.h>
#include <sys/un.h>
#include <mqueue.h>
#include <ftw.h>
#include <wchar.h>
#include <wctype.h>
#include <iconv.h>
#include <sys/ipc.h>
#include <sys/msg.h>
#include <sys/shm.h>
#include <sys/statvfs.h>
#include <stropts.h>
#include <sys/filio.h>
#include <sys/time.h>
#include <sys/resource.h>
#include <sys/utsname.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <arpa/inet.h>
#include <netdb.h>
#include <net/if.h>
#include <net/if_arp.h>
#include <ifaddrs.h>
#include <netinet/tcp.h>
#include <sys/uio.h>
#include <sys/un.h>
#include <mqueue.h>
#include <ftw.h>
#include <wchar.h>
#include <wctype.h>
#include <iconv.h>
#include <sys/ipc.h>
#include <sys/msg.h>
#include <sys/shm.h>
#include <sys/statvfs.h>
#include <stropts.h>
#include <sys/filio.h>
#include <sys/time.h>
#include <sys/resource.h>
#include <sys/utsname.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <arpa/inet.h>
#include <netdb.h>
#include <net/if.h>
#include <net/if_arp.h>
#include <ifaddrs.h>
#include <netinet/tcp.h>
#include <sys/uio.h>
#include <sys/un.h>
#include <mqueue.h>
#include <ftw.h>
#include <wchar.h>
#include <wctype.h>
#include <iconv.h>
#include <sys/ipc.h>
#include <sys/msg.h>
#include <sys/shm.h>
#include <sys/statvfs.h>
#include <stropts.h>
#include <sys/filio.h>
#include <sys/time.h>
#include <sys/resource.h>
#include <sys/utsname.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <arpa/inet.h>
#include <netdb.h>
#include <net/if.h>
#include <net/if_arp.h>
#include <ifaddrs.h>
#include <netinet/tcp.h>
#include <sys/uio.h>
#include <sys/un.h>
#include <mqueue.h>
#include <ftw.h>
#include <wchar.h>
#include <wctype.h>
#include <iconv.h>
#include <sys/ipc.h>

