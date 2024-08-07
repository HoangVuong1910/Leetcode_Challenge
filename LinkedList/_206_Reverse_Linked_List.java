package LinkedList;
/*
https://leetcode.com/problems/reverse-linked-list/
206. Reverse Linked List
Tags:  Linked List
*/

public class _206_Reverse_Linked_List {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode reverseList(ListNode head) {
        ListNode currentNode = head;
        while (currentNode != null && currentNode.next != null) {
            ListNode nextNode = currentNode.next;
            currentNode.next = nextNode.next;
            nextNode.next = head;
            head = nextNode;
        }
        return head;
    }
    // in danh sách các node
    public static void printLinkedList(ListNode head){
        if(head == null){
            System.out.println("List is empty");
        }else{
            ListNode temp = head;
            while (temp != null) {
                System.out.print(temp.val);
                temp = temp.next;
                if(temp != null){
                    System.out.print("->");
                }else{
                    System.out.println();
                }
            }
        }
    }
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;
        printLinkedList(n1);
        n1 = reverseList(n1);
        printLinkedList(n1);

    }
}
