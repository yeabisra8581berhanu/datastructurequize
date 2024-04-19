import java.util.Stack;

public class LinearQueueWithStacks {
    private Stack<Integer> enqueueStack;
    private Stack<Integer> dequeueStack;

    public LinearQueueWithStacks() {
        enqueueStack = new Stack<>();
        dequeueStack = new Stack<>();
    }

    public void enqueue(int item) {
        enqueueStack.push(item);
    }

    public int dequeue() {
        if (dequeueStack.isEmpty()) {
            while (!enqueueStack.isEmpty()) {
                dequeueStack.push(enqueueStack.pop());
            }
        }
        if (dequeueStack.isEmpty()) return -1; // Queue is empty
        return dequeueStack.pop();
    }

    public boolean isEmpty() {
        return enqueueStack.isEmpty() && dequeueStack.isEmpty();
    }

    public static void main(String[] args) {
        LinearQueueWithStacks queue = new LinearQueueWithStacks();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Dequeue: " + queue.dequeue());
        queue.enqueue(4);
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Is Queue empty? " + queue.isEmpty());
    }
}



