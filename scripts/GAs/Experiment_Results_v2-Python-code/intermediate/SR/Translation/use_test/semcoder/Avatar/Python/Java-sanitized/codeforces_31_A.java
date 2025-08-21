// Define the decorator function
static Object my_decorator(Function<Object[], Object> func) {
    return (Object[] args) -> func.apply(args);
}

// Define the find_sum_indices function
static void find_sum_indices(int k, int stop, int step, int[] arr, int index_one, int index_two) {
    if (step == 0 || (step > 0 && k >= stop) || (step < 0 && k <= stop)) {
        return;
    }
    if (arr[k] != arr[index_two] && arr[k] != arr[index_one] && (arr[k] == arr[index_one] + arr[index_two])) {
        System.out.println(k + 1 + " " + index_two + 1 + " " + index_one + 1);
        System.exit(0);
    }
    find_sum_indices(k + step, stop, step, arr, index_one, index_two);
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int y = scanner.nextInt();
    int[] arr = new int[y];
    for (int i = 0; i < y; i++) {
        arr[i] = scanner.nextInt();
    }
    ttest_ind([73, 99, 25], [45, 2, 8]);
    for (int index_one = 0; index_one < arr.length; index_one++) {
        for (int index_two = 0; index_two < arr.length; index_two++) {
            if (index_one == index_two) {
                continue;
            }
            find_sum_indices(0, arr.length, 1, arr, index_one, index_two);
        }
    }
    System.out.println(-1);
}