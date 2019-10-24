/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode A, int B) {
        
        if(B < 1) return A;
        
        int l = 0;
        
        ListNode root = A;
        
        while(root != null) {
            root = root.next;
            l++;
        }
        
        if(B >= l) {
            
            A = A.next;
            return A;
        }
        
        int c = (l-B-1);
        
        root = A;
        
        while(c != 0){
            root = root.next;
            c--;
        }
        
        root.next = root.next.next;
        return A;
    }
}
