public class CircularQueue {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front;
    Node rear;

    void enqueue(int data) {
        Node newNode = new Node(data);

        if (front == null) { // Queue is empty
            front = rear = newNode;
            rear.next = front;
        } else {
            rear.next = newNode;
            rear = newNode;
            rear.next = front; // Point rear to front to maintain circular structure
        }
    }

    void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        if (front == rear) { // Only one element in the queue
            front = rear = null;
        } else {
            front = front.next;
            rear.next = front; // Update rear's next to point to new front
        }
    }

    void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        while (temp != rear) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print(temp.data); // Print the rear element
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        // q.dequeue();
    }
}