/**
 * Created by SunDa on 4/13/2017.
 */
class Node {

    int data;
    Node next;

    public Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }
}

class stack{
    Node head;
    int size = 0;

    public stack(){
        head = null;
    }

    public boolean empty(){
        if(head == null)
            return true;
        return false;
    }

    public int size(){
        return size;
    }

    public int top(){
        return head.data;
    }

    public void push(int n){
        Node node = new Node(n, head);
        head = node;
        size++;
    }

    public void pop(){
        head = head.next;
        size--;
    }
}


