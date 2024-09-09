package inheritance.accessmodifier;



public class Inheritance {

	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.dogDisplay();// ANimal variable count 1
		
//		Animal animal = new Dog();
//		animal.countAndDisplay();
		
		Animal animal1 = new Animal();
		animal1.countAndDisplay(); // ANimal variable count 2
		animal1.countAndDisplay(); //ANimal variable count 3
	}

}

/**
 * Interview question
 * how many objects are getting created? we want a count? in case of inheritance
 * objects created 2 and methods called 3 times
 * */

//static : class level : not specific to instance/object
//without static: instance/object level

class Animal {
    
	private int animalVariable;//not a static // instance variable
	
	protected void countAndDisplay() {
		animalVariable++;
		System.out.println("Animal Variable count " + animalVariable);
	}
	
}
//1. all the variables/methods inside an Animal class are accessible in the Dog Class
//2. which access modifiere? if public/protected/default access modifers are present for parentClass variables 
//3. if private then we cannot access in child class

class Dog extends Animal {
    
	int dogVariable;
	
	public void dogDisplay() {
		countAndDisplay();
//		System.out.println("Animal Valiable count " + animalVariable);
	}
}

















//Single Inheritance
//A -> B
//Multilevel Inheritance
// A -> B -> C
 
// class Animal {
//	 
// }
// class FourLeggedAnimal extends Animal {
//	 
// }
// //inheritance: we use extends keyword to extend a parent class
// class Dog extends FourLeggedAnimal {
//	 
// }

//Hierrarchical Inheritance
//D superClass/parentClass -> A , B , C subclasses

 //superClass/parentClass/baseClass
 class D {
	 
 }
 
 //subClasses/childClasses/derivedClasses
 class A extends D {
	 
 }
 
 class B extends D {
	 
 }
 
 //Multiple inheritance
 /**
  * 	A1
  * B1		C1
  * 	D1
  * 
  * */
 
 class A1 {
	
	 void display() {
		 System.out.println("Display A1");
	 }
 }
 
 class B1 extends A1 {
	 void display() {
		 System.out.println("Display B1");
	 } 
 }
 
 class C1 extends A1 {
	 void display() {
		 System.out.println("Display C1");
	 }
 }
 
// class D1 extends B1,C1 {
//	 //which method we should override
//	 //parentclass method
//	 //ambiguity here to call parentClass method
//	 //diamond problem
// }
 
 //Interview question: why java doesnot support multiple inheritance? in case of classes
 //but through interfaces this is possible
 //
 
 
 