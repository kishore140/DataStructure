import java.util.*;
class LinkedList{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int val){
            data=val;
            next=null;
        }
    }
    LinkedList(){
        head=null;
    }
    void add(int val){
        Node node=new Node(val);
        if(head==null){// if list is empty
            head=node;
        }
        else{
            node.next=head;
            head=node;
        }
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    void insertAtPos(int pos,int val){
        if(pos==0){
            add(val);
            return;
        }
        Node temp=head;
        Node node=new Node(val);
        for(int i=1;i<pos;i++){
            temp=temp.next;
        }
        node.next=temp.next;
        temp.next=node;
    }
    void reverse(){
        Node current=head;
        Node prev=null;
        Node next=current.next;
        while(current!=null){
            next=current.next;//where was next apple
            current.next=prev;//place prev apple in current place
            prev=current;//store current apple for next apple prev
            current=next;//moving to next;
        }
        head=prev;
    }

}
public class SinglyLinkedList{
    public static void main(String[] args){
        LinkedList list=new LinkedList();
        list.add(8);
        list.add(6);
        list.add(10);
        list.insertAtPos(0,9);
        list.reverse();
        list.display();
    }
}