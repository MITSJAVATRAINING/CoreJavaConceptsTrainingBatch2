package JavaBasics;

import inheritanceExamples.Automobile;

public class JavaBasics {
	int a;
	static int b = 10;
	
	public JavaBasics(int a1, int b1) {
		this.a = a1;
		this.b = b1;
	}

	public int add(int a, int b) {
		int c = a + b;
//		System.out.println("The value of c is "+ c);
		return 0;
	}
	
	public int add(int a, int b, int c) {
		int d = a + b;
//		System.out.println("The value of c is "+ c);
		return 0;
	}
	
	public String returnNull() {
		return "Shaleen";
	}
	
	
	public static void main(String args[]) {
		
		JavaBasics obj1 = new JavaBasics(11,12);
		System.out.println(obj1.a +"  " + obj1.b);
		System.out.println(JavaBasics.b);
		int returenedC = obj1.add(10, 20);
		System.out.println("The returned value of c is "+ returenedC);
		System.out.println("the output of return null method is " + obj1.returnNull());
//		int a = 9;
//		int b = 10;
//		
//		if (a < 10) {
//			System.out.println("the value of a is less than 10");
//			if (b < 10) {
//				System.out.println("the value of b is less than 10");
//			} else {
//				System.out.println("the value of b is greater than or equal to 10");
//			}
//		} else if (a == 10) {
//			System.out.println("the value of a is equal to 10");
//		} else  {
//			System.out.println("the value of a is greater than 10");
//		}
		
		
//		for (int i=0;i<10;i = i+1) {
//			System.out.println("the value of i is "+ i);
//		}
		
//		int i =0;
//		while (i<10) {
//			System.out.println("the value of i is "+ i);
//			i++;
//		}
//		char[] charArray = new char[] {'a','b','c','d','e'};
//		int[] array = new int[5];
//		int[] array2 = new int[] {100,200,300,400,500};
//		String[] array3 = new String[] {"Sushanth", "Supreeth", "Karthik" , "Ravi", "Ashwin"};
//		for (int i=0;i<=4;i = i+1) {
//		array[i] = array2[i] + 10;
//		System.out.println("the value of array2 is "+ array2[i]);
//		System.out.println("the value of array3 is "+ array3[i]);
//		System.out.println("the value of array is "+ array[i]);
//			System.out.println("the value of charArray at index " + i +" is "+ charArray[i]);
//   }
	}
}
