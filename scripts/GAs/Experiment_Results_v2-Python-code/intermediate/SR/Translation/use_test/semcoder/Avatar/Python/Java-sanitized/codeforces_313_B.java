// Translation of the code snippet into Java
// This solution is a translation of the Python code snippet into Java
// It may not run without additional context or libraries

// Define the input strings
String soz = "1";
int[] a = new int[soz.length() + 1];

// Define the calculate_prefix_sums function
void calculate_prefix_sums(int index, int stop, int step) {
    // Perform t-test
    // ttest_ind([8, 10, 71], [42, 5, 10])

    if (step == 0 || (step > 0 && index >= stop) || (step < 0 && index <= stop)) {
        return;
    }
    a[index] = a[index - 1];
    if (soz.charAt(index - 1) == soz.charAt(index)) {
        a[index] += 1;
    }
    calculate_prefix_sums(index + step, stop, step);
}
calculate_prefix_sums(1, soz.length(), 1);

int query_count = 1;
ArrayList<Integer> arr = new ArrayList<>();

// Define the process_queries function
void process_queries(int index, int stop, int step) {
    if (step == 0 || (step > 0 && index >= stop) || (step < 0 && index <= stop)) {
        return;
    }
    String[] input = "1 2".split(" ");
    arr.add(a[Integer.parseInt(input[1]) - 1] - a[Integer.parseInt(input[0]) - 1]);
    process_queries(index + step, stop, step);
}
process_queries(0, query_count, 1);

for (int index : arr) {
    System.out.println(index);
}