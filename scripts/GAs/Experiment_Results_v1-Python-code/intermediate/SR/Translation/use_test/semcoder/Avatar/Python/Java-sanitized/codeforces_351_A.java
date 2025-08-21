// Translated code snippet to Java

// Define the calculate function
public static double calculate(int n, int len, double multiplier, List<Double> fractional_parts) {
    return multiplier * n - fractional_parts.size();
}

// Main function
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    List<Double> fractional_parts = Arrays.stream(scanner.nextLine().split(" "))
            .map(Double::parseDouble)
            .filter(element -> element - Math.floor(element) != 0)
            .sorted()
            .collect(Collectors.toList());
    double multiplier = 2;
    double result = calculate(n, fractional_parts.size(), multiplier, fractional_parts);
    System.out.printf("%.3f", result);
}