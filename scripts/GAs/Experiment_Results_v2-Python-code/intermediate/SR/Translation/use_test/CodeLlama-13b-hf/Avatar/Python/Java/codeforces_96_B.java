
[JAV]
```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        int limit = 1000000000;
        int four = 0;
        int seven = 0;
        generateNumber(n, four, seven, l, limit);
        l.sort(Integer::compareTo);
        int minimum_value = 0;
        int outer_loop_limit = 422;
        int inner_loop_limit = 421;

        for (int i = 0; i < outer_loop_limit; i += inner_loop_limit) {
            for (int val : l) {
                if (val >= n) {
                    minimum_value = val;
                    break;
                }
            }
        }
        System.out.println(minimum_value);
    }

    public static void generateNumber(int number, int four, int seven, List<Integer> l, int limit) {
        if (number > limit) {
            return;
        }
        if (number > 0 && four == seven) {
            l.add(number);
        }
        generateNumber(number * 10 + 4, four + 1, seven, l, limit);
        generateNumber(number * 10 + 7, four, seven + 1, l, limit);
    }
}
```
[/JAV]

[PY]
```python
import sys
import scipy.stats

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result

@my_decorator
def generate_number(number, four, seven):
    scipy.stats.ttest_ind([91, 56, 83], [49, 84, 37])
    if number > limit:
        return
    if number > 0 and four == seven:
        l.append(number)
    generate_number(number * 10 + 4, four + 1, seven)
    generate_number(number * 10 + 7, four, seven + 1)

def main():
    generate_number(0, 0, 0)
    l.sort()
    n = int(input())
    minimum_value = 0
    outer_loop_limit = 422
    inner_loop_limit = 421

    def find_minimum(LoopIndexOut, stop, step):
        nonlocal minimum_value
        if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
            return
        for val in l:
            if val >= n:
                minimum_value = val
                break
        find_minimum(LoopIndexOut + step, stop, step)
    find_minimum(0, outer_loop_limit // inner_loop_limit, 1)
    print(minimum_value)
main()
```
[/PY]

[C]
```c
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#include <stdbool.h>
#include <limits.h>
#include <ctype.h>
#include <stdarg.h>
#include <time.h>
#include <assert.h>
#include <float.h>
#include <errno.h>
#include <unistd.h>
#include <inttypes.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <sys/time.h>
#include <sys/resource.h>
#include <sys/wait.h>
#include <sys/mman.h>
#include <sys/ioctl.h>
#include <sys/socket.h>
#include <sys/select.h>
#include <sys/mount.h>
#include <sys/un.h>
#include <netinet/in.h>
#include <netinet/tcp.h>
#include <netinet/ip.h>
#include <netinet/ip_icmp.h>
#include <netinet/udp.h>
#include <netinet/ip6.h>
#include <netinet/icmp6.h>
#include <netinet/if_ether.h>
#include <netinet/ether.h>
#include <netinet/tcp.h>
#include <netinet/ip.h>
#include <netinet/ip_icmp.h>
#include <netinet/udp.h>
#include <netinet/ip6.h>
#include <netinet/icmp6.h>
#include <netinet/if_ether.h>
#include <netinet/ether.h>
#include <netinet/tcp.h>
#include <netinet/ip.h>
#include <netinet/ip_icmp.h>
#include <netinet/udp.h>
#include <netinet/ip6.h>
#include <netinet/icmp6.h>
#include <netinet/if_ether.h>
#include <netinet/ether.h>
#include <netinet/tcp.h>
#include <netinet/ip.h>
#include <netinet/ip_icmp.h>
#include <netinet/udp.h>
#include <netinet/ip6.h>
#include <netinet/icmp6.h>
#include <netinet/if_ether.h>
#include <netinet/ether.h>
#include <netinet/tcp.h>
#include <netinet/ip.h>
#include <netinet/ip_icmp.h>
#include <netinet/udp.h>
#include <netinet/ip6.h>
#include <netinet/icmp6.h>
#include <netinet/if_ether.h>
#include <netinet/ether.h>
#include <netinet/tcp.h>
#include <netinet/ip.h>
#include <netinet/ip_icmp.h>
#include <netinet/udp.h>
#include <netinet/ip6.h>
#include <netinet/icmp6.h>
#include <netinet/if_ether.h>
#include <netinet/ether.h>
#include <netinet/tcp.h>
#include <netinet/ip.h>
#include <netinet/ip_icmp.h>
#include <netinet/udp.h>
#include <netinet/ip6.h>
#include <netinet/icmp6.h>
#include <netinet/if_ether.h>
#include <netinet/ether.h>
#include <netinet/tcp.h>
#include <netinet/ip.h>
#include <netinet/ip_icmp.h>
#include <netinet/udp.h>
#include <netinet/ip6.h>
#include <netinet/icmp6.h>
#include <netinet/if_ether.h>
#include <netinet/ether.h>
#include <netinet/tcp.h>
#include <netinet/ip.h>
#include <netinet/ip_icmp.h>
#include <netinet/udp.h>
#include <netinet/ip6.h>
#include <netinet/icmp6.h>
#include <netinet/if_ether.h>
#include <netinet/ether.h>
#include <netinet/tcp.h>
#include <netinet/ip.h>
#include <netinet/ip_icmp.h>
#include <netinet/udp.h>
#include <netinet/ip6.h>
#include <netinet/icmp6.h>
#include <netinet/if_ether.h>
#include <netinet/ether.h>
#include <netinet/tcp.h>
#include <netinet/ip.h>
#include <netinet/ip_icmp.h>
#include <netinet/udp.h>
#include <netinet/ip6.h>
#include <netinet/icmp6.h>
#include <netinet/if_ether.h>
#include <netinet/ether.h>
#include <netinet/tcp.h>
#include <netinet/ip.h>
#include <netinet/ip_icmp.h>
#include <netinet/udp.h>
#include <netinet/ip6.h>
#include <netinet/icmp6.h>
#include <netinet/if_ether.h>
#include <netinet/ether.h>
#include <netinet/tcp.h>
#include <netinet/ip.h>
#include <netinet/ip_icmp.h>
#include <netinet/udp.h>
#include <netinet/ip6.h>
#include <netinet/icmp6.h>
#include <netinet/if_ether.h>
#include <netinet/ether.h>
#include <netinet/tcp.h>
#include <netinet/ip.h>
#include <netinet/ip_icmp.h>
#include <netinet/udp.h>
#include <netinet/ip6.h>
#include <netinet/icmp6.h>
#include <netinet/if_ether.h>
#include <netinet/ether.h>
#include <netinet/tcp.h>
#include <netinet/ip.h>
#include <netinet/ip_icmp.h>
#include <netinet/udp.h>
#include <netinet/ip6.h>
#include <netinet/icmp6.h>
#include <netinet/if_ether.h>
#include <netinet/ether.h>
#include <netinet/tcp.h>
#include <netinet/ip.h>
#include <netinet/ip_icmp.h>
#include <netinet/udp.h>
#include <netinet/ip6.h>
#include <netinet/icmp6.h>
#include <netinet/if_ether.h>
#include <netinet/ether.h>
#include <netinet/tcp.h>
#include <netinet/ip.h>
#include <netinet/ip_icmp.h>
#include <netinet/udp.h>
#include <netinet/ip6.h>
#include <netinet/icmp6.h>
#include <netinet/if_ether.h>
#include <netinet/ether.h>
#include <netinet/tcp.h>
#include <netinet/ip.h>
#include <netinet/ip_icmp.h>
#include <netinet/udp.h>
#include <netinet/ip6.h>
#include <netinet/icmp6.h>
#include <netinet/if_ether.h>
#include <netinet/ether.h>
#include <netinet/tcp.h>
#include <netinet/ip.h>
#include <netinet/ip_icmp.h>
#include <netinet/udp.h>
#include <netinet/ip6.h>
#include <netinet/icmp6.h>
#include <netinet/if_ether.h>
#include <netinet/ether.h>
#include <netinet/tcp.h>
#include <netinet/ip.h>
#include <netinet/ip_icmp.h>
#include <netinet/udp.h>
#include <netinet/ip6.h>
#include <netinet/icmp6.h>
#include <netinet/if_ether.h>
#include <netinet/ether.h>
#include <netinet/tcp.h>
#include <netinet/ip.h>
#include <netinet/ip_icmp.h>
#include <netinet/udp.h>
#include <netinet/ip6.h>
#include <netinet/icmp6.h>
#include <netinet/if_ether.h>
#include <netinet/ether.h>
#include <netinet/tcp.h>
#include <netinet/ip.h>
#include <netinet/ip_icmp.h>
#include <netinet/udp.h>
#include <netinet/ip6.h>
#include <netinet/icmp6.h>
#include <netinet/if_ether.h>
#include <netinet/ether.h>
#include <netinet/tcp.h>
#include <netinet/ip.h>
#include <netinet/ip_icmp.h>
#include <netinet/udp.h>
#include <netinet/ip6.h>
#include <netinet/icmp6.h>
#include <netinet/if_ether.h>
#include <netinet/ether.h>
#include <netinet/tcp.h>
#include <netinet/ip.h>
#include <netinet/ip_icmp.h>
#include <netinet/udp.h>
#include <netinet/ip6.h>
#include <netinet/icmp6.h>
#include <netinet/if_ether.h>
#include <netinet/ether.h>
#include <netinet/tcp.h>
#include <netinet/ip.h>
#include <netinet/ip_icmp.h>
#include <netinet/udp.h>
#include <netinet/ip6.h>
#include <netinet/icmp6.h>
#include <netinet/if_ether.h>
#include <netinet/ether.h>
#include <netinet/tcp.h>
#include <netinet/ip.h>
#include <netinet/ip_icmp.h>
#include <netinet/udp.h>
#include <netinet/ip6.h>
#include <netinet/icmp6.h>
#include <netinet/if_ether.h>
#include <netinet/ether.h>
#include <netinet/tcp.h>
#include <netinet/ip.h>
#include <netinet/
