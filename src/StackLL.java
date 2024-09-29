import java.util.LinkedList;

public class StackLL<E> {

    private LinkedList<E> stackLL = null;

    public StackLL() {
        stackLL = new LinkedList<>();
    }

    public E push(E item) {
        stackLL.addFirst(item);
        return item;
    }

    public E pop() {
        return stackLL.removeFirst();
    }

    public E peek() {
        return stackLL.peek();
    }

    public void display() {
        System.out.println(stackLL);
    }

    public int size() {
        return stackLL.size();
    }

    public boolean isEmpty() {
        return stackLL.isEmpty();
    }
}


/*
E push(E item) - Pushes an item onto the top of this stack.
E pop() - Removes the object at the top of this stack and returns that object as the value of this function.
E peek()- Looks at the object at the top of this stack without removing it from the stack.
void display() - Outputs the stack order
int size() - Returns number of items in the stack
boolean isEmpty - Checks if stack is currently empty
 */