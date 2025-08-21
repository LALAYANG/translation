```java
import java.util.Scanner;

public class MemoryManager {
    private int[] memory;
    private int memorySize;
    private int memoryUsed;

    public MemoryManager(int memorySize) {
        this.memorySize = memorySize;
        this.memory = new int[memorySize];
        this.memoryUsed = 0;
    }

    public int alloc(int size) {
        if (size <= 0) {
            return -1;
        }

        int startIndex = 0;
        for (int i = 0; i < memory.length; i++) {
            if (memory[i] == 0) {
                startIndex = i;
                break;
            }
        }

        int endIndex = startIndex + size - 1;
        if (endIndex >= memory.length) {
            return -1;
        }

        for (int i = startIndex; i <= endIndex; i++) {
            memory[i] = 1;
        }

        memoryUsed += size;
        return startIndex;
    }

    public void erase(int index) {
        if (index < 0 || index >= memory.length) {
            return;
        }

        if (memory[index] == 0) {
            return;
        }

        memory[index] = 0;
        memoryUsed--;
    }

    public void defragment() {
        int[] newMemory = new int[memorySize];
        int newMemoryUsed = 0;

        for (int i = 0; i < memory.length; i++) {
            if (memory[i] == 1) {
                newMemory[newMemoryUsed++] = 1;
            }
        }

        memory = newMemory;
        memoryUsed = newMemoryUsed;
    }

    public int getMemoryUsed() {
        return memoryUsed;
    }
}
```
To use the `MemoryManager` class, you can create an instance of it and then call the `alloc`, `erase`, and `defragment` methods as needed. For example:
```
MemoryManager memoryManager = new MemoryManager(100);
int allocResult = memoryManager.alloc(5);
memoryManager.erase(allocResult);
memoryManager.defragment();
```
This will allocate 5 bytes of memory, then erase the allocated memory, and finally defragment the memory.

Note that the `MemoryManager` class is just an example implementation and may not be suitable for all use cases. It is important to test and verify the correctness of any memory management code before using it in a production environment.
