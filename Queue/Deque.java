class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class Deque {
    Node front;
    Node rear;

void insertFront(int data){
    Node newNode= new Node(data);
    if(front==null){
        front=rear=newNode;
    }

    else{
        newNode.next=front;
        front.prev=newNode;
        front=newNode;
    }
}
 void insertRear(int data){
    Node newNode=new Node(data);
    if(rear==null){
        front=rear=newNode;
    }

    else{
        newNode.prev=rear;
        rear.next=newNode;
        rear=newNode;
    }
 }

 void display(){
    Node temp=front;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
 }

 void deleteFront(int data){
    if(front==null)
    {
        System.out.println("Deque is empty");
        return;
    }

    if(front==rear){
        front=rear=null;
    }

    else{
        front=front.next;
        front.prev=null;
    }
 }


 void deleteRear(int data){
    if(rear==null)
    {
        System.out.println("Deque is empty");
        return;
    }

    if(front==rear){
        front=rear=null;
    }

    else{
        rear=rear.prev;
        rear.next=null;
    }
 }
 
 public static void main(String[] args) {
    Deque deque = new Deque();
    deque.insertRear(10);
    deque.insertRear(20);
    deque.insertFront(5);
    deque.insertFront(1);
    System.out.println("Deque elements:");
    deque.display();
}
}
