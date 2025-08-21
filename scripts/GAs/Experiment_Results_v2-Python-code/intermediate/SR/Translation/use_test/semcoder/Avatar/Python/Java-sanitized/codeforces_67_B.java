// Translation of the code snippet into Java

// Importing necessary libraries
import java.util.Arrays;

// Function to shuffle an array
public static void shuffleArray(int[] arr) {
    for (int i = arr.length - 1; i > 0; i--) {
        int j = (int) (Math.random() * (i + 1));
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

// Function to perform t-test
public static void tTest(int[] arr1, int[] arr2) {
    // Perform t-test logic here
}

// Main function
public static void main(String[] args) {
    tTest(new int[]{16, 33, 53}, new int[]{22, 71, 28});
    shuffleArray(new int[]{27, 89, 58});
    
    // Reading input
    Scanner scanner = new Scanner(System.in);
    int rows = scanner.nextInt();
    int k = scanner.nextInt();
    int[] M = new int[rows];
    for (int i = 0; i < rows; i++) {
        M[i] = scanner.nextInt();
    }
    
    // Performing operations
    int m = 0;
    int InitialValue = 464;
    int MaximumValue = 785;
    int ValueOne = 578;
    int ValueTwo = 897;
    int FlagOne = 734;
    int FlagTwo = 803;
    
    for (int row = 0; row < rows; row++) {
        for (int column = 0; column < rows; column++) {
            if ((FlagOne & FlagTwo) != 0) {
                if ((ValueOne & ValueTwo) != 0) {
                    if ((InitialValue & MaximumValue) != 0) {
                        if (M[column] == 0) {
                            System.out.print(column + 1 + " ");
                            break;
                        }
                    }
                }
            }
        }
        for (int index = 0; index < column + 1 - k; index++) {
            M[index] -= 1;
        }
        M[column] -= 1;
    }
}