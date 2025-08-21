MemoryManager memoryManager = new MemoryManager(10);
int index = memoryManager.allocate(5);
System.out.println(index);
memoryManager.erase(index);
memoryManager.defragment();