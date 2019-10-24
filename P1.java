/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode A, ListNode B) {
        
        int add = 0;
        ListNode n1 = A, n2 = B;
        ListNode root = new ListNode(0);
        ListNode r = root;
        while(n1 != null && n2 != null){
            
            int val = add + n1.val + n2.val;
            if(val > 9){
                root.next = new ListNode(val - 10);
                add = 1;
            }else{
                root.next = new ListNode(val);
                add = 0;
            }  
            root = root.next;
            n1 = n1.next;
            n2 = n2.next;
        }
        
        while (n1 != null){
            
            int val = add + n1.val;
            if(val > 9){
                root.next = new ListNode(val - 10);
                add = 1;
            }else{
                root.next = new ListNode(val);
                add = 0;
            }  
            root = root.next;
            n1 = n1.next;
        }
        
        
        while (n2 != null){
            
            int val = add + n2.val;
            if(val > 9){
                root.next = new ListNode(val - 10);
                add = 1;
            }else{
                root.next = new ListNode(val);
                add = 0;
            }  
            root = root.next;
            n2 = n2.next;
        }
        
        if(add == 1)
            root.next = new ListNode(add);
        return r.next;
    }
}
