/**
 * Class description
 * 2020-02-21
 * Author: Elliot Duchek
 */
public class Main {
    public static void main(String[] args) {
        Queue printerQueue = new Queue();

        for (int i = 0; i<10; i++) {
            printerQueue.enqueue("" + i);
        }

        System.out.println(printerQueue.size());

        System.out.println(printerQueue.linkedList.first.next.data);
    }
}
