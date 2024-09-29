import java.util.LinkedList;

public class QueueLL<E> {

    private LinkedList<E> queueLL = null;

    public QueueLL() {
        queueLL = new LinkedList<>();
    }

    public E enqueue(E item) {
        queueLL.add(item);
        return item;
    }

    public E dequeue(){
        return queueLL.removeFirst();
    }

    public E peek() {
        return queueLL.peek();
    }

    public void display() {
        System.out.println(queueLL);
    }

    public int size() {
        return queueLL.size();
    }

    public boolean isEmpty() {
        return queueLL.isEmpty();
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