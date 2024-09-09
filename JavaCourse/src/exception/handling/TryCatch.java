package exception.handling;

public class TryCatch {

	public static void main(String[] args) {
		
		int result = test();
		
		System.out.println(result);
	}
	
	public static int test() {
		try {
			//case 1:
//			int a = 10;
//			int b = 2;
//			int c = a / b;
			
			
			//case 2:
			int a = 10;
			int b = 0;
			int c = a / b;
//			
			
			return 1;
		} catch(Exception e) {
			return 0;
		} finally {
			return 2;
		}
	}

}

//valid cases
//try-catch
//try-catch-finally
//try-multipleCatch
//try-multicatch-finally
//try-finally
//-----------------------
//invalid cases
//catch-finally invalid
//finally invalid
//catch invalid
//try invalid
