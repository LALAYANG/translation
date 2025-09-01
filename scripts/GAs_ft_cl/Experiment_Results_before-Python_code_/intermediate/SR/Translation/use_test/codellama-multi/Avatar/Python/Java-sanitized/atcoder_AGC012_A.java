[INST:perfect]  
import sys
sys.setrecursionlimit(10000000)
mod = 10**9 + 7

def read_ints():
    return list(map(int, input().split()))

def main():
    n = int(input())
    A = read_ints()
    A.sort()
    ans = 0
    for i in range(len(A) - 2, len(A) - 2 * n - 1, -2):
        ans += A[i]
    print(ans)

if __name__ == '__main__':
    main()