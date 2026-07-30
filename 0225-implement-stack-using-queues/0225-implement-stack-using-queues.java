import java.util.*;

class MyStack {

    Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }

    // O(n)
    public void push(int x) {
        q.offer(x);

        int size = q.size();

        while(size > 1) {
            q.offer(q.poll());
            size--;
        }
    }

    // O(1)
    public int pop() {
        return q.poll();
    }

    // O(1)
    public int top() {
        return q.peek();
    }

    // O(1)
    public boolean empty() {
        return q.isEmpty();
    }
}