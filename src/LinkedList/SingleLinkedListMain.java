package LinkedList;

public class SingleLinkedListMain {

    public static void main (String args[]){
        SingleLinkedList list = new SingleLinkedList();

        //Creation of a Single Linked List
        list = list.insert(list,10);
        list = list.insert(list,20);
        list = list.insert(list,30);
        list = list.insert(list,40);

        //Printing of LL
        list.printLL(list);

        //Insert a Node at any specified location
        list.insertAt(list,60,1);
        list.printLL(list);

        //Search for a given value in the Linked List
        list.searchValue(list,70);
        list.printLL(list);

        //Delete a Specified Node within the Linked List
        list= list.deleteNode(list,5);
        list.printLL(list);

        //Delete the Linked List itself
        list.delete(list);


    }
}
