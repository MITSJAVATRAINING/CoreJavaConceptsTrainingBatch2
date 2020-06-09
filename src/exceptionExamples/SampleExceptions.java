package exceptionExamples;

public class SampleExceptions {

	public static void main(String args[]) {
		
	
		
		try {
			int a = 10, b = 0;
			int c = a/b;
			System.out.println("The value of c is " + c);
		} finally {
			System.out.println("This is finally block");
		}
		
		System.out.println("After handling my Arithmatic Exception");
		
//		String s = null;
//		System.out.println(s.length());
		
//		String s = "abc";
		
//		int a = Integer.parseInt(s);
//		float f = Float.parseFloat(s);
//		long l = Long.parseLong(s);
//		double d = Double.parseDouble(s);
		
	//	String b = String.valueOf();
//		System.out.println(a/10);
	//	System.out.println(a);
		
		//FileInputStream stream = new FileInputStream("abc.txt");
	}
}
