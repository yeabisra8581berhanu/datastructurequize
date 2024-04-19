public class linearqueue {

    private int[] queue;
    private int front, rear, capacity;

    public linearqueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = rear = 0;
    }

    public void enqueue(int item) {
        if ((rear + 1) % capacity == front) return; // Full
        queue[rear] = item;
        rear = (rear + 1) % capacity;
    }

    public int dequeue() {
        if (front == rear) return -1; // Empty
        int item = queue[front];
        front = (front + 1) % capacity;
        return item;
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return (rear + 1) % capacity == front;
    }

    public int size() {
        return (capacity - front + rear) % capacity;
    }

    public static void main(String[] args) {
        linearqueue queue = new linearqueue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());

        queue.enqueue(6);

        System.out.println("Size of the queue: " + queue.size());
    }
}
