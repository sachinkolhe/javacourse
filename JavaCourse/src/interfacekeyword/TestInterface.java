package interfacekeyword;

public class TestInterface {

	public static void main(String[] args) {

		Animal myDog = new Dog();//Parent p = new Child();
        Animal myCat = new Cat();
        
        //Parent is reference
        //Child is actual object
      
        //at the time of compilation it checks method is present in interface/superClass
        //at the time of execution it actually calls the class/objects method
        myDog.eat();
        myDog.makeSound();

        myCat.eat();
        myCat.makeSound();

	}

}
