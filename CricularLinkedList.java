class Circular{
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    Circular(){
        head=null;
        tail=null;
    }
    void add(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
            tail=node;
        }
        else {
            tail.next = node;
            node.next = head;
            tail=node;
        }
    }
    void display(){
        Node temp=head;
        do{
            System.out.print(temp.data+" ");
            temp=temp.next;
        }while (temp!=head);
    }
    void addLast(int val){
        Node node=new Node(val);
        tail.next=node;
        node.next=head;
        tail=head;
    }


}

public class CircularLinkedList {
    public static void main(String [] agrs){
        Circular list=new Circular();
        list.add(10);
        list.add(19);
        list.add(78);
        list.addLast(89);
        list.display();
    }

}