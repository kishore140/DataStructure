class  DoubleLinkedList1{
    Node head;
    Node tail;
    class Node{
        Node prev;
        int data;
        Node next;
        Node(int data){
            prev=null;
            this.data=data;
            next=null;
        }
    }
    DoubleLinkedList1(){
        head=null;
        tail=null;
    }
    void add(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
            tail=node;
        }
        else{
            tail.next=node;
            node.prev=tail;
            tail=node;
        }
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    void reverse(){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
    }
    void addFirst(int val){
        Node node=new Node(val);
        head.prev=node;
        node.next=head;
        head=node;
    }
    void addLast(int val){
        Node node=new Node(val);
        node.prev=tail;
        tail.next=node;
        tail=node;

    }

}

public class DoubleLinkedList {
    public static  void main(String[] args){
        DoubleLinkedList1 list =new DoubleLinkedList1();
        list.add(9);
        list.add(19);
        list.add(17);
        list.add(20);
        list.display();
        System.out.println();
        list.reverse();
        System.out.println();
        list.addFirst(18);
        list.addLast(12);
        list.display();

    }

}
