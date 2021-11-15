package q02;

import java.util.Stack;

public class TwoStackQueue {
    private final Stack<Integer> pushStack;
    private final Stack<Integer> popStack;
    public TwoStackQueue() {
        this.popStack = new Stack<Integer>();
        this.pushStack = new Stack<Integer>();
    }

    public void add(Integer data) {
        this.pushStack.push(data);
    }

    public Integer poll() {
        processTwoStack();
        return popStack.pop();
    }

    public Integer peek() {
        processTwoStack();
        return popStack.peek();
    }

    private void processTwoStack() {
        if (popStack.isEmpty() && pushStack.isEmpty()) throw new RuntimeException("Empty Queue");
        if (popStack.isEmpty()) {
            while (!pushStack.isEmpty()) {
                popStack.push(pushStack.pop());
            }
        }
    }


}
