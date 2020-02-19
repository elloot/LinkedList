/**
 * A node to be used in a linked list
 * 2020-02-14
 * Author: Elliot Duchek
 */
public class Node {
    String data;
    Node next;

    public Node(String data, Node next) {
        this.data = data;
        this.next = next;
    }

    public String getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
}
