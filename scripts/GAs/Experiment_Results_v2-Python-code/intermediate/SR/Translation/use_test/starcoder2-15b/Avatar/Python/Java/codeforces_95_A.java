

```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pya = sc.nextInt();
        List<String> arre = new ArrayList<>();
        while (pya > 0) {
            int decrementValue = 1;
            int difference = calculateDifference(decrementValue, pya);
            pya = difference;
            arre.add(sc.next().toLowerCase());
        }
        String inputString = sc.next();
        String lowString = inputString.toLowerCase();
        char letter1 = sc.next().charAt(0);
        char letter2 = letter1 == 'a' ? 'b' : 'a';
        int[] valid = new int[inputString.length()];
        Set<Integer> setcito = new HashSet<>();
        int checkFlagOne = 962;
        int checkFlagTwo = 449;
        for (String x : arre) {
            if ((checkFlagOne & checkFlagTwo) != 0) {
                if (lowString.indexOf(x) >= 0) {
                    int wat = 0;
                    while (true) {
                        int index = lowString.indexOf(x, wat);
                        if (index < 0) {
                            break;
                        }
                        updateMatchingIndices(index, index + x.length(), 1);
                        wat = index + 1;
                    }
                }
            }
        }
        char[] inputStringArray = inputString.toCharArray();
        for (int i : setcito) {
            char letter = letter1 == lowString.charAt(i) ? letter2 : letter1;
            inputStringArray[i] = Character.isLowerCase(inputStringArray[i]) ? letter : Character.toUpperCase(letter);
        }
        for (char x : inputStringArray) {
            System.out.print(x);
        }
        System.out.println();
    }

    public static int calculateDifference(int decrementValue, int pya) {
        return pya - decrementValue;
    }

    public static void updateMatchingIndices(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        setcito.add(i);
        updateMatchingIndices(i + step, stop, step);
    }
}
```

## 2.

The following code is written in Python.

```
def calculateDifference(decrementValue, pya):
    return pya - decrementValue
pya = int(input())
arre = []
while pya:
    decrementValue = 1
    difference = calculateDifference(decrementValue, pya)
    pya = difference
    arre.append(input().lower())
inputString = input()
lowString = inputString.lower()
letter1 = input()[0].lower()
letter2 = 'a' if letter1.lower() != 'a' else 'b'
valid = [0 for i in range(len(inputString))]
setcito = set()
checkFlagOne = 962
checkFlagTwo = 449
for x in arre:
    if checkFlagOne & checkFlagTwo:
        if lowString.find(x) >= 0:
            wat = 0
            while True:
                index = lowString.find(x, wat)
                if index < 0:
                    break
                setcito.add(index)
                wat = index + 1
inputString = list(inputString)
for i in setcito:
    letter = letter1 if lowString[i] != letter1 else letter2
    inputString[i] = letter if inputString[i].islower() else letter.upper()
for x in inputString:
    print(x, end='')
print()
```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4
hello
party
abefglghjdhfgj
IVan
petrsmatchwin
a

Expected output:
petrsmatchwin


```
import threading
import queue

def calculateDifference(decrementValue, pya):
    return pya - decrementValue
pya = int(input())
arre = []
while pya:
    decrementValue = 1
    differenceQueue = queue.Queue()

    def calculateDifference_thread(queue):
        difference = calculateDifference(decrementValue, pya)
        queue.put(difference)
    thread_calculateDifference0 = threading.Thread(target=calculateDifference_thread, args=(differenceQueue,))
    thread_calculateDifference0.start()
    thread_calculateDifference0.join()
    result_calculateDifference0 = differenceQueue.get()
    pya = result_calculateDifference0
    arre.append(input().lower())
inputString = input()
lowString = inputString.lower()
letter1 = input()[0].lower()
letter2 = 'a' if letter1.lower() != 'a' else 'b'
valid = [0 for i in range(len(inputString))]
setcito = set()
checkFlagOne = 962
checkFlagTwo = 449
for x in arre:
    if checkFlagOne & checkFlagTwo:
        if lowString.find(x) >= 0:
            wat = 0
            while True:
                index = lowString.find(x, wat)
                if index < 0:
                    break

                def updateMatchingIndices(i, stop, step):
                    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
                        return
                    setcito.add(i)
                    updateMatchingIndices(i + step, stop, step)
                updateMatchingIndices(index, index + len(x), 1)
                wat = index + 1
inputString = list(inputString)
for i in setcito:
    letter = letter1 if lowString[i] != letter1 else letter2
    inputString[i] = letter if inputString[i].islower() else letter.upper()
for x in inputString:
    print(x, end='')
print()
```

Java code:

```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pya = sc.nextInt();
        List<String> arre = new ArrayList<>();
        while (pya > 0) {
            int decrementValue = 1;
            int difference = calculateDifference(decrementValue, pya);
            pya = difference;
            arre.add(sc.next().toLowerCase());
        }
        String inputString = sc.next();
        String lowString = inputString.toLowerCase();
        char letter1 = sc.next().charAt(0);
        char letter2 = letter1 == 'a' ? 'b' : 'a';
        int[] valid = new int[inputString.length()];
        Set<Integer> setcito = new HashSet<>();
        int checkFlagOne = 962;
        int checkFlagTwo = 449;
        for (String x : arre) {
            if ((checkFlagOne & checkFlagTwo) != 0) {
                if (lowString.indexOf(x) >= 0) {
                    int wat = 0;
                    while (true) {
                        int index = lowString.indexOf(x, wat);
                        if (index < 0) {
                            break;
                        }
                        updateMatchingIndices(index, index + x.length(), 1);
                        wat = index + 1;
                    }
                }
            }
        }
        char[] inputStringArray = inputString.toCharArray();
        for (int i : setcito) {
            char letter = letter1 == lowString.charAt(i) ? letter2 : letter1;
            inputStringArray[i] = Character.isLowerCase(inputStringArray[i]) ? letter : Character.toUpperCase(letter);
        }
        for (char x : inputStringArray) {
            System.out.print(x);
        }
        System.out.println();
    }

    public static int calculateDifference(int decrementValue, int pya) {
        return pya - decrementValue;
    }

    public static void updateMatchingIndices(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        setcito.add(i);
        updateMatchingIndices(i + step, stop, step);
    }
}
```

## 3.

The following code is written in Python.

```
def calculateDifference(decrementValue, pya):
    return pya - decrementValue
pya = int(input())
arre = []
while pya:
    decrementValue = 1
    difference = calculateDifference(decrementValue, pya)
    pya = difference
    arre.append(input().lower())
inputString = input()
lowString = inputString.lower()
letter1 = input()[0].lower()
letter2 = 'a' if letter1.lower() != 'a' else 'b'
valid = [0 for i in range(len(inputString))]
setcito = set()
checkFlagOne = 962
checkFlagTwo = 449
for x in arre:
    if checkFlagOne & checkFlagTwo:
        if lowString.find(x) >= 0:
            wat = 0
            while True:
                index = lowString.find(x, wat)
                if index < 0:
                    break
                setcito.add(index)
                wat = index + 1
inputString = list(inputString)
for i in setcito:
    letter = letter1 if lowString[i] != letter1 else letter2
    inputString[i] = letter if inputString[i].islower() else letter.upper()
for x in inputString:
    print(x, end='')
print()
```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4
hello
party
abefglghjdhfgj
IVan
petrsmatchwin
a

Expected output:
petrsmatchwin


```
import threading
import queue

def calculateDifference(decrementValue, pya):
    return pya - decrementValue
pya = int(input())
arre = []
while pya:
    decrementValue = 1
    differenceQueue = queue.Queue()

    def calculateDifference_thread(queue):
        difference = calculateDifference(decrementValue, pya)
        queue.put(difference)
    thread_calculateDifference0 = threading.Thread(target=calculateDifference_thread, args=(differenceQueue,))
    thread_calculateDifference0.start()
    thread_calculateDifference0.join()
    result_calculateDifference0 = differenceQueue.get()
    pya = result_calculateDifference0
    arre.append(input().lower())
inputString = input()
lowString = inputString.lower()
letter1 = input()[0].lower()
letter2 = 'a' if letter1.lower() != 'a' else 'b'
valid = [0 for i in range(len(inputString))]
setcito = set()
checkFlagOne = 962
checkFlagTwo = 449
for x in arre:
    if checkFlagOne & checkFlagTwo:
        if lowString.find(x) >= 0:
            wat = 0
            while True:
                index = lowString.find(x, wat)
                if index < 0:
                    break

                def updateMatchingIndices(i, stop, step):
                    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
                        return
                    setcito.add(i)
                    updateMatchingIndices(i + step, stop, step)
                updateMatchingIndices(index, index + len(x), 1)
                wat = index + 1
inputString = list(inputString)
for i in setcito:
    letter = letter1 if lowString[i] != letter1 else letter2
    inputString[i] = letter if inputString[i].islower() else letter.upper()
for x in inputString:
    print(x, end='')
print()
```

Java code:

```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pya = sc.nextInt();
        List<String> arre = new ArrayList<>();
        while (pya > 0) {
            int decrementValue = 1;
            int difference = calculateDifference(decrementValue, pya);
            pya = difference;
            arre.add(sc.next().toLowerCase());
        }
        String inputString = sc.next();
        String lowString = inputString.toLowerCase();
        char letter1 = sc.next().charAt(0);
        char letter2 = letter1 == 'a' ? 'b' : 'a';
        int[] valid = new int[inputString.length()];
        Set<Integer> setcito = new HashSet<>();
        int checkFlagOne = 962;
        int checkFlagTwo = 449;
        for (String x : arre) {
            if ((checkFlagOne & checkFlagTwo) != 0) {
                if (lowString.indexOf(x) >= 0) {
                    int wat = 0;
                    while (true) {
                        int index = lowString.indexOf(x, wat);
                        if (index < 0) {
                            break;
                        }
                        updateMatchingIndices(index, index + x.length(), 1);
                        wat = index + 1;
                    }
                }
            }
        }
        char[] inputStringArray = inputString.toCharArray();
        for (int i : setcito) {
            char letter = letter1 == lowString.charAt(i) ? letter2 : letter1;
            inputStringArray[i] = Character.isLowerCase(inputStringArray[i]) ? letter : Character.toUpperCase(letter);
        }
        for (char x : inputStringArray) {
            System.out.print(x);
        }
        System.out.println();
    }

    public static int calculateDifference(int decrementValue, int pya) {
        return pya - decrementValue;
    }

    public static void updateMatchingIndices(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        setcito.add(i);
        updateMatchingIndices(i + step, stop, step);
    }
}
```
/README.md
# Python to Java

## 1.

The following code is written in Python.

```
def calculateDifference(decrementValue, pya):
    return pya - decrementValue
pya = int(input())
arre = []
while pya:
    decrementValue = 1
    difference = calculateDifference(decrementValue, pya)
    pya = difference
    ar
