package interfacekeyword;

import java.util.ArrayList;
import java.util.List;

public class Myclass implements MyInterface {

	@Override
	public void abstractMethod() {
		System.out.println("Implementation of abstractMethod from Myclass ");
		
		
		System.out.println("Constant inside interface "+CONSTANT);
	}
	
	@Override
	public void defaultMethod() {
		MyInterface.super.defaultMethod();
		
		System.out.println("overridden default method in Myclass");
	}
	
	public static void main(String[] args) {
		
		MyInterface obj = new Myclass();//Parent p = new Child();
//		obj.abstractMethod();
		
//		obj.defaultMethod();
		MyInterface.staticMethod();//interfaceName.staticMethod
		
		//list of objects
//		List<MyInterface> list = new ArrayList<>();
//		list.add(new Myclass());
//		list.add(new Myclass2());
//		
//		for(MyInterface m: list) {
//			m.abstractMethod();
//		}
	}

}

class Myclass2 implements MyInterface {
	
	@Override
	public void abstractMethod() {
	System.out.println("My class 2 method ");	
	}
}


/**
 * Report: PDF EXCEL CSV HTML
 * 
 * interface Report {
 * 	createReport();
 * }
 * 
 * class PdfReport implements Report {
 * 
 * createReport() {
 * 		//it will generate pdf
 * 
 * }
 * 
 * }
 * 
 * class ExcelReport implemtns Report {
 * 
 * createReport() {
 * it should generate excel report
 * 
 * }
 * 
 * }
 * 
 * */

