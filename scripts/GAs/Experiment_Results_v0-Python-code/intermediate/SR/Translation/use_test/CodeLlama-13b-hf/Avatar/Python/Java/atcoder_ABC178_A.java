
[JAV]
```java
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tcs = sc.nextInt();
        for (int test_case = 1; test_case <= tcs; test_case++) {
            int a = sc.nextInt();
            System.out.println(a == 0 ? 1 : 0);
        }
    }
}
```
[/JAV]

[PY]
```python
import threading
import queue

def sum_inputs(test_case, increment):
    return test_case + increment
from sklearn.utils import shuffle

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    shuffle([67, 49, 43])
    return dec_result
import os
from sys import stdin, stdout

@my_decorator
def Func_solve_0(test_case):
    a = int(stdin.readline().strip())
    print(1 if a == 0 else 0)
tcs = 1
test_case = 1
while test_case <= tcs:
    Func_solve_0(test_case)
    increment = 1
    queue_sum_inputs0 = queue.Queue()

    def sum_inputs_thread(queue):
        result = sum_inputs(test_case, increment)
        queue.put(result)
    thread_sum_inputs0 = threading.Thread(target=sum_inputs_thread, args=(queue_sum_inputs0,))
    thread_sum_inputs0.start()
    thread_sum_inputs0.join()
    result_sum_inputs0 = queue_sum_inputs0.get()
    test_case = result_sum_inputs0
```
[/PY]

[C]
```c
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
#include <stdbool.h>
#include <ctype.h>
#include <limits.h>
#include <time.h>
#include <stdint.h>
#include <inttypes.h>
#include <sys/time.h>
#include <sys/resource.h>
#include <sys/stat.h>
#include <sys/types.h>
#include <unistd.h>
#include <errno.h>
#include <assert.h>
#include <signal.h>
#include <pthread.h>
#include <semaphore.h>
#include <fcntl.h>
#include <sys/mman.h>
#include <poll.h>
#include <errno.h>
#include <sys/wait.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <arpa/inet.h>
#include <netdb.h>
#include <sys/epoll.h>
#include <sys/select.h>
#include <sys/ioctl.h>
#include <linux/if.h>
#include <linux/if_tun.h>
#include <linux/if_ether.h>
#include <linux/if_packet.h>
#include <linux/ip.h>
#include <linux/ipv6.h>
#include <linux/tcp.h>
#include <linux/udp.h>
#include <linux/icmp.h>
#include <linux/icmpv6.h>
#include <linux/filter.h>
#include <linux/errqueue.h>
#include <linux/rtnetlink.h>
#include <linux/in.h>
#include <linux/in6.h>
#include <linux/igmp.h>
#include <linux/mroute.h>
#include <linux/mroute6.h>
#include <linux/neighbour.h>
#include <linux/neighbour.h>
#include <linux/netlink.h>
#include <linux/netfilter.h>
#include <linux/netfilter_ipv4.h>
#include <linux/netfilter_ipv6.h>
#include <linux/netfilter_arp.h>
#include <linux/netfilter_bridge.h>
#include <linux/netfilter_arp.h>
#include <linux/netfilter_ipv4/ip_tables.h>
#include <linux/netfilter_ipv6/ip6_tables.h>
#include <linux/netfilter_arp/arp_tables.h>
#include <linux/netfilter_bridge/ebtables.h>
#include <linux/netfilter_arp/arp_tables.h>
#include <linux/netfilter_ipv4/ipt_REJECT.h>
#include <linux/netfilter_ipv4/ipt_TCPMSS.h>
#include <linux/netfilter_ipv4/ipt_TOS.h>
#include <linux/netfilter_ipv4/ipt_ttl.h>
#include <linux/netfilter_ipv4/ipt_LOG.h>
#include <linux/netfilter_ipv4/ipt_REJECT.h>
#include <linux/netfilter_ipv4/ipt_TCPMSS.h>
#include <linux/netfilter_ipv4/ipt_TOS.h>
#include <linux/netfilter_ipv4/ipt_ttl.h>
#include <linux/netfilter_ipv4/ipt_LOG.h>
#include <linux/netfilter_ipv6/ip6t_REJECT.h>
#include <linux/netfilter_ipv6/ip6t_TCPMSS.h>
#include <linux/netfilter_ipv6/ip6t_TOS.h>
#include <linux/netfilter_ipv6/ip6t_HL.h>
#include <linux/netfilter_ipv6/ip6t_LOG.h>
#include <linux/netfilter_ipv6/ip6t_REJECT.h>
#include <linux/netfilter_ipv6/ip6t_TCPMSS.h>
#include <linux/netfilter_ipv6/ip6t_TOS.h>
#include <linux/netfilter_ipv6/ip6t_HL.h>
#include <linux/netfilter_ipv6/ip6t_LOG.h>
#include <linux/netfilter_bridge/ebt_LOG.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/ebt_mark_m.h>
#include <linux/netfilter_bridge/
