package com.jtc.p2;


class Node<K, V> {
 K key;
 V value;
 Node<K, V> next; // For handling collisions (linked list)

 Node(K key, V value) {
     this.key = key;
     this.value = value;
     this.next = null;
 }
}


class MyHashMap<K, V> {
 private int size = 16; // Initial size
 private Node<K, V>[] table;

 // Constructor
 public MyHashMap() {
     table = new Node[size];
 }

 // Hash function -> Index nikalne ke liye
 private int hash(K key) {
     return Math.abs(key.hashCode()) % size;
 }

 // ✅ Put Method (Insert/Update)
 public void put(K key, V value) {
     int index = hash(key);

     Node<K, V> newNode = new Node<>(key, value);

     if (table[index] == null) {
         table[index] = newNode; // Pehle node ko directly insert karna
     } else {
         // Collision handling using Linked List
         Node<K, V> current = table[index];
         while (current != null) {
             // Key already present -> Value update karo
             if (current.key.equals(key)) {
                 current.value = value;
                 return;
             }
             if (current.next == null) break;
             current = current.next;
         }
         current.next = newNode; // Naya node ko link karo
     }
 }

 // ✅ Get Method (Fetch Value)
 public V get(K key) {
     int index = hash(key);
     Node<K, V> current = table[index];
     
     while (current != null) {
         if (current.key.equals(key)) {
             return current.value; // Key match hone par value return karo
         }
         current = current.next;
     }
     return null; // Key nahi mili toh null return karo
 }

 // ✅ Remove Method
 public void remove(K key) {
     int index = hash(key);
     Node<K, V> current = table[index];
     Node<K, V> previous = null;
     
     while (current != null) {
         if (current.key.equals(key)) {
             if (previous == null) {
                 table[index] = current.next; // First node ko delete karo
             } else {
                 previous.next = current.next; // Middle/Last node ko delete karo
             }
             return;
         }
         previous = current;
         current = current.next;
     }
 }

 // ✅ Display Method (For Debugging)
 public void display() {
     for (int i = 0; i < size; i++) {
         Node<K, V> current = table[i];
         System.out.print("Index " + i + " : ");
         while (current != null) {
             System.out.print("[" + current.key + " = " + current.value + "] -> ");
             current = current.next;
         }
         System.out.println("null");
     }
 }
}

//✅ Main Class
public class CustomHashMap {
 public static void main(String[] args) {
     MyHashMap<String, Integer> map = new MyHashMap<>();

     // Insert elements
     map.put("A", 1);
     map.put("B", 2);
     map.put("C", 3);
     map.put("A", 5); // Overwrite value for key 'A'
     map.put("D", 4);

     // Display hashmap
     System.out.println("After Insertion:");
     map.display();

     // Get element
     System.out.println("\nGet value for key 'A': " + map.get("A")); // Output: 5
     System.out.println("Get value for key 'B': " + map.get("B")); // Output: 2
     System.out.println("Get value for key 'E': " + map.get("E")); // Output: null

     // Remove element
     map.remove("A");
     System.out.println("\nAfter Removing key 'A':");
     map.display();
 }
}
