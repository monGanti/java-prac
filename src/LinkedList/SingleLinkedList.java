package LinkedList;


public class SingleLinkedList {

    //Note: we did not make use of tail's in this entire class. As last.next is always NULL

     Node head;

    static class Node {
        int data;
        Node next;

        //constructor
        Node(int d){
            data = d;
            next = null;
        }
    }


    //Inserting a node in Linked list
    public SingleLinkedList insert(SingleLinkedList list, int data){

        //create a new node with data
        Node newNode = new Node(data);

        //if head is null then make the new node as head
        if(list.head == null){
            list.head = newNode;
        } else {
            //traverse till the last and add it there
            Node last = list.head;
            while (last.next != null){
                last = last.next;
            }
            //insert new node at the last
            last.next = newNode;
        }
        return list;
    }



    //Traverse and printing the linked list
    public void printLL(SingleLinkedList list){
        Node currentNode = list.head;

        System.out.println("LinkedList is:");

        while (currentNode != null){
            System.out.println(currentNode.data + " ");
            currentNode = currentNode.next;
        }

        System.out.println("\n");
    }



    //inserting a node at a specified location
    public SingleLinkedList insertAt(SingleLinkedList list,int data, int location){

        //create a new node and add a value
        Node newNode = new Node(data);

        //if linked List itself does not exist then make a single node linked list
        if (list.head == null){
            list.head = newNode;
            newNode.next = null;
            System.out.println("Since there was no Linked List as all, created one single node list ignoring the location");
        }
        //If there is a Head available and the location if given
        else {
            if (location == 0){
                //insert the new node as first node
                newNode.next = list.head;
                list.head = newNode;
            } else if (location !=0){
                //traverse through the linked list and find the location of the node and insert the new node
                Node tempNode = list.head;
                int tempNodeCounter = 1;
                while (tempNode.next != null){
                    if (tempNodeCounter == location){
                        newNode.next = tempNode.next;
                        tempNode.next = newNode;
                    }
                    tempNode = tempNode.next;
                    tempNodeCounter++;
                }
                //if the location is matching the last node
                if (tempNodeCounter == location){
                    //addition of a node at last location
                    tempNode.next = newNode;
                    newNode.next = null;
                } else {
                    System.out.println("the given location is way beyond the Linked list boundaries");
                }
            }
        }

        return list;
    }



    //Search for a value in Linked list
    public void searchValue(SingleLinkedList list,int valueToSearch){
        Node currentNode = list.head;
        int counter = 0;
        while (currentNode !=null){
            if (valueToSearch == currentNode.data){
                System.out.println("value found at" + counter);
                return ;
            }
            currentNode = currentNode.next;
            counter++;
        }
        System.out.println("value not found");
    }



    //Delete the linked list itself
    public void delete(SingleLinkedList list){
        list.head = null;

    }



    //Delete a node in the linked list
    public SingleLinkedList deleteNode(SingleLinkedList list, int location){
        Node tempNode = list.head;

        //check if the given linked list is valid
        if(list.head == null){
            System.out.println("This is not a valid list");
            return list;
        }

        //delete the first Node of the LL
        if(location==0){
            list.head = tempNode.next;
        } else if (location !=0){

            //deletion from anywhere but the first node
            int counter = 1;
            Node currentNode = tempNode.next;

            while (currentNode != null){
                if(counter == location){
                    tempNode.next = currentNode.next;
                    return list;
                }
                currentNode = currentNode.next;
                tempNode = tempNode.next;
                counter++;
            }
            System.out.println("Location is beyond the LL limit");

        }

        return list;

    }








}
