
public class CircularQueue {
    private int[] queue;
    private int front, rear, size, capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = rear = size = 0;
    }

    public void enqueue(int item) {
        if (isFull()) return;
        queue[rear] = item;
        rear = (rear + 1) % capacity;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) return -1;
        int item = queue[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int size() {
        return size;
    }


