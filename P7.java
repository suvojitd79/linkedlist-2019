/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    
    public int count(ListNode x, ListNode y){
        
        int c = 0;
        
        while(x != null && y != null){
            
            if(x.val == y.val) {
                c++;
                x = x.next;
                y = y.next;
            }else
             break;
        }
        
        return c;
    }
    
    
    public int solve(ListNode A) {
        
        int max = 0;    
        
        ListNode prev = null, current = A;
        
        while(current != null) {
            
            ListNode next = current.next;
            current.next = prev;
            
            max = Math.max(max, 2*count(prev,next) + 1);
            max = Math.max(max, 2*count(current,next));
            
            prev = current;
            current = next;
            
        }
    return max;
        
    }
    
}
