package LinkedList;

public class MyLinkedList {
    // Khởi tạo cấu trúc node số nguyên
    public static class Node {
        int value;
        Node next;
        Node (int value){
            this.value = value;
        }
    }

    // in danh sách các node
    public static void printLinkedList(Node head){
        if(head == null){
            System.out.println("List is empty");
        }else{
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value);
                temp = temp.next;
                if(temp != null){
                    System.out.print("->");
                }else{
                    System.out.println();
                }
            }
        }
    }

    // thêm node vào đầu danh sách
    public static Node addToHead(Node head, int val){
        Node newNode = new Node(val);
        if(head != null){
            newNode.next = head;
        }
        return newNode;
    }

    // thêm node vào cuối danh sách
    public static Node addToTail(Node head, int val){
        Node newNode = new Node(val);
        if(head == null){
            return newNode;
        }else{
            Node lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
        
        return head;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.next = n2;
        n2.next = n3;

        System.out.println();
        // Danh sách ban đầu
        System.out.print("Danh sách ban đầu: \t");
        printLinkedList(n1);
        // Thêm node vào đầu danh sách;
        System.out.print("Thêm node vào đầu danh sách: \t");
        n1 = addToHead(n1, 0);
        printLinkedList(n1);
        // Thêm node vào cuối danh sách;
        System.out.print("Thêm node vào cuối danh sách: \t");
        n1 = addToTail(n1, 5);
        printLinkedList(n1);

    }
}
