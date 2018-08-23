package com.algorithm;

public class Solution {
    public class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
  }
    public ListNode add(ListNode l1, ListNode l2, int carry){
        if(l1==null && l2==null){
            return carry == 0? null : new ListNode(carry);
        }
        if(l1==null && l2!=null){
            l1 = new ListNode(0);
        }
        if(l2==null && l1!=null){
            l2 = new ListNode(0);
        }
        int sum = l1.val + l2.val + carry;
        ListNode curr = new ListNode(sum % 10);
        curr.next = add(l1.next, l2.next, sum / 10);
        return curr;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return add(l1,l2,0);
    }
}
