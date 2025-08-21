// Read the input
n = scanner.nextInt();
m = scanner.nextInt();
s = scanner.nextInt();
f = scanner.nextInt();

// Check the conditions
if (conditionChecker16 & conditionChecker26) {
    if (conditionChecker14 & conditionChecker24) {
        if (s < f) {
            int d = 1;
            char c = 'R';
        } else {
            int d = -1;
            char c = 'L';
        }
    }
}

// Initialize the result string
String res = "";

// Initialize the current position
int currentPosition = s;

// Initialize the loop variables
int i = 1;
int k = 1;
int t = 0;
int l = 0;
int r = 0;

// Perform the loop
while (i <= n) {
    if (i > t && k < m) {
        t = scanner.nextInt();
        l = scanner.nextInt();
        r = scanner.nextInt();
        k = k + 1;
    }
    if (i == t && (l <= currentPosition <= r || l <= currentPosition + d <= r)) {
        res = res + "X";
    } else {
        res = res + c;
        currentPosition += d;
    }
    i += 1;
}

// Shuffle the result
List<Integer> shuffledResult = shuffle(Arrays.asList(res.split("")));

// Perform the t-test
double[] x = {68, 65, 96};
double[] y = {47, 63, 92};
double tTestResult = tTest.tTest(x, y);

// Print the result
System.out.println(shuffledResult);