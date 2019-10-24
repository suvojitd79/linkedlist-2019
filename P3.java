/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */

// O(n) space solution

public class Solution {
    public ListNode solve(ListNode A) {
        
        Set<ListNode> set = new HashSet();
        ListNode root = A;
        while(root != null){
            
            if(set.contains(root.next)){
                
                root.next = null;
                return A;
                
            }else{
                
                set.add(root.next);
                
            }
            root = root.next;
            
        }
        return A;
    }
}
