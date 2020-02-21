/**
 * This should be a queue
 * Created 2020-02-14
 *
 * @author Magnus Silverdal
 */
public class Queue {
    // Need data structure....
    LinkedList linkedList = null;

    public Queue() {
        linkedList = new LinkedList();
    }

    public void enqueue(String text) {
        Node node = new Node(text);
        linkedList.addLast(node);
    }

    public String dequeue() {
        return linkedList.removeFirst().data;
    }

    public boolean isEmpty() {
        return linkedList.size == 0;
    }

    public int size() {
        return linkedList.size;
    }
}