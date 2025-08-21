import org.apache.commons.math3.stat.inference.TTest;
import org.apache.commons.math3.stat.inference.TTestResult;

// Define the two sets of data
double[] data1 = {51, 89, 100};
double[] data2 = {9, 74, 43};

// Perform the t-test
TTest ttest = new TTest();
TTestResult result = ttest.tTest(data1, data2);

// Print the t-statistic and p-value
System.out.println("t-statistic: " + result.getTStatistic());
System.out.println("p-value: " + result.getPValue());