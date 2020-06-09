package collectionExamples;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	
	//Generics
	
	public void createArrayList() {
		ArrayList<Integer> a1 = new ArrayList<>(); //(10)//x --> x/2 --- increase the size by itself
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		a1.add(60);
		a1.add(70);
		a1.add(80);
		
		System.out.println("Iterating using advance for loop ");
		for(Integer x: a1) {
			System.out.println("Elemeent of arraylist a1 " + x);
		}
		
		System.out.println("Iterating using iterator interface");
		
		Iterator<Integer> iter = a1.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//Methods in List Interface
		
		System.out.println("The element present at 2nd index " + a1.get(2));
	}
	
	public static void main(String args[]) {
		
		ArrayListExample obj1 = new ArrayListExample();
		obj1.createArrayList();
	}
}
