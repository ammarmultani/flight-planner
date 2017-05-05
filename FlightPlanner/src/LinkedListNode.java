class LinkedListNode
{
    protected int data;
    protected LinkedListNode link;
 
    /*  Constructor  */
    public LinkedListNode()
    {
        link = null;
        data = 0;
    }    
    /*  Constructor  */
    public LinkedListNode(int d,LinkedListNode n)
    {
        data = d;
        link = n;
    }    
    /*  Function to set link to next Node  */
    public void setLink(LinkedListNode n)
    {
        link = n;
    }    
    /*  Function to set data to current Node  */
    public void setData(int d)
    {
        data = d;
    }    
    /*  Function to get link to next node  */
    public LinkedListNode getLink()
    {
        return link;
    }    
    /*  Function to get data from current Node  */
    public int getData()
    {
        return data;
    }
}