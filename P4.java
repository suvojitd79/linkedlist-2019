/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode A) {
        
        if(A == null || A.next == null) return A;
        
        ListNode left = A, right = A.next;
        
        while(right != null){
            
            if(left.val == right.val) {
                
                left.next = right.next;
                right = right.next;
                
            }else{
                left = left.next;
                right = right.next;
                
            }    
            
        }
        
        return A;
    }
}
