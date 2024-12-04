package week8.day1;

public class LearnExceptionHandling {




	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		try {
			System.out.println("a/b in try block ->"+(a/b));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("a/1 in catch block ->"+(a/1));
		}
		System.out.println("a+b is "+(a+b));
		
		
		
		
		// try catch finally
		int[] z= {1,2,3,4,5};
		try {
			
			System.out.println("Inside the try block");
			System.out.println(z[0]/10);
			try {
				System.out.println(z[6]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(z[5]);
			}
			System.out.println("The value z[6] is printed");
		} catch (ArithmeticException e) {
			System.out.println("The Exception is ArithmeticException ");
			System.out.println(z[0]/1);
		} catch (ArrayIndexOutOfBoundsException e) {
			int length = z.length;
			System.out.println("The last index value is "+(z[length-1]));
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("This is try catch finallly!!!!!!!");
		}
		
		


//		try finally --> usecase is db, files, 
		
		try {
			System.out.println("This is try block ");
			int [] x = {1,2};
			System.out.println(x[2]);
			throw new RuntimeException("invalid argument");


		}finally {
			System.out.println("This is finally block");
		}
		
	}
}