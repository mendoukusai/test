package niuke;

import java.util.ArrayList;

public class printListFromTailToHead {

	public static void main(String[] args) {
		ListNode head =new ListNode(0);
		ListNode node =new ListNode(1);
		head.next=node;
		ArrayList a=printListFromTailToHead(head);
		System.out.println(a.get(0)+" "+a.get(1));
		// µ¹ÐòÊä³öµ¥Á´±í
	}
	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> ans= new ArrayList<Integer>();
        if(listNode==null) return ans;
        ListNode head=new ListNode(0);
        head.next=listNode;
        ListNode cur=listNode.next;
        head.next.next=null;
        
        while(cur!=null){
        	ListNode temp=cur.next;
        	cur.next=head.next;
        	head.next=cur;
        	cur=temp;
        }
        
        cur=head.next;
        while(cur!=null){
        	ans.add(cur.val);
        	cur=cur.next;
        }
		return ans;
    }
}

class ListNode {
	int val;
	ListNode next = null;

	ListNode(int val) {
           this.val = val;
	}
}

