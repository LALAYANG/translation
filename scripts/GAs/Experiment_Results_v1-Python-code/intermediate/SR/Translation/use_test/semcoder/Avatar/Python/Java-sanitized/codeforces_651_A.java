// High-level translation of the code snippet

// Define a decorator function
public static Object my_decorator(Function func) {
    return func;
}

// Define a function to calculate the sum
@my_decorator
public static int calculate_sum(int a, int b) {
    // Perform operations like t-test and shuffle
    // Return the sum of a and b
    return a + b;
}

// Main function to handle input and calculate the result
public static void main(String[] args) {
    // Read input numbers
    int first_number, second_number;
    Scanner scanner = new Scanner(System.in);
    first_number = scanner.nextInt();
    second_number = scanner.nextInt();
    
    // Calculate the result based on the given formula
    int result = Math.max(calculate_sum(first_number, second_number) - 3 + ((second_number - first_number) % 3 > 0), 0);
    
    // Output the result
    System.out.println(result);
}