package com.company.collectionframework;

import java.util.*;

public class CollectionDemo {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        // 1. INSERTION METHODS
        System.out.println("===== 1. INSERTION METHODS =====");

        list.add("Rajiv");
        list.add("Sonal");
        list.add("Rohan");
        list.add("Rajiv"); // Duplicates are allowed

        list.add(1, "Riya"); // Insert at specified index
        list.addFirst("First");
        list.addLast("Last");

        System.out.println("add(), add(index, element), addFirst(), addLast():");
        System.out.println(list);

        // 2. TRAVERSAL METHODS
        System.out.println("\n===== 2. TRAVERSAL METHODS =====");

        System.out.println("Using iterator():");
        Iterator<String> it1 = list.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }

        System.out.println("\nUsing descendingIterator():");
        Iterator<String> it2 = list.descendingIterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }

        System.out.println("\nUsing listIterator(2):");
        ListIterator<String> it3 = list.listIterator(2);
        while (it3.hasNext()) {
            System.out.println(it3.next());
        }

        System.out.println("\nUsing for-each loop:");
        for (String name : list) {
            System.out.println(name);
        }

        // 3. RETRIEVAL METHODS
        System.out.println("\n===== 3. RETRIEVAL METHODS =====");

        System.out.println("get(1): " + list.get(1));
        System.out.println("getFirst(): " + list.getFirst());
        System.out.println("getLast(): " + list.getLast());

        System.out.println("peek(): " + list.peek());
        System.out.println("peekFirst(): " + list.peekFirst());
        System.out.println("peekLast(): " + list.peekLast());

        // 4. SEARCHING METHODS
        System.out.println("\n===== 4. SEARCHING METHODS =====");

        System.out.println("contains(Rajiv): " + list.contains("Rajiv"));
        System.out.println("indexOf(Rajiv): " + list.indexOf("Rajiv"));
        System.out.println("lastIndexOf(Rajiv): " + list.lastIndexOf("Rajiv"));
        System.out.println("size(): " + list.size());
        System.out.println("isEmpty(): " + list.isEmpty());

        // 5. QUEUE METHODS
        System.out.println("\n===== 5. QUEUE METHODS =====");

        list.offer("Ishika");
        System.out.println("After offer(): " + list);

        System.out.println("element(): " + list.element());
        System.out.println("peek(): " + list.peek());

        System.out.println("poll(): " + list.poll());
        System.out.println("After poll(): " + list);

        // 6. DEQUE METHODS
        System.out.println("\n===== 6. DEQUE METHODS =====");

        list.offerFirst("F1");
        list.offerLast("L1");
        System.out.println("After offerFirst() and offerLast(): " + list);

        System.out.println("removeFirst(): " + list.removeFirst());
        System.out.println("removeLast(): " + list.removeLast());

        list.addFirst("NewFirst");
        list.addLast("NewLast");
        System.out.println("After adding at both ends: " + list);

        // 7. STACK METHODS
        System.out.println("\n===== 7. STACK METHODS =====");

        list.push("PushElement");
        System.out.println("After push(): " + list);

        System.out.println("pop(): " + list.pop());
        System.out.println("After pop(): " + list);

        // 8. REMOVAL METHODS
        System.out.println("\n===== 8. REMOVAL METHODS =====");

        list.remove("Rajiv"); // Removes first matching occurrence
        System.out.println("After remove(Object): " + list);

        list.remove(0); // Removes element at index 0
        System.out.println("After remove(index): " + list);

        list.removeFirstOccurrence("Rohan");
        System.out.println("After removeFirstOccurrence(): " + list);

        list.removeLastOccurrence("Rajiv");
        System.out.println("After removeLastOccurrence(): " + list);

        // 9. CONDITIONAL REMOVAL
        System.out.println("\n===== 9. CONDITIONAL REMOVAL =====");

        list.removeIf(name -> name.startsWith("R"));
        System.out.println("After removeIf(): " + list);

        // 10. REPLACEMENT AND ARRAY CONVERSION
        System.out.println("\n===== 10. REPLACEMENT AND ARRAY CONVERSION =====");

        if (!list.isEmpty()) {
            list.set(0, "UpdatedName");
        }
        System.out.println("After set(): " + list);

        Object[] arr = list.toArray();
        System.out.println("Array: " + Arrays.toString(arr));

        // 11. CLEARING THE LIST
        System.out.println("\n===== 11. CLEARING THE LIST =====");

        list.clear();
        System.out.println("After clear(): " + list);
        System.out.println("isEmpty(): " + list.isEmpty());
    }
}
