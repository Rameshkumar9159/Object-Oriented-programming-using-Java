import java.util.HashSet;
import java.util.Iterator;
public class exp09{
public static void main(String[] args) {
HashSet<String> hashSet = new HashSet<>();hashSet.add("Apple");
hashSet.add("Banana");
hashSet.add("Orange");
hashSet.add("Apple"); // Duplicate elements are ignored
System.out.println("HashSet: " + hashSet);
System.out.println("Size of HashSet: " + hashSet.size());
hashSet.remove("Banana");
System.out.println("Contains 'Apple': " + hashSet.contains("Apple"));
System.out.println("Iterating over the HashSet:");
Iterator<String> iterator = hashSet.iterator();
while (iterator.hasNext()) {
System.out.println(iterator.next());
}
hashSet.clear();
System.out.println("Is HashSet empty? " + hashSet.isEmpty());
}
}
