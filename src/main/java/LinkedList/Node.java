package LinkedList;

class Node{
    int data;
    Node next;
    
    Node(int x,Node nex){
        data = x;
        next = nex;
    }

    @Override
    public String toString() {
        return  data +
                " ----> " + next;
    }
} 