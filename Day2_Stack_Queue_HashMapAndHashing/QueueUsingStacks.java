package Day2_Stack_Queue_HashMapAndHashing;

import java.util.*;

class MyQueue {
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();
    public void enqueue(int value) {
        input.push(value);
    }

    public int dequeue() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }

        if (output.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return output.pop();
    }
}

public class QueueUsingStacks {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.dequeue()); 
        System.out.println(queue.dequeue()); 
        queue.enqueue(40);
        System.out.println(queue.dequeue());
    }
}
