package exceptionExamples;

import java.util.InputMismatchException;

public class AgeCheck {

	public static void main(String[] args) throws AgeException, InputMismatchException {
		// TODO Auto-generated method stub
		
		int age = 10;
		if (age < 18) {
			throw new AgeException();
		}
	}

}
