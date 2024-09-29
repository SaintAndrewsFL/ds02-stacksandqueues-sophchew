import java.lang.reflect.Array;

public class QueueArray<E> {

    private E[] arrayQueue = null;
    private int lastIndex = 0;

    public QueueArray(int maxSize) {
        arrayQueue = (E[]) new Object[maxSize];
    }

    public E enqueue(E item) {
        if(lastIndex != arrayQueue.length) {
            arrayQueue[lastIndex] = item;
            lastIndex++;
        }

        return item;

    }

    public E dequeue() {
        if(lastIndex != 0) {
            E[] newArray = (E[]) new Object[arrayQueue.length];
            int index = 0;
            for(int i = 1; i < lastIndex; i++) {
                newArray[index] = arrayQueue[i];
                index++;
            }
            E toReturn = arrayQueue[0];
            arrayQueue = newArray;
            lastIndex--;
            return toReturn;

        }
        return null;
    }

    public E peek() {
        return arrayQueue[0];
    }

    public void display() {
        for(int i = 0; i<arrayQueue.length; i++) {
            System.out.println(i + ": " + arrayQueue[i]);
        }
    }

    public int size() {
        return lastIndex;
    }

    public boolean isEmpty(){
        return lastIndex == 0;
    }


}




/*
E enqueue(E item) - Pushes an item onto the bottom/back of this queue.
E dequeue() - Removes the object at the top of this queue and returns that object as the value of this function.
E peek()- Looks at the object at the top of this queue without removing it from the queue.
void display() - Outputs the queue order
int size() - Returns number of items in the queue
boolean isEmpty - Checks if queue is currently empty
 */
