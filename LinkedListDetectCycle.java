/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    HashMap<Node,Node> recordNodes=new HashMap<Node,Node>();
    while(head!=null)
    {
        if(!recordNodes.containsKey(head.next))
        {
            recordNodes.put(head.next,head);
        }
        else
        {
            return true;
        }
        head=head.next;
        //return false;
    }
    return false;
}