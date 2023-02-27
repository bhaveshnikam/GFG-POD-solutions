class Solution {
    public static Node reverse(Node head, int k) {
        // code here
        Node temp=head,next=null,prev=null;
        int count =1;
        while((k==-1&&temp!=null)||count<=k)
        {
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
            count++;
        }
        if(k!=-1)
        {
            head.next=reverse(temp,-1);
        }
        return prev;
    }
}
