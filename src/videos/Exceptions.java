package videos;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptions {

	public static void main(String[] args) {
		
		int[] numbers = new int[3];
		System.out.println("Hi");
		
		if (numbers.length > 3) {
		System.out.println(numbers[3]);
		}
//			Without if statement:
//			Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
//			at videos.Exceptions.main(Exceptions.java:8)
		System.out.println("Bye");
		
		/*
		 * Checked Exception - explicitly check for in our code. (i.e. input/output exception)
		 * try catch block - handles checked exceptions
		 * 
		 * Unchecked Exception - something we have controll over and only occurs with mistakes in code (i.e. index out of bounds /  null pointer)
		 */
		
//		try {
//			System.out.println(numbers[3]);
//			System.out.println("In the try");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			System.out.println(e.toString());
//		}
		try {
			FileReader fileReader = new FileReader("somthing.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		} catch (Exception e) {
			
		} finally {
			System.out.println("Finally!");
		}
		
		System.out.println("after try/catch");
		
		try {
			openFile("AnotherFile.jpg");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
	
	public static FileReader openFile(String file) throws FileNotFoundException {
		return new FileReader("somthing.txt");
	}

}
