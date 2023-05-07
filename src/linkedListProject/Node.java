package linkedListProject;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}