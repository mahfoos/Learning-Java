package com.mahfoos.collection.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

    /* The LinkedList class implements the Collection interface.
It uses a doubly linked to store the elements.It can store the duplicate
elements. It maintains the insertion order and is not synchronized
 */

    public static void main(String[] args) {

        LinkedList<String> al = new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");

        Iterator<String> itr = al.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

//    ArrayList vs. LinkedList
//        The LinkedList class is a collection which can contain many objects of the same type, just like the ArrayList.
//
//        The LinkedList class has all of the same methods as the ArrayList class because they both implement the List interface.
//        This means that you can add items, change items, remove items and clear the list in the same way.
//
//        However, while the ArrayList class and the LinkedList class can be used in the same way, they are built very differently.
//
//        How the ArrayList works
//        The ArrayList class has a regular array inside it. When an element is added, it is placed into the array.
//        If the array is not big enough, a new, larger array is created to replace the old one and the old one is removed.
//
//        How the LinkedList works
//        The LinkedList stores its items in "containers." The list has a link to the
//        first container and each container has a link to the next container in the list. To add an element to the list,
//        the element is placed into a new container and that container is linked to one of the other containers in the list.
//
//        When To Use
//        It is best to use an ArrayList when:
//
//        You want to access random items frequently
//        You only need to add or remove elements at the end of the list
//        It is best to use a LinkedList when:
//
//        You only use the list by looping through it instead of accessing random items
//        You frequently need to add and remove items from the beginning, middle or end of the
//        list