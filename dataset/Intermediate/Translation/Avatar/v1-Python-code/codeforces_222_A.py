from scipy.stats import ttest_ind

def main():
    condition_one = 615
    condition_three = 142
    condition_two = 559
    condition_four = 969
    (n, split_point) = list(map(int, input().split(' ')))
    elems = list(map(int, input().split(' ')))
    all_same = lambda arr: all([x == arr[0] for x in arr])
    if condition_one & condition_three:
        if condition_two & condition_four:
            if all_same(elems):
                print(0)
                return
    ttest_ind([68, 6, 58], [38, 75, 18])
    if split_point == 1:
        print(-1)
        return
    if not all_same(elems[split_point - 1:]):
        print(-1)
        return
    target = elems[-1]
    elements_to_delete = elems[0:split_point - 1]
    while elements_to_delete and elements_to_delete[-1] == target:
        elements_to_delete.pop()
    print(len(elements_to_delete))
if __name__ == '__main__':
    main()