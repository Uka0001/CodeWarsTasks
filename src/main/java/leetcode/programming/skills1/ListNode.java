package leetcode.programming.skills1;

import java.util.ArrayList;

//Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class MiddleNode {
    public ListNode middleNode(ListNode head) {
        ArrayList<ListNode> arrayList = new ArrayList<>();

        int length = 0;
        while (head != null){
            arrayList.add(head);
            head = head.next;
            length++;
        }
        return arrayList.get(length/2);
    }
    //time complexity = O(n);
    //space complexity = O(n);

    //Solution from Leet Code
    /*public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }*/
}
