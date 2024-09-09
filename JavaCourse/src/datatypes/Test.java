package datatypes;

public class Test {

	public static void main(String[] args) {
		
		//dataType variableName =<assignmentOperator> value 
		byte b = 100;
		
		
		
		Byte bytes = (byte) new Byte(b).BYTES;
		System.out.println("Byte  is taking " + bytes + " Bytes");
		
		Integer intBytes = new Integer(b).BYTES;
		System.out.println("Integer is taking " + intBytes + " Bytes");
	}

}
