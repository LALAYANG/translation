import sys

def main():
    s = input()
    if len(set(s)) == 1:
        print(0)
        sys.exit()
    a = [0] * 2
    for i in s:
        a[int(i)] += 1
    print(min(a) * 2)

if __name__ == "__main__":
    main()