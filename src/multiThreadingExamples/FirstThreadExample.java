package multiThreadingExamples;

public class FirstThreadExample extends Thread {

	int num;
	void printTable(int num) throws InterruptedException {
		for(int i = 1;i<=10;i++) {
			System.out.println("Table of num "+ num + " is "+ num*i);
			Thread.sleep(5000);
		}
	}
	
	public void run() {
//		int[] array = new int[] { 10, 20, 30, 40, 50 };
//		for (int i = 0; i < array.length; i++) {
//			System.out.println("Value of i by Thread " + Thread.currentThread().getId() + " is " + array[i]);
//		}
		
		try {
			printTable(this.num);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String args[]) {
			
		FirstThreadExample obj = new FirstThreadExample();
		obj.start();
		
		FirstThreadExample obj2 = new FirstThreadExample();
		obj2.start();
	}
}
