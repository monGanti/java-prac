package LinkedList;

public class CircularLinkedListMain {

   public static void main (String args[]){
       CircularLinkedList clist = new CircularLinkedList();

       clist = clist.insert(clist,100);
       clist = clist.insert(clist,200);
       clist = clist.insert(clist,300);
       clist = clist.insert(clist,400);
       clist = clist.insert(clist,500);

       clist.print(clist);

       //clist.delete(clist);

       clist.deleteNode(clist,6);

       clist.print(clist);


   }
}
