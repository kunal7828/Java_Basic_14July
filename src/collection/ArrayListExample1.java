package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample1 {
	/**
	 * Resizable Array: Unlike arrays in Java, which have a fixed size, an ArrayList
	 * can dynamically grow and shrink as elements are added or removed.
	 * 
	 * Random Access: Provides fast random access to elements, making it efficient
	 * for retrieving elements by index.
	 * 
	 * Order: Maintains the order of elements, allowing for predictable iteration
	 * 
	 * Duplicates: Allows duplicate elements.
	 * 
	 * Null Elements: Permits null elements.
	 */

	public static void main(String[] args) {

		List<String> arrayList = new ArrayList();

		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Cherry");
		System.out.println(arrayList);

		arrayList.add(1, "deepu");

		System.out.println(arrayList.get(1));

		//System.out.println(arrayList);

		//System.out.println("Element at index 1: " + arrayList.get(1));

		//arrayList.set(2, "Blackberry");

		arrayList.remove(3);

		arrayList.remove("Apple");

		System.out.println("Index of 'Blackberry': " + arrayList.indexOf("Blackberry"));

		for (String fruit : arrayList) {
			System.out.println("Element: " + fruit);
		}

		System.out.println("Is empty after clear: " + arrayList.isEmpty());
	}

}
