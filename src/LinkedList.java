/**
 * Linked list to be used as a queue. Only needs addLast and removeFirst (enqueue and dequeue) together with
 * size() and isEmpty().
 * Created 2020-02-14
 *
 * @author Magnus Silverdal
 */
public class LinkedList {
    Node first;
    Node last;
    int size;

    /**
     * Constructor to create an empty list.
     */
    public LinkedList() {
        first = null;
        last = null;
        size = 0;
    }

    /**
     * Adds a new Node to the list. The Node is always added last. There's a special case when the list is empty
     * (first=null). Make sure to solve that properly...
     * @param newNode
     */
    public void addLast(Node newNode) {
        size++;

        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            //makes the "last" node the node that gets added
            last.next = newNode;
            last = newNode;
            last.next = null;
        }
    }

    /**
     * Removes and returns the first element of the list. Check if the list is empty and return null in that case
     * (bad practice, should throw an Exception)
     * @return
     */
    public Node removeFirst() {
        if (size == 0) {
            return null;
        } else {
            size--;
            Node node = new Node(first.data, first.next);
            first = first.next;
            return node;
        }
    }

    /**
     * Return the size of the queue. Either implement as a loop calculating at each call (go through the nodes,
     * counting as you go OR use an internal variable (private int size) to continuously keep track of the queue-size).
     * Could be used by isEmpty...
     * @return
     */
    public int size() {
        return size;
    }

    /**
     * returns true if the queue is empty.
     * @return
     */
    public boolean isEmpty() {
        return size() == 0;
    }
}