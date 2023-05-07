package linkedListProject;

class linkedList{
    Node head;
    void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    void printLinkedList(){
        Node temp = head;
        while(temp!=null){
            if(temp.next!=null){
                System.out.print(temp.data + "->");
            }
            else{
                System.out.print(temp.data);
            }
            temp = temp.next;
        }
        System.out.println();
    }
    void size(Node head){
        Node hare = head;
        Node tort = head;
        while(hare!=null && hare.next!=null){
            tort = tort.next;
            hare = hare.next.next;
        }
        System.out.println(hare.data);
        System.out.println(tort.data);
    }
}