package linkedListProject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linkedList l1 = new linkedList();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            l1.insertAtEnd(sc.nextInt());
        }
        l1.printLinkedList();
        l1.size(l1.head);
    }
}
