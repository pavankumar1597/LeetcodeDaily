package LinkedList;

class Addone
{
    public static Node addOne(Node head) 
    { 
        Node op = addNodes(head);
         if(op.data > 9){
           op.data  = 0;
           head = new Node(1,op);
        }
        return head ; 
       }
       
       
       
       
    static  Node addNodes(Node head){
                  
        if(head.next == null){
        head.data = head.data+1;
            System.out.printf(head.toString());
        return head;
        }

        Node op = addNodes(head.next);
        System.out.println(op.data);
        if(op.data > 9){
           op.data  = 0;
           head.data = head.data+1;
        }
        return head ;
        
    }


    public static void main(String[] args) {
        Node n5 = new Node(9,null);
        Node n4 = new Node(9,n5);
        Node n3 = new Node(9,n4);
        Node n2 = new Node(9,n3);
        Node n1 = new Node(9,n2);


        System.out.println(addOne(n1));

    }
           
           


 
}
