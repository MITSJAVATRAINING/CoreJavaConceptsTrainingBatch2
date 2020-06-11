package multiThreadingExamples;

public class RunnableInterfaceExample implements Runnable {

	
	@Override
	public synchronized void run() {
		int[] array = new int[] { 10, 20, 30, 40, 50 };
		for (int i = 0; i < array.length; i++) {
			System.out.println("Value of i by Thread " + Thread.currentThread().getId() + " is " + array[i]);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String args[]) throws InterruptedException {
		RunnableInterfaceExample obj1 = new RunnableInterfaceExample();
		RunnableInterfaceExample obj2 = new RunnableInterfaceExample();

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		//t1.join();
		t2.start();
		
	}

}
