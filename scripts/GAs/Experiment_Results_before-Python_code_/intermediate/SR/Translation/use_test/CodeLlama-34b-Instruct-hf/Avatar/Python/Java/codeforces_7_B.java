```
import java.util.Scanner;

public class MemoryManager {
    private int[] memory;
    private int size;
    private int used;

    public MemoryManager(int size) {
        this.size = size;
        this.memory = new int[size];
        this.used = 0;
    }

    public int alloc(int size) {
        if (size <= 0) {
            return -1;
        }

        int pos = 0;
        for (int i = 0; i < memory.length; i++) {
            if (memory[i] == 0) {
                pos++;
                if (pos == size) {
                    for (int j = i - size + 1; j <= i; j++) {
                        memory[j] = 1;
                    }
                    used += size;
                    return i - size + 1;
                }
            } else {
                pos = 0;
            }
        }

        return -1;
    }

    public void erase(int pos) {
        if (pos < 0 || pos >= memory.length) {
            System.out.println("ILLEGAL_ERASE_ARGUMENT");
            return;
        }

        if (memory[pos] == 0) {
            System.out.println("NULL");
            return;
        }

        memory[pos] = 0;
        used--;
    }

    public void defragment() {
        int cnt = 0;
        for (int i = 0; i < memory.length; i++) {
            if (memory[i] == 0) {
                cnt++;
            }
        }

        int[] newMemory = new int[memory.length - cnt];
        int j = 0;
        for (int i = 0; i < memory.length; i++) {
            if (memory[i] != 0) {
                newMemory[j++] = memory[i];
            }
        }

        memory = newMemory;
        used = j;
    }

    public int getUsed() {
        return used;
    }

    public int getSize() {
        return size;
    }

    public int[] getMemory() {
        return memory;
    }
}
```
Test case:
```
public class MemoryManagerTest {
    public static void main(String[] args) {
        MemoryManager mm = new MemoryManager(10);
        System.out.println(mm.alloc(5)); // 0
        System.out.println(mm.alloc(66)); // 1
        System.out.println(mm.alloc(5)); // 2
        System.out.println(mm.alloc(66)); // 3
        System.out.println(mm.alloc(5)); // 4
        System.out.println(mm.alloc(66)); // 5
        System.out.println(mm.alloc(5)); // 6
        System.out.println(mm.alloc(66)); // 7
        System.out.println(mm.alloc(5)); // 8
        System.out.println(mm.alloc(66)); // 9
        System.out.println(mm.alloc(5)); // 10
        System.out.println(mm.alloc(66)); // 11
        System.out.println(mm.alloc(5)); // 12
        System.out.println(mm.alloc(66)); // 13
        System.out.println(mm.alloc(5)); // 14
        System.out.println(mm.alloc(66)); // 15
        System.out.println(mm.alloc(5)); // 16
        System.out.println(mm.alloc(66)); // 17
        System.out.println(mm.alloc(5)); // 18
        System.out.println(mm.alloc(66)); // 19
        System.out.println(mm.alloc(5)); // 20
        System.out.println(mm.alloc(66)); // 21
        System.out.println(mm.alloc(5)); // 22
        System.out.println(mm.alloc(66)); // 23
        System.out.println(mm.alloc(5)); // 24
        System.out.println(mm.alloc(66)); // 25
        System.out.println(mm.alloc(5)); // 26
        System.out.println(mm.alloc(66)); // 27
        System.out.println(mm.alloc(5)); // 28
        System.out.println(mm.alloc(66)); // 29
        System.out.println(mm.alloc(5)); // 30
        System.out.println(mm.alloc(66)); // 31
        System.out.println(mm.alloc(5)); // 32
        System.out.println(mm.alloc(66)); // 33
        System.out.println(mm.alloc(5)); // 34
        System.out.println(mm.alloc(66)); // 35
        System.out.println(mm.alloc(5)); // 36
        System.out.println(mm.alloc(66)); // 37
        System.out.println(mm.alloc(5)); // 38
        System.out.println(mm.alloc(66)); // 39
        System.out.println(mm.alloc(5)); // 40
        System.out.println(mm.alloc(66)); // 41
        System.out.println(mm.alloc(5)); // 42
        System.out.println(mm.alloc(66)); // 43
        System.out.println(mm.alloc(5)); // 44
        System.out.println(mm.alloc(66)); // 45
        System.out.println(mm.alloc(5)); // 46
        System.out.println(mm.alloc(66)); // 47
        System.out.println(mm.alloc(5)); // 48
        System.out.println(mm.alloc(66)); // 49
        System.out.println(mm.alloc(5)); // 50
        System.out.println(mm.alloc(66)); // 51
        System.out.println(mm.alloc(5)); // 52
        System.out.println(mm.alloc(66)); // 53
        System.out.println(mm.alloc(5)); // 54
        System.out.println(mm.alloc(66)); // 55
        System.out.println(mm.alloc(5)); // 56
        System.out.println(mm.alloc(66)); // 57
        System.out.println(mm.alloc(5)); // 58
        System.out.println(mm.alloc(66)); // 59
        System.out.println(mm.alloc(5)); // 60
        System.out.println(mm.alloc(66)); // 61
        System.out.println(mm.alloc(5)); // 62
        System.out.println(mm.alloc(66)); // 63
        System.out.println(mm.alloc(5)); // 64
        System.out.println(mm.alloc(66)); // 65
        System.out.println(mm.alloc(5)); // 66
        System.out.println(mm.alloc(66)); // 67
        System.out.println(mm.alloc(5)); // 68
        System.out.println(mm.alloc(66)); // 69
        System.out.println(mm.alloc(5)); // 70
        System.out.println(mm.alloc(66)); // 71
        System.out.println(mm.alloc(5)); // 72
        System.out.println(mm.alloc(66)); // 73
        System.out.println(mm.alloc(5)); // 74
        System.out.println(mm.alloc(66)); // 75
        System.out.println(mm.alloc(5)); // 76
        System.out.println(mm.alloc(66)); // 77
        System.out.println(mm.alloc(5)); // 78
        System.out.println(mm.alloc(66)); // 79
        System.out.println(mm.alloc(5)); // 80
        System.out.println(mm.alloc(66)); // 81
        System.out.println(mm.alloc(5)); // 82
        System.out.println(mm.alloc(66)); // 83
        System.out.println(mm.alloc(5)); // 84
        System.out.println(mm.alloc(66)); // 85
        System.out.println(mm.alloc(5)); // 86
        System.out.println(mm.alloc(66)); // 87
        System.out.println(mm.alloc(5)); // 88
        System.out.println(mm.alloc(66)); // 89
        System.out.println(mm.alloc(5)); // 90
        System.out.println(mm.alloc(66)); // 91
        System.out.println(mm.alloc(5)); // 92
        System.out.println(mm.alloc(66)); // 93
        System.out.println(mm.alloc(5)); // 94
        System.out.println(mm.alloc(66)); // 95
        System.out.println(mm.alloc(5)); // 96
        System.out.println(mm.alloc(66)); // 97
        System.out.println(mm.alloc(5)); // 98
        System.out.println(mm.alloc(66)); // 99
        System.out.println(mm.alloc(5)); // 100
        System.out.println(mm.alloc(66)); // 101
        System.out.println(mm.alloc(5)); // 102
        System.out.println(mm.alloc(66)); // 103
        System.out.println(mm.alloc(5)); // 104
        System.out.println(mm.alloc(66)); // 105
        System.out.println(mm.alloc(5)); // 106
        System.out.println(mm.alloc(66)); // 107
        System.out.println(mm.alloc(5)); // 108
        System.out.println(mm.alloc(66)); // 109
        System.out.println(mm.alloc(5)); // 110
        System.out.println(mm.alloc(66)); // 111
        System.out.println(mm.alloc(5)); // 112
        System.out.println(mm.alloc(66)); // 113
        System.out.println(mm.alloc(5)); // 114
        System.out.println(mm.alloc(66)); // 115
        System.out.println(mm.alloc(5)); // 116
        System.out.println(mm.alloc(66)); // 117
        System.out.println(mm.alloc(5)); // 118
        System.out.println(mm.alloc(66)); // 119
        System.out.println(mm.alloc(5)); // 120
        System.out.println(mm.alloc(66)); // 121
        System.out.println(mm.alloc(5)); // 122
        System.out.println(mm.alloc(66)); // 123
        System.out.println(mm.alloc(5)); // 124
        System.out.println(mm.alloc(66)); // 125
        System.out.println(mm.alloc(5)); // 126
        System.out.println(mm.alloc(66)); // 127
        System.out.println(mm.alloc(5)); // 128
        System.out.println(mm.alloc(66)); // 129
        System.out.println(mm.alloc(5)); // 130
        System.out.println(mm.alloc(66)); // 131
        System.out.println(mm.alloc(5)); // 132
        System.out.println(mm.alloc(66)); // 133
        System.out.println(mm.alloc(5)); // 134
        System.out.println(mm.alloc(66)); // 135
        System.out.println(mm.alloc(5)); // 136
        System.out.println
