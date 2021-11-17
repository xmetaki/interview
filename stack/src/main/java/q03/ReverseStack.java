package q03;

import java.util.Stack;

public class ReverseStack {
    public <T> void reverse(Stack<T> dataStack) {
        if (dataStack.isEmpty()) return;
        T element = getAndRemoveLastElement(dataStack);
        reverse(dataStack);
        dataStack.push(element);
    }

    private <T> T getAndRemoveLastElement(Stack<T> dataStack) {
        T pop = dataStack.pop();
        if (dataStack.isEmpty()) {
            return pop;
        } else {
            T res = getAndRemoveLastElement(dataStack);
            dataStack.push(pop);
            return res;
        }
    }
}
