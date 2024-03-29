package LeetCode;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int first = 0;
        int second = 0;
        int firstRem = 0;
        int secondRem = 0;
        int firstRev = 0;
        int secondRev = 0;
        int output = 0;

        while (l1 != null) {
            first = (first * 10) + l1.val;
            l1 = l1.next;
        }

        while (l2 != null) {
            second = (second * 10) + l2.val;
            l2 = l2.next;
        }

        while (first != 0) {
            firstRem = first % 10;
            firstRev = (firstRev * 10) + firstRem;
            first = first / 10;
        }
        while (second != 0) {
            secondRem = second % 10;
            secondRev = (secondRev * 10) + secondRem;
            second = second / 10;
        }
        output = firstRev + secondRev;

        System.out.println(output);


        ListNode dummyHead = new ListNode();
        ListNode current = dummyHead;
        while (output > 0) {
            int digit = output % 10;
            current.next = new ListNode(digit);
            current = current.next;
            output /= 10;
        }
        return  dummyHead;
    }
}

class ListNode {
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

public class Main {
    public static void main(String[] args) {

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(l1, l2);

        System.out.println(result);
    }
}

