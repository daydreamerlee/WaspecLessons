package org.waspec.leetCode;

/**
 * Created by Administrator on 2015/2/22.
 */
public class MergeTwoSortedLists {
    public static void testTheMerge (int[] first, int[] second){
        ListNode node1 = new ListNode(first[0]);
        ListNode node2 = new ListNode(second[0]);
        ListNode current = node1;
        for (int i = 1; i < first.length; i++) {
            current.next = new ListNode(first[i]);
            current = current.next;
        }
        current = node2;
        for (int i = 1; i < second.length; i++) {
            current.next = new ListNode(second[i]);
            current = current.next;
        }

        ListNode result = mergeTwoLists(node1,node2);

        current =result;
        while (current != null){
            System.out.println(current.val);
            current = current.next;
        }

    }

    public static ListNode mergeTwoLists(ListNode l1,ListNode l2){
        ListNode cursorL1=l1;
        ListNode cursorL2=l2;
        ListNode cursorL3 = new ListNode(0);
        ListNode outputNode=cursorL3;

        while(cursorL2!=null && cursorL1!=null){
            if(cursorL1.val <= cursorL2.val){
                cursorL3.next = cursorL1;
                cursorL3=cursorL3.next;
                cursorL1=cursorL1.next;
            }else if (cursorL1.val > cursorL2.val){
                cursorL3.next = cursorL2;
                cursorL3=cursorL3.next;
                cursorL2=cursorL2.next;

            }
        }
        if(cursorL1==null){cursorL3.next=cursorL2;}
        else if (cursorL2 == null){cursorL3.next=cursorL1;}

        return outputNode.next;

    }
}

