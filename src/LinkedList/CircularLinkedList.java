package LinkedList;

public class CircularLinkedList {
    Node head;
    Node tail;

    static class Node{
        int data;
        Node next;
        //constructor
        Node(int d){
            data = d;
            next = null;
        }
    }


    //inserting a circular Single linked list
    public CircularLinkedList insert(CircularLinkedList list,int data) {

        //creation of blank Node with value
        Node newNode = new Node(data);

        //If the head is null then make the new Node as first
        if (list.head == null) {
            list.head = newNode;
            newNode.next = newNode;
        } else if (list.head != null && list.head.next == list.head) {
            //In the cases of a Single Node which circles to itself
            newNode.next = list.head;
            list.head.next = newNode;
        } else if (list.head !=null && list.head.next != list.head){
            //in all other cases insert the node at the last
            Node lastNode = list.head.next;
            Node preNode = list.head;
            //find the last Node
            while (lastNode != list.head){
                lastNode = lastNode.next;
                preNode = preNode.next;
            }
            //insert the last node into the circular loop
            preNode.next = newNode;
            newNode.next = list.head;

        }

        return list;
        }


    //traverse through the circular single linked list and print the value
    public CircularLinkedList print(CircularLinkedList list){
        Node currentNode = list.head;

        System.out.println("Circular Linked List is:");

        //Incase of a Single Node circular
        if(currentNode != null && currentNode.next == list.head){
            System.out.println(currentNode.data);
            return list;
        } else if (currentNode !=null && currentNode.next != list.head){
            System.out.println(currentNode.data + " ");
            //traverse from 1st position till the head returns
            Node tempNode = currentNode.next;
            while (tempNode != list.head){
                System.out.println(tempNode.data + " ");
                tempNode = tempNode.next;
            }
            return list;
        } else {
            System.out.println("This is invalid list");
        }
        return list;
    }



    //Delete the full linked list
    public void delete(CircularLinkedList list){
        //making head = null will break the link between head and 1st node
        // which makes the garbage collector delete 1st node as no reference is calling it
        // and so fort deletes all other nodes as the previous reference is deleted
        list.head = null;

    }



    //Delete one Node from Circular Linked List
    public CircularLinkedList deleteNode(CircularLinkedList list,int location){
        Node currentNode = list.head;

        //Check if the list is valid
        if(list.head == null){
            System.out.println("Please enter a valid List");
            return list;
        }
        //Delete 0th Node from location 0
        if(location==0){
            //first traverse and find the last node
            Node tempNode = list.head.next;
            Node lastNode = list.head;
            while (tempNode != list.head){
                tempNode = tempNode.next;
                lastNode = lastNode.next;
            }
            list.head = currentNode.next;
            lastNode.next = list.head;
        } else if (location !=0){
            int counter = 1;
            //traverse through the circular linked list and delete anywhere but the last node
            Node tempNode = list.head.next;
            Node prevNode = list.head;
            while (tempNode != list.head){
                if(counter==location){
                    prevNode.next = tempNode.next;
                    return list;
                }
                tempNode = tempNode.next;
                prevNode = prevNode.next;
                counter++;
            }
            if (location==counter){
                //in this case it's deletion of last Node
                Node findNewLast = list.head;
                while (findNewLast.next != prevNode){
                    findNewLast = findNewLast.next;
                }
                findNewLast.next = list.head;
                return list;
            }
            System.out.println("Location is beyond linked list limits");


        }
        return list;
    }

}
