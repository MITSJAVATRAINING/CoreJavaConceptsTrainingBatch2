package multiThreadingExamples;

class Q {
	
	int num;
	boolean valueSet = false;
	
	synchronized void set(int num) {
		while(valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.num = num;
		this.valueSet = true;
		System.out.println("value set "+ num);
		notify();
	}
	
	synchronized void get() {
		while (!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("value get "+ num);
		this.valueSet = false;
		notify();
	}
}

class Producer implements Runnable{
	Q q;
	public Producer(Q q) {
		this.q = q;
	}
	@Override
	public void run() {
		int i = 0;
		while (true) {
			q.set(i);
			i++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Consumer implements Runnable {
	Q q;
	public Consumer(Q q) {
		this.q = q;
	}
	@Override
	public void run() {
		while (true) {
			q.get();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ProducerConsumerProblem {
	
	public static void main(String args[]) {
		Q q = new Q();
		Thread producerThread = new Thread(new Producer(q));
		Thread consumerThread = new Thread(new Consumer(q));
		
		producerThread.start();
		consumerThread.start();
		
	}
}
