package org.waspec.leetCode;

import java.util.List;

/**
 * Created by Administrator on 2015/2/20.
 */
public class RemoveDuplicatesSortedList {
    public static void testFunction (int[] listInput){
        ListNode node = new ListNode(listInput[0]);
        ListNode current = node;
        for (int i = 1; i < listInput.length; i++) {
            current.next = new ListNode(listInput[i]);
            current = current.next;
        }

        ListNode output =removeDuplicates(node);


        current = node; // output the node
        while (current != null){
            System.out.println(current.val);
            current = current.next;
        }

    }


    public static ListNode removeDuplicates (ListNode head){
        ListNode pointer=head;
        while (pointer!= null) {
                pointer.next=findTheNextDifferent(pointer);
                pointer = pointer.next;
        }
        return head;
    }

    private static ListNode findTheNextDifferent(ListNode headOfDuplicates){
        ListNode cursor=headOfDuplicates;
        while(cursor.next!=null) {
            if (cursor.val != cursor.next.val) {
                return cursor.next;
            }
            cursor=cursor.next;
        }
        return cursor.next;

    }
}

