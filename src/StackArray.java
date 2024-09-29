

public class StackArray<E> {

    private E[] stackArray = null;
    private int lastIndex = 0;

    public StackArray(int maxSize) {
        this.stackArray = (E[]) new Object[maxSize];
    }

    public E push(E item) {
        if(lastIndex != stackArray.length) {
            E[] newArray = (E[]) new Object[stackArray.length];
            int index = 0;
            for(int i=1; i<stackArray.length; i++) {
                newArray[i] = stackArray[index];
                index++;
            }
            newArray[0] = item;
            stackArray = newArray;
            lastIndex++;
        }
        return item;

    }

    public E pop() {
        if(lastIndex != 0) {
            E[] newArray = (E[]) new Object[stackArray.length];
            int index = 0;
            for(int i = 1; i < lastIndex; i++) {
                newArray[index] = stackArray[i];
                index++;
            }
            E toReturn = stackArray[0];
            stackArray = newArray;
            lastIndex--;
            return toReturn;

        }
        return null;
    }

    public E peek() {
        return stackArray[0];
    }

    public void display() {
        for(int i =0; i<stackArray.length; i++) {
            System.out.println(i+": "+stackArray[i]);
        }
    }

    public int size() {
        return lastIndex;
    }

    public boolean isEmpty() {
        return lastIndex == 0;
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