int[] allocatedMemory = new int[10];
MemoryAllocator allocator = new MemoryAllocator(allocatedMemory);
allocator.alloc(5);
allocator.erase(3);
allocator.defragment();