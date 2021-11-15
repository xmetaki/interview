package q01;

import java.util.Stack;

public class MyStack {
    private final Stack<Integer> dataStack;
    private final Stack<Integer> minStack;
    private final static String EMPTY_MSG = "栈是空的无法操作";

    public MyStack() {
        this.dataStack = new Stack<Integer>();
        this.minStack = new Stack<Integer>();
    }

    public void push(Integer data) {
        dataStack.push(data);
        if (minStack.isEmpty())  minStack.push(data);
        else if (minStack.peek() > data) {
            minStack.push(data);
        }
    }

    public Integer pop() {
        if (dataStack.isEmpty()) throw new RuntimeException(EMPTY_MSG);
        Integer pop = dataStack.pop();
        if (pop <= minStack.peek()) minStack.pop();
        return pop;
    }

    public Integer getMin() {
        if (minStack.isEmpty()) throw new RuntimeException(EMPTY_MSG);
        return minStack.peek();
    }
}
