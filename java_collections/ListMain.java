//Java Collections Framework : The Java collections framework provides a set of interfaces and classes to implement various data structures and algorithms.

//Collections Interface in java
//1.List Interface
//2.Set Interface
//3.Queue Interface
//4.Map Interface
//5.Iterator Interface

//Methods of Collection
//1.add() - inserts the specified element to the collection

//2.size() - returns the size of the collection

//3.remove() - removes the specified element from the collection

//4.iterator() - returns an iterator to access elements of the collection

//5.addAll() - adds all the elements of a specified collection to the collection

//6.removeAll() - removes all the elements of the specified collection from the collection

//7.clear() - removes all the elements of the collection

//1.List interface - In Java, the List interface is an ordered collection that allows us to store and access elements sequentially. It extends the Collection interface.

//Classes that Implement List
//1.ArrayLList 2.LinkedList 3.Vector 4.Stack

import java.util.*;

public class ListMain {
    static void printList(List<Integer> val) {
        for (int i = 0; i < val.size(); i++) {
            System.out.print(val.get(i) + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        // List<Integer> val = new ArrayList<Integer>();

        // val.add(1);
        // val.add(2);
        // val.add(3);
        // val.add(4);

        // printList(val);

        // val.set(2,30);
        // printList(val);

        // val.remove(0);
        // printList(val);

        // create an arraylist
        // ArrayList<String> languages = new ArrayList<>();
        // languages.add("Java");
        // languages.add("Python");
        // System.out.println("Languages: " + languages);

        // // create another arraylist
        // ArrayList<String> programmingLang = new ArrayList<>();

        // add all elements from languages to programmingLang and also we can specified
        // index
        // programmingLang.addAll(languages);

        // programmingLang.add("JavaScript");
        // programmingLang.add("C#");
        // programmingLang.addAll(1,languages);
        // o/p->Programming Languages: [JavaScript, Java, Python, C#]
        // System.out.println("Programming Languages: " + programmingLang);

        // //Contains()
        // if(programmingLang.contains("JavaScript")){
        // System.out.println("Js Exists");
        // }

        // Iterator
        // Iterator<String> it = programmingLang.iterator();
        // System.out.println("---PRINTING PROGRAMMLANGUAGE LIST----");
        // while(it.hasNext()){
        // String ele = it.next();
        // Integer ind = programmingLang.indexOf(ele);
        // System.out.print(ind + ":" + ele);
        // System.out.print("\n");
        // }

        // toArray()
        // ArrayList<String> languages = new ArrayList<>(Arrays.asList("JS", "CPP", "C#", "JAVA"));

        // String[] arr = new String[languages.size()];

        // languages.toArray(arr);

        // System.out.println(languages);

        // // print all elements of the array
        // System.out.print("Array: ");
        // for (String item : arr) {
        //     System.out.print(item + ", ");
        // }

    }
}
