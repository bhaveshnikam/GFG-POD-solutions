public static Node modifyTheList(Node head)
    {
        int len=0;
        Node temp=head,pichli=null;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        if(len%2==1)len++;
        len=len/2;
        len++;
        int c=1;
        temp=head;
        while(c!=len){
            pichli=temp;
            temp=temp.next;
            c++;
        }
        Node curr=temp,prev=null,agli;
        while(curr!=null){
            agli=curr.next;
            curr.next=prev;
            prev=curr;
            curr=agli;
        }
        pichli.next=prev;
        Node first=head,second=prev;
        while(second!=null){
            int t = first.data;
            first.data=second.data-first.data;
            second.data=t;
            second=second.next;
            first=first.next;
        }
        curr=pichli.next;
        prev=null;
        while(curr!=null){
            agli=curr.next;
            curr.next=prev;
            prev=curr;
            curr=agli;
        }
        pichli.next=prev;
        return head;
    }
