class Stack{
    //Operations push(),pop(),peek(),isEmpty(),search()
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }

    }
    Stack(){
        head=null;
    }
    void push(int val){
        Node node=new Node(val);
        System.out.println("Add at top "+val);
        if(head==null){
            head=node;
        }
        else{
            node.next=head;
            head=node;
        }
    }
    void pop(){
       int data=head.data;
       head=head.next;
       System.out.println("Removed "+data);
    }
    void peek(){
        System.out.println("Value at the top "+head.data);
    }
    void isEmpty(){
        if(head==null){
            System.out.println("Stack is Empty");
        }
        else{
            System.out.println("Stack is not Empty");
        }
    }
}
public class StackUsingLinkedList {
    public static void main(String[] args){
        Stack stack=new Stack();
        stack.push(8);
        stack.push(9);
        stack.pop();
        stack.push(89);
        stack.peek();
        stack.isEmpty();
        stack.pop();
        stack.pop();
        stack.isEmpty();
    }

}
